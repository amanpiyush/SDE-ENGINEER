import java.util.*;


class Main{
    public static void main(String [] args) {
        Scanner input = new Scanner (System.in);

        // System.out.print("Enter the Salary : ");
        // int salary = input.nextInt();

        //while loop
        int n = 1;
        while(n <= 5){
            System.out.println(n);
            n++;
        }


        int m = 1;
        do{
            System.out.println("This is the DO while loop");
            m++;
        }while(m <= 5);
    }
}