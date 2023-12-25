package arrayString.pairproduct;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class PairProduct {
    public static void main(String[] args) {
        System.out.println(pairProduct(List.of(3, 2, 5, 4, 1), 8));
    }

    public static List<Integer> pairProduct(List<Integer> numbers, int target) {
        Map<Double, Integer> seen = new HashMap<>();
        for(int i = 0; i < numbers.size(); i++) {
            double comp = (double)target / numbers.get(i);
            if (seen.containsKey(comp))
                return List.of(seen.get(comp), i);
            seen.put((double)numbers.get(i), i);
        }
        return null;
    }
}


//pair product
//Write a method, pairProduct, that takes in an List and a target product as arguments.
// The function should return a List containing a pair of indices whose elements multiply
// to the given target. The indices returned must be unique.
//
//Be sure to return the indices, not the elements themselves.
//
//There is guaranteed to be one such pair whose product is the target.