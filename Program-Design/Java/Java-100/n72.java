import java.util.Scanner;

public class n72 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(Math.round(n*1.6d*10)/10d);
    }
}
