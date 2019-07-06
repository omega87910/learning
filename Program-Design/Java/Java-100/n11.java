import java.util.Scanner;

public class n11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int w = scn.nextInt();
        int h = scn.nextInt();
        int k=0;
        for(int i=1;i<=h;i++){
            for(int j =1 ;j<w; j++){
            System.out.print(j*i+"\t");
            k=j;
            }
            System.out.println((k+1)*i+"\t");
        }
    }
}
