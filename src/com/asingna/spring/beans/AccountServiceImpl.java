package com.asingna.spring.beans;

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void transfer(String out, String in, int money) {
		this.accountDao.outMoney(out, money);
		this.accountDao.inMoney(in, money);
	}

}
