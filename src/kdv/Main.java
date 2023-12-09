package kdv;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){

       double tutar ,kdvOran=0.18,kdvTutar,kdvliTutar;

       Scanner input= new Scanner(System.in);
        System.out.print("ücret tutarını giriniz:");
       tutar=input.nextDouble();

        kdvTutar  = tutar*kdvOran;
        kdvliTutar= kdvTutar+tutar;


        System.out.println("Kdv'siz tutarı giriniz:" + tutar);
        System.out.println("Kdv oranı : " + kdvOran);
        System.out.println("Kdv tutarı : " + kdvTutar);
        System.out.println("Kdv'li tutar :" + kdvliTutar );




    }




}

 //KDV'siz Fiyat = 10;
//
//KDV'li Fiyat = 11.8;
//
//KDV tutarı = 1.8;