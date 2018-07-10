package com.jiabian.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 参加签名对象的属性
 * 
 * SignConfig
 * 创建人:黄世平
 * 时间：2016年11月9日-下午1:18:14 
 * @version 1.0.0
 *
 */
@Documented 								  //包含在javadoc中
@Target({ElementType.TYPE,ElementType.FIELD}) //接口、类、枚举、注解//字段、枚举的常量
@Retention(RetentionPolicy.RUNTIME)           //注解会在class字节码文件中存在，在运行时可以通过反射获取到
public @interface SignConfig {

	/**
	 * 包含属性  支持正则
	 * 
	 * @return
	 */
	String[] includeProperties() default {};

	/**
	 * 排除属性 支持正则
	 * 
	 * @return
	 */
	String[] excludeProperties() default {};

}
