class implementstring {
    public static void main(String[] args) {
        String s = "Java";
        System.out.println(s.length());

        String s1 = "";
        String s2 = "   ";
        System.out.println(s1.isEmpty());
        System.out.println(s2.isBlank());

        String a = "Java";
        String b = "java";
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));

        String x = "Apple";
        String y = "Banana";
        System.out.println(x.compareTo(y));

        String str = "Hello World";
        System.out.println(str.contains("World"));
    }
}