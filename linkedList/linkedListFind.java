package linkedList;

public class linkedListFind {
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");

        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(isFound(a, "c"));
    }

    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    static boolean isFound(Node<String> head, String target) {
        if (head == null)
            return false;
        if (head.data.equals(target))
            return true;
        return isFound(head.next, target);
    }
}


//linked list find
//Write a method, linkedListFind, that takes in the head of
// a linked list and a target value. The method should return
// a boolean indicating whether or not the linked list contains
// the target.