package com.jiabian.rest.control;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import javax.servlet.http.HttpServletResponse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.fastjson.JSON;
import com.jiabian.rongyun.model.SendMessage;
import com.jiabian.rongyun.model.SystemMessage;
import com.jiabian.user.request.UsersReq;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class ActControlTest extends BaseJunit4Test {
	MockMvc mockMvc;

	@BeforeClass
	public static void BeforeClass() {
	}
	@Before
	public void setUp() throws Exception {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
		session = new MockHttpSession();
		request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
	}
	@Test
	public void login() throws Exception {
		
		//UserThirdRegReq userThirdRegReq = new UserThirdRegReq();
		//userThirdRegReq.setMobile(getTel());
		//userThirdRegReq.setPassword("123456");
		UsersReq usersReq = new UsersReq();
		String body = JSON.toJSONString(usersReq);
		HttpHeaders httpHeaders = this.getHttpHeader(session.getId(), body);
		MvcResult result = mockMvc.perform(
				post("/users/nearbyFriends").contentType(MediaType.APPLICATION_JSON).content(body).headers(httpHeaders))
				.andDo(MockMvcResultHandlers.print()).andReturn();
		Assert.assertEquals(result.getResponse().getStatus(), HttpServletResponse.SC_OK);
	}
	
	
	
	
	@Test
	public void testnice() throws Exception {
		UsersReq usersReq = new UsersReq();
		String body = JSON.toJSONString(usersReq);
		HttpHeaders httpHeaders = this.getHttpHeader(session.getId(), body);
		MvcResult result = mockMvc.perform(
				post("/common/getUserInfo").contentType(MediaType.APPLICATION_JSON).content(body).headers(httpHeaders))
				.andDo(MockMvcResultHandlers.print()).andReturn();
		Assert.assertEquals(result.getResponse().getStatus(), HttpServletResponse.SC_OK);
	}
	
	
	
	@Test
	public void testSogn() {
		SystemMessage msg = new SystemMessage();
		msg.setHeadIcon("http://");
		msg.setNickName("aa");
		msg.setSex(1);
		msg.setMsgType(2);
		msg.setTagType("sys.jiabian");
		msg.setContent("test");
		SendMessage.sendMessage("5", msg);
	}
}
