import java.util.Scanner;

public class n38 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int flag=0;
        for(int i =1;i<=n;i++){
            if((double)n/(double)i==n/i){
                System.out.println(i);
                flag++;
            }
        }
        if(flag>2){
            System.out.println("NO");
        }
        else{
            System.out.println("Yes");
        }
    }
}
