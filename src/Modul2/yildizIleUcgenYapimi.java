package Modul2;

import java.util.Scanner;

public class yildizIleUcgenYapimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak Sayısını Giriniz:");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= (n - i);
                 k++) {
                System.out.println(" ");
        }
        for (int j = 1; j <= (2 *i) - 1; j++) {
            System.out.println("*");
        }
        System.out.println();
        }

    }
}
