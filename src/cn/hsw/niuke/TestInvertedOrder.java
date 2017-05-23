package cn.hsw.niuke;



/**
 * 	@author  author: ShuWei Hu, 279577923@qq.com
	@date createTime：2017年4月6日 上午9:48:24
 	@version 1.0 
 	从尾部到头部访问链表
 */
public class TestInvertedOrder {
	
	public static void main(String[] args) {
		
		ListNode listNode = new ListNode(1);
		
		ListNode current = listNode;
		
		for(int i =2; i<10; i++){
			current.next = new ListNode(i);
			current = current.next;
		}
		
		outPrint(listNode);
		System.out.println();
		invertedPrint(listNode);
		
		
	}

	private static void invertedPrint(ListNode node) {
		
		if(node != null){
			if(node.next != null)
			{
				invertedPrint(node.next);
			}
			
			System.out.print(node.val + " ");
		}
		
	}

	private static void outPrint2(ListNode node) {
		
		if(node != null){
			System.out.print(node.val +" ");
			node = node.next;
			outPrint2(node);
		}
		
	}

	private static void outPrint(ListNode node) {
		
		if(node != null){
			System.out.print(node.val);
			ListNode current = node.next;
			
			while(current != null){
				System.out.print(" " +current.val);
				current = current.next;
			}
		}
		
		
	}
	
	

}
