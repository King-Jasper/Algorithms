public class Ordinal {

    public static void main(String[] args){
        String result = ordinal( 22);
        System.out.println(result);
    }


    public static String ordinal(int i) {
        int mod100 = i % 100;
        int mod10 = i % 10;
        if(mod10==1 && mod100 !=11){
            return i+ "st";
        }else if(mod10 == 2 && mod100 !=12){
            return i + "nd";
        }else if(mod10==3 && mod100 !=13){
            return i+"rd";

        }else{
            return i+"th";
        }

    }
}