package Modul2;

import java.util.Scanner;

public class armstrongSayisiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;
        //BASAMAKSAYISI BULMA
        //2451/10=245
        //245/10=24
        //24/10=2
        //2/10=0
        //0/10=0
        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }
        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow = basValue;
            }
            result = basPow;
            tempNumber /= 10;

        }
        if (result == number) {
            System.out.println(result);
        }


    }
}
