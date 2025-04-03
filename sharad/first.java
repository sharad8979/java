import java.util.Scanner;
public  class first{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter real part and img part of complex number=");
        int real=sc.nextInt();
        int img=sc.nextInt();
        if(real!=0 && img==0){
            System.out.println("Purely real number="+real+"+"+img+"i");
        }else if(real==0 && img!=0){
            System.out.println("Purely imaginary number="+real+"+"+img+"i");
        }else{
            System.out.println("Complex number="+real+"+"+img+"i");
        }
    }

}