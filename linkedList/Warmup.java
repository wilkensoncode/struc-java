package linkedList;
public class Warmup {
    public static void main(String[] args) {
        Node link = warmup();
        while (link != null){
            System.out.print(link.data + " ");
            link = link.next;
        }
    }

    static class Node<T> {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node warmup() {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");

        a.next = b;
        b.next = c;
        c.next = new Node<>(1);
        return a;
    }
}
