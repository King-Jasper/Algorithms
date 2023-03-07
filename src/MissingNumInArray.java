public class MissingNumInArray {
    public static void main(String[] args) {
        //Array should not have duplicate
        //Array don't need to be sorted out
        //Values should be in range

        int arr[] = {1, 2, 4, 5};

        //1+2+4+5= 12; sum1
        //1+2+3++4+5 = 15; sum2
        //sum2-sum1 = 15-12 = 3 missing number.


        int i;
        for (i = 0; i < arr.length; i++) {

        }
        int sum1 = arr[i];

        System.out.println("The sum of elements in an array:" + sum1);
        int sum2 = 0;
        int j;
        for (j = 1; j <= 5; j++) {

        }
        sum2 = sum2 + j;

        System.out.println("The sum of range in an array:" + sum2);
    }

}