package Day3;

class Student{
    public int regnum;
    public String name;
    Student(int regnum, String name){
        this.regnum= regnum;
        this.name=name;
    }
}

// driver code
public class ArrayofObjects {
    public static void main(String[] args) {
        Student[] studentarr = new Student[3];
        studentarr[0] = new Student(1,"Yeswanth");
        studentarr[1] = new Student(2,"Jatin");
        studentarr[2] = new Student(3,"Chaitanya");

        Student[] studarr = new Student[]{
                new Student(1,"Yesh"),
                new Student(2,"Jatin"),
                new Student(3,"Amulya")
        };
        for (Student e: studarr){
            System.out.println(e.regnum+" "+e.name);
        }
    }
}
