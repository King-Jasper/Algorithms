public class OrdinalNum {

public static void main(String []args){

    String res = ordinal(0);
    System.out.println(res);
}

    public static String ordinal(int i){
        if(i == 0){
            return "0";
        }
        int num100 = i%100;
        int num10 = i%10;

        if (num10==1 && num100!=11){
            return i+ "st";
        }else if(num10 ==2 && num100!=12){
            return i+"nd";

        }else if(num10 == 3 && num100!=13){
            return i+"rd";
        }else {
            return i +"th";
        }

    }
}

