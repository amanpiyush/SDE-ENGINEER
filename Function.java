public class Function {

    public static int swapNum(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        return (swapNum(a, b));
    }
    
    public static void main(String[] args) {
        int num = swapNum(45 , 89);
        System.out.println(num);
    }
}
