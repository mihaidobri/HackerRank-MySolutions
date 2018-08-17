package Day19Interfaces.Solution;

public class Day19Interfaces implements AdvancedArithmetics {
    int sum = 0;

    public int divisorSum(int n) {
        int interm = n;
        while (interm > 0) {
            if ((n % interm) == 0)
                sum = sum + interm;
            interm--;
        }
        return sum;
    }
}
