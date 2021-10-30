package JAVA101;
import java.util.Scanner;
public class hıpotenusuBulanProgram {
    public static void main(String[] args) {
        //Değişkenleri oluştur
        int a,b;
        double c;
        //kullanıcıdan verileri al
        Scanner input =new Scanner(System.in);
        System.out.print("Birinci Kenari Giriniz:");
        a=input.nextInt();
        System.out.print("İkinci Kenari Giriniz:");
        b=input.nextInt();
        System.out.print("Üçüncü Kenari Giriniz:");
        c=input.nextInt();
        double u=(a+b+c)/2;
        double alan;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println(alan);














    }
}
