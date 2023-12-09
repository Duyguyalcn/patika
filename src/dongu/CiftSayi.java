package dongu;
import java.util.Scanner;
public class CiftSayi {
    public static void main(String[]args) {
//kullanıcının girdiği sayıya kadar çift olan sayıları bul
        int k;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        k = inp.nextInt();
//başını ve sonunu bildiğimiz döngülerde for kullanırız.

        for (int i = 1; i <= k; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }


        }


    }}







/*Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.
Döngüleri kullanırız çünkü girdiğimiz sayıya kadar aynı koşulda işlem yapılmasını bekleriz.
*/