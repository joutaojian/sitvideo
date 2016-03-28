package com.tajok.web.util.designPattern.singleton;

/**
 * 懒汉单例，调用的时候再实例化
 * @author Administrator
 *
 */
public class LazySingleton {

	private static LazySingleton instance = null;
	
	private LazySingleton() {
	}

	public static LazySingleton getInstance(){
		
		if(instance==null)
			instance = new LazySingleton();
		
		return instance;
	}

}
