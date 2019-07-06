import java.util.Scanner;

public class n49 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        int m=0 ;
        int i =1;
        while(sum<n){
            sum=sum+i;
            m=i;
            i++;
        }
        System.out.println(m);
    }
}
