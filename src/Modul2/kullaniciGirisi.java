package Modul2;

import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, choose, newPassword;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız:");
        userName = input.nextLine();

        System.out.print("Şifreniz:");
        password = input.nextLine();

        //stringler için eşitlik durumu equals ile yapılır
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız");
        } else {
            System.out.println("Hatalı Giriş Yaptınız");
            System.out.print("Şifrenizi Sıfırlamak İster Misiniz?: ");
        }
        choose = input.nextLine();
        if (choose.equals("evet")) {
            System.out.print("Yeni Şifrenizi Giriniz:");
        } else {
            System.out.print("Tekrar Giriş Yapmayı Deneyiniz");
        }
        newPassword = input.nextLine();
        if (newPassword.equals("java123")) {
            System.out.print("Eski Şifre Yenisi İlke Aynı Olamaz");
        } else {
            System.out.print("Yeni Şifre Oluşturuldu");
        }
    }
}

