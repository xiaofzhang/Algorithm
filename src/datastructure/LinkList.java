package datastructure;

import utils.MyException;

public class LinkList {
    private Node first;

    public LinkList() {
        first = null;
    }

    //每插入一元素，都放在现有元素的左边
    /**
     * 添加新节点
     * @param newNode
     */
    public void insertNode(Node newNode) {
        newNode.setNext(first);
        first = newNode;
    }

    /**
     * 添加新节点
     * @param data
     */
    public void insertNode(Object data) {
        Node newNode = new Node(data);
        newNode.setNext(first);
        first = newNode;
    }

    /**
     *指定位置添加新节点
     */
    public void insertNodeByIndex(int index,Node newNode) throws MyException {
        if (index < 1 || index > length() + 1) {
            throw new MyException("插入的位置不合法!");
        }
        int length = 1;//记录位置
        Node current = first;//可移动的指针
        while (current.getNext() != null) {//遍历
            if (index == length++) {
                newNode.setNext(current.getNext());//新节点的next指向原来节点的next
                current.setNext(newNode);//原来节点的next指向新的节点
                return;
            }
            current.setNext(current.getNext());
        }
    }

    /**
     * 求链表长度
     * @return
     */
    public int length() {
        if (first == null) {
            return 0;
        }
        int length = 0;
        Node current = first;
        while (current != null) {
            length++;
            current = current.getNext();
        }
        return length;
    }

    /**
     *删除头节点
     */
    public Object deleteFirst() {
        Node temp = first;
        first = first.getNext();
        return temp.getData();
    }

    /**
     * 删除尾节点
     */
    public Object deleteLast() {
        if (length() == 0){
            return null;
        }
        if (length() == 1){
           return deleteFirst();
        }
        Node previous = first;
        Node current = first.getNext();//可移动的指针

        while (current.getNext() != null) {//遍历
            previous = previous.getNext();
            current = current.getNext();
        }
        previous.setNext(current.getNext());
        return current.getData();
    }

    /**
     *删除指定位置的节点
     */
    public void deleteNodeByIndex(int index) throws MyException {
        if (index < 1 || index > length()) {
            throw new MyException("删除的位置不存在!");
        }
        int length = 1;//记录位置
        Node current = first;//可移动的指针
        while (current.getNext() != null) {//遍历
            if (index == length++) {
                current.setNext(current.getNext().getNext());//指向当前节点的下一个节点的下一个节点
                return;
            }
            current.setNext(current.getNext());
        }
    }

    /**
     *修改指定位置节点数据
     */
    public void updateNodeByIndex(int index,Object data) throws MyException {
        if (index < 1 || index > length()) {
            throw new MyException("修改的位置不存在!");
        }
        int length = 1;//记录位置
        Node current = first;//可移动的指针
        while (current.getNext() != null) {//遍历
            if (index == length++) {
                current.setData(data);
                return;
            }
            current.setNext(current.getNext());
        }
    }

    /**
     * 查找指定数据节点
     */
    public Node findByKey(Object key) {
        Node current = first;
        while (current.getData() != key) {
            if (current.getNext() == null)
                return null;
            else
                current = current.getNext();
        }
        return current;
    }


    /**
     * 选择排序:适用于可强制转为int的类型
     */
    public void selectSortNode() throws MyException {
        if (length() < 2) {
            throw new MyException("无需排序!");
        }
        Node firstTemp = first;
        while (firstTemp.getNext() != null) {
            Node secondTemp = firstTemp.getNext();
            while (secondTemp.getNext() != null) {
                if ((int)firstTemp.getData() >= (int)secondTemp.getData()) {
                    int t = (int)secondTemp.getData();
                    secondTemp.setData(firstTemp.getData());
                    firstTemp.setData(t);
                }
                secondTemp = secondTemp.getNext();
            }
            //处理链表尾元素
            if (secondTemp.getNext() == null && secondTemp.getData() != null) {
                if ((int)firstTemp.getData() >= (int)secondTemp.getData()) {
                    int t = (int)secondTemp.getData();
                    secondTemp.setData(firstTemp.getData());
                    firstTemp.setData(t);
                }
                secondTemp = secondTemp.getNext();
            }
            firstTemp = firstTemp.getNext();
        }
    }

    /**
     * 显示链表
     */
    public void display() {
        Node current = first;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println("");
    }

}
