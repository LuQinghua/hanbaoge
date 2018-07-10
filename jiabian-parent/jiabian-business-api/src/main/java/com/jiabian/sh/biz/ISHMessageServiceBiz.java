package com.jiabian.sh.biz;

import com.jiabian.rongyun.model.SystemMessage;



/**
 * 消息接口
 * @author admin
 *
 */
public interface ISHMessageServiceBiz {
	public void sendMessage(String toUserId,SystemMessage msg);
	
}

