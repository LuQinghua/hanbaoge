package com.jiabian.cache;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

import com.alibaba.fastjson.JSON;

/**
 * 
 * jedis 工具类 JedisUtil 创建人:黄世平 时间：2016年11月8日-上午9:31:18
 * 
 * @version 1.0.0
 * 
 */
@Component
public class JedisUtil {
	private static final Logger logger = LogManager.getLogger(JedisUtil.class
			.getName());

	private static JedisCluster jc;

	@Autowired
	public JedisUtil(JedisCluster jc) {
		JedisUtil.jc = jc;
	}

	/**
	 * 获取redis里的json对象，转换为对象
	 * 
	 * @param key
	 * @return Object
	 * @since p2p_cloud_v1.0
	 */
	public static <T> T getObject(String key, Class<T> clazz) {
		String jsonObject = jc.get(key);
		if (StringUtils.isEmpty(jsonObject))
			return null;
		return JSON.parseObject(jsonObject, clazz);
	}

	/**
	 * 获取redis里的json对象，转换为对象
	 * 
	 * @param key
	 * @return Object
	 * @since p2p_cloud_v1.0
	 */
	public static String get(String key) {
		String jsonObject = jc.get(key);
		if (StringUtils.isEmpty(jsonObject)){
			return null;
		}  
		return JSON.parseObject(jsonObject, String.class);
	}

	/**
	 * 
	 * (获取redis里的value)
	 * 
	 * @param key
	 * @return String
	 * @since 1.0.0
	 */
	public static String getValue(String key) {
		String jsonObject = jc.get(key);
		if (StringUtils.isEmpty(jsonObject))
			return null;
		return jsonObject;
	}

	/**
	 * 
	 * 获取返回值的类型
	 * 
	 * @param key
	 * @return String
	 * @since 1.0.0
	 */
	public static String type(String key) {
		String valueType = jc.type(key);
		return valueType;
	}

	/**
	 * 获取list对象
	 * 
	 * @param key
	 * @param clazz
	 * @return List<T>
	 * @since p2p_cloud_v1.0
	 */
	public static <T> List<T> getList(String key, Class<T> clazz) {
		String jsonObject = jc.get(key);
		if (StringUtils.isEmpty(jsonObject)) {
			return new ArrayList<T>();
		}
		return JSON.parseArray(jsonObject, clazz);
	}

	public static void save(String key, String value) throws RedisException {
		if (value == null)
			return;
		// save(key, 15, JSON.toJSONString(value));
		jc.set(key, value);

	}

	public static void save(String key, int expirationTime, Object value) {
		if (value == null)
			return;
		jc.setex(key, expirationTime, JSON.toJSONString(value));
	}

	public static void del(String key) {
		jc.del(key);
	}

	// 批量删除
	public static int batchDel(String str) {
		int count = 0;
		TreeSet<String> keys = keys(str + "*");
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			del(it.next());
			count++;
		}
		return count;
	}

	public static void move(String key) {
		jc.move(key, 1);
	}

	public static byte[] getKey(String key) {
		return key.getBytes();
	}

	/**
	 * 从变量 +1 操作
	 */
	public static Long incr(String key) {
		Long val = jc.incr(key);
		return val;
	}

	public static boolean exists(String key) {
		return jc.exists(key);
	}

	public static Long ttl(String key) {
		return jc.ttl(key);
	}

	public static void expire(String key, int expirationTime) {
		jc.expire(key, expirationTime);
	}

	/**
	 * 方法：返回列表的长度
	 * 
	 * @param key
	 * @return
	 */
	/**
	 * 方法：对象序列化逆向
	 * 
	 * @param bytes
	 * @return
	 */
	public static Object byte2Object(byte[] bytes) {
		if (bytes == null || bytes.length == 0)
			return null;
		try {
			ObjectInputStream inputStream;
			inputStream = new ObjectInputStream(new ByteArrayInputStream(bytes));
			Object obj = inputStream.readObject();
			return obj;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Object byte2ObjectNoV(byte[] bytes) {
		if (bytes == null || bytes.length == 0)
			return null;
		try {
			ObjectInputStream inputStream;
			inputStream = new ObjectInputStream(new ByteArrayInputStream(bytes));
			Object obj = inputStream.readObject();
			return obj;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 方法：对象序列化
	 * 
	 * @param value
	 * @return
	 */
	public static byte[] object2Bytes(Object value) {
		if (value == null)
			return null;
		ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream outputStream;
		try {
			outputStream = new ObjectOutputStream(arrayOutputStream);
			outputStream.writeObject(value);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				arrayOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return arrayOutputStream.toByteArray();
	}

	// @param pattern 获取key的前缀 全是是 *

	public static TreeSet<String> keys(String pattern) {

		TreeSet<String> keys = new TreeSet<>();
		// 获取所有的节点

		Map<String, JedisPool> clusterNodes = jc.getClusterNodes();
		// 遍历节点 获取所有符合条件的KEY

		for (String k : clusterNodes.keySet()) {
			logger.debug("Getting keys from: {}", k);
			if (k.indexOf("10.105.84.220") != -1) {
				continue;
			}
			JedisPool jp = clusterNodes.get(k);
			Jedis connection = jp.getResource();
			try {
				keys.addAll(connection.keys(pattern));
			} catch (Exception e) {
				logger.error("Getting keys error: {}", e);
			} finally {
				logger.debug("Connection closed.");
				connection.close();// 用完一定要close这个链接！！！
			}
		}
		logger.debug("Keys gotten!");
		return keys;
	}

}
