package linkedList;

public class GetNodeValue {
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");

        a.next = b;
        b.next = c;
        c.next = d;

        System.out.println(getValue(a, 2));

    }

    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    static String getValue(Node<String> head, int i) {
        int count = 0;
        return getValue(head.next, count, i);
    }
    static String getValue(Node<String> head, int count,  int i) {
        if (count == i)
            return head.data;
        if (head == null)
            return null;
        return getValue(head.next, count+1, i);
    }
}
