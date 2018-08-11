package Day6Review;

import java.io.*;
import java.util.*;

public class Day6Review {
/*
Given a string S, , of length  that is indexed from 0 to N-1 , print its even-indexed and
odd-indexed characters as 2 space-separated strings on a single line
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many strings you want to input ? (press Enter afterwards)");
        int T = scan.nextInt();
        System.out.println("Enter the string/strings and press Enter");
        scan.nextLine();
        for(int i = 0;i < T ;i++ )
        {
            String s = scan.nextLine();
            for(int j = 0;j < s.length() ; j+=2)
            {
                System.out.print(s.charAt(j));
            }
            System.out.print(" ");
            for(int j = 1;j < s.length() ; j+=2)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}