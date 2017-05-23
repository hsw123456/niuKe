package cn.hsw.niuke;

import java.util.ArrayList;
import java.util.List;

/**
 * 	@author  author: ShuWei Hu, 279577923@qq.com
	@date createTime：2017年4月8日 上午11:05:18
 	@version 1.0 
 */
public class QuanPaiLie {
	
	public static void main(String[] args) {
		
		String str = "abc";
		
		List<String> result = new ArrayList<>();
		permutation(str, 0, str.length()-1, result);
		
		System.out.println(result);
		
	}

	private static void permutation(String str, int start, int end,List<String> result) {
		
		if(start == end)
			return;
		else {
			
			for(int i = start; i<=end ; i++){
				String newStr = swap(str, start, i);
				result.add(newStr);
				permutation(newStr, start+1, end ,result);
			}
			
		}
		
	}
	
	private static String swap(String str , int i, int j){
		
		char[] arr = str.toCharArray();
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return new String(arr);
		
	}

}
