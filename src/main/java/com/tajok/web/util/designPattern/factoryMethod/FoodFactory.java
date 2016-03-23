package com.tajok.web.util.designPattern.factoryMethod;

public class FoodFactory {
	
	public Food getFood(String foodName){
		
		Food food = null;
		switch(foodName){
		case "JiPa":food = new JiPa();break;
		case "KaoYa":food = new KaoYa();break;
		case "ShaoJi":food = new ShaoJi();break;
		default:System.out.print("没有这种食物！");
		}
		return food;
		
	}

}
