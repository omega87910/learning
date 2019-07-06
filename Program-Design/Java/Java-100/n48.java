import java.util.Scanner;

public class n48 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i =0 ;i<=n;i++){
            System.out.println(i+"\t"+(int)Math.pow(i,2)+"\t"+(int)Math.pow(i,3));
        }
    }
}
