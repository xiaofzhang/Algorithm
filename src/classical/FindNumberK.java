package classical;

/**
 * 寻找数组中第k大的元素
 */
public class FindNumberK {
    /**
     * method1:数组排序法
     */
    public int findNumberKeyBySort(int[] array,int key) {
        if (key < 0 || key >= array.length) {
            System.out.println("key 不合法!");
            return -1;
        }
        //插入排序
        int i;
        for (int j = 1; j < array.length; j++) {
            int temp = array[j];
            i = j;
            while (i > 0 && array[i-1] <= temp) {
                array[i] = array[i-1];
                --i;
            }
            array[i] = temp;
        }
        return array[key-1];
    }
}
