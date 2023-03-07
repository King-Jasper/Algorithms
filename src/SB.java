import java.util.Arrays;

public class SB {
    public static void main(String[] args){

        String name = "Stephen Donald";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf("h"));
        name.split(String.valueOf(5));
//        StringBuilder stringBuilder = new StringBuilder();
//        for(int i = 0; i<26; i++){
//            char ch = (char) ('a' + i);
//            stringBuilder.append(ch);
//
//        }
//        System.out.println(stringBuilder.toString().length());
//       //stringBuilder.deleteCharAt(5);
//       // stringBuilder.reverse();
//
//        System.out.println(stringBuilder);
    }


}
