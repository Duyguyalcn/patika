package daire;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        //ilk adım değişkenleri ata

       int r;
       double pi=3.14;

       //2.olarak scanner sınıfı tanımla
        Scanner input=new Scanner(System.in);
        System.out.print("yarıçapı giriniz:");r=input.nextInt();
        double alan= pi*r*r;
        System.out.println("dairenin alanı :" + alan);
        double cevre=2*pi*r;
        System.out.print("dairenin cevresi:" + cevre);

    }
    }




    //Daire alanı hesaplama