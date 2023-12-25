package linkedList;
public class Warmup {
    public static void main(String[] args) {
        Node<String> link = warmup();
//        while (link != null){
//            System.out.print(link.data + " ");
//            link = link.next;
//        }

         printList(link); // recurse
    }

    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node<String> warmup() {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");

        a.next = b;
        b.next = c;
        return a;
    }

    static Node<String> printList(Node<String> head){
        if (head == null)
            return null;
        System.out.println(head.data);
        return printList(head.next);
    }
}
