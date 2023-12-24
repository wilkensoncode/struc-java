package mostfreqchr;
import java.util.Map;
import java.util.HashMap;

public class MostFreqChar {
    public static void main(String[] args) {
        System.out.println(mostFreq("bookeeper"));
        System.out.println(mostFeq("bookeeper"));
    }
    public static char mostFeq(String s){
        Map<Character, Integer> map = new HashMap<>();
        char result = '\0';

        for(char c: s.toCharArray()){
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c) + 1);
        }

        for (char c: s.toCharArray()){
            if('\0' == result || map.get(c) > map.get(result)) {
                result = c;
            }
        }
        return result;
    }
    public static char mostFreq(String s) {
        char res = '\0';
        int dig = 0;
        int[] ch = new int[26];
        char[] chr = new char[26];
        for (char c : s.toCharArray()) {
            ch[((int) c) - ((int) 'a')] += 1;
            chr[((int) c) - ((int) 'a')] = c;
        }

        for (int i = 0; i < ch.length; i++){
            if(ch[i]> dig){
                dig = ch[i];
                res = chr[i];
            }
        }

        return res;
    }
}

//linear
//most frequent char
//Write a function, mostFrequentChar, that takes in a string as an argument.
// The function should return the most frequent character of the string.
// If there are ties, return the character that appears earlier in the string.
//
//You can assume that the input string is non-empty.