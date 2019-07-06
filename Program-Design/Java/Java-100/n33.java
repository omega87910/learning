import java.util.Scanner;

public class n33 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double sum=0;
        for(double i =1.0;i<=n;i++){
            sum = sum + Math.pow(2, i);
        }
        System.out.println((int)sum);
    }
}
