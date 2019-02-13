package datastructure;
/**
 * 单向的队列
 */
public class Queue {
	private int maxSize;//队列长度
	private Object[] queue;
	private int front;//队头
	private int rear;//队尾
	private int nItems;//队中数据项个数
	
	public Queue(int max) {
		maxSize = max;
		queue = new Object[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert(Object value) {
		if (isFull()) {
			System.out.println("Can't insert "+value+" ,queue is full!");
			return;
		}
		if (rear == maxSize - 1) {
			rear = -1;
		}
		queue[++rear] = value;
		nItems++;
	}
	
	public Object remove() {
		if (isEmpty()) {
			System.out.println("Can't remove,queue is empty error!"+nItems);
			return null;
		}
		Object temp = queue[front++];
		if (front == maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}
	
	public Object peekFront() {
		return queue[front];
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
	
	public int size() {
		return nItems;
	}
	
	public void display() {
		while (!isEmpty()) {
			System.out.print(remove()+" ");
		}
		System.out.println("");
	}
}
