package hipotenus;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){

        int a,b;
        double c;
        Scanner input=new Scanner(System.in);
        System.out.print("a kenarını giriniz:");
        a=input.nextInt();
        System.out.print("b kenarını giriniz:");
        b=input.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("hipotenüs:" +c);








    }
}
