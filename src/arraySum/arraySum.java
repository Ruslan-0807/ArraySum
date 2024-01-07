package arraySum;

public class arraySum {

    public static int arraySum (int [][] array){
        int sum = 0;
        for (int[] line : array) {
            for ( int value : line) {
                sum += value;
            }
        }
        return sum;
    }
}
