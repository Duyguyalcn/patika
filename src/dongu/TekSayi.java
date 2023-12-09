package dongu;
import java.util.Scanner;
public class TekSayi {
    public static void main(String[]args) {
        // negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.


        int n;
int total=0;
//kullanıcının ne kadar kez sayı gireceğini bilmediğimiz için while kullanıyoruz.


        Scanner scanner = new Scanner(System.in);


        do {
            System.out.print("Sayı giriniz: ");
            n = scanner.nextInt();
            if (n%2==1){
                total+=n;
            }
        }
            while (n > 0) ;

        System.out.println("Toplam :" + total);

    }








    }











