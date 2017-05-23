package cn.hsw.niuke;

import java.util.Stack;

/**
 * @author author: ShuWei Hu, 279577923@qq.com
 * @date createTime：2017年3月24日 上午11:31:38
 * @version 1.0
 */
public class ReverseList {

	public ListNode ReverseList(ListNode head) {
		
			if(head == null)
				return null;
			
	        Stack<Integer> stack = new Stack<>();
	       ListNode current = head;
	        
	        while(current!= null){
	            stack.push(current.val);
	            current = current.next;
	        }
	        
	        ListNode head1 = new ListNode(stack.pop());
	        	current  = head1;
	        	while(!stack.isEmpty()){
	        		current.next = new ListNode(stack.pop());
	        		current = head1.next;
	        	}
	       
	        
	       return current;
	      
	      
	    }
}

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}
