package com.jiabian.control.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiabian.base.control.BaseController;
import com.jiabian.cache.JedisUtil;
import com.jiabian.cache.RedisRes;
import com.jiabian.redis.request.RedisReq;

@Controller
@RequestMapping(value = "/redisData")
public class RedisDataControl extends BaseController<RedisReq, RedisRes> {

	/**
	 * 
	 * (查询单条redis值) com.jiabian.control.data 方法名：getRedisValue 创建人：彭振锋
	 * 时间：2016年12月29日-下午5:34:37
	 * 
	 * @param key
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	@RequestMapping(value = "/getRedisValue")
	public String getRedisValue(RedisReq reidsReq, ModelMap model) {
		if (reidsReq.getKey() == null) {
			return "dataManager/redisManager"; 
		}
		List<RedisRes> redisList = new ArrayList<>();
		TreeSet<String> keys = new TreeSet<>();
		// 通配符查询 key值
		keys = JedisUtil.keys(reidsReq.getKey() + "*");
		// 迭代
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String theKey = it.next();
			// 获取返回值类型
			RedisRes redisRes = new RedisRes();
			// 获取到value值
			String value = JedisUtil.getValue(theKey);
			if (value != null) {
				redisRes.setValue(value);
				redisRes.setKey(theKey);
				redisList.add(redisRes);
			}
			// 返回值是列表类型

		}
		model.put("redisList", redisList);
		return "dataManager/redisManager";
	}

	/**
	 * 
	 * (跳转redis管理页面) com.jiabian.control.data 方法名：toRedisPage 创建人：彭振锋
	 * 时间：2016年12月29日-下午5:51:19
	 * 
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	@RequestMapping(value = "/toRedisPage")
	public String toRedisPage() {
		return "dataManager/redisManager";
	}

	/**
	 * 
	 * (添加一条redis数据) 测试 com.jiabian.control.data 方法名：saveRedis 创建人：彭振锋
	 * 时间：2016年12月30日-上午10:36:49
	 * 
	 * @return int
	 * @exception
	 * @since 1.0.0
	 */
	@RequestMapping(value = "/saveRedis")
	@ResponseBody
	public int saveRedis() {
		JedisUtil.save("test6", "这里是6");
		return 1;
	}

	/**
	 * 
	 * (删除一条redis数据) com.jiabian.control.data 方法名：delRedis 创建人：彭振锋
	 * 时间：2016年12月30日-上午10:53:04
	 * 
	 * @return int
	 * @exception
	 * @since 1.0.0
	 */
	@RequestMapping(value = "/delRedis")
	public String delRedis(RedisReq reidsReq) {
		JedisUtil.del(reidsReq.getKey());
		return "redirect:getRedisValue";
	}

	// 批量删除
	@RequestMapping(value = "/batchDel")
	public String batchDel(RedisReq reidsReq) {
		List<String> keysList = new ArrayList<String>();
		Collections.addAll(keysList, reidsReq.getKeysArr()); // 数组转集合
		for (int i = 0; i < keysList.size(); i++) {// 批量删除
			JedisUtil.del(keysList.get(i));
		}
		return "redirect:getRedisValue";
	}
}