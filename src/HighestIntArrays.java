import java.util.Arrays;
import java.util.Scanner;

public class HighestIntArrays {

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        int []arr = new int[10];

        for(int i = 0; i<arr.length; i++){

            System.out.println("Enter number:");
            arr[i] = input.nextInt();

        }

        Arrays.sort(arr); //11, 55, 42, 11, 42, 55

        int max = arr[arr.length-1];

        System.out.println("Max number:" + max);

    }
}
