public class Abide {

    public static void main(String[] args){

        String name = "Stephen Done";
        String [] arrOfStr = name.split(" ");

        String firstName = arrOfStr[0].toUpperCase();
        String lastName = arrOfStr[1].toUpperCase();
        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);

        String initials = firstInitial + (".") + lastInitial;

System.out.println(initials);
    }
}


