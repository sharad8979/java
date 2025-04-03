import java.util.Scanner;
public class four{
    public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number=");
        int n=sc.nextInt();
        if((n&(n-1))==0){
            System.out.println("Power of 2");
        }else if(n==1 || n==0){
            System.out.println("Power of 2");
        }else{
            System.out.println("not Power of 2");
        }
    }
}