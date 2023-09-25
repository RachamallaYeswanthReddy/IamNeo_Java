package Day5;

public class MethodOverriding {
    public static void main(String[] args) {
        // creating instance for animal
        Animal animal = new Animal();
        animal.makeSound();
        Animal cat = new Cat(); // upcasting => widening(typecasting => keeping small datatype in bigger)
        cat.makeSound();
        //cat is of type animal , but it refers to an instance of Cat class
        Animal dog = new Dog();
        dog.makeSound();
        //dog is of type animal , but it refers to an instance of Dog class
    }
}
// Inheritance
class Animal{
    void makeSound(){
        System.out.println("Generic Sound");
    }
}
class Cat extends Animal{
    @Override // annotations => need for framework
    void makeSound(){
        System.out.println("meow");
    }
}
class Dog extends Animal{
    @Override // annotations => need for framework
    void makeSound(){
        System.out.println("I bark");
    }
}