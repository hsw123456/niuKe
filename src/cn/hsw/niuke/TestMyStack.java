package cn.hsw.niuke;

import org.junit.Test;

/**
 * @author author: ShuWei Hu, 279577923@qq.com
 * @date createTime：2017年3月23日 下午2:34:55
 * @version 1.0
 */
public class TestMyStack {

	public static void main(String[] args) {

		MyStack ms = new MyStack();

		ms.push(1);
		ms.push(2);
		ms.push(5);
		ms.push(7);
		ms.push(9);
		ms.push(11);

		ms.pop();
		System.out.println(ms.peak());
		System.out.println(ms.pop());
		ms.pop();
		System.out.println(ms.pop());

	}

	@Test
	public void testMyQueue() {
		MyQueue mq = new MyQueue();

		mq.add(1);
		mq.add(3);
		mq.add(5);
		mq.add(7);

		System.out.println(mq.poll());
		System.out.println(mq.poll());
		mq.add(9);
		System.out.println(mq.poll());
		System.out.println(mq.poll());
		System.out.println(mq.poll());
		mq.add(11);
		mq.add(13);
		System.out.println(mq.poll());
		System.out.println(mq.peak());
	}

	@Test
	public void testReverseStack() {
		ReverseStack reverseStack = new ReverseStack();

		MyStack ms = new MyStack();
		ms.push(3);
		ms.push(5);
		ms.push(7);
		ms.push(9);
		reverseStack.reverse(ms);
		System.out.println(ms.peak());
	}
	
	@Test
	public void testSort() {
		ReverseStack reverseStack = new ReverseStack();

		MyStack ms = new MyStack();
		ms.push(2);
		ms.push(1);
		ms.push(5);
		ms.push(4);
		ms.push(3);
		ms.push(9);
		ms.push(7);
		ms.outPut();
		
		reverseStack.sort(ms);
		System.out.println();
		ms.outPut();

	}

}
