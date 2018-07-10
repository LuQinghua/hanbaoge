package com.jiabian.inviter;

import com.jiabian.util.SMSEnum;

public interface IInviterBiz {

	Integer checkedUserTel(String userTel);

	Integer inviterRegister(String userTel, String userPwd, String reUserPwd,
			String verCode, Byte userSource, SMSEnum smsEnum,Long inviterId);
	
}
