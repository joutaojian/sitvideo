package com.tajok.designPattern.proxy;

public class Proxy implements Source{

	private Person person = new Person();
	
	@Override
	public void excuteMethod() {
		 before();  
		 person.excuteMethod();  
	     atfer();
	}
	
	//新增的方法
    private void atfer() {  
        System.out.println("after proxy!");  
    }  
    
    //新增的方法
    private void before() {  
        System.out.println("before proxy!");  
    }  
	
}
