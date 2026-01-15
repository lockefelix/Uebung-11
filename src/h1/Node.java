package h1;

public class Node {
    public Node next;

    public Node(Node next) {
        this.next = next;
    }

    public Node getNext(Node x){
        return x.next;
    }

    public void setNext(Node y, Node x) {
        x.next = y;
    }
}