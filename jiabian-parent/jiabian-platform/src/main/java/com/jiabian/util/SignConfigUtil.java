package com.jiabian.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.jiabian.annotation.SignConfig;
import com.jiabian.base.io.request.IRequest;
import com.jiabian.exception.AuthException;

/**
 * 
 * @author admin
 *
 */
@Component
public class SignConfigUtil {
	private static final Logger logger = LogManager.getLogger(SignConfigUtil.class.getName());
	private final static List<Class<?>> JAVA_BASH_TYPE = new ArrayList<Class<?>>();
	static {
		JAVA_BASH_TYPE.add(int.class);
		JAVA_BASH_TYPE.add(Integer.class);
		JAVA_BASH_TYPE.add(short.class);
		JAVA_BASH_TYPE.add(Short.class);
		JAVA_BASH_TYPE.add(BigInteger.class);

		JAVA_BASH_TYPE.add(long.class);
		JAVA_BASH_TYPE.add(Long.class);

		JAVA_BASH_TYPE.add(float.class);
		JAVA_BASH_TYPE.add(Float.class);

		JAVA_BASH_TYPE.add(double.class);
		JAVA_BASH_TYPE.add(Double.class);
		JAVA_BASH_TYPE.add(BigDecimal.class);

		JAVA_BASH_TYPE.add(boolean.class);
		JAVA_BASH_TYPE.add(Boolean.class);

		JAVA_BASH_TYPE.add(String.class);
		JAVA_BASH_TYPE.add(char.class);
		JAVA_BASH_TYPE.add(Character.class);
		JAVA_BASH_TYPE.add(byte.class);
		JAVA_BASH_TYPE.add(Byte.class);

		JAVA_BASH_TYPE.add(java.util.Date.class);
		JAVA_BASH_TYPE.add(java.sql.Date.class);
		JAVA_BASH_TYPE.add(java.sql.Time.class);
		JAVA_BASH_TYPE.add(java.sql.Timestamp.class);

	}

	private Set<String> includeProperties;
	private Set<String> excludeProperties;

	/**
	 * 非基本对象
	 * 
	 * @param obj
	 *            requestVO
	 * @return param1=$param1&parma2=$param2....
	 * @throws AuthException
	 */
	public StringBuilder getSigning(IRequest reqVO) throws AuthException {

		Class<?> clazz = reqVO.getClass();
		SignConfig signConfig = clazz.getAnnotation(SignConfig.class);
		if (signConfig != null) {
			setIncludeProperties(signConfig.includeProperties());
			setExcludeProperties(signConfig.excludeProperties());
		}else{
			 this.includeProperties = null;
			 this.excludeProperties =null;
		}
		return signConfig2String(reqVO);

	}

	/**
	 * 基本对象
	 * 
	 * @param obj
	 *            java 基本数据对象String,int....
	 * @param paramName
	 * @return paramName=obj
	 * @throws AuthException
	 */
	public StringBuilder getSigning(Object obj, String paramName) throws AuthException {

		if (JAVA_BASH_TYPE.contains(obj.getClass())) {
			return new StringBuilder().append(paramName).append("=").append(obj);
		} else {
			throw new AuthException(AuthException.ErrorMessageInfo.SIGN_INIT);
		}
	}

	private StringBuilder signConfig2String(IRequest obj) throws AuthException {
		StringBuilder singStr = null;
		if (this.excludeProperties == null && this.includeProperties == null) {// 检查属性上的注解
			singStr = getSigningConfigByElement(obj);
		} else if (this.excludeProperties != null && !this.excludeProperties.isEmpty()) { // 取部分
			singStr = getSigningConfigByExcludeProperties(this.excludeProperties, obj);
		} else if (this.excludeProperties != null && this.excludeProperties.isEmpty()) { // 全部
			singStr = getSigningConfigAll(obj);
		} else if (this.includeProperties != null && !this.includeProperties.isEmpty()) {// 
			singStr = getSigningConfigByIncludeProperties(this.includeProperties, obj);

		} else {
			singStr = new StringBuilder();
		}
		return singStr;
	}

	private StringBuilder getSigningConfigByElement(IRequest obj) throws AuthException {
		List<String> list = new ArrayList<String>();
		StringBuilder paramStr = new StringBuilder(1024);
		try {
			if (obj != null) {
				Class<?> clz = obj.getClass();
				// 获取实体类的所有属性，返回Field数组
				Field[] fields = clz.getDeclaredFields();
				for (Field fld : fields) {
					if (fld.getAnnotation(SignConfig.class) != null) {
						if (logger.isDebugEnabled()) {
							logger.debug("beanName:" + fld.getName());
						}
						Method getMethod;
						getMethod = clz.getMethod("get" + textCapWords(fld.getName()));
						Object val = getMethod.invoke(obj);
						if (val != null && !val.equals("")) {
							list.add(fld.getName() + "=" + val);
						}
					}
				}
			}
			return paramStr.append(list.toString().replace(", ", "&")).deleteCharAt(0).deleteCharAt(
					paramStr.length() - 1);
		} catch (Exception e) {
			e.printStackTrace();
			throw new AuthException(AuthException.ErrorMessageInfo.SIGN_INIT);
		}
	}

