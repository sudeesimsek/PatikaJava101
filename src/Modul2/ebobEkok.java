package Modul2;

import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz:");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz:");
        int n2 = input.nextInt();
        int ebob = 1;

        for (int i = 1; i <= n1; i++) {
            if(n1%i==0&&n2%i==0){
                System.out.println(i);
                ebob=i;
            }
            for (int k=1;k<=(n1*n2);i++){
                if (k%n1==0&&k%n2==0){
                    System.out.println(k);
                }
            }
        }
    }
}
