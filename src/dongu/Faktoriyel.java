package dongu;
import java.util.Scanner;
public class Faktoriyel {
    public static void main(String[]args){

        //FAKTÖRİYEL BULMA!!  n!=1*2*3*4*5.....*n
        Scanner input=new Scanner(System.in);
        System.out.print("faktöriyelini hesaplamak için sayı giriniz:");
int n=input.nextInt();
int total=1;
for (int i=1;i<=n;i++){

total=total*i;
}
        System.out.println("Faktöriyel: " + total);

    }


}
