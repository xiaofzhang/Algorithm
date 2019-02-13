package datastructure;

public class LinkStack {
    private LinkList linkList;

    public LinkStack() {
        linkList = new LinkList();
    }

    public void push(Object value) {
        linkList.insertNode(value);
    }

    public Object pop() {
        return linkList.deleteFirst();
    }

    public boolean isEmpty() {
        return (linkList.length() == 0);
    }

    public void display() {
        linkList.display();
    }
}