	private StringBuilder getSigningConfigByIncludeProperties(final Set<String> includeProperties, IRequest obj)
			throws AuthException {
		List<String> list = new ArrayList<String>();
		StringBuilder paramStr = new StringBuilder(1024);
		try {
			if (obj != null) {
				Class<?> clz = obj.getClass();
				// 获取实体类的所有属性，返回Field数组
				for (String fld : includeProperties) {
					Method getMethod = clz.getMethod("get" + textCapWords(fld));
					if (getMethod == null) {
						continue;
					}
					Object val = getMethod.invoke(obj);
					if (val != null && !val.equals("")) {
						list.add(fld + "=" + val);
					}
				}
			}
			return paramStr.append(list.toString().replace(", ", "&")).deleteCharAt(0).deleteCharAt(
					paramStr.length() - 1);
		} catch (Exception e) {
			e.printStackTrace();
			throw new AuthException(AuthException.ErrorMessageInfo.SIGN_INIT);
		}
	}

	private StringBuilder getSigningConfigAll(IRequest obj) throws AuthException {
		List<String> list = new ArrayList<String>();
		StringBuilder paramStr = new StringBuilder(1024);
		try {
			if (obj != null) {
				Class<?> clz = obj.getClass();
				// 获取实体类的所有属性，返回Field数组
				Field[] fields = clz.getDeclaredFields();
				for (Field fld : fields) {
					if (logger.isDebugEnabled()) {
						logger.debug("beanName:" + fld.getName());
					}
					Method getMethod = clz.getMethod("get" + textCapWords(fld.getName()));
					Object val = getMethod.invoke(obj);
					if (val != null && !val.equals("")) {
						list.add(fld.getName() + "=" + val);
					}
				}
			}
			return paramStr.append(list.toString().replace(", ", "&")).deleteCharAt(0).deleteCharAt(
					paramStr.length() - 1);
		} catch (Exception e) {
			e.printStackTrace();
			throw new AuthException(AuthException.ErrorMessageInfo.SIGN_INIT);
		}
	}

	/**
	 * 排除ExcludeProperties
	 * 
	 * @param excludeProperties
	 * @param obj
	 * @return
	 * @throws AuthException
	 */
	private StringBuilder getSigningConfigByExcludeProperties(final Set<String> excludeProperties, IRequest obj)
			throws AuthException {

		List<String> list = new ArrayList<String>();
		StringBuilder paramStr = new StringBuilder(1024);
		try {
			if (obj != null) {
				Class<?> clz = obj.getClass();
				// 获取实体类的所有属性，返回Field数组
				Field[] fields = clz.getDeclaredFields();
				for (Field fld : fields) {
					if (excludeProperties.contains(fld.getName())) {
						continue;
					}
					Method getMethod = clz.getMethod("get" + textCapWords(fld.getName()));
					Object val = getMethod.invoke(obj);
					if (val != null && !val.equals("")) {
						list.add(fld.getName() + "=" + val);
					}
				}
			}
			return paramStr.append(list.toString().replace(", ", "&")).deleteCharAt(0).deleteCharAt(
					paramStr.length() - 1);
		} catch (Exception e) {
			e.printStackTrace();
			throw new AuthException(AuthException.ErrorMessageInfo.SIGN_INIT);
		}
	}

	private void setIncludeProperties(String[] includeProperties) {
		if (null != includeProperties && 0 != includeProperties.length) {
			// this.includeProperties = new HashSet<String>();
			for (String fld : includeProperties) {
				if (null != fld && 0 != fld.length()) {
					this.includeProperties.add(fld);
				}
			}
		}
	}

	private void setExcludeProperties(String[] excludeProperties) {
		if (null != excludeProperties && 0 != excludeProperties.length) {
			if (excludeProperties.length == 1 && excludeProperties[0].length() == 0) {
				this.excludeProperties = new HashSet<String>();
				return;
			}
			for (String fld : excludeProperties) {
				if (null != fld && 0 != fld.length()) {
					this.excludeProperties.add(fld);
				}
			}
		}
	}

	/**
	 * 
	 * @param c
	 * @param szInterface
	 * @return
	 */
	public boolean isInterface(Class<?> c, String szInterface) {
		Class<?>[] face = c.getInterfaces();
		for (int i = 0, j = face.length; i < j; i++) {
			if (face[i].getName().equals(szInterface)) {
				return true;
			} else {
				Class<?>[] face1 = face[i].getInterfaces();
				for (int x = 0; x < face1.length; x++) {
					if (face1[x].getName().equals(szInterface)) {
						return true;
					} else if (isInterface(face1[x], szInterface)) {
						return true;
					}
				}
			}
		}
		if (null != c.getSuperclass()) {
			return isInterface(c.getSuperclass(), szInterface);
		}
		return false;
	}

	/**
	 * 首字母大写
	 * 
	 * @param name
	 * @return
	 */
	private static String textCapWords(String name) {
		StringBuilder newWords = new StringBuilder(name);
		newWords.replace(0, 1, newWords.substring(0, 1).toUpperCase());
		return newWords.toString();
	}

	public static void main(String[] args) {
		System.out.println(textCapWords("username"));
	}

}
