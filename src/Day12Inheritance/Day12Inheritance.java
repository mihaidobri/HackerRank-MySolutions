package Day12Inheritance;

import java.util.Scanner;

class Day12Inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name, last name, id, having a space beetwen them");
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();

        System.out.println("How many grades you want to add/calculate");
        int numScores = scan.nextInt();

        int[] testScores = new int[numScores];

        System.out.println("Enter your grades with a space beetwen them");
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}
