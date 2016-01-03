package com.tajok.alg;

/**
 * 蛮力法：简单直接的解决问题
 * 优点：适用性，简单性
 * 缺点：效率低
 * @author taojian
 * @date 2015-12-30
 * @version 1.0
 */

public class ManLiFa {

	/**
	 * 直接排序
	 * S=O(1),T=O(n2),稳定算法
	 * @param a
	 */
	public static void choiceSort(Integer[] a) {
		if (a == null || a.length <= 0) {
			return;
		}
		for (int i = 0; i < a.length; i++) {
			int min = i; /* 将当前下标定义为最小值下标 */

			for (int j = i + 1; j < a.length; j++) {
				if (a[min] > a[j]) { /* 如果有小于当前最小值的关键字 */
					min = j; /* 将此关键字的下标赋值给min */
				}
			}
			if (i != min) {/* 若min不等于i，说明找到最小值，交换 */
				int tmp = a[min];
				a[min] = a[i];
				a[i] = tmp;
			}
		}
	}

	/**
	 * 冒泡排序
	 * S=O(1),T=O(n2),稳定算法
	 * @param a
	 */
	public static void bubbleSort(Integer[] a) {
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	
}