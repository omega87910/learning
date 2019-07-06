import java.util.Scanner;

public class n25 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y=0;
        if(x<-1){
            y=3*x*x;
        }
        else if(x>=-1 && x<=1){
            y=x*x*x+3*x-3;
        }
        else if(x>1){
            y=2-x+3;
        }
        System.out.println(y);
    }
}
