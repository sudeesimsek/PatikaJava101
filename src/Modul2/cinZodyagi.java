package Modul2;

import java.util.Scanner;

public class cinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, mod;
        String sign = "";
        System.out.print("Doğum Yılınız:");
        year = input.nextInt();
        mod = year % 12;
        switch (mod) {
            case 1:
                sign = "Maymun";

                sign = "Maymun";
                break;
            case 2:
                sign = "Horoz";
                break;
            case 3:
                sign = "Köpek";
                break;
            case 4:
                sign = "Domuz";
                break;
            case 5:
                sign = "Fare";
                break;
            case 6:
                sign = "Öküz";
                break;
            case 7:
                sign = "Kaplan";
                break;
            case 8:
                sign = "Tavşan";
                break;
            case 9:
                sign = "Ejdarha";
                break;
            case 10:
                sign = "Yılan";
                break;
            case 11:
                sign = "At";
                break;
            case 12:
                sign = "Koyun";
                break;
        }
        System.out.println("Burcunuz:" + sign);
    }
}
