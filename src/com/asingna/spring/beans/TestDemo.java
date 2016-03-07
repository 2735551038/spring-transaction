package com.asingna.spring.beans;
 

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDemo {

	private static Logger logger = Logger.getLogger(TestDemo.class);
	
	@Resource(name="accountService")
	private AccountService accountService;
	@Test
	public void testTransfer()
	{
		//logger.debug("start debug transfer...");
		logger.info("start info ...");
		accountService.transfer("aaa", "bbb", 200);
	}
}
