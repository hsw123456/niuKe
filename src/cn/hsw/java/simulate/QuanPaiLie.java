package cn.hsw.java.simulate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author author: ShuWei Hu, 279577923@qq.com
 * @date createTime：2017年4月9日 上午11:36:44
 * @version 1.0
 */
public class QuanPaiLie {

	public static void main(String[] args) {

		String str = "1123";
		QuanPaiLie(str, 0);

	}

	public static void QuanPaiLie(String str, int start) {

		if (start == str.length())
			System.out.println(str);

		else {

			for (int i = start; i < str.length(); i++) {
				
				if(!is_swap(str, start, i)){
					str = swap(str, start, i);
					QuanPaiLie(str, start + 1);}

			}
		}

	}

	private static String swap(String str, int i, int j) {
		char[] arr = str.toCharArray();
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return new String(arr);
	}

	private static boolean is_swap(String str, int begin, int k) {
		boolean flag = false;

		for (int i = begin; i < k; i++) {
			if (str.charAt(i) == str.charAt(k)) {
				flag = true;
				break;
			}
		}

		return flag;
	}
}
