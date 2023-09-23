package Day5;
//method overloading
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String s1, String s2) {
        return s1 + s2;// operator loading
    }
}
class Main{
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int sum1= cal.add(5,4);
        String sum2 = cal.add("Yeswanth"," Reddy");
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
