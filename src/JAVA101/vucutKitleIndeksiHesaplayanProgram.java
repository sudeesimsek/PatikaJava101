package JAVA101;
import java.util.Scanner;
public class vucutKitleIndeksiHesaplayanProgram {
    public static void main(String[] args) {
        double boy,kilo,indeks;
        Scanner input =new Scanner(System.in);

        System.out.print("Kilonuzu Giriniz :");
        kilo=input.nextDouble();

        System.out.print("Boyunuzu Giriniz :");
        boy=input.nextDouble();

        indeks=kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz:"+indeks);



    }
}
