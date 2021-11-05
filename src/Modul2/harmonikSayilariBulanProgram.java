package Modul2;

import java.util.Scanner;

public class harmonikSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n Sayısını Giriniz:");
        int n = input.nextInt();
        double result = 0;
        for (int i = 1; i <= n;
             i++) {
            result += (1.0 / i);
            //1.döngü,i=1;result=0+(1/1)=1
            //2.döngü,i=2;result=1+(1/2)=1.5
            //int int bölüm int olur.Bir değişkeni double yaparak sonuç double yapılabilir
        }
        System.out.println("Sonuç:" + result);

    }
}
