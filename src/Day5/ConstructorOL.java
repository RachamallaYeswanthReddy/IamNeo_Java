package Day5;

public class ConstructorOL {
    public static void main(String[] args) {
        //different initialization options
        Person person1 = new Person();
        // 1. Person person1, declaring a person with name person1;
        // 2. new Person(), Instantiating the objecting (creating) with new keyword
        // 3. initialization, constructors
        Person person2 = new Person("Yeswanth",15);
        Person person3 = new Person("Shivani");
        System.out.println(person2);
    }
}
//
class Person{
    private String name;
    private int age;

    // constructors 1.default constructors
    public Person(){
        return;
    }
    // 2
    public Person(String aName){
        this.name = aName;
    }
    // 3 constructor
    public Person(String aName, int anAge){
        this.name= aName;
        this.age = anAge;
    }
}