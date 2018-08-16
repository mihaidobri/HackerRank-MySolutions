package Day17MoreExeption.Solution;

import java.util.Scanner;

/**
 * Task
 * Write a Calculator class with a single method: int power(int,int).
 * The power method takes two integers, p and n, as parameters and returns the integer result of n^p.
 * If either n or p is negative, then the method must throw an exception with the message:
 * "n and p should be non-negative."
 */
class Calculator {
    int m = 1;

    int power(int n, int p) throws Exception {

        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }

        while (p != 0) {
            m = m * n;
            p--;
        }
        return m;
    }
}

class Day17MoreException {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("For how many numbers we should calculate the power of n ");
        int t = in.nextInt();
        while (t-- > 0) {

            System.out.println("Enter your \"n\" followed by a \"space\" and your \"p\" ");
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
