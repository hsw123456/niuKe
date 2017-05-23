package cn.hsw.niuke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author author: ShuWei Hu, 279577923@qq.com
 * @date createTime��2017��3��24�� ����7:46:39
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

		int state = -1;// ���״̬
		// �ж��Ƿ�Ϊ�ֵ�˳��
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
			state = 0;// ״̬0 ��Ϊ���ֵ�˳������
		}

		boolean flag2 = false;
		// �ж��Ƿ�Ϊ����������
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i).length() > list.get(i + 1).length()) {
				flag = true;
				break;
			}
		}

		if (!flag2) {
			state = 1;// ״̬01�����ϰ���������
		}
		// �ж��Ƿ����߶���
		if (!flag && !flag2) {
			state = 2;// ״̬2�������߶�����
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
