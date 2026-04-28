class hello{
    public static void main(String args[]){
        System.out.println("Hello World");
        System.out.println("Good Morning Everyone ");
        System.out.print("I am Sabari");
        System.out.println("I am from Erode");
        byte b=2;
        short s=1000;
        int i=10;
        float f=1234.46f;
        double d=123456.789;
        char c='A';
        boolean bool=true;
        System.out.println("byte: "+b);
        System.out.println("short: "+s);
        System.out.println("int: "+i);
        System.out.println("float: "+f);
        System.out.println("double: "+d);
        System.out.println("char: "+c);
        System.out.println("boolean: "+bool);

        String str="Hello Java";
        System.out.println("String: "+str);
        System.out.println("Length: "+str.length());

        //String Constant Pool
        String str1="HelloJava";
        String str2="HelloJava";
        System.out.println("Comparing str1 and str2: "+(str1==str2)); //Compare the references of str1 and str2
        
        // int []arr = {1,2,3,4,5};
        // System.out.println("Array: "+arr);
    }
}

