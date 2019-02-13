package datastructure;

/**
 * 节点类
 */
public class Node {
    private Object data;
    private Node next;

    public Node(Object value) {
        this.data = value;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
