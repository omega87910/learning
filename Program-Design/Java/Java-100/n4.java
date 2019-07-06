import java.util.Random;
import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        Random rd =new Random();
        Scanner scn = new Scanner(System.in);
        int ip = scn.nextInt();
        rd.setSeed(ip);
        int[][] a = new int[5][5];
        for(int i =0 ; i<5; i++){
            for(int j =0 ; j<4;j++){
                a[i][j] = rd.nextInt(10);
                System.out.print(a[i][j]+"\t");
            }
            a[i][4] = rd.nextInt(10);
            System.out.println(a[i][4]+"\t");
        }
        System.out.println();
        for(int i =0 ; i<5; i++){
            for(int j =0 ; j<4;j++){
                System.out.print(a[j][i]+"\t");
            }
            System.out.println(a[4][i]+"\t");
        }
    }
}
