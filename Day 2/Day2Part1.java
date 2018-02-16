import java.io.*;
import java.util.Scanner;

public class Day2Part1 {
    public static void main(String[] args) throws IOException {
        Scanner fin = new Scanner(new File("Input.txt"));
        int[][] array = new int[16][16];

        for (int row = 0; row < array.length; row++)
            for (int column = 0; column < array[row].length; column++)
                array[row][column] = fin.nextInt();

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        int checksum = 0;
        int max;
        int min;
        for (int row = 0; row < array.length; row++) {
            max = getMaxValue(array[row]);
            min = getMinValue(array[row]);
            System.out.println(max);
            System.out.println(min);
            checksum += max - min;
        }
        System.out.println(checksum);
    }

    public static int getMaxValue(int[] numbers) {
        int maxValue = numbers[0];
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] > maxValue)
                maxValue = numbers[i];

        return maxValue;

    }

    public static int getMinValue(int[] numbers) {
        int minValue = numbers[0];
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        return minValue;
    }
}
