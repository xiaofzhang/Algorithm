package datastructure;

public class Test {
	public static void main(String[] args) {
//		Array array = new Array(100);
//		for (int i = 20; i < 50; i++) {
//			array.insert(i);
//		}
//		array.insert(12);
//		array.insert(56);
//		array.insert(78);
//		array.insert(34);
//		array.insert(67);
//		System.out.print("初始数组===");
//		array.display();
//		System.out.println("--------------------");
//		System.out.println(array.find(40));
//		array.delete(25);
//		array.delete(35);
//		System.out.print("****排序过程******");
//		array.selectSort();
//		array.insertSort();
//		array.orderInsert(23);
//		array.display();
//		System.out.println(array.orderFind(27));
//		array.orderFind(34);
//		-------------------------------
//		Stack stack = new Stack(5);
//		stack.push(2);
//		System.out.println(stack.pop());
		//System.out.println(stack.peek());//报错
		
//		String string = "part";
//		for (int i = 0; i < string.length(); i++) {//单词逆序
//			char c = string.charAt(i);
//			stack.push(c);
//		}
//		stack.display();
//		
//		Stack.check("a{b[c(d))}");
		
//		Queue queue = new Queue(5);
//		queue.insert(2);
//		queue.insert(3);
//		queue.insert(4);
//		queue.insert(5);
//		queue.insert(6);
//		queue.insert(7);
//		queue.insert(78);
//		queue.display();
//		System.out.println(queue.remove());
//		queue.display();
//		System.out.println(queue.remove());
//		queue.display();
//		InToPost inToPost = new InToPost("3*(4+5)");
//		ParsePost parsePost = new ParsePost(inToPost.doTrans());
//        System.out.println(parsePost.doParse());
//        LinkList linkList = new LinkList();
//        linkList.insertNode(20);
//        linkList.insertNode(50);
//        linkList.insertNode(30);
//        linkList.insertNode(70);
//        linkList.insertNode(40);
//        linkList.display();
//        try {
//            linkList.selectSortNode();
//        } catch (MyException e) {
//            e.printStackTrace();
//        }
//        linkList.display();
//        LinkStack stack = new LinkStack();
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(50);
//        stack.display();
//        stack.pop();
//        stack.pop();
//        stack.display();
//        System.out.println(stack.isEmpty());
//        stack.pop();
//        stack.pop();
//        System.out.println(stack.isEmpty());
//        System.out.println(linkList.length());
//        linkList.deleteFirst();
//        System.out.println(linkList.length());
//        linkList.display();
//        linkList.deleteLast();
//        linkList.display();
//        LinkQueue queue = new LinkQueue();
//        queue.insert(10);
//        queue.insert(20);
//        queue.insert(30);
//        System.out.print("队列：(先进先出)<队尾---队头>");
//        queue.display();
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        LinkStack stack = new LinkStack();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        System.out.print("栈：(先进后出)<栈顶---栈低>");
//        stack.display();
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        DoublyLinkList doublyLinkList = new DoublyLinkList();
//        doublyLinkList.insertFirst(10);
//        doublyLinkList.insertFirst(20);
//        doublyLinkList.displayForward();
//        doublyLinkList.insertLast(9);
//        doublyLinkList.displayForward();
//        doublyLinkList.insertAfter(20,15);
//        doublyLinkList.displayForward();
//        doublyLinkList.deleteFirst();
//        doublyLinkList.displayForward();
//        doublyLinkList.deleteLast();
//        doublyLinkList.displayForward();
//        doublyLinkList.deleteKey(15);
//        doublyLinkList.displayForward();
//        doublyLinkList.insertFirst(30);
//        doublyLinkList.insertFirst(20);
//        doublyLinkList.insertFirst(60);
//        doublyLinkList.insertFirst(70);
//        doublyLinkList.displayForward();
//        doublyLinkList.displayBackward();
        doublyLinkList.insertLast(10);
        System.out.println(doublyLinkList.isEmpty());
    }
}
