import java.util.Scanner;
public class n32 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        double sum=0.0;
        for(double i =1.0 ;i<=n;i++){
            sum = sum + 1/((2*i-1)*(2*i));
        }
        System.out.println(sum);
    }
}
