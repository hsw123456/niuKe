package cn.hsw.niuke;

import java.util.Scanner;

/**
 * @author author: ShuWei Hu, 279577923@qq.com
 * @date createTime��2017��3��27�� ����9:09:38
 * @version 1.0 ������С��ӵ��һ��ӵ��ħ�����ֻ�������n������(����һ����),�����ħ���ֻ�ÿ��ʹ��ħ����ʱ��ͻᷢ��һ�����صı仯��
 *  ÿ�����ֻ����Լ�������һ�����ֵĺ�(���һ�����ֵĺ���һ�������ǵ�һ��),//
 *  һ��ĳ��λ�õ����ִ��ڵ���100�����϶�100ȡģ(����ĳ��λ�ñ�Ϊ103,//
 *  �ͻ��Զ���Ϊ3).���ڸ������ħ���ֻ��Ĺ��ɣ���������ʹ��k��ħ��֮��ħ���ֻ���״̬��
 *   ��������: �������ݰ������У�
 *  ��һ��Ϊ��������n(2 �� n �� 50)��k(1 �� k �� 2000000000),�Կո�ָ�
 *  �ڶ���Ϊħ���ֻ���ʼ��n�������Կո�ָ�����Χ����0��99.
 */
public class MagicRing {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// �����Ԫ�ش�С

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
