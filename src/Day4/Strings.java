package Day4;

public class Strings {
    public static void main(String[] args) {
        String S1 = "Hello";// create string hello in the pool, if not already present.
        String S2 = "Hello"; // check the pool. it will not be created again

        // creates in the Heap memory
        String S3 = new String("Hello");
        String S4 = new String("Hello");

        // == operator compares the address or reference of the strings
        System.out.println(S1==S2);
        System.out.println(S3==S4);
        System.out.println(S1==S4);

        System.out.println(S1.equals(S2));
        System.out.println(S1.equals(S4));
        System.out.println(S1.hashCode());//69609650
        System.out.println(S2.hashCode());//69609650
        System.out.println(S3.hashCode());//69609650

    }
}
