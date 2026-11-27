package tgs3;

import java.util.Scanner;
public class cetak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah novel: ");
        int novel = input.nextInt();

        System.out.print("Jumlah lembar per novel: ");
        int lembar = input.nextInt();

        int totalDetik = novel * lembar;
        int hari = totalDetik / 86400;
        totalDetik = totalDetik % 86400;
        int jam = totalDetik / 3600;
        totalDetik = totalDetik % 3600;
        int menit = totalDetik / 60;
        int detik = totalDetik % 60;

        System.out.println("--------Waktu yang dibutuhkan-------");
        System.out.println("Hari: " + hari);
        System.out.println("Jam: " + jam);
        System.out.println("Menit: " + menit);
        System.out.println("Detik: " + detik);
    }
}
```[cite: 2]