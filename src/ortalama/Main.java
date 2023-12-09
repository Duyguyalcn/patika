package ortalama;
import java.util.Scanner;


public class Main {
    public static void main(String[]args){
int mat,tarih,muzik,turkce,fizik,kimya;
 Scanner input= new Scanner(System.in);
        System.out.print("matematik notunuzu giriniz: ");
 mat = input.nextInt();

        System.out.print("fizik notunuzu giriniz:");
     fizik=input.nextInt();
        System.out.print("tarih notunuzu giriniz:");
          tarih=input.nextInt();

        System.out.print("müzik notunuzu giriniz:");
          muzik=input.nextInt();

        System.out.print("türkçe notunuzu giriniz:");
         turkce=input.nextInt();

        System.out.print("kimya notunuzu giriniz:");
         kimya=input.nextInt();

        int toplam = mat+fizik+tarih+kimya+muzik+turkce;
         double sonuc= toplam/6;
         System.out.println("ortalamanız: " + sonuc);
    }


    }