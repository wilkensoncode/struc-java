package arrayString.uncompress;

public class Uncompress {
    public static void main(String[] args) {
        System.out.println(uncompress("55y"));
    }

    public static String uncompress(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0 , j =0;
        while (j < s.length()) {
            char ch = s.charAt(j);
            if (Character.isDigit(ch)) {
                j++;
            } else {
                int num = Integer.parseInt(s.substring(i, j));
                result.append(String.valueOf(ch).repeat(num));
                j++;
                i = j;
            }
        }
        return result.toString();
    }
}



// time complexity: O(nm)
// space complexity: O(nm)
//arrayString.uncompress
//Write a method, arrayString.uncompress, that takes in a string as an argument.
// The input string will be formatted into multiple groups according to the following pattern:
//
//<number><char>
//
//for example, '2c' or '3a'.
//The method should return an uncompressed version of the string
// where each 'char' of a group is repeated 'number' times consecutively.
// You may assume that the input string is well-formed according to
// the previously mentioned pattern.