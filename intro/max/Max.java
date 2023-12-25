package intro.max;

public class Max {
    public static void main(String[] args) {
        double result = max(new double[] {1, 2, 3});
        System.out.println(result);
    }

    public static double max(double[] num) {
        double max = Integer.MIN_VALUE;
        for (double n: num)
            if (n > max) max = n;
        return max;
    }
}


//    intro.max value
//    Write a method, maxValue, that takes in an array of numbers as an argument.
//    The method should return the largest number in the array.
//    Solve this without using any built-in array methods.
//    You can assume that the array is non-empty.
