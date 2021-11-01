package Modul2;

import java.util.Scanner;

public class hesapMakinesiSwitchCase {
    public static void main(String[] args) {
        int n1,n2,choose=4,c;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayısı Giriniz:");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz:");
        n2 = input.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Toplam:" + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkan:" + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpım:" + (n1 * n2));
                break;
            case 4:
                c=(n2==0)?+0:(n1 / n2);
                System.out.println(c);
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız");

        }


    }
}
