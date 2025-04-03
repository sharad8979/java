public class third{
    public static void main(String[] args) {
        int a=8,b=6;
        System.out.println("Before Swapping ="+a+" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swapping ="+a+" "+b);
    }
}