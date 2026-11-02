package tgsPrak;

import java.util.Scanner;

public class komisi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Jumlah penjualan hari ini: Rp");
        double jual = sc.nextDouble();
        
        double bonus;
        double persen;
        
        if (jual <= 2000000) {
            bonus = 100000;
            persen = 0.10;
        } else if (jual <= 5000000) {
            bonus = 200000;
            persen = 0.15;
        } else {
            bonus = 300000;
            persen = 0.20;
        }
        
        double hasilKomisi = jual * persen;
        double pendapatan = bonus + hasilKomisi;
        
        System.out.println("\n--- HASIL PENJUALAN ---");
        System.out.println("Penjualan           : Rp" + jual);
        System.out.println("Uang Jasa           : Rp" + bonus);
        System.out.println("Komisi              : Rp" + hasilKomisi);
        System.out.println("Total Pendapatan: Rp" + pendapatan);
    }
}