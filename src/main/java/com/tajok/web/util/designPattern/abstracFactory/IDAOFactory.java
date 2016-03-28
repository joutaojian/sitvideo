package com.tajok.web.util.designPattern.abstracFactory;

public interface IDAOFactory {

	public Object createDAO(String className);
	
}
