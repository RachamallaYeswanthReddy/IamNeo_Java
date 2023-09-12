public class variables {
    static int staticvariable =10;
    private String instanceVariable = "I am an instance Variable";
    public void method() {
        int localvariable = 20;
        System.out.println("Inside Method");
        System.out.println("Local Variable " + localvariable);
    }

    public static void main(String[] args) {
        variables obj=new variables();
        obj.method();
        System.out.println(obj.instanceVariable);
        System.out.println(staticvariable);
    }
}
