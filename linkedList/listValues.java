package linkedList;

import java.util.ArrayList;
import java.util.List;

public class listValues {
    public static void main(String[] args) {

        Node<String> x = new Node<>("x");
        Node<String> y = new Node<>("y");
        x.next = y;
        List<String> result = linkedListValuesRecur(x);
//        List<String> result = linkedListValues(x);
        System.out.println(result);
    }

    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public static List<String> linkedListValues(Node<String> head) {
        List<String> result = new ArrayList<>();
        Node<String> current = head;
        while (current != null) {
            result.add(current.data);
            current = current.next;
        }
        return result;
    }

    static List<String> linkedListValuesRecur(Node<String> head) {
        List<String> result = new ArrayList<>();
        linkedListValuesRecur(head, result);
        return result;
    }

    private static void linkedListValuesRecur(Node<String> head, List<String> values) {
        if (head == null)
            return;
        values.add(head.data);
        linkedListValuesRecur(head.next, values);
    }
}
