package datastructure;

/**
 * 双向链表
 */
public class DoublyLinkList {
    private DoublyNode first;
    private DoublyNode last;

    public DoublyLinkList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    /**
     *在链表头插入
     */
    public void insertFirst(Object data) {
        DoublyNode newNode = new DoublyNode(data);
        if (isEmpty()) {
            last = newNode;
        } else {
            first.setPrevious(newNode);
            newNode.setNext(first);
        }
        first = newNode;
    }

    /**
     *在链表尾插入
     */
    public void insertLast(Object data) {
        DoublyNode newNode = new DoublyNode(data);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.setNext(newNode);
        }
        newNode.setPrevious(last);
        last = newNode;
    }

    /**
     *insert data after key
     */
    public void insertAfter(Object key,Object data) {
        DoublyNode current = first;

        while (current.getData() != key) {
            current = current.getNext();
            if (current == null) {
                return;
            }
        }

        DoublyNode newNode = new DoublyNode(data);

        if (current == last) {
            newNode.setNext(null);
            last = newNode;
        } else {
            newNode.setNext(current.getNext());
            current.getNext().setPrevious(newNode);
        }
        newNode.setPrevious(current);
        current.setNext(newNode);
    }

    /**
     *删除链表头元素
     */
    public DoublyNode deleteFirst() {
        DoublyNode current = first;
        if (first.getNext() == null) {
            last = null;
        } else {
            first.getNext().setPrevious(null);
            first = first.getNext();
        }
        return current;
    }

    /**
     *删除链表尾元素
     */
    public DoublyNode deleteLast() {
        DoublyNode current = last;
        if (last.getPrevious() == null) {
            first = null;
        } else {
            last.getPrevious().setNext(null);
            last = last.getPrevious();
        }
        return current;
    }

    /**
     *删除链表中指定元素
     */
    public DoublyNode deleteKey(Object key) {
        DoublyNode current = first;
        while (current.getData() != key) {
            current = current.getNext();
            if (current == null) {
                return null;
            }
        }
        if (current == first) {
            first = current.getNext();
        } else {
            current.getPrevious().setNext(current.getNext());
        }
        if (current == last) {
            last = current.getPrevious();
        } else {
            current.getNext().setPrevious(current.getPrevious());
        }
        return current;
    }

    /**
     * 从头到尾显示
     */
    public void displayForward() {
        System.out.print("List(first-->last): ");
        DoublyNode current = first;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println("");
    }

    /**
     * 从尾到头显示
     */
    public void displayBackward() {
        System.out.print("List(last-->first): ");
        DoublyNode current = last;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getPrevious();
        }
        System.out.println("");
    }
}
