package com.tajok.web.util.sqlClient;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class ExcuteSQL {

	public static void add(String sql) {
		System.out.println("---执行插入---");
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			try {
				conn = JdbcUtil.getConnection();
				ps = conn.prepareStatement(sql);
				ps.executeUpdate();
				System.out.println("---成功---");
			} catch (SQLException e) {
				System.out.println("---SQL语句错误---");
			}
		} finally {
			JdbcUtil.close(rs, ps, conn);
		}

	}

	public static void get(String sql) {
		System.out.println("---执行查询---");
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ResultSetMetaData data;
		int j=0;
		List<String> list_name  = new ArrayList<String>();
		List<String> list_type  = new ArrayList<String>();
		try {
			conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			data = rs.getMetaData();
			//列
			for (int i = 1; i <= data.getColumnCount(); i++) {
				String columnTypeName = data.getColumnTypeName(i);
				String columnLabel = data.getColumnLabel(i);
				list_type.add(columnTypeName);
				list_name.add(columnLabel);
			}
			//行
			 while(rs.next()){
				 
				for(int i = 1; i <= data.getColumnCount(); i++,j++){
				if(list_type.get(j).equals("INT"))
					System.out.print(rs.getInt(list_name.get(j)));
				else if(list_type.get(j).equals("VARCHAR")){
					System.out.print(rs.getString(list_name.get(j)));
				}else if(list_type.get(j).equals("TIMESTAMP")){
					System.out.print(rs.getTimestamp(list_name.get(j)));
				}
				System.out.print(" | ");
				if(j==(data.getColumnCount()-1)){
					j=-1;
					System.out.println();
				}
				}
				}
			System.out.println("---成功---");
		}catch (SQLException e) {
			System.out.println("---SQL语句错误---");
		} finally {
			JdbcUtil.close(rs, ps, conn);
		}
	}

	public static void update(String sql) throws SQLException {
		System.out.println("---执行更新---");
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.executeUpdate();
			System.out.println("---成功---");
		}catch (SQLException e) {
			System.out.println("---SQL语句错误---");
		} finally {
			JdbcUtil.close(rs, ps, conn);
		}

	}

	public static void delete(String sql) throws SQLException {
		System.out.println("---执行删除---");
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.executeUpdate();
			System.out.println("---成功---");
		}catch (SQLException e) {
			System.out.println("---SQL语句错误---");
		} finally {
			JdbcUtil.close(rs, ps, conn);
		}

	}

}

/*
// 获得所有列的数目及实际列数
int columnCount = data.getColumnCount();
// 获得指定列的列名
String columnName = data.getColumnName(i);
// 获得指定列的列值
int columnType = data.getColumnType(i);
// 获得指定列的数据类型名
String columnTypeName = data.getColumnTypeName(i);
// 所在的Catalog名字
String catalogName = data.getCatalogName(i);
// 对应数据类型的类
String columnClassName = data.getColumnClassName(i);
// 在数据库中类型的最大字符个数
int columnDisplaySize = data.getColumnDisplaySize(i);
// 默认的列的标题
String columnLabel = data.getColumnLabel(i);
// 获得列的模式
String schemaName = data.getSchemaName(i);
// 某列类型的精确度(类型的长度)
int precision = data.getPrecision(i);
// 小数点后的位数
int scale = data.getScale(i);
// 获取某列对应的表名
String tableName = data.getTableName(i);
// 是否自动递增
boolean isAutoInctement = data.isAutoIncrement(i);
// 在数据库中是否为货币型
boolean isCurrency = data.isCurrency(i);
// 是否为空
int isNullable = data.isNullable(i);
// 是否为只读
boolean isReadOnly = data.isReadOnly(i);
// 能否出现在where中
boolean isSearchable = data.isSearchable(i);

System.out.println("列:" + i );
System.out.println("字段名称:" + columnName);
System.out.println("类型:"+ columnType);
System.out.println("数据类型名:" + columnTypeName);
System.out.println("所在的Catalog名字:"+ catalogName);
System.out.println("对应数据类型的类:"+ columnClassName);
System.out.println("在数据库中类型的最大字符个数:"+ columnDisplaySize);
System.out.println("默认的列的标题:" + columnLabel);
System.out.println("模式:" + schemaName);
System.out.println("类型的精确度(类型的长度):" + precision);
System.out.println("小数点后的位数:" + scale);
System.out.println("对应的表名:" + tableName);
System.out.println("是否自动递增:" + isAutoInctement);
System.out.println("在数据库中是否为货币型:" + isCurrency);
System.out.println("是否为空:" + isNullable);
System.out.println("是否为只读:" + isReadOnly);
System.out.println("能否出现在where中:"+ isSearchable);
*/
