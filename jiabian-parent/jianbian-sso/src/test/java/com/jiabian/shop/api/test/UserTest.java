package com.jiabian.shop.api.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.jiabian.shop.api.test.util.HttpClientTool;
import com.jiabian.util.MD5;

public class UserTest {


	/**
	 * 测试登录
	 * com.jiabian.shop.api.test 
	 * 方法名：loginTest
	 * 创建人：何雪平 
	 * 时间：2016年10月26日-下午3:36:45  void
	 * @exception 
	 * @since  1.0.0
	 */
	@Test
	public void loginTest(){
		String url="http://192.168.1.188:18281/user/login";
		//String url="http://localhost:8080/user/login";
		Map<String, String> map=new HashMap<>();
		map.put("userAccount", "15378830293");
		map.put("userPwd", "111111");
	    map.put("sid", "1212");
		map.put("type", "1");
		// type 1: 手机号  2：用户名 3：邮箱
	    String json=HttpClientTool.doPost(url, map);
		System.out.println(json);
	}	
	
	/**
	 *根据id查询基本信息测试
	 * com.jiabian.shop.api.test 
	 * 方法名：selectBase
	 * 创建人：何雪平 
	 * 时间：2016年10月27日-下午3:16:29  void
	 * @exception 
	 * @since  1.0.0
	 */
	@Test
	public void selectBase(){
		String url="http://localhost:8080/user/base";
		Map<String, String> map=new HashMap<>();
		map.put("id", "7");
		String json=HttpClientTool.doPost(url, map);
		System.out.println(json);
	}
	
	/**
	 * 用户注册用例 
	 * com.jiabian.shop.api.test 
	 * 方法名：selectRegister
	 * 创建人：何雪平 
	 * 时间：2016年10月31日-下午2:35:43  void
	 * @exception 
	 * @since  1.0.0
	 */
	@Test
	public void selectRegister(){
		String url="http://localhost:8080/user/register";
		Map<String, String> map=new HashMap<>();
		map.put("userTel", "15378830293");
		map.put("userPwd", "123456");
		map.put("verCode", "288559");
		map.put("smsEnum", "SC_REGIST");
		String json=HttpClientTool.doPost(url, map);
		System.out.println(json);
	}
	
	/**
	 * 找回密码 核验
	 * com.jiabian.shop.api.test 
	 * 方法名：findCheckTest
	 * 创建人：何雪平 
	 * 时间：2016年11月8日-上午11:07:32  void
	 * @exception 
	 * @since  1.0.0
	 */
	@Test
	public void findCheckTest(){
		String url="http://localhost:8080/user/find/check";
		Map<String, String> map=new HashMap<>();
		map.put("userTel", "15378830293");
		map.put("verCode", "55");
		/*map.put("smsEnum", "SC_MPWD");*/
		String json=HttpClientTool.doPost(url, map);
		System.out.println(json);
	}
	
	/**
	 * 更新用户密码
	 * com.jiabian.shop.api.test 
	 * 方法名：updatePwdTest
	 * 创建人：何雪平 
	 * 时间：2016年11月8日-下午2:25:10  void
	 * @exception 
	 * @since  1.0.0
	 */
	@Test
	public void updatePwdTest(){
		String url="http://localhost:8080/user/pwd/update";
		Map<String, String> map=new HashMap<>();
		map.put("userTel", "15378830293");
		map.put("userPwd", "111111");
		/*map.put("smsEnum", "SC_MPWD");*/
		String json=HttpClientTool.doPost(url, map);
		System.out.println(json);
	}
	
	/**
	 * 测试用户详情
	 * com.jiabian.shop.api.test 
	 * 方法名：userDetail
	 * 创建人：何雪平 
	 * 时间：2016年11月9日-下午2:41:05  void
	 * @exception 
	 * @since  1.0.0
	 */
	@Test
	public void userDetail(){
		String url="http://localhost:8080/user/detail";
		Map<String, String> map=new HashMap<>();
		map.put("id", "283");
		String json=HttpClientTool.doPost(url, map);
		System.out.println(json);
	}
	
	/**
	 * 绑定手机
	 * com.jiabian.shop.api.test 
	 * 方法名：BoundCheck
	 * 创建人：何雪平 
	 * 时间：2016年11月9日-下午8:49:28  void
	 * @exception 
	 * @since  1.0.0
	 */
	@Test
	public void BoundCheck(){
		String url="http://localhost:8080/user/bound";
		Map<String, String> map=new HashMap<>();
		map.put("id", "244");
		map.put("userTel", "15378830291");
		map.put("verCode", "581578");
		map.put("smsEnum", "SC_BPHONE");
		String json=HttpClientTool.doPost(url, map);
		System.out.println(json);
	}
	
	/**
	 * 查询用户名修改状态
	 * com.jiabian.shop.api.test 
	 * 方法名：selectNameChangeTest
	 * 创建人：何雪平 
	 * 时间：2016年11月10日-下午8:34:11  void
	 * @exception 
	 * @since  1.0.0
	 */
	@Test
	public void selectNameChangeTest(){
		String url="http://localhost:8080/user/name/change";
		Map<String, String> map=new HashMap<>();
		map.put("id", "246");
		String json=HttpClientTool.doPost(url, map);
		System.out.println(json);
	}
	
