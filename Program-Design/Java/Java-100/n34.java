import java.util.Scanner;

public class n34 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1 ;i<=n;i++){
            for(int j=1;j<=n;j++){
                for(int k=1;k<=n;k++){
                    if(i*i+j*j==k*k && i+j+k<=n ){
                        if(i<j && j<k) {
                            System.out.println(i + "\t" + j + "\t" + k);
                        }
                    }
                }
            }
        }
    }
}
