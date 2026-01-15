package h1;

public class H1_main {
    public static void main(String[] args) {

        Node e = new Node(null);
        Node d = new Node(e);
        Node c = new Node(d);
        Node b = new Node(c);
        Node a = new Node(b);

        System.out.println(distance(e, c));
    }

    public static int distance(Node x, Node y) {

        int distance = 0;

        if (x==y) return distance;

        if (x.next == null) {
            distance++;
            return distance + distance(x, y.next);
        }

        if (y.next == null) {
            distance++;
            return distance + distance(y, x.next);
        }


        return distance(x.next, y.next);

    }
}