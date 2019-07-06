import java.util.Scanner;

public class n17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        int words = a.length();
        for(int i=0;i<=words-1;i++){
            System.out.print(a.charAt(i)+"\t");
        }
    }
}
