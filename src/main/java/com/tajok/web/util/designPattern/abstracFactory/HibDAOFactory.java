package com.tajok.web.util.designPattern.abstracFactory;

public class HibDAOFactory implements IDAOFactory{

	@Override
	public Object createDAO(String className) {
		
		Object o = null;
		try {
			o = Class.forName(className).newInstance();//不能实例化接�?
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Hib");
		
		return o;
	}

}
