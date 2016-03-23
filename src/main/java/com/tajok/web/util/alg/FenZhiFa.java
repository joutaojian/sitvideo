package com.tajok.web.util.alg;

import java.util.Arrays;

/**
 * 分治法：分解复杂问题，大问题化为一个一个的小问题，对每个问题求解并合并
 * @author taojian
 * @date 2016-1-4
 * @version 1.0
 */
public class FenZhiFa {

	/**
	 * 归并排序
	 * 归并（Merge）排序法是将两个（或两个以上）有序表合并成一个新的有序表
	 * S=O(n),T=O(nlog2n),稳定算法
	 * @param data
	 * @param left
	 * @param right
	 */
	public static void mergeSort(int[] data, int left, int right) {
	    // TODO Auto-generated method stub
	    if(left<right){
	        //找出中间索引
	        int center=(left+right)/2;
	        //对左边数组进行递归
	        mergeSort(data,left,center);
	        //对右边数组进行递归
	        mergeSort(data,center+1,right);
	        //合并
	        merge(data,left,center,right);
	        
	    }
	}
	public static void merge(int[] data, int left, int center, int right) {
	    // TODO Auto-generated method stub
	    int [] tmpArr=new int[data.length];
	    int mid=center+1;
	    //third记录中间数组的索引
	    int third=left;
	    int tmp=left;
	    while(left<=center&&mid<=right){
	        //从两个数组中取出最小的放入中间数组
	        if(data[left]<=data[mid]){
	            tmpArr[third++]=data[left++];
	        }else{
	            tmpArr[third++]=data[mid++];
	        }
	    }
	    //剩余部分依次放入中间数组
	    while(mid<=right){
	        tmpArr[third++]=data[mid++];
	    }
	    while(left<=center){
	        tmpArr[third++]=data[left++];
	    }
	    //将中间数组中的内容复制回原数组
	    while(tmp<=right){
	        data[tmp]=tmpArr[tmp++];
	    }
	    System.out.println(Arrays.toString(data));
	}


	
	/**
	 * 快速排序
	 * 从数列中取出一个数作为基准数；分区过程，将比这个数大的数全放到它的右边，小于或等于它的数全放到它的左边；再对左右区间重复第二步，直到各区间只有一个数
	 * S=O(n),T=O(nlog2n),不稳定算法
	 * @param s
	 * @param l
	 * @param r
	 */
	public static void quickSort(int[]s,int l,int r){
			
	}
	
	/**
	 * 二分查找
	 */
}
