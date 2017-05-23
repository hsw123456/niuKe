package cn.hsw.niuke;

import java.util.Arrays;

/**
 * @author author: ShuWei Hu, 279577923@qq.com
 * @date createTime：2017年3月23日 下午2:13:18
 * @version 1.0 模拟栈的实现
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

			// 数据复制过去？？

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
			System.out.println("该栈为空！");
		}else{
			System.out.println("从栈底到栈顶的元素分别为：");
			for(int i =0; i<=topOfStack; i++){
				System.out.print(theArray[i] + " ");
			}
			
		}

	}

}
