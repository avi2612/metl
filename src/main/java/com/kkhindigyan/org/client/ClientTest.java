package com.kkhindigyan.org.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kkhindigyan.org.model.Account;
import com.kkhindigyan.org.service.AccountService;
import com.kkhindigyan.org.service.impl.AccountServiceImpl;
/**
* @author Avinash Singh
* spring App client Program
*/
public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = null;
		try {
			ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
			AccountService accountService1 = ctx.getBean("accountService", AccountServiceImpl.class);
			accountService1.updateAccountBalance(new Account("6770865400", "Money tranfer"), 5000L);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(ctx != null)
				ctx.close();
		}
	}

}
