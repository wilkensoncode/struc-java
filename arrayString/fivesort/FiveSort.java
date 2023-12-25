package arrayString.fivesort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FiveSort {
    public static void main(String[] args) {
        System.out.println(fiveSort(new ArrayList<>(List.of(5, 5, 6, 5, 5, 5, 5))));
    }

    public static List<Integer> fiveSort(List<Integer> array) {
        int i = 0, j = array.size() - 1;

        while (i < j) {
            while (array.get(j) == 5)
                j--;
            if(array.get(i) == 5 && i < j) {
                Collections.swap(array, i, j);
            }
            i++;
        }
        return array;
    }
}
