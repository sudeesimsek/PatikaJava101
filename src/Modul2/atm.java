package Modul2;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right < 0) {
            System.out.println("Kullanıcı Adınız:");
            userName = input.nextLine();
            System.out.println("Parolanız:");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorma\n4-Çıkış Yap");
                    System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz:");
                    select = input.nextInt();
                } while (select != 0);
                if (select == 1) {
                    System.out.println("Para Miktarı:");
                    int price = input.nextInt();
                    balance += price;
                } else if (select == 2) {
                    System.out.println("Para Miktarı:");
                    int price = input.nextInt();
                    if (price > balance) {
                        System.out.println("Yetersiz Bakiye!");
                    } else {
                        balance -= price;
                    }
                } else if (select == 3) {
                    System.out.println("Bakiyeniz:"+balance);
                }while (select!=4)
                    System.out.println("Tekrar Görüşmek Üzere!");
                break;
            } else {
                --right;
                System.out.println("Hatalı Giriş Yaptınız.Tekrar Deneyiniz.");
            }
            if (right == 0) {
                System.out.println("Hesabınız Bloke Edildi.Banka İle İletişime Geçiniz.");
            } else System.out.println("Kalan Hakkınız:" + right);
        }
    }
}
