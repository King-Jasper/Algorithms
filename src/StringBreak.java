public class StringBreak {
    public static void main(String[]  args){

        String str = "Tryto@makeyourself@more";
        String [] arrOf = str.split("o", 3);
        for(String element: arrOf){

            System.out.println(element);

        }
    }


}


