package com.tajok.test;

import org.junit.Test;

import com.tajok.web.util.utils.JDBCUtil;

public class TestJDBC {
	
	@Test
	public void test1(){
		JDBCUtil jdbc = new JDBCUtil();
//		String sql = "select Count(*) from t_user";
//		String sql = "insert into t_user values("+"9"+","+"'周XX'"+","+"'zhou'"+","+"'aa@qqq.com'"+","+"'1357809424'"+","+"'2016-03-09 19:07:28'"+","+"'4'"+")";
//		System.out.println(sql);
		String sql = null;
		System.out.println(jdbc.SQLConnection(sql));
		
	}

	
}
