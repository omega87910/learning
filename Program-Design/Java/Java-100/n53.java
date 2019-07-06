
import java.util.Scanner;

public class n53 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
            System.out.print(square(a[i]) + "\t");
        }
        System.out.println();
    }
    public static int square(int ma){
        ma= (int) Math.pow(ma,2);
        return ma;
    }
}
