package Day16Exceotions;

import java.util.Scanner;

/**
 * Task
 * Read a string, S, and print its integer value; if S cannot be converted to an integer, print Bad String.
 */
public class Day16Exceptions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your string-integers, it will print its integer value ");
        String S = in.next();

        try {
            int foo = Integer.parseInt(S);
            System.out.println("The integer value is " + foo);
        } catch (Exception e) {
            System.out.println("Bad String");
        }

    }
}

