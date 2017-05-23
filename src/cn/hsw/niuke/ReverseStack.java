package cn.hsw.niuke;

/**
 * @author author: ShuWei Hu, 279577923@qq.com
 * @date createTime��2017��3��23�� ����8:11:29
 * @version 1.0 Ҫ��ʵ��һ��ջ�����򣬵���ֻ���õݹ麯�������ջ����Ĳ�����ʵ�֣� �������Լ��������������ݽṹ
 */
public class ReverseStack {

	/**
	 * �Ƴ�ջ��Ԫ�ز�����
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
		//�����ջ��Ԫ��
		int i = get(stack);
		reverse(stack);
		stack.push(i);
	}
	
	/**
	 * ��һ��ջ����
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
