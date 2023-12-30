package linkedList;

public class ZipperList {
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


        Node<String> x = new Node<>("x");
        Node<String> y = new Node<>("y");
        Node<String> z = new Node<>("z");
        x.next = y;
        y.next = z;

        Node<String> curr = zipperList(a, x);
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
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

    static <T> Node<T> zipperList(Node<T> head1, Node<T> head2) {
        return zipperList(head1, head2, 0);
    }

    static <T> Node<T> zipperList(Node<T> head1, Node<T> head2, int counter) {
        if (head1 == null)
            return head2;
        if(head2 == null)
            return head1;
        if (counter % 2 == 0) {
            head1.next =  zipperList(head1.next, head2, counter + 1);
            return head1;
        } else {
            head2.next = zipperList(head1, head2.next,   counter + 1);
            return head2;
        }
    }
//    static <T> Node<T> zipperList(Node<T> head1, Node<T> head2) {
//        Node<T> curr1 = head1.next;
//        Node<T> curr2 = head2;
//        Node<T> tail = head1;
//        int counter = 0;
//        while (curr2 != null && curr1 != null) {
//
//            if (counter % 2 == 1) {
//                tail.next = curr1;
//                curr1 = curr1.next;
//            } else {
//                tail.next = curr2;
//                curr2 = curr2.next;
//            }
//            counter += 1;
//            tail = tail.next;
//        }
//
//        if (curr2 != null)
//            tail.next = curr2;
//        else if (curr1 != null)
//            tail.next = curr1;
//
//        return head1;
//    }
}



