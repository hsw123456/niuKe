package cn.hsw.niuke;

import java.util.Scanner;

/**
 * @author author: ShuWei Hu, 279577923@qq.com
 * @date createTime：2017年3月27日 下午9:09:38
 * @version 1.0 描述：小易拥有一个拥有魔力的手环上面有n个数字(构成一个环),当这个魔力手环每次使用魔力的时候就会发生一种奇特的变化：
 *  每个数字会变成自己跟后面一个数字的和(最后一个数字的后面一个数字是第一个),//
 *  一旦某个位置的数字大于等于100就马上对100取模(比如某个位置变为103,//
 *  就会自动变为3).现在给出这个魔力手环的构成，请你计算出使用k次魔力之后魔力手环的状态。
 *   输入描述: 输入数据包括两行：
 *  第一行为两个整数n(2 ≤ n ≤ 50)和k(1 ≤ k ≤ 2000000000),以空格分隔
 *  第二行为魔力手环初始的n个数，以空格分隔。范围都在0至99.
 */
public class MagicRing {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 输入的元素大小

		while (scanner.hasNext()) {
			int size = scanner.nextInt();
			int k = scanner.nextInt();
			int[] initArr = new int[size];
			
			for(int i=0; i<size; i++){
				initArr[i] = scanner.nextInt();
			}
			
			outPut(parse(initArr,k));
			System.out.println();
		}

	}

	private static void outPut(int[] arr) {
		if(arr != null){
			System.out.print(arr[0]);
			for(int i=1; i<arr.length; i++){
				System.out.print(" "+arr[i]);
			}
		}
		
	}

	private static int[] parse(int[] initArr, int k) {
		
		for(int i=0; i<k; i++){
			int temp = initArr[0];
			for(int j=0; j<initArr.length; j++){
				if(j == initArr.length-1){
					initArr[j] = initArr[j] + temp;
				}else {
					initArr[j] += initArr[j+1];
				}
				if(initArr[j]>=100) initArr[j] %=100;
			}
			
			
			
		}
		
		return initArr;
	}
}
