package cn.hsw.niuke;

import java.util.ArrayList;

/**
 * 	@author  author: ShuWei Hu, 279577923@qq.com
	@date createTime��2017��3��25�� ����11:14:44
 	@version 1.0 
 */
public class YueShu {
	
	public static void main(String[] args) {
		
	}
	
	// ������ ʱ�临�ӶȽϵ�
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
