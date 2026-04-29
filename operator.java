public class operator {
    public static void main(String args[]){
        //Arithmetic operation
        int a=100;
        int b=5;
        System.out.println("Addition"+(a+b));
        System.out.println("Subtraction "+(a-b));
        System.out.println("Multiplication "+(a*b));
        System.out.println("Division "+(a/b));
        //Relational operator
        System.out.println("a is greater than b: "+(a>b));
        System.out.println("a is less than b: "+(a<b));
        System.out.println("a is equal to b: "+(a==b));
        //Logical operator
        boolean x=true;
        boolean y=false;
        System.out.println("x AND y: "+(x && y));
        System.out.println("x OR y: "+(x || y));
        System.out.println("NOT x: "+(!x));
        //Bitwise operator
        int p=5; // 0101 in binary
        int q=3; // 0011 in binary
        System.out.println("p AND q: "+(p & q)); // 0001 in binary, which is 1 in decimal
        System.out.println("p OR q: "+(p | q));  // 011
        System.out.println("p XOR q: "+(p ^ q)); // 0110 in binary, which is 6 in decimal
        //Assignment operator
        int i = 5;

        int pre = ++i;   // pre-increment
        System.out.println("Pre: " + pre); // 6

        int j = 5;
        int post = j++;  // post-increment
        System.out.println("Post: " + post); // 5

        System.out.println(5+10+"a");
        System.out.println("a"+5+10);
        System.out.println("a"+(5+10));
        System.out.println(5+10+"a"+5+10);

        


    }
}





