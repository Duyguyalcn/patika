package dongu;
import java.util.Scanner;
public class Ussu {


    public static void main(String[] args) {


        //üssü sayı hesaplama.üssü mantığı kur.3üssü4 4 tane 3 demek.döngüyle yap.



      int n,k;
        Scanner input=new Scanner(System.in);
        System.out.print("üssü alınacak sayı : ");
        n=input.nextInt();
        System.out.print("üs olacak sayı : ");
        k=input.nextInt();
        int total=1;


        int i=1;
        while (i<=k){

            total*=n;
            i++;
        }


        System.out.println("Cevap:"+ total );







    }

}