package com.tajok.web.util.designPattern.abstracFactory;

public class JdbcDAOFactory implements IDAOFactory{

	@Override
	public Object createDAO(String className) {
		
		Object o = null;
		try {
			o = Class.forName(className).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Jdbc");
		
		return o;
		
	}

}