	/**
	 * 更新用户名
	 * com.jiabian.shop.api.test 
	 * 方法名：updateUserNameTest
	 * 创建人：何雪平 
	 * 时间：2016年11月15日-下午2:51:40  void
	 * @exception 
	 * @since  1.0.0
	 */
	@Test
	public void updateUserNameTest(){
		String url="http://localhost:8080/user/name/update";
		Map<String, String> map=new HashMap<>();
		map.put("id", "246");
		map.put("userName", "刷漆");
		String json=HttpClientTool.doPost(url, map);
		System.out.println(json);
	}
	
	/**
	 * 第三方授权登录
	 * com.jiabian.shop.api.test 
	 * 方法名：userAuthTest
	 * 创建人：何雪平 
	 * 时间：2016年12月6日-下午3:49:13  void
	 * @exception 
	 * @since  1.0.0
	 */
	@Test
	public void userAuthTest(){
		String url="http://localhost:8080/user/auth";
		Map<String, String> map=new HashMap<>();
		map.put("openId", "5608329195");
		map.put("type", "2");
		String json=HttpClientTool.doPost(url, map);
		System.out.println(json);
	}
	
	/**
	 * 更新用户头像
	 * com.jiabian.shop.api.test 
	 * 方法名：updateUserImgTest
	 * 创建人：何雪平 
	 * 时间：2016年12月6日-下午3:50:51  void
	 * @exception 
	 * @since  1.0.0
	 */
	@Test
	public void updateUserImgTest(){
		String url="http://localhost:8080/user/img";
		Map<String, String> map=new HashMap<>();
		map.put("userId", "17");
		map.put("userImg", "http://oe01jrh3d.bkt.clouddn.com/FgKc1D26LMPrJwhizy3RZBMhTFc7");
		String json=HttpClientTool.doPost(url, map);
		System.out.println(json);
	}
	
	/**
	 * 即时通讯用户列表
	 * com.jiabian.shop.api.test 
	 * 方法名：userChatTest
	 * 创建人：何雪平 
	 * 时间：2016年12月7日-下午5:31:48  void
	 * @exception 
	 * @since  1.0.0
	 */
	@Test
	public void userChatTest(){
		String url="http://localhost:8080/user/chat";
		Map<String, String> map=new HashMap<>();
		String json=HttpClientTool.doPost(url, map);
		System.out.println(json);
	}
	
	/**
	 * 手机验证码登录
	 * com.jiabian.shop.api.test 
	 * 方法名：userVerLoginCheck
	 * 创建人：何雪平 
	 * 时间：2016年12月28日-下午5:59:33  void
	 * @exception 
	 * @since  1.0.0
	 */
	@Test
	public void userVerLoginCheck(){
		String url="http://localhost:8080/user/login/verCode";
		Map<String, String> map=new HashMap<>();
		map.put("userTel", "15378830293");
		map.put("verCode", "616942");
		map.put("smsEnum", "SC_LOGIN");
		String json=HttpClientTool.doPost(url, map);
		System.out.println(json);
	}
	
	/**
	 * 查询是否设置登录密码
	 * com.jiabian.shop.api.test 
	 * 方法名：selectLoginPwd
	 * 创建人：何雪平 
	 * 时间：2016年12月29日-上午10:37:03  void
	 * @exception 
	 * @since  1.0.0
	 */
	@Test
	public void selectLoginPwd(){
		String url="http://localhost:8080/user/login/userPwd";
		Map<String, String> map=new HashMap<>();
		map.put("userId", "150");
		String json=HttpClientTool.doPost(url, map);
		System.out.println(json);
	}
	
	/**
	 * 设置登录密码
	 * com.jiabian.shop.api.test 
	 * 方法名：insertLoginPwd
	 * 创建人：何雪平 
	 * 时间：2016年12月29日-上午10:46:21  void
	 * @exception 
	 * @since  1.0.0
	 */
	@Test
	public void insertLoginPwd(){
		String url="http://localhost:8080/user/login/userPwd/insert";
		Map<String, String> map=new HashMap<>();
		map.put("userId", "114");
		map.put("userPwd", "111111");
		String json=HttpClientTool.doPost(url, map);
		System.out.println(json);
	}
	
	/**
	 * 第三方换绑手机号
	 * com.jiabian.shop.api.test 
	 * 方法名：updateAuthUserTel
	 * 创建人：何雪平 
	 * 时间：2016年12月30日-下午2:16:49  void
	 * @exception 
	 * @since  1.0.0
	 */
	@Test
	public void updateAuthUserTel(){
		String url="http://localhost:8080/user/auth/userTel";
		Map<String, String> map=new HashMap<>();
		map.put("userId", "151");
		map.put("userTel", "15378830293");
		String json=HttpClientTool.doPost(url, map);
		System.out.println(json);
	}
	
	/**
	 * 查询用户手机号
	 * com.jiabian.shop.api.test 
	 * 方法名：selectUserTel
	 * 创建人：何雪平 
	 * 时间：2017年1月5日-下午1:36:45  void
	 * @exception 
	 * @since  1.0.0
	 */
	@Test
	public void selectUserTel(){
		String url="http://localhost:8080/user/userTel";
		Map<String, String> map=new HashMap<>();
		map.put("userId", "151");
		String json=HttpClientTool.doPost(url, map);
		System.out.println(json);
	}
	
	@Test
	public void aaa(){
		String userPwd = MD5.encryptionStr("111111"+ "HmzF");
		System.out.println(userPwd);
	}

	
}
