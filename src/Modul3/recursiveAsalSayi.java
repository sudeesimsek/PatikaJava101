package Modul3;
import java.util.Scanner;
public class recursiveAsalSayi {
    static void f (int n){
        int sayac = 0;

        for(int i = 2; i < n; i++)
        {
            if(n % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println(n + " Asal bir sayidir.");
        }
        else {
            System.out.println(n + " Asal bir sayi degildir.");
        }
    }
    public static void main(String[] args) {
        System.out.print("Bir sayi giriniz:");
        Scanner tara=new Scanner(System.in);
        int sayi=tara.nextInt();
        f(sayi);


    }
}
