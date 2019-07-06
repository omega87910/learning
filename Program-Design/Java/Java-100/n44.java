import java.util.Scanner;

public class n44 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i =2; i<=n;i++){
            int flag=0;
            for(int j=1 ;j<=i;j++){
                if((double)i/(double)j==i/j){
                    flag++;
                }
            }
            if(flag==2){
                System.out.println(i);
            }
        }
    }
}
