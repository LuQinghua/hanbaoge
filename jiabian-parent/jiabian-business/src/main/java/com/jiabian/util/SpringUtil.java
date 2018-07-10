package com.jiabian.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.util.Assert;

/**
 * author huangshiping
 * @date:Aug 29, 201511:23:06 AM
 * @version:1.0
 */
public class SpringUtil implements ApplicationContextAware {
	private static ApplicationContext applicationContext = null;

	@Override
	public void setApplicationContext(ApplicationContext ac) throws BeansException {
		applicationContext = ac;
	}
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}
	public static Object getBean(String beanName) {
		return applicationContext.getBean(beanName);
	}
	public static boolean containsBean(String beanName) {
		return applicationContext.containsBean(beanName);
	}
	/**
	 * 获取实例
	 * @param name Bean名称
	 * @param type Bean类型
	 * @return 实例
	 */
	public static <T> T getBean(String name, Class<T> type) {
		Assert.hasText(name);
		Assert.notNull(type);
		return applicationContext.getBean(name, type);
	}
	public static <T> T getBean(Class<T> type) {
		Assert.notNull(type);
		return applicationContext.getBean(type);
	}
}
