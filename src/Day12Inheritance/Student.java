package Day12Inheritance;

public class Student extends Person {

    private int[] testScores;

    Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    int avg = 0;
    public char calculate() {

        for (int i = 0; i < testScores.length; i++) {

            avg += testScores[i];
        }
        avg = avg / testScores.length;

        if (avg >= 90) {
            return '0';
        } else if (avg >= 80) {
            return 'E';
        } else if (avg >= 70) {
            return 'A';
        } else if (avg > 55) {
            return 'P';
        } else if (avg >= 40) {
            return 'D';
        } else
            return 'T';

    }
}