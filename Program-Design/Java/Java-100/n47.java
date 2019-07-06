import java.util.Scanner;

public class n47 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int fail =0;
        int a =scn.nextInt();
        int b =scn.nextInt();
        int c =scn.nextInt();
        int d =scn.nextInt();
        int e =scn.nextInt();
        int max = a;
        int min = a;
        if(a<60){
            fail++;
        }
        if(b<60){
            fail++;
        }
        if(c<60){
            fail++;
        }
        if(d<60){
            fail++;
        }
        if(e<60){
            fail++;
        }
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        if(d>max){
            max=d;
        }
        if(e>max){
            max=e;
        }
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        if(d<min){
            min=d;
        }
        if(e<min){
            min=e;
        }
        System.out.println((a+b+c+d+e)/5);
        System.out.println(fail);
        System.out.println(max);
        System.out.println(min);
    }
}
