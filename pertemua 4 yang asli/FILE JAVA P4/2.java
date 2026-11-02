package tgsPrak;

import java.util.Scanner;

public class hari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka hari: ");
        int hari = sc.nextInt();
        
        String namaHari;
        
        switch (hari) {
            case 1: namaHari = "Senin";
            break;
            case 2: namaHari = "Selasa";
            break;
            case 3: namaHari = "Rabu";
            break;
            case 4: namaHari = "Kamis";
            break;
            case 5: namaHari = "Jumat";
            break;
            case 6: namaHari = "Sabtu";
            break;
            case 7: namaHari = "Minggu";
            break;
            default: namaHari = "hari gak ada";
        }
        
        System.out.println("Nama hari: " + namaHari);
    }
}
