package com.tajok.util;

import java.util.Random;

/**
 * 算法工具
 * @author taojian
 * @date 2015-12-30
 * @version 1.0
 */
public class AlgUtil {
	
	/**
	 * 提供足够大的随机数组
	 * @param num 数组的容量
	 * @param digit 数组内数值的最大位数，位数为2就是0~99
	 * @return
	 */
	public static Integer[] randomArray(int num,int digit){
		
		Integer[] list = new Integer[num];
		Random random = new Random();
		int mod = (int) Math.pow(10, digit);
		for (int i = 0; i < num; i++)
			list[i] = Math.abs(random.nextInt()) % mod;
		
		return list;
		
	}
}