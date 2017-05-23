package cn.hsw.niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author author: ShuWei Hu, 279577923@qq.com
 * @date createTime：2017年3月24日 下午8:46:40
 * @version 1.0
 */
public class HuiWen {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String a = scanner.next();
			String b = scanner.next();
			System.out.println(Counter(a, b));

		}
	}

	private static int Counter(String a, String b) {
		List<String> strList = new ArrayList<>();

		strList.add(b + a);
		for (int i = 0; i < a.length(); i++) {
				String half = a.substring(0, i);
				String other = a.substring(i);
				strList.add(half + b + other);
		}
		
		int count  = 0;
		
		for(int i= 0; i<strList.size(); i++){
			String str = strList.get(i);
			int k = str.length()-1;
			boolean flag = false;
			for(int j= 0;j<=k; j++,k--){
				if(str.charAt(j) != str.charAt(k)){
					flag = true;
					break;
				}
			}
			
			if(!flag){
				count++ ;
			}
		}
		
		return count;

	}

}
