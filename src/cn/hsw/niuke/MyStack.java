package cn.hsw.niuke;

import java.util.Arrays;

/**
 * @author author: ShuWei Hu, 279577923@qq.com
 * @date createTime��2017��3��23�� ����2:13:18
 * @version 1.0 ģ��ջ��ʵ��
 */
public class MyStack {

	private static final int DEFALUT_CAPACITY = 5;

	private int[] theArray;

	private int topOfStack;

	public MyStack() {
		theArray = new int[DEFALUT_CAPACITY];
		topOfStack = -1;
	}

	public void push(int a) {

		if (++topOfStack == theArray.length) {
			
			int newCapacity = theArray.length*2;
			theArray = Arrays.copyOf(theArray, newCapacity);

			// ���ݸ��ƹ�ȥ����

		}
		theArray[topOfStack] = a;

	}

	public boolean isEmpty(){
		
		return topOfStack == -1;
	}

	public int peak() {
		if(isEmpty())
			throw new UnderflowException("ArrayStack top");
		
		return theArray[topOfStack];

	}

	public int pop() {
		if(isEmpty())
			throw new UnderflowException("ArrayStack pop");
		
		int topValue = theArray[topOfStack];
		topOfStack--;
		return topValue;
	}
	
	public void outPut(){
		if(isEmpty()){
			System.out.println("��ջΪ�գ�");
		}else{
			System.out.println("��ջ�׵�ջ����Ԫ�طֱ�Ϊ��");
			for(int i =0; i<=topOfStack; i++){
				System.out.print(theArray[i] + " ");
			}
			
		}

	}

}
