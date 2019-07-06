import java.util.Scanner;

public class n23 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int l = Integer.toString(a).length();
        String str = "";
        for (int i = 1; i <= l; i++) {
            if (i == 1 && a>0) {
                str =  a % 10 + " dollar "+str;
                a=a/10;
            }
            else if (i == 2 && a>0) {
                str =  a%10 +" ten "+str;
                a=a/10;
            }
            else if(i==3 && a>0){
                str = a%10 + " hundred "+str;
                a=a/10;
            }
            else if(i==4 && a >0){
                str = a%10 + " thousand "+str;
            }
        }
        System.out.println(str);
    }
}