public class AtmMac {

    public static void main(String[] arg){

        int[] res = atm(200);
        System.out.println(res);

    }
    public static int[] atm(int amount){
        int[] arr = new int[3];

        while(amount>0){
            if(amount % 100 ==0){
              amount -=100;
              arr[0] +=1;
            }else if(amount % 50 ==0){
                amount -=50;
                arr[1] +=1;
            }else if(amount % 20 ==0){
                amount -=20;
                arr[2] +=1;
            }
        }

        return arr;
    }
}
