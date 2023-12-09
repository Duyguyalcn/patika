package alan;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        int a,b,c,u,Alan;
        Scanner input= new Scanner(System.in);

        System.out.print("a kenarını giriniz:");
        a=input.nextInt();
        System.out.print("b kenarını giriniz:");
        b=input.nextInt();
        System.out.print("c kenarını giriniz:");
        c=input.nextInt();

        u=(a+b+c)/2;

         Alan= (int) Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println(Alan);


    }

}

//üçgen alanı hesaplayan program.