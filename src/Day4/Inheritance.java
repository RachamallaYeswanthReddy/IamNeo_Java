package Day4;

public class Inheritance {
    public static void main(String[] args) {
        Dog labrador = new Dog("dog");
        labrador.name = "Puppy";
        labrador.display();
    }
}


class Animal {
    String name;
    String type;
    // constructor
    Animal(String type){
        this.type=type;
    }
    public void eat() {
        System.out.println("I can Eat");
    }
}

class Dog extends Animal {
    Dog(String type){
        super(type);
        System.out.println(type );
    }
    public void display() {
        super.eat(); // super keyword will go to superclass and run all the methods
        System.out.println("My name is " + name);
    }
}
