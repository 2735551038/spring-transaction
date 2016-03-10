package com.asingna.spring.beans;

import org.springframework.transaction.annotation.Transactional;

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	@Transactional
	@Override
	public void transfer(String out, String in, int money) {
		this.accountDao.outMoney(out, money);
		this.accountDao.inMoney(in, money);
	}

}
