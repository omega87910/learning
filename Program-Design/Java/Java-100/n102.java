import java.util.Scanner;

public class n102 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int move = scn.nextInt();
        int words =str.length();
        for(int i=0;i<words;i++){
            if((int)str.charAt(i)>=65&&(int)str.charAt(i)<=90){
                if((int)str.charAt(i)+move>90){
                    System.out.print((char)((int)str.charAt(i)+move-26));
                }
                else{
                    System.out.print((char)((int)str.charAt(i)+move));
                }
            }
            else if((int)str.charAt(i)>=97&&(int)str.charAt(i)<=122){
                if((int)str.charAt(i)+move>122){
                    System.out.print((char)((int)str.charAt(i)+move-26));
                }
                else{
                    System.out.print((char)((int)str.charAt(i)+move));
                }
            }
            else if((int)str.charAt(i)>=48&&(int)str.charAt(i)<=57){
                if((int)str.charAt(i)+move>57){
                    System.out.print((char)((int)str.charAt(i)+move-10));
                }
                else{
                    System.out.print((char)((int)str.charAt(i)+move));
                }
            }
            else{
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
    }
}
