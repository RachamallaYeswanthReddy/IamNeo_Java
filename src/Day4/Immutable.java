package Day4;

public class Immutable {
    public final int v; // the value must be initialized if
    // we wont pass the constructor
    // Final object should be initialized but passing const it need not to be initialized .
    //constructor
    public Immutable(int v){
        this.v=v;
    }
    // getter methods
    public int getV(){
        return v;
    }
    public static void main(String[] args) {
        Immutable im= new Immutable(1000);
        System.out.println(im.v);
    }
}
