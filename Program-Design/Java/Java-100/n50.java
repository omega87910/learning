import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class n50 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i =0;
        while(Math.pow(n,i)<=10000){
            i++;
        }
        System.out.println(i);
    }
}
