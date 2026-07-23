class scope{

    static void random(int marks){
        marks = 67;
        System.out.println(marks);
    }
    public static void main(String[] args) {
        System.out.println();

        int a = 40;

        {
            a = 70; //value initialize outside this block.
            int c = 99;
            System.out.println(c);
            //value initialize in this block remain in this block.
        }
        // System.out.println(c);
        System.out.println(a);
    }
}