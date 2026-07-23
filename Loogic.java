import java.util.Scanner;

public class Loogic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int P = input.nextInt();
        int T = input.nextInt();
        int R = input.nextInt();
        simpleInterest(P, T, R);
        
    }

    static void simpleInterest(int P, int T, int R){

        int SI = (P * R * T)/100;
        System.out.println("The Simple Interest Is : " + SI);
        System.out.println("Total Amount is : "+ (P + SI));
        
    }
}
