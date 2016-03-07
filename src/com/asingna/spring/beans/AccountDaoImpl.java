package com.asingna.spring.beans;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	@Override
	public void outMoney(String out, int money) {
		String sql = "update account set money = money - ? where name = ? ";
		this.getJdbcTemplate().update(sql, money, out);
	}

	@Override
	public void inMoney(String in, int money) {
		String sql = "update account set money = money + ? where name = ? ";
		this.getJdbcTemplate().update(sql, money, in);
	}

}
