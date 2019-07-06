import java.util.Scanner;

public class n21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a =scn.nextInt();
        int b =scn.nextInt();
        int c =scn.nextInt();
        if(a*a+b*b==c*c){
            System.out.println("Right triangle");
        }
        else if(a*a+b*b<c*c){
            System.out.println("Obtuse triangle");
        }
        else if(a*a+b*b>c*c){
            System.out.println("Acute triangle");
        }
    }
}
