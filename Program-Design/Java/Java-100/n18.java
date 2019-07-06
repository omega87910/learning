import java.util.Scanner;

public class n18 {


    public  static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int times=0;
        System.out.println(digits(a,times));
    }

    public static int digits(int a, int times) {
            while(a>0){
                a=a/10;
                times++;
            }
        return times;
    }
}