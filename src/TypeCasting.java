public class TypeCasting {
    void widening ()
    {
        int myInt = 9;
        double myDouble = myInt;//Automatic Casting
        System.out.println(myInt);
        System.out.println(myDouble);
    }
    void narrowing(){
        double myDouble = 9.78d;
        int myInt = (int) myDouble;//manual Casting
        System.out.println(myDouble);
        System.out.println(myInt);
    }

    public static void main(String[] args) {
        TypeCasting tc = new TypeCasting();
        tc.widening();
        tc.narrowing();
    }
}