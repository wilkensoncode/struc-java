package linkedList;

public class ReverseList {
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        print(reverseList(a));

    }

    static class Node<T> {
        T data;
        Node<T> next;
        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    static <T> Node<T> reverseList(Node<T> head){
       return reverseList(head, null);
    }
    static <T> Node<T> reverseList(Node<T> head,Node<T> prev){
        if (head == null ){
            return prev;
        }
        Node<T> next = head.next;
        head.next = prev;
        return reverseList(next,head);
    }
//   static Node<String> reverseList(Node<String> head){
//        Node<String> prev = null;
//        Node<String> current = head;
//
//        while (current != null ){
//            Node<String> next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//        }
//        return prev;
//    }

    static void print(Node<String> head){
        Node<String> curr = head;
        while(curr != null) {
            System.out.print(curr.data + "–>");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
