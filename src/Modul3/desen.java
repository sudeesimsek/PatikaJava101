package Modul3;

import java.util.Scanner;

public class desen {

    static void ext(int n, int temp,boolean down){
    System.out.print(" " + temp);
        if(temp <= 0) {
        down = false;
    }
    int next = down ? temp - 5 : temp + 5;
        if(next <= n) {
        ext(n, next, down);
    }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("N Sayısı : ");
        n = scanner.nextInt();

        System.out.print("Çıktısı :");
       ext(n, n, true);

    }
}
