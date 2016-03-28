package com.tajok.web.util.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.mysql.jdbc.PreparedStatement;

public class JDBCUtil {

	public List<Map<String, Object>> SQLConnection(String sql) {

		// 0.预定义
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String url = null;
		String username = null;
		String password = null;
		List<Map<String, Object>> rs_list = null;
//		sql = "insert into t_user values(?,?,?,?,?,?,?)";
		java.sql.PreparedStatement pstmt = null;
		
		// 1.加载MySql的驱动类
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("找不到驱动程序类 ，加载驱动失败！");
			e.printStackTrace();
		}

		// 2.数据库配置信息
		url = "jdbc:mysql://localhost:3306/mybatis";
		username = "root";
		password = "";

		// 3.连接数据库
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException se) {
			System.out.println("数据库连接失败！");
			se.printStackTrace();
		}

		// 4.用Statement装载并执行SQL，接收返回结果
		try {
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);// 执行sql语句
//			ResultSetMetaData md = rs.getMetaData();// 获得结果集结构信息（字段数、字段名等）
//			int columnCount = md.getColumnCount();
//			rs_list = new ArrayList<Map<String, Object>>();
//			
//			while (rs.next()) {
//				Map<String, Object> rowData = new HashMap<String, Object>();
//				for (int i = 1; i <= columnCount; i++) {
//					rowData.put(md.getColumnName(i), rs.getObject(i));
//				}
//				rs_list.add(rowData);
//			}
			
//			stmt = conn.createStatement();
//			int insert = stmt.executeUpdate(sql) ;
//			System.out.println(insert);
//			9,'周XX','zhou','aa@qqq.com','1357809424','2016-03-09 19:07:28','4')
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,11);
			pstmt.setString(2,"zhou");
			pstmt.setString(3,"zhouXXX");
			pstmt.setString(4,"aa@qqq.com");
			pstmt.setInt(5,13578094);
			pstmt.setString(6,"2016-03-09 19:07:28");
			pstmt.setInt(7,3);
			int in =pstmt.executeUpdate(sql);
			
			/*
			 * //获取单个结果 while(rs.next()) { System.out.print(rs.getInt("id") +
			 * "   "); }
			 */
		} catch (SQLException e) {
			System.out.println("数据操作错误");
			e.printStackTrace();
		}

		// 5.关闭数据库
		try {
			if (rs != null) {// 关闭返回结果的数据流
				rs.close();
				rs = null;
			}
			if (stmt != null) {// 关闭Statement
				stmt.close();
				stmt = null;
			}
			if (conn != null) {// 关闭数据库
				conn.close();
				conn = null;
			}
		} catch (Exception e) {
			System.out.println("数据库关闭错误");
			e.printStackTrace();
		}

		return rs_list;
	}

}
