package com.tajok.web.util.designPattern.strategy;

public class AlgContext {
	
	private Alg alg;

	public AlgContext(String s){
		
		switch(s){
		case "A":Alg_A algA = new Alg_A();alg = algA;break;
		case "B":Alg_B algB = new Alg_B();alg = algB;break;
		case "C":Alg_C algC = new Alg_C();alg = algC;break;
		default:System.out.print("没有这种算法！");
		}
	}

	public void getResult(){
		alg.excuteAlg();
	}
}

