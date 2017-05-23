package cn.hsw.java.simulate;

/**
 * @author author: ShuWei Hu, 279577923@qq.com
 * @date createTime：2017年3月30日 下午3:30:07
 * @version 1.0
 */
public class MyLinkedList<T> {

	public MyLinkedList() {
		header = new ListNode<T>(null);
	}

	public boolean isEmpty() {
		return header.next == null;
	}

	public void makeEmpty() {
		header.next = null;
	}

	public LinkedListIterator<T> zeroth() {
		return new LinkedListIterator<>(header);
	}

	public LinkedListIterator<T> first() {
		return new LinkedListIterator<>(header.next);

	}

	public void insert(T x, LinkedListIterator<T> p) {
		if (p != null && p.current != null)
			p.current.next = new ListNode<T>(x, p.current.next);
	}

	public LinkedListIterator<T> find(T t) {
		ListNode<T> itr = header.next;

		while (itr != null && !itr.element.equals(t)) {
			itr = itr.next;
		}

		return new LinkedListIterator<>(itr);
	}

	public LinkedListIterator<T> findPrevious(T t) {
		ListNode<T> itr = header.next;

		while (itr.next != null && !itr.next.element.equals(t)) {
			itr = itr.next;
		}

		return new LinkedListIterator<>(itr);
	}

	public void remove(T x) {
		LinkedListIterator<T> p = findPrevious(x);
		if (p.current.next != null)
			p.current.next = p.current.next.next;

	}

	// 一个空的头结点
	private ListNode<T> header;

}

/**
 * 记录链表位置的类
 * 
 * @param <T>
 */
class LinkedListIterator<T> {
	ListNode<T> current; // Current position

	public LinkedListIterator(ListNode<T> current) {
		super();
		this.current = current;
	}

	public boolean isValid() {
		return current != null;
	}

	// retrieve:检索，取回
	public T retrieve() {
		return isValid() ? current.element : null;
	}

	public void advance() {
		if (isValid())
			current = current.next;
	}
}

class ListNode<T> {

	public T element;
	public ListNode<T> next;

	public ListNode(T theElement) {
		this(theElement, null);
	}

	public ListNode(T theElement, ListNode<T> n) {
		element = theElement;
		next = n;
	}
}