import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static int romanToInt(String s) {
        HashMap<String , Integer> map = new HashMap<>(Map.of("I", 1,"V",5,"X",
                10,"L",50,"C",100,"D",500,"M",1000));

        String[] newS = s.split("");
        int value =0;
        for(int i=0; i<s.length();i++){
            int a = map.get(newS[i]);
            int b =(i >= s.length()-1 )? 0 : map.get(newS[i+1]);


            if( a<b){
                value += (b-a);
                i++;
            }else{
                value += a;
            }
        }

        System.out.println(value);
        return value;


    }
    public static void main(String[]args){
       // int result = (romanToInt(100));
        System.out.println(romanToInt("XL"));
    }
}

