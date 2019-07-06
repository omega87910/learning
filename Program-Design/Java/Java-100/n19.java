import java.util.Random;
import java.util.Scanner;

public class n19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rd = new Random();
        int seed =scn.nextInt();
        rd.setSeed(seed);
        int a =rd.nextInt(100);
        int b =rd.nextInt(100);
        int c =rd.nextInt(100);
        int max = a;
        int min = a;
        if(b> max){
            max =b;
        }
        if (c>max){
            max =c;
        }
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        System.out.println(max+"\t"+min);
        System.out.println(a+""+b+""+c);
    }
}
