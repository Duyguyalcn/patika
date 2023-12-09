package bki;
import java.util.Scanner;
public class Main {

    public static void main(String[]args){
     double kilo,boy;
     Scanner input=new Scanner(System.in);
        System.out.print("boyunuzu metre cinsinden giriniz:");
        boy=input.nextDouble();
        System.out.print("kilonuzu giriniz:");
       kilo=input.nextDouble();
       double bki= kilo / (boy*boy);
        System.out.print("Bki:"+ bki);
}

}
 //BKİ HESAPLAYAN PROGRAM