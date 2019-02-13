package datastructure;
/**
 * 数组类
 * @author 小飞
 *
 */
public class Array {
	private Object[] array;
	private int size;
	
	public Array(int max) {
		array = new Object[max];
		size = 0;
	}
	/**
	 * 线性查找
	 * @param key
	 * @return
	 */
	public boolean find(Object key) {
		int i;
		for (i = 0; i < size; i++) {//从前往后逐一查找
			if (array[i] == key) {
				break;
			}
		}
		if (i == size) {
			return false;
		} else {
			return true;
		}
	}
	/**
	 * 插入（无序数组）：直接放在数组末尾位置
	 * @param value
	 */
	public void insert(Object value) {
		array[size] = value;
		size ++;
	}
	/**
	 * 删除（无序数组）
	 * @param value
	 * @return
	 */
	public boolean delete(Object value) {
		int i;
		for (i = 0; i < size; i++) {
			if (value == array[i]) {//查找value
				break;
			}
		}
		if (i == size) {
			return false;
		} else {
			for (int j = i; j < size; j++) {//在查找到的位置，把后面的数依次向前移动一位，数组长度减一
				array[j] = array[j+1];
			}
			size--;
			return true;
		}
	}
	/**
	 * 显示数组
	 */
	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
	}
	/**
	 * 二分查找（有序数组）：int型数组
	 * @param key
	 * @return 返回找到值的下标;未找到返回-1
	 */
	public int orderFind(int key) {
		int start = 0;
		int end = size - 1;
		int mid;
		
		while (start <= end) {
			mid = (start + end)/2;
			if ((int)array[mid] > key) {
				end = mid - 1;
			} else if ((int)array[mid] < key) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
	/**
	 * 递归实现二分查找
	 */
	public int recFind(int key,int lower,int upper) {
		int mid;
		mid = (lower+upper)/2;
		if ((int)array[mid] == key) {
			return mid;
		} else if (lower > upper) {
			return size;
		} else {
			if ((int)array[mid] < key) {
				return recFind(key,mid+1,upper);
			} else {
				return recFind(key,lower,mid-1);
			}
		}
	}
	/**
	 * 插入(有序数组):int型数组
	 */
	public void orderInsert(int value) {
		int i;
		for (i = 0; i < size; i++) {
			if ((int)array[i] > value) {
				break;
			}
		}
		for (int j = size; j > i; j--) {
			array[j] = array[j-1];
		}
		array[i] = value;
		size ++;
	}
	/**
	 * 删除
	 */
	public boolean orderDelete(int value) {
		int i = orderFind(value);
		if (i == size) {
			return false;
		} else {
			for (int j = i; j < size; j++) {
				array[j] = array[j+1];
			}
			size --;
			return true;
		}
	}
	/**
	 * 冒泡排序(int型数组)
	 */
	public void bubbleSort() {
		int temp = 0;
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				if ((int)array[i] > (int)array[j]) {
					temp = (int)array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	/**
	 * 选择排序(int型数组)
	 */
	public void selectSort() {
		int temp = 0;
		for (int i = 0; i < array.length-1; i++) {
			if ((int)array[i] > (int)array[i+1]) {
				temp = (int)array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
			}
		}
	}
	/**
	 * 插入排序(int型数组)
	 */
	public void insertSort() {
		int i;
		for (int j = 1; j < size; j++) {
			int temp = (int)array[j];
			i = j;
			while (i > 0 && (int)array[i-1] >= temp) {
				array[i] = array[i-1];
				--i;
			}
			array[i] = temp;
		}
	}
}
