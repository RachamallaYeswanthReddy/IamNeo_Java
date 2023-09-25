package Day5;
// driver code
public class Abstraction {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        Shape Rectangle = new Rectangle();
        Rectangle.draw();
        Rectangle.display();
    }
}
//inheritance is followed => is - a
abstract class Shape{
    // abstract class cannot be instantiated
    // abstract class can have constructors, static methods
    //it can have abstract methods and non-abstract methods
    //abstract methods-> if a class dont have an implementation
    abstract void draw(); // abstract method
    //variable => only instance variables are permitted in the abstract class
    int x,y;
    void display(){ // non-abstract method bcoz.. it contains body
        System.out.println("Display");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing a circle");
    }
}
// abstract methods must be implemented in the child class else throws error
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing a Rectangle");
    }
}
