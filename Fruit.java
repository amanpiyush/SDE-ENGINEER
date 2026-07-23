import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Name : ");

        String fruits = input.nextLine();
        switch(fruits){
            case "Mango" -> System.out.println("King of the Fruits"); 
            case "Apple" -> System.out.println("Red sweet Fruit"); 
            case "Banana"-> System.out.println("Soft Fruits"); 
            case "Kiwi"  -> System.out.println("Sure Sweet Taste fruit"); 
            default      -> System.out.println("No of fruit Matches"); 
            
        }
    }
}
