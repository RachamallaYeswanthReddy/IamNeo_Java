package Day1;

public class Variable {
    //instance variable
    String instvar = "I am instance var";
    int instint;
    //Static Var
    static int STATICVAR = 100;
    static String STATICSTRING;
    //local variable
    public void localmethod(){
        int localvar= 20;
        System.out.println("Local Day1.Variable: " + localvar);
        //instance
        System.out.println(instvar);
    }
    public static void main(String[] args) {
        Variable vr = new Variable();

        System.out.println(vr.instvar);
        System.out.println(vr.instint);

        System.out.println(STATICSTRING);
        System.out.println(STATICVAR);

        vr.localmethod();
    }
}
