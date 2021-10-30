package JAVA101;
import java.util.Scanner;
public class daireninAlaniniBulanProgram {
    public static void main(String[] args) {
        int r,a;
        double pi =3.14;
        Scanner input =new Scanner(System.in);

        System.out.print("Dairenin Yarıçapını Giriniz:");
        r=input.nextInt();

        System.out.print("Dairenin Merkez Açısının Ölçüsünü Giriniz:");
        a=input.nextInt();

        double alan=(pi*(r*r)*a)/360;
        System.out.println("Dairenin Alanı:"+alan);

    }
}
