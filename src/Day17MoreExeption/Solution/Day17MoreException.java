package Day17MoreExeption.Solution;

import java.util.Scanner;

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
        int t = in.nextInt();
        while (t-- > 0) {

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
