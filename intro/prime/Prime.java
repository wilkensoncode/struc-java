package intro.prime;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i < Math.sqrt(num); i++)
            if (num % i == 0) return false;
        return true;
    }
}
// time complexity: O(sqrt(n))
// space complexity: O(1)

//    is intro.prime
//    Write a method, isPrime, that takes in a number as an argument.
//    The method should return a boolean indicating whether or not the given number is intro.prime.
//
//        A intro.prime number is a number that is only divisible by two distinct
//        numbers: 1 and itself.
//
//        For example, 7 is a intro.prime because it is only divisible by 1 and 7.
//        For example, 6 is not a intro.prime because it is divisible by 1, 2, 3, and 6.
//
//        You can assume that the input number is a positive integer.