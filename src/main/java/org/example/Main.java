package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math,turkish,chemistry,physics,music;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Math : ");
        math = scanner.nextInt();

        System.out.print("Turkish : ");
        turkish = scanner.nextInt();

        System.out.print("Chemistry : " );
        chemistry = scanner.nextInt();

        System.out.print("Physics :");
        physics = scanner.nextInt();

        System.out.print("Music : ");
        music = scanner.nextInt();

        int total = 0;
        int coursecount = 0;


        if (math >= 0 && math <= 100) {
            total += math;
            coursecount++;
        } else {

            System.out.println("Geçersiz Matematik notu girdiniz.");
        }

        if (turkish >= 0 && turkish <= 100) {
            total += turkish;
            coursecount++;
        } else {

            System.out.println("Geçersiz Türkçe notu girdiniz.");
        }

        if (chemistry >= 0 && chemistry <= 100) {
            total += chemistry;
            coursecount++;
        } else {

            System.out.println("Geçersiz Kimya notu girdiniz.");
        }

        if (physics >= 0 && physics <= 100) {
            total += physics;
            coursecount++;
        } else {

            System.out.println("Geçersiz Fizik notu girdiniz.");
        }

        if (music >= 0 && music <= 100) {
            total += music;
            coursecount++;
        } else {

            System.out.println("Geçersiz Müzik notu girdiniz.");
        }


            double average = (double) total / coursecount;
            if (average >= 55) {
                System.out.println("Ortalama: " + average + " - Geçti");
            } else {
                System.out.println("Ortalama: " + average + " - Kaldı");
            }

    }
}
