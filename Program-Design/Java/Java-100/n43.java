import java.util.Scanner;

public class n43 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum1=1;
        int a=1;
        System.out.print(sum1+"\t");
        while(sum1<n){
            sum1+=a;
            System.out.print(sum1+"\t");
            a++;
        }
        System.out.println();
        for(int i =0;i<=n ;i++){
            for(int j =0;j<=i;j++) {
                System.out.print(i+1+"\t");
            }
        }
    }
}
