import java.util.Random;
        import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random randnum = new Random();
	int ip = scn.nextInt();
        randnum.setSeed(ip);
        int str = scn.nextInt();
        int a = randnum.nextInt(42)+1;
        int b = randnum.nextInt(42)+1;
        int c = randnum.nextInt(42)+1;
        int d = randnum.nextInt(42)+1;
        int e = randnum.nextInt(42)+1;
        int f = randnum.nextInt(42)+1;
        System.out.println(a+"\t"+b+"\t"+c+"\t"+d+"\t"+e+"\t"+f);
    }
}
