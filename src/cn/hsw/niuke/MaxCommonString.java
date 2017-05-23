package cn.hsw.niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author author: ShuWei Hu, 279577923@qq.com
 * @date createTime：2017年3月29日 下午7:39:56
 * @version 1.0
 * 求两个字符串的最大公共子串：问题没解决
 */
public class MaxCommonString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String str1 = scanner.nextLine();
			String str2 = scanner.nextLine();

			System.out.println(MaxCommonStr(str1, str2));
			

		}
	}

	private static int MaxCommonStr(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		
		List<String> subList1 = new ArrayList<>();
		List<String> subList2 = new ArrayList<>();
		
		for(int i= 0; i<len1; i++){
			for(int j = 0; j<len1 ; j++){
				subList1.add(str1.substring(i, j));
			}
		}

		return 0;
	}

}
