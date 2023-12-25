package arrayString.anagrams;
import java.util.HashMap;
import java.util.Map;


public class Anagrams {
    public static void main(String[] args) {

        System.out.println(mapAnagrams("restful").equals(mapAnagrams("fluster")));

        System.out.println(arrAnagrams("ana", "naa"));

    }

    public static Map<Character, Integer> mapAnagrams(String s1) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            map.putIfAbsent(ch, 0);
            map.put(ch, map.get(ch) + 1);
        }
        return map;
    }

    public static boolean arrAnagrams(String s1, String s2) {
        int[] letters = new int[26];
        for (char ch : s1.toCharArray()) {
            letters[((int) ch) - ((int) 'a')] += 1;
        }
        for (char ch : s2.toCharArray()) {
            letters[((int) ch) - ((int) 'a')] -= 1;
        }
        for (int letter : letters)
            if (letter == 1) return false;
        return true;
    }
}

//len 1 and len 2 O(n + m)

//arrayString.anagrams
//Write a method, arrayString.anagrams, that takes in two strings as arguments.
// The method should return a boolean indicating whether or not the strings are arrayString.anagrams.
// Anagrams are strings that contain the same characters, but in any order.