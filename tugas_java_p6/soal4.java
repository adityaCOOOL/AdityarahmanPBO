package prak_p6;

import java.util.Scanner;

public class empat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jmlh mahasiswa: ");
        int jumlah = input.nextInt();

        String[] nama = new String[jumlah];
        int[] nilai = new int[jumlah];
        String[] status = new String[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));

            System.out.print("Nama: ");
            nama[i] = input.next();

            System.out.print("Nilai: ");
            nilai[i] = input.nextInt();

            if (nilai[i] > 50) {
                status[i] = "Lulus";
            } else {
                status[i] = "tidak Lulus";
            }
        }
        System.out.println("\n          Daftar Nilai Mahasiswa");
        System.out.println("-----------------------------------------------");
        System.out.println("No\tNama\t\tNilai\tStatus");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + "\t" + nama[i] + "\t\t"
                    + nilai[i] + "\t" + status[i]);
        }
        System.out.println("-----------------------------------------------");
    }
}
