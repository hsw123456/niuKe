package cn.hsw.niuke;
/**
 * 	@author  author: ShuWei Hu, 279577923@qq.com
	@date createTime：2017年3月23日 下午6:45:14
 	@version 1.0 
 	利用两个栈实现队列的效果：
 	注意：队列是先进先出，后进后出(push,pop,peak)，
 	push:从队列头部添加一个元素，pop:从对列尾部移除一个元素
 	
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
