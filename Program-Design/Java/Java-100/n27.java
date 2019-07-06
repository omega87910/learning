import java.util.Scanner;

public class n27 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        double b=0;
        if(a<600){
            b = a*0.5;
        }
        else if(a>=600 && a<1200){
            b= a*0.5*0.9;
        }
        else if(a>=1200){
            b = a*0.5*0.79;
        }
        System.out.println(b);
    }
}
