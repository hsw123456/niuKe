package cn.hsw.niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author author: ShuWei Hu, 279577923@qq.com
 * @date createTime：2017年3月30日 下午6:26:51
 * @version 1.0
 * 求某个字符串的去全排列，未完成
 */
public class Permutation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String str = scanner.next();

			List<String> list = permutation(str);
			System.out.println(list);

		}
	}

	public static List<String> permutation(String str) {
		
		
		return parse(str.toCharArray(),0, str.length());
		
		
	}
	
	private static List<String> parse(char[] arr, int begin, int end) { 
		List<String> list = new ArrayList<>();
		
		for(int i=begin; i<end; i++){
			arr = swap(arr, begin, i);
			list.add(new String(arr));
			parse(arr, begin+1,end);
		}
		
		return list;
	}

	public static char[] swap(char[] arr, int i, int j){
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

}
