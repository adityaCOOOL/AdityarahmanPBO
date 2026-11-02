package tgsPrak;

import java.util.Scanner;

public class cekBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int angka;
        System.out.print("Inputkan angka: ");
        angka = sc.nextInt();
        
        String hasil = "Ganjil";
        
        if (angka % 2 == 0) {
            hasil = "Genap";
        }
        System.out.println("Angka " + angka + " adalah " + hasil);
    }
}
