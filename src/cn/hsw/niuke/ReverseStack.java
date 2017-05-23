package cn.hsw.niuke;

/**
 * @author author: ShuWei Hu, 279577923@qq.com
 * @date createTime：2017年3月23日 下午8:11:29
 * @version 1.0 要求：实现一个栈的逆序，但是只能用递归函数和这个栈本身的操作来实现， 而不能自己申请其他的数据结构
 */
public class ReverseStack {

	/**
	 * 移除栈底元素并返回
	 * 
	 * @param stack
	 * @return
	 */
	public int get(MyStack stack) {

		int result = stack.pop();

		if (stack.isEmpty()) {
			return result;
		} else {
			int last = get(stack);
			stack.push(result);
			return last;
		}

	}
	
	public void reverse(MyStack stack){
		
		if(stack.isEmpty()){
			return ;
		}
		//获得了栈底元素
		int i = get(stack);
		reverse(stack);
		stack.push(i);
	}
	
	/**
	 * 将一个栈逆序
	 * @param stack
	 */
	public void sort(MyStack stack){
		MyStack help = new MyStack();
		
		while(!stack.isEmpty()){
			int current = stack.pop();
			if(help.isEmpty()){
				help.push(current);
			}else{
				if(current <= help.peak()){
					help.push(current);
				}else{
					while(!help.isEmpty()){
					stack.push(help.pop());}
					help.push(current);
				}
			}
		}
		
		while(!help.isEmpty()){
			stack.push(help.pop());
		}
		
	}

}
