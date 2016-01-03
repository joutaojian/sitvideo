package com.tajok.test;

import org.junit.Test;
import com.tajok.alg.ManLiFa;
import com.tajok.util.AlgUtil;

public class TestAlg {
	
	@Test
	public void test1(){
		
		Integer[] list = AlgUtil.randomArray(1000,2);
		long startMili = System.currentTimeMillis();// 计时开始
//		ManLiFa.bubbleSort(list);// 冒泡排序
		ManLiFa.choiceSort(list);// 选择排序
		long endMili = System.currentTimeMillis();
		System.out.println("总耗时为：" + (endMili - startMili) + "毫秒");// 计时结束             
		
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}
}