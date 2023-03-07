import java.util.ArrayList;

public class CustomArray {
    public static void main(String []args){

        ArrayList<Integer> list = new  ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(9);

        for(int i = 0; i<14; i++){
            list.add(2*i);
        }

        System.out.println(list);


    }

}
