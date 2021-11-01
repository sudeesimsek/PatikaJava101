package Modul2;

import java.util.Scanner;

public class sinifiGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        mat = input.nextInt();
        if ((mat<0)||(mat>100)){
            System.out.println("Girilen Not Sıfır İle 100 Arasında Olmalıdır");
            mat=((mat<0)||(mat>100))? 0:mat;}

        System.out.print("Fizik Notunuz:");
        fizik = input.nextInt();
        if ((fizik<0)||(fizik>100)){
            System.out.println("Girilen Not Sıfır İle 100 Arasında Olmalıdır");
            fizik=((fizik<0)||(fizik>100))? 0:fizik;}

        System.out.print("Türkçe Notunuz:");
        turkce = input.nextInt();
        if ((turkce<0)||(turkce>100)){
            System.out.println("Girilen Not Sıfır İle 100 Arasında Olmalıdır");
            turkce=((turkce<0)||(turkce>100))? 0:turkce;}

        System.out.print("Kimya Notunuz:");
        kimya = input.nextInt();
        if ((kimya<0)||(kimya>100)){
            System.out.println("Girilen Not Sıfır İle 100 Arasında Olmalıdır");
            kimya=((kimya<0)||(kimya>100))? 0:kimya;}

        System.out.print("Müzik Notunuz:");
        muzik = input.nextInt();
        if ((muzik<0)||(muzik>100)){
            System.out.println("Girilen Not Sıfır İle 100 Arasında Olmalıdır");
            muzik=((muzik<0)||(muzik>100))? 0:muzik;}

        double avarege = (mat + kimya + muzik + turkce + fizik) / 5;
        if ((avarege<0)||(avarege>100)){
            System.out.println("Girilen Not Sıfır İle 100 Arasında Olmalıdır");
        }
        if (avarege <= 50) {
            System.out.println("Sinifta Kaldiniz.Seneye Görüşürüz :D");
        } else{
            System.out.println("Tebrikler,Sınıfı Geçtiniz");}
        System.out.print("Ortalamanız:"+avarege);

    }

}
