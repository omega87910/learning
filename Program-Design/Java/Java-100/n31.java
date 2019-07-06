import java.util.Scanner;

public class n31 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum=0;
        for(int i =0;i<=n;i++){
            sum = sum + i*(i+1);
        }
        System.out.println(sum);
    }
}
