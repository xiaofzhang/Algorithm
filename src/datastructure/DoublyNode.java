package datastructure;

/**
 * 双向节点类
 */
public class DoublyNode {
    private DoublyNode previous;
    private Object data;
    private DoublyNode next;

    public DoublyNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyNode previous) {
        this.previous = previous;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public DoublyNode getNext() {
        return next;
    }

    public void setNext(DoublyNode next) {
        this.next = next;
    }

    public DoublyNode(Object data) {
        this.data = data;
    }
}
