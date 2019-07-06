import java.util.Scanner;

public class n51 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int flag = 0;
        for(int i=0;i<n;i++){
            a[i] = scn.nextInt();
        }
        ///////////////////////////////////////////////
        for (int i = 1; i <= n ; i++) {
            for(int j=0;j<i;j++){
                if(j+1>=n){
                    break;
                }
                if (a[j + 1] < a[j]) {
                    flag = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = flag;
                }
            }
        }
        ///////////////////////////////////////////////
        for (int i =0 ;i<n;i++) {
            System.out.println(a[i]);
        }
    }
}