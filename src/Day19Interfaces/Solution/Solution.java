package Day19Interfaces.Solution;

import java.util.Scanner;

/*
 *Complete the implementation of Day19Class class, which implements the AdvancedArithmetic interface.
 *The implementation for the divisorSum(n) method must return the sum of all divisors of n.
 */
public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number you want to compute its divisors");
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetics myCalculator = new Day19Interfaces();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);

    }
}
