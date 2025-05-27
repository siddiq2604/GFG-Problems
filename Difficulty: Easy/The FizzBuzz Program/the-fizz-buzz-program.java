// User function Template for Java
class Solution {
    public static void fizzBuzz(int number) {
        // Write your code here.
         if(number % 3 == 0 & number % 5 == 0) {
        System.out.println("FizzBuzz");
    } else if (number % 3 == 0) {
        System.out.println("Fizz");
    } else if (number % 5 == 0) {
        System.out.println("Buzz");
    } else {
        System.out.println(number);
    }
    }
}