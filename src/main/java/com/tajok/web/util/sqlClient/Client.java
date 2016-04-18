package com.tajok.web.util.sqlClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {
	
	private String s;


	public void inPut() throws SQLException {
		String readline = null;
		BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
		try {
			readline = sin.readLine();// 从系统标准输入读入一字符串
			while (!readline.equals("exit")) {
				System.out.println("输入:" + readline);
				switch(readline.subSequence(0, 1).toString())
				{
				case "i":ExcuteSQL.add(readline);break;
				case "s":ExcuteSQL.get(readline);break;
				case "u":ExcuteSQL.update(readline);break;
				case "d":ExcuteSQL.delete(readline);break;
				default:break;
				}
				readline = sin.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setSQL(String s) {
		this.s = s;
	}
	public String getSQL() {
		return s;
	}


}
