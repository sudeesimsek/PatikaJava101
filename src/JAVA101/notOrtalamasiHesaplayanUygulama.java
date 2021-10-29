package JAVA101;
import java.util.Scanner;
public class notOrtalamasiHesaplayanUygulama {
    public static void main(String[] args) {
        //Değişkenler oluşturulmalı
        //Scanner sınıfını import ile dahil et
        int matematik,fizik,kimya,turkce,tarih,muzik;
        //Scanner sınıfının kullanılabilmesi için nesne üret
        Scanner inp=new Scanner(System.in);
        //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz:");
        matematik=inp.nextInt();

        System.out.print("Fizik Notunuz:");
        fizik=inp.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya=inp.nextInt();

        System.out.print("Türkçe Notunuz:");
        turkce=inp.nextInt();

        System.out.print("Tarih Notunuz:");
        tarih=inp.nextInt();

        System.out.print("Müzik Notunuz:");
        muzik=inp.nextInt();

        int toplam = (matematik+fizik+kimya+turkce+tarih+muzik);
        int sonuc= toplam/6;
        System.out.println("Ortalamanız:"+sonuc);
        boolean kosul1=sonuc>=60;
        String str=kosul1 ? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(str);













    }
    }
