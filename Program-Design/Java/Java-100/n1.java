import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int str = scn.nextInt();
        int result=0;
        while(str!=0){
            result=result+(str%10);
            str=str/10;
        }
        System.out.println(result);
    }
}
