import java.util.Scanner;

public class n30 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[][] information =new String[6][6];
        int sum =0;
        String flag ;
        for(int j =0;j<5;j++){
            for(int i =0;i<5;i++){
                information[i][j]=scn.next();
            }
        }
        for(int i=0 ;i<5;i++) {
            double useravg = (Integer.parseInt(information[2][i]) + Integer.parseInt(information[3][i]) + Integer.parseInt(information[4][i])) / 3d;
            information[5][i] = Double.toString(useravg);
        }
        ////////////////////////////////////////////////////////////////////
        for(int i=0 ;i<=5;i++){
            for(int j=0;j<5;j++){
                if(Double.parseDouble(information[5][j])<Double.parseDouble(information[5][j+1])){
                    flag=information[i][j];
                    information[i][j]=information[i][j+1];
                    information[i][j+1]=flag;
                }
                if(j+2==5){
                    break;
                }
            }
        }
        ////////////////////////////////////////////////////////////////////
        System.out.println("ID\t\tNAME\tChinese\tEnglish\t\tMath\tAvg");
        for(int j =0;j<5;j++){
            for(int i =0;i<=5;i++){
                System.out.print(information[i][j]+" \t\t");
            }
            System.out.println();
        }
        System.out.print("AVG:\t\t\t\t");
            for (int i = 2; i < 5; i++) {
                for(int j=0;j<5;j++) {
                sum += Integer.parseInt(information[i][j]);
            }
            System.out.print(sum/5d+"\t");
            sum=0;
        }
    }
}
