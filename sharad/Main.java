class Car {

    String color;

    void display() {
        System.out.println("Colour of car=" + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "Red";
        c1.display();
    }

}
