package cn.hsw.niuke;

import java.util.Scanner;


/**
 * 	@author  author: ShuWei Hu, 279577923@qq.com
	@date createTime：2017年3月29日 下午8:30:59
 	@version 1.0 
 */
public class CountDifference {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()){
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			
			System.out.println(counter(a,b,c));
			
			
		}
	}

	private static int counter(int a, int b, int c) {
		
		int m = a/c -1;
		int n = b/c + 1;
		int count  =0;
		for(int k=m; k<n; k++){
			if(k*c>= a && k*c<=b)
				count++;
		}
		
		return count;
	}

}
