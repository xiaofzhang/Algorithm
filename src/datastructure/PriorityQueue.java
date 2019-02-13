package datastructure;
/**
 * 优先级队列:数据项按关键字的值有序
 */
public class PriorityQueue {
	private int maxSize;
	private int[] priorityQ;
	private int nItems;
	
	public PriorityQueue(int max) {
		maxSize = max;
		priorityQ = new int[maxSize];
		nItems = 0;
	}
	
	public void insert(int value) {
		int i;
		if (nItems == 0) {
			priorityQ[nItems++] = value;
		} else {
			for (i = nItems - 1; i >= 0; i--) {
				if (value > priorityQ[i]) {
					priorityQ[i+1] = priorityQ[i];
				} else {
					break;
				}
			}
			priorityQ[i+1] = value;
			nItems++;
		}
	}
	
	public int remove() {
		return priorityQ[--nItems];
	}
	
	public int peekMin() {
		return priorityQ[nItems-1];
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
	
	public void display() {
		while (!isEmpty()) {
			System.out.print(remove()+" ");
		}
		System.out.println("");
	}
}
