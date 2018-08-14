package Day12Inheritance;

public class Student extends Person {
private int[] testScores;

    Student(String firstName, String lastName, int idNumber, int[] testScores ){
        super(firstName,lastName,idNumber);
        this.testScores=testScores;
    }
    int n=0;

    char avg;

    public char calculate() {
        for(int i=0; i<testScores.length; i++){
            n++;
            avg = (char) ((testScores[i]+avg)/n);
        }

        if (avg >= 90 && avg <= 100) {
            avg = 'O';
            return avg;
        } else if (avg <= 80 && avg < 90) {
            return 'E';
        } else if (avg <= 70 && avg < 80) {
            return 'A';
        } else if (avg <= 55 && avg < 70) {
            return 'P';
        } else if (avg <= 40 && avg < 55) {
            return 'D';
        } else if (avg < 40) {
            return 'T';
        }
        return avg;
    }
}
