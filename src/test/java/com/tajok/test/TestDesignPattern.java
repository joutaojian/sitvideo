package com.tajok.test;

import org.junit.Test;

import com.tajok.designPattern.factoryMethod.Food;
import com.tajok.designPattern.factoryMethod.FoodFactory;
import com.tajok.designPattern.proxy.Proxy;
import com.tajok.designPattern.proxy.Source;
import com.tajok.designPattern.strategy.AlgContext;

public class TestDesignPattern {

	/**
	 * FactoryMethod：工厂模式就是一个对象工厂，用于快捷便利的创建对象，并使用对象的方法和属性
	 * 简单工厂模式，包含了面向对象的封装、继承、多态
	 */
	@Test
	public void test1(){
		FoodFactory factory = new FoodFactory();
		Food food = factory.getFood("KaoYa");
		food.eat();
	}
	
	/**
	 * Strategy：策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户
	 * 策略模式，如果使用工厂模式需要经常性修改或维护难度大（面对算法的时常变动），可以使用策略模式
	 * 【这里策略模式和工厂模式相结合】：把每个算法当作一个对象，利用策略模式分离每个算法对象(使每个算法相互间不影响)，再利用工厂模式获取对象
	 */
	@Test
	public void test2(){
		AlgContext algcontext = new AlgContext("B");
		algcontext.getResult();
	}
	
	/**
	 * Proxy：代理模式，为对象提供一个代理以控制对象的访问
	 * 根据依赖倒转原则和里式代换原则，一个类最好实现一个公共接口，而不是继承父类
	 * 所以当一个实现公共接口的类，需要增加功能，但是根据开放-封闭原则，不应该对这个类进行修改
	 * 应该新建一个代理类实现一样的公共接口，并在代理类中实例化需要增加需求的类，调用该类的方法并在代理类中新增方法，一起使用
	 */
	@Test
	public void test3(){
		Source source = new Proxy();
		source.excuteMethod();
	}
}
