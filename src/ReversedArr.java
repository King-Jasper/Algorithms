public class ReversedArr {

    public static void main(String[] args){
        int [] intArr = {20, 30, 40, 50, 60};
        System.out.println("Original Array:");
        for(int i=intArr.length-1;i>=0;i--){
            System.out.print(intArr[i] + " ");
        }
    }
}
