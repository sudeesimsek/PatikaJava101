package JAVA101;
import java.util.Scanner;
public class manavProgrami {
    public static void main(String[] args) {
        double armut,elma,muz,domates,patlıcan,toplam;
        Scanner input =new Scanner(System.in);
        System.out.print("Armut Kaç Kilo :");
        armut=input.nextDouble();
        System.out.print("Elma Kaç Kilo :");
        elma=input.nextDouble();
        System.out.print("Muz Kaç Kilo :");
        muz=input.nextDouble();
        System.out.print("Domates Kaç Kilo :");
        domates=input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo :");
        patlıcan=input.nextDouble();
        toplam=elma*3.67+armut*2.14+muz*0.95+domates*1.11+patlıcan*5.0;
        System.out.println("Toplam Tutar :"+toplam);




    }
}
