import java.util.Scanner;
public class n39 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] square = new int[n][n];
        for(int i=1 ;i<=n;i++){
            square[i-1][0]=i;
            square[0][i-1]=i;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                square[i][j]=square[i][0]*square[0][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                System.out.print(square[i][j]+"\t");
            }
            System.out.println(square[i][n-1]);
        }
    }
}