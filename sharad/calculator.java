// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Calculator {
    void add(int a, int b) {
        System.out.println("Addition of int=" + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Addition of double=" + (a + b));
    }
}

class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(2, 3);
        cal.add(3.5, 5.6);
    }
}