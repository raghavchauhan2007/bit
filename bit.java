import java.util.*;
public class bit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int bit = sc.nextInt();

        if(bit == 0){
            int bitMask = ~(1<<pos);
            System.out.println(bitMask & n);
        }
        else if(bit == 1){
            int bitMask = 1<<pos;
            System.out.println(bitMask | n);
        }
        else{
            System.out.println("invalid bit");
        }
    }
}