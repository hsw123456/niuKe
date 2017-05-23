package cn.hsw.niuke;
/**
 * 	@author  author: ShuWei Hu, 279577923@qq.com
	@date createTime��2017��3��23�� ����6:45:14
 	@version 1.0 
 	��������ջʵ�ֶ��е�Ч����
 	ע�⣺�������Ƚ��ȳ���������(push,pop,peak)��
 	push:�Ӷ���ͷ�����һ��Ԫ�أ�pop:�Ӷ���β���Ƴ�һ��Ԫ��
 	
 */
public class MyQueue {
	
	private MyStack stackPush = new MyStack();
	
	private MyStack stackPop =  new MyStack();;
	
	
	public void add(int a){
		stackPush.push(a);
	}
	
	public int poll(){
		
		if(stackPop.isEmpty()){
			while(!stackPush.isEmpty()){
				stackPop.push(stackPush.pop());
			}
		}
		
		return stackPop.pop();
		
	}
	
	public int peak(){
		
		return 0;
		
	}

}
