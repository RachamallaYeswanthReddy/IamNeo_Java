public class Strings {
    public static void main(String[] args) {
        java.lang.String str = "Hello World!";// String pool
        System.out.println(str);
        String str2 = new java.lang.String("hello Iamneo");// Heap memory
        System.out.println(str2);
        String empty = "";
        System.out.println(empty);
        String s1 = "Hello";
        String s2 = "Hello"; // these are created in string pool
        // StringBuilder
        StringBuilder str4 = new StringBuilder("Hellooo");
        //StringBuffer
    }
}