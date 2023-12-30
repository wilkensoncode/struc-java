package linkedList;

public class MergeLists {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(5);
        Node<Integer> b = new Node<>(7);
        Node<Integer> c = new Node<>(10);
        Node<Integer> d = new Node<>(12);
        Node<Integer> e = new Node<>(20);
        Node<Integer> f = new Node<>(28);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // 5 -> 7 -> 10 -> 12 -> 20 -> 28

        Node<Integer> q = new Node<>(6);
        Node<Integer> r = new Node<>(8);
        Node<Integer> s = new Node<>(9);
        Node<Integer> t = new Node<>(25);
        q.next = r;
        r.next = s;
        s.next = t;

        Node<Integer>  res = mergeLists(a, q);
        while(res != null){
            System.out.println(res.data);
            res = res.next;
        }
    }

    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node<Integer> mergeLists(Node<Integer> head1, Node<Integer> head2) {
        if (head2 == null)
            return head1;
        if (head1 == null)
            return head2;
        if (head1.data < head2.data){
            head1.next = mergeLists(head1.next, head2);
            return head1;
        } else {
            head2.next = mergeLists(head1, head2.next);
            return head2;
        }
    }
//    static Node<Integer> mergeLists(Node<Integer> head1, Node<Integer> head2) {
//        Node<Integer> tail = new Node<>(0);
//        Node<Integer> head =tail;
//        while (head1 != null && head2 != null){
//            if (head1.data < head2.data) {
//                tail.next = head1;
//                head1 = head1.next;
//            } else {
//                tail.next = head2;
//                head2 = head2.next;
//            }
//            tail = tail.next;
//        }
//        return head.next;
//    }
}
