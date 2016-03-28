package com.tajok.web.util.designPattern.singleton;

/**
 * 饿汉单例,先实例化，哪怕你没有调用
 * @author Administrator
 *
 */
public class EagerSingleton {

	private static final EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {
	}

	public static EagerSingleton getInstance(){
		
		return instance;
	}
	
}
