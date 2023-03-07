import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args){
        int num,ren;

        Scanner input = new Scanner(System.in);
        num=input.nextInt();
        System.out.println("Enter Number");

        while(num>0){
            ren=num%10;
            System.out.print(ren);
            num=num/10;
        }


    }

}
