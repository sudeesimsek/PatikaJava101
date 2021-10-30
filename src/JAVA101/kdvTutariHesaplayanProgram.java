package JAVA101;
import java.util.Scanner;
public class kdvTutariHesaplayanProgram {
    public static void main(String[] args) {
   double tutar,kdvOran=0.18,kdvTutar,kdvliTutar;
        Scanner input =new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz:");
        tutar=input.nextDouble();

        kdvOran=(tutar>1000)?0.08:kdvOran;
        kdvTutar=tutar*kdvOran;
        kdvliTutar=tutar+kdvTutar;

        System.out.println("KDVsiz Tutar:"+tutar);
        System.out.println("KDV Oranı:"+kdvOran);
        System.out.println("KDV Tutarı:"+kdvTutar);
        System.out.println("KDVli Tutarı:"+kdvliTutar);






    }
}
