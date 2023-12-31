package linkedList;

public class UniValue {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(7);
        Node<Integer> b = new Node<>(7);
        Node<Integer> c = new Node<>(2);

        a.next = b;
        b.next = c;

        System.out.println(isUniValue(a));
    }

    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    static <T> boolean isUniValue(Node<T> head) {
        return isUniValue(head, head.data);
    }

    static <T> boolean isUniValue(Node<T> head, T value) {
        if (head == null)
            return true;
        if (head.data != value)
            return false;
        else
            return isUniValue(head.next, value);
    }
}


//Write a method, isUnivalueList, that takes in the
// head of a linked list as an argument. The method
// should return a boolean indicating whether or not
// the linked list contains exactly one unique value.
//You may assume that the input list is non-empty.
