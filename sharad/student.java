// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Student{
    String name;
    int age;
    
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name="+name);
        System.out.println("Age="+age);
    }
}

class Main {
    public static void main(String[] args) {
        Student std=new Student("Sharad",21);
        std.display();
    }
}