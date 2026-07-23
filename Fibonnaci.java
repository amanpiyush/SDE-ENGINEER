import java.util.*;

public class Fibonnaci {
    
    public static void Fibonnaci(int n){
        int a = 0;
        int b = 1;
        int count = 0;

        System.out.println("Fibonaci Series of " + n + " Number");
        while(count < n){
            System.out.println(a + " ");
            int next = a + b;
            a = b;
            b = next;
            count ++;
        }
    }

    public static void main(String[] args) {
        Fibonnaci(10);
    }
}
