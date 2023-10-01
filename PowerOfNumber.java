package Week2;

import java.util.Scanner;

public class PowerOfNumber {
    static int power(int a,int b) {
      ;
        if (b == 0) {

            return 1;
        } else {
            return a * power(a, b - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tabanı giriniz: ");
        int taban = scanner.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int us = scanner.nextInt();

        if (us < 0) {
            System.out.println("Üs negatif olamaz.");
        } else {
            int sonuc =power(taban, us);
            System.out.println("Sonuç : "   + sonuc);
        }
    }
}
