package cn.hsw.niuke;

import java.util.ArrayList;

/**
 * 	@author  author: ShuWei Hu, 279577923@qq.com
	@date createTime：2017年3月25日 上午11:14:44
 	@version 1.0 
 */
public class YueShu {
	
	public static void main(String[] args) {
		
	}
	
	// 求因数 时间复杂度较低
    public static ArrayList<Integer> getAppNums(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) {
                    list.add(n / i);
                }
            }
        }
        return list;
    }

}
