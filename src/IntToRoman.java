import java.util.TreeMap;

public class IntToRoman {

    private final static TreeMap<Integer, String> map = new TreeMap<>();

    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    public static String intToRoman(int num) {
        int l =  map.floorKey(num);
        if (num == l) {
            return map.get(num);
        }
        return map.get(l) + intToRoman(num-l);
    }

    public static void main(String[] args) {
       // System.out.println(intToRoman(3));
        //System.out.println(intToRoman(4));
       // System.out.println(intToRoman(9));
        System.out.println(intToRoman(350));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
    }
}

