package datastructure.tree;

public class Node {
    /**
     * 节点数据值
     */
    private Object value;
    /**
     * 左节点
     */
    Node leftNode;
    /**
     * 右节点
     */
    Node rightNode;

    /**
     * 构造函数
     */
    public Node(Object value) {
        this.value = value;
    }

    /**
     * 设置左节点
     */
    public void setLeftNode(Node node) {
        this.leftNode = node;
    }

    /**
     * 设置右节点
     */
    public void setRightNode(Node node) {
        this.rightNode = node;
    }

}
