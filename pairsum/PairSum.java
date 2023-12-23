package pairsum;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class PairSum {
    public static void main(String[] args) {
        System.out.println(pairSum(List.of(3, 2, 5, 4, 1), 3));
    }

    public static List<Integer> pairSum(List<Integer> list, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int comp = target - list.get(i);
            if (map.containsKey(comp)) {
                return List.of(map.get(comp), i);
            }
            map.put(list.get(i), i);
        }
        return null;
    }
}

//linear
//    pair sum
//    Write a method, pairSum, that takes in an List and a target sum as arguments.
//    The function should return an List containing a pair of indices
//    whose elements sum to the given target. The indices returned must be unique.
//
//        Be sure to return the indices, not the elements themselves.
//
//        There is guaranteed to be one such pair that sums to the target.