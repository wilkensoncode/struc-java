package intersection;

import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        System.out.println(intersect(List.of(4, 2, 1, 6), List.of(3, 6, 9, 2, 10)));

    }

    public static List<Integer> intersect(List<Integer> a, List<Integer> b) {
        Set<Integer> s1 = new HashSet<>(a);
        Set<Integer> s2 = new HashSet<>(b);
        s1.retainAll(s2);
        return new ArrayList<>(s1);
    }
}

//linear
//intersection
//        Write a method, intersection, that takes in two Lists, a,b,
//        as arguments. The method should return a new List containing
//        elements that are in both of the two Lists.
//        You may assume that each input List does not contain
//        duplicate elements.