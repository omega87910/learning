import java.util.Scanner;

public class n24 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
       for(int i=0;i<6;i++){
            int flag =scn.nextInt();
            if (flag>0){
                a++;
            }
            else if(flag==0)
            {
                b++;
            }
            else if(flag<0){
                c++;
            }
        }

        System.out.println("+:"+a);
        System.out.println("0:"+b);
        System.out.println("-:"+c);
    }
}
