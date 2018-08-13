package Day5Loop;

import java.util.Scanner;

public class Day5Loop {

/*
Given an integer, n, print its first 10 multiples. Each multiple nxi (where 1<=i<=10 )
should be printed on a new line in the form: n x i = result.
 */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int i=0;
        while(true){
            i++;
            int result=0;
            result=n*i;
            System.out.println(n+" x "+i+" = "+result );

            if(i==10){
                break;
            }

        }

        scanner.close();
    }
}
