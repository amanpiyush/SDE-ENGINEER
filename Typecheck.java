import java.util.*;

public class Typecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Words : ");
        char ch = input.next().trim().charAt(0);

        //trim()  : Removing the extra spaces

        System.out.println("Char : " + ch);

        if(ch >= 'a' && ch < 'z'){
            System.out.println("Lower Case");
        }else{
            System.out.println("Upper Case");
        }

    }
}
