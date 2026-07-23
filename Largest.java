import java.util.*;


public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a  = input.nextInt();
        int b  = input.nextInt();
        int c  = input.nextInt();

        System.out.println(Math.max(c, Math.max(a, b)));
        
        // int max = a;

        // if(b > max){
        //    max = b;
        // }
        // if(c > max){
        //     max = c;
        // }
        // System.out.println("The Max : " + max);
    }
}
