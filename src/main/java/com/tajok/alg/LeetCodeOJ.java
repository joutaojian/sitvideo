package com.tajok.alg;

/**
 * LeetCodeOJ
 * @author taojian
 * @date 2016-1-9
 * @version 1.0
 */
public class LeetCodeOJ {
	
    //326.给定一个整数,编写函数判断它是否是3的幂
    public boolean isPowerOfThree(int n) {
        return n > 0 && (1162261467 % n == 0);
     }
    
    //231.给定一个整数,编写函数判断它是否是2的幂
    //java中的int是32位的，范围是-2147483648－2147483647(2^31)，无符号数的范围是4 294 967 296(2^32)
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) { return false;}
         int m = -n; // For example if n = 8, i.e., 0000 1000, m would be 1111 1000
         m &= n;//m=m&n , 按位与
         return m == n; 
         /*
          * return n > 0 && (1073741824 % n == 0);//1073741824是2^30
          */
         }
     
    //191.编写函数接收一个无符号整数，返回其二进制形式中包含的1的个数（也叫做汉明权重）
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans = 0;
        while (n != 0) {
            ans += n & 1;//每次只判定最后一位是否为1
            n >>>= 1;//右移一位
        }
        return ans;
    }
    
    //190.二进制逆位
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
    	
    	int i=0,j=0,result = 0;
        for(;i<32; i++) {
        if((n&1)==1) j += 1;
        result=j;
        j <<= 1;//因为这里，所以要循环31次
        n >>= 1;//右移一位
        }
        return result;
    /*
    @Test
    public void reverseBitsTest() {
    	System.out.println(reverseBits(-2147483648)); 
    }
    */
    }
    
    //268. Missing Number,找到连续数据中，少掉的一个
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return total - sum;
    }
    
}