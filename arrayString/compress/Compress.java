package arrayString.compress;

public class Compress {
    public static void main(String[] args) {
        System.out.println(compress("ssssbbz"));
    }

    public static String compress(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0, j =0;
        s = s + " ";
        while (j < s.length()){
            char chi = s.charAt(i);
            if ( s.charAt(j) == chi){
                j++;
            } else {
                if ((j-i) > 1) result.append((j-i));
                result.append(chi);
                i = j;
            }
        }
        return result.toString();
    }

}

// time O(n)
//arrayString.compress
//Write a method, arrayString.compress, that takes in a string as an argument.
// The method should return a compressed version of the string where
// consecutive occurrences of the same characters are compressed into
// the number of occurrences followed by the character. Single character
// occurrences should not be changed.
//
//'aaa' compresses to '3a'
//'cc' compresses to '2c'
//'t' should remain as 't'
//You can assume that the input only contains alphabetic characters.