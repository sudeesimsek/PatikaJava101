package Modul2;

import java.util.Scanner;

public class ucakBiletiFiyatiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe, yas, yolculukTipi, km;
        double normaltutar, yasIndirimi=0, indirimliTutar, toplamTutar=0, gidisDonusBiletIndirimi;
        boolean isError = false;

        System.out.print("Mesafe:");
        mesafe = input.nextInt();

        System.out.print("Yaş:");
        yas = input.nextInt();

        System.out.print("Yolculuk Tipini Giriniz (1-Tek yön/2-Gidiş-Dönüş):");
        yolculukTipi = input.nextInt();
        normaltutar = (mesafe * 0.10);
        indirimliTutar=normaltutar-yasIndirimi;
        if (mesafe < 0) {
            isError = true;
        }
        if (yas < 0) {
            isError = true;
        } else if (yas < 12) {
            yasIndirimi = normaltutar * 0.5;
            indirimliTutar = normaltutar - yasIndirimi;
        } else if ((yas > 12) && (yas < 24)) {
            yasIndirimi = normaltutar * 0.1;
            indirimliTutar = normaltutar - yasIndirimi;
        } else if (yas > 65) {
            yasIndirimi = normaltutar * 0.3;
            indirimliTutar = normaltutar - yasIndirimi;
        }
        if (yolculukTipi == 2) {
            gidisDonusBiletIndirimi = normaltutar * 0.20;
            toplamTutar = indirimliTutar - gidisDonusBiletIndirimi;
        }
        if ((yolculukTipi < 0) || (yolculukTipi > 3)) {
            isError = true;
        }
        if (isError) {
            System.out.println("Tekrar Deneyiniz");
        } else {
            System.out.println("Toplam Tutar:"+toplamTutar);
            System.out.println("Sudiş Airlines İyi Uçuşlar Diler!");
        }
    }

}
