package Modul2;

import java.util.Scanner;

public class sayilariKucuktenBuyugeSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("1.Sayıyı Giriniz:");
        a = input.nextInt();

        System.out.print("2.Sayıyı Giriniz:");
        b = input.nextInt();

        System.out.print("3.Sayıyı Giriniz:");
        c = input.nextInt();

        if (a < b && a < c) {

            if (b < c) {
                System.out.println("a<b<c");
            } else
                System.out.println("a<c<b");
        } else if ((b < a) && (b < a)) {
            if (a < c) {
                System.out.println("b<a<c");
            } else
                System.out.println("b<c<a");
        }else if ((c<a)&&(c<b)){
            if (a>c){
                System.out.println("c<a<b");
            }else
                System.out.println("c<b<a");
        }

    }
}
