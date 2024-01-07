package arraySum;

import static arraySum.arraySum.arraySum;

public class ArraySumMain {
    public static void main(String[] args) {
        int[][]array1 = {
                { 3, 5, 5, 1, 0, 4 },
                { 9, 8, 6, 0, 3, 9 },
                { 7, 0, 3, 5, 10, 2}
        };
        int sum =  arraySum(array1);
        System.out.println("Сумма = " + sum);
    }
}
