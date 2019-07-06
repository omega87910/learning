import java.util.Scanner;

public class n84 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int words =str.length();
        boolean b = true;
        for(int i =1 ;i<words;i++) {
            if (str.charAt(i-1) == str.charAt(words-i)) { }
            else{
                b=false;
                break;
            }
        }
        if(b==true){
            System.out.println("YES");
        }
        else if(b==false){
            System.out.println("NO");
        }
    }
}
