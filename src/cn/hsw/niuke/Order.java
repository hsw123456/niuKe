package cn.hsw.niuke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author author: ShuWei Hu, 279577923@qq.com
 * @date createTime：2017年3月24日 下午7:46:39
 * @version 1.0
 */
public class Order {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			List<String> strList = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				strList.add(scanner.next());
			}

			System.out.println(outPut(strList));

		}

	}

	public static String outPut(List<String> list) {

		int state = -1;// 标记状态
		// 判断是否为字典顺序
		List<String> dest = new ArrayList<>(list);
		Collections.sort(list);
		boolean flag = false;

		for (int i = 0; i < list.size(); i++) {
			if (!list.get(i).equals(dest.get(i))) {
				flag = true;
				break;
			}
		}

		if (!flag) {
			state = 0;// 状态0 即为按字典顺序排序
		}

		boolean flag2 = false;
		// 判断是否为按长度排序
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i).length() > list.get(i + 1).length()) {
				flag = true;
				break;
			}
		}

		if (!flag2) {
			state = 1;// 状态01即符合按长度排序
		}
		// 判断是否两者都是
		if (!flag && !flag2) {
			state = 2;// 状态2：即两者都符合
		}

		if (state == 0) {
			return "lexicographically";
		} else if (state == 1) {
			return "lengths";
		} else if (state == 2) {
			return "both";
		} else {
			return "none";
		}

	}

}
