import java.util.Arrays;

public class DigitsAscending {
    public static void main(String [] args){
        System.out.print(sortDesc(123456));

}
    public static int sortDesc(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        Arrays.sort(digits);
        return Integer.parseInt(new StringBuilder(new String(digits)).reverse().toString());
    

    }
}