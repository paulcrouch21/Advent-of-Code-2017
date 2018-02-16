import java.io.*;
import java.util.*;

public class Day2Part2 {
    public static void main(String[] args) throws Exception {
        Scanner fin = new Scanner(new File("Input.txt"));
        int[][] numbers = new int[16][16];

        for (int row = 0; row < numbers.length; row++)
            for (int column = 0; column < numbers[row].length; column++)
                numbers[row][column] = fin.nextInt();

        int checksum = 0;
        for (int row  = 0; row < numbers.length; row++)
            checksum += checkDiv(numbers[row]);

        System.out.println(checksum);


    }

    public static int checkDiv(int[] numArray) {
        int mySum = 0;
        Arrays.sort(numArray);
        for (int i = 0; i < numArray.length - 1; i ++)
            for (int j = i + 1; j < numArray.length; j++)
                if (numArray[j] % numArray[i] == 0)
                    mySum += numArray[j] / numArray[i];
        return mySum;
    }
}