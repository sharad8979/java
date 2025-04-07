import java.util.Scanner;

public class largest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("N1 is largest");
            } else {
                System.out.println("N3 is largest");
            }
        } else {
            if (n2 > n3) {
                System.out.println("N2 is largest");
            } else {
                System.out.println("N3 is largest");
            }
        }
    }
}