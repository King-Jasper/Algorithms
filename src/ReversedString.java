public class ReversedString {

    public static void main(String[] args){

        String originalStr = "Jasper";
        String ReversedStr = "";

        for(int index =0; index<originalStr.length(); index++){
            ReversedStr = originalStr.charAt(index) + ReversedStr;

            System.out.println("Reversed String:" +ReversedStr);
        }

    }
}
