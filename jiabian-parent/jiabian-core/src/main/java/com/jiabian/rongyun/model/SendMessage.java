package com.jiabian.rongyun.model;

import com.jiabian.rongyun.rongyun.io.rong.ApiHttpClient;
import com.jiabian.rongyun.rongyun.io.rong.models.SdkHttpResult;

public class SendMessage {
	public static void sendMessage(String toUserId, SystemMessage msg) {
		try {
			SdkHttpResult res = ApiHttpClient.publishSingleMessage("1", toUserId, msg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
