package project;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // 0-100 arasi sayi tahmin etme oyunu
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rastgeleSayi = random.nextInt(101);

        int denemeSayisi = 0;

        int tahminEdilen;

        boolean tahminDogrumu = false;

        System.out.println("0 ile 100 arasi bir sayiyi tahmin etmeye calisin");

        do {
            System.out.println("tahmininizi yapiniz");
            tahminEdilen = scanner.nextInt();
            denemeSayisi++;

            if (tahminEdilen < rastgeleSayi) {
                System.out.println("sayi daha büyük olmali");
            } else if (tahminEdilen > rastgeleSayi) {
                System.out.println("sayi daha kücük olmali");
            } else {
                tahminDogrumu = true;
                System.out.println("tebrikler dogru tahmin");
                System.out.println("deneme sayisi: " + denemeSayisi);
            }
        } while (!tahminDogrumu);
        scanner.close();
    }
}

