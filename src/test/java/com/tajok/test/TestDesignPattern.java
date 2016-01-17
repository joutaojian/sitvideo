package com.tajok.test;

import org.junit.Test;

import com.tajok.designPattern.factoryMethod.Food;
import com.tajok.designPattern.factoryMethod.FoodFactory;
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
	
}
