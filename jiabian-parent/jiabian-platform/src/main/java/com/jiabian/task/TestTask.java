package com.jiabian.task;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * 
 * @author admin
 *
 */
@Component
public class TestTask {
	private static final Logger logger = LogManager.getLogger(TestTask.class.getName());
    /**
	 * 活动开始前2.5小时
	 */
	@Scheduled(cron = "0 3,32 * * * ? ")
	// 每十分中做一次
	public void test() {
		logger.info("测试任务..");
	}
}
