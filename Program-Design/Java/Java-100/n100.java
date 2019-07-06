import java.util.Scanner;

public class n100 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d =0;

        if (b == 1)
        {   d += 0;

        }
        else if (b == 2)
        {
            d += 31;
        }
        else if (b==3){
            d+=59;
        }
        else if (b==4){
            d+=90;
        }
        else if (b==5){
            d+=120;
        }
        else if (b==6){
            d+=151;
        }
        else if (b==7){
            d+=181;
        }
        else if (b==8){
            d+=212;
        }
        else if (b==9){
            d+=243;
        }
        else if (b==10){
            d+=273;
        }
        else if (b==11){
            d+=304;
        }
        else if (b==12){
            d+=334;
        }
        int f = (c+d) ;
        if(f>=21 & f<=50){
            System.out.println("Aquarius");
        }
        else if (f>=51 && f<=79){
            System.out.println("Pisces");
        }
        else if(f>=80 && f<=109){
            System.out.println("Aries");
        }
        else if (f>=110 && f<=140)
        {
            System.out.println("Taurus");
        }
        else if (f>=141 && f<=172){
            System.out.println("Gemini");
        }
        else if (f>=173 && f<=203){
            System.out.println("Cancer");
        }
        else if (f>=204 && f<=234){
            System.out.println("Leo");
        }
        else if (f>=235 && f<=265){
            System.out.println("Virgo");
        }
        else if (f>=266 && f<=296){
            System.out.println("Libra");
        }
        else if (f>=297 && f<=325){
            System.out.println("Scorpio");
        }
        else if (f>=326 && f<=354){
            System.out.println("Sagittarius");
        }
        else if (f>=355 || f<=20 ){
            System.out.println("Capricorn");
        }
    }
}
