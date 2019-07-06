import java.util.Scanner;

public class n40 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String newN =Integer.toString(n);
        StringBuffer sb = new StringBuffer();
        sb.append(newN);
        sb.reverse();
        System.out.println(sb);
    }
}
