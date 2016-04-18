package com.tajok.web.util.sqlClient;

import java.sql.SQLException;

public class Run {

	public static void main(String[] args) throws SQLException {
		 Client c = new Client();
		 c.inPut();
	}

}
/*
String sql_add = "insert into t_user(name,password,email) values('aa','ba','ca')";
sql = "update t_user set name='lucy',password='123' where id=13";
sql = "select * from t_user";
sql = "delete from t_user where id=13";
 ExcuteSQL.delete();ExcuteSQL.add(c.getSQL());
 ExcuteSQL.update();
 ExcuteSQL.get();


Thread tt = new Thread(new Runnable() {
	public void run() {
		try {
			String sign =null;
			
			while(true){
				System.out.println(2);
			if(sign != c.getSQL()) {
				System.out.println(3);
				ExcuteSQL.add(c.getSQL());
				sign = c.getSQL();
			}
			}
		} catch (Exception e) {
		}
	}
});
*/