package Modul3;

import java.util.Scanner;

public class gelismisHesapMakinesi {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam:" + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println(("Çıkan:" + result));
        return result;
    }

    static int impact(int a, int b) {
        int result = a * b;
        System.out.println(("Çarpım:" + result));
        return result;
    }

    static int divide(int a, int b) {
        if (b==0){
            return 0;
        }
        int result = a / b;
        System.out.println(("Bölüm:" + result));
        return result;
    }
    static int power (int a,int b){
        int result=1;
        for (int i=1;i<=b;i++){
            result*=a;
        }
        return result;
    }
    static int mod (int a,int b){
        int result=a%b;
        System.out.println("Mod:");
        return result;
    }
    static void calc (int a,int b){
        System.out.println("Çevre:"+2*(a+b));
        System.out.println("Alan:"+a*b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1-Toplama İşlemi\n" + "2-Çıkarma İşlemi\n"
                + "3-Çarpma İşlemi\n" + "4-Bölme İşlemi\n"
                + "5-Üslü Sayı Hesaplama\n" + "6-Mod Alma\n"
                + "7-Dikdörtgen Alan ve Çevre Hesabı\n" + "8-Çıkış Yap\n";
        while (true) {
            System.out.println("Menü");
            System.out.println("Bir İşlem Seçiniz");
            select = input.nextInt();
            if (select == 0) {
                break;
            }
            System.out.println("İlk Sayı:");
            int a = input.nextInt();
            System.out.println("İkinci Sayı:");
            int b = input.nextInt();
            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    impact(a,b);
                    break;
                case 4:
                    if (b==0){
                        System.out.println("İkinci Sayı 0 olamaz");
                    }
                    divide(a,b);
                    break;
                case 5:
                    System.out.println("Sonuç:"+power(a,b));
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    calc(a,b);
                    break;
                default:
                    System.out.println("Geçersiz İşlem");
            }

        }
        System.out.println("Güle Güle");

    }
}
