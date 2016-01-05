package com.tajok.test;

import org.junit.Test;

import com.tajok.alg.FenZhiFa;
import com.tajok.alg.ManLiFa;
import com.tajok.util.AlgUtil;

public class TestAlg {
	
	/**
	 * 测试蛮力法的冒泡和快排
	 */
	@Test
	public void test1(){
		
		Integer[] list = AlgUtil.randomArray(100,2);
		long startMili = System.currentTimeMillis();// 计时开始
//		ManLiFa.bubbleSort(list);// 冒泡排序
		ManLiFa.choiceSort(list);// 选择排序
		long endMili = System.currentTimeMillis();
		System.out.println("总耗时为：" + (endMili - startMili) + "毫秒");// 计时结束             
		
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}
	
	/**
	 * 测试分治法的归并排序
	 */
	@Test
	public void test2(){
		int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		FenZhiFa.mergeSort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}