package Day12Inheritance;

public class Student extends Person {
private int[] testScores;

    Student(String firstName, String lastName, int idNumber, int[] testScores ){
        super(firstName,lastName,idNumber);
        this.testScores=testScores;
    }
    int n=0;

    char avg;
    public int calculate(){
        for(int i=0; i<testScores.length; i++){
            n++;
            avg = (char) ((testScores[i]+avg)/n);
        }

        return avg;
    }

}
