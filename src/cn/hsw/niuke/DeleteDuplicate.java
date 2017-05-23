package cn.hsw.niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

/**
 * @author author: ShuWei Hu, 279577923@qq.com
 * @date createTime：2017年3月24日 下午3:23:08
 * @version 1.0
 *删除重复数未完成
 */
public class DeleteDuplicate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int size = scanner.nextInt();

			Stack<Integer> stack = new Stack<>();
			int[] arr = new int[size];

			for (int i = size - 1; i >= 0; i--) {
				arr[i] = scanner.nextInt();
			}
			stack.push(arr[0]);
			for (int i = 1; i < size; i++) {
				if (stack.peek() != arr[i]) {
					stack.push(arr[i]);
				}
			}
			outPut(stack);
		}
	}

	private static void outPut(Stack<Integer> stack) {
		if (stack != null) {
			System.out.print(stack.pop());
			while (!stack.isEmpty()) {
				System.out.print(" " +stack.pop());
			}
		}
	}

}
