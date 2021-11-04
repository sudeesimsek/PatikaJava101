package Modul2;

import java.util.Scanner;

public class ciftSayilarinToplaminiBulanProgram {
    public static void main(String[] args) {
        int i;
        int total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz:");
            i = input.nextInt();
            if ((i % 4 == 0) && (i % 2 == 0)){
                total += i;
            }
        } while (i % 2 == 0);
        System.out.print("Toplam:" + total);
    }
}
