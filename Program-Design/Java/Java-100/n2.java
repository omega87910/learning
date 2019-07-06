import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str=scn.next();
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        sb.reverse();
        System.out.print(sb);
    }
}
