package datastructure;

public class LinkQueue {
    private LinkList linkList;

    public LinkQueue() {
        linkList = new LinkList();
    }

    public void insert(Object value) {
        linkList.insertNode(value);
    }

    public Object remove() {
       return linkList.deleteLast();
    }

    public boolean isEmpty() {
        return (linkList.length() == 0);
    }

    public void display() {
        linkList.display();
    }
}
