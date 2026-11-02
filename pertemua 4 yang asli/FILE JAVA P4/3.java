package tgsPrak;

import java.util.Scanner;

public class gaji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nik anda : ");
        String nomor = sc.nextLine();

        System.out.print("Masukan Nama anda : ");
        String namaPegawai = sc.nextLine();

        System.out.print("Kode golongan (1-4): ");
        int kode = sc.nextInt();

        System.out.print("Status menikah? (ya/tidak): ");
        String menikah = sc.next();

        System.out.print("Jumlah anak: ");
        int banyakAnak = sc.nextInt();

        int pokok;

        switch (kode) {
            case 1: pokok = 1200000; break;
            case 2: pokok = 1500000; break;
            case 3: pokok = 1750000; break;
            case 4: pokok = 2000000; break;
            default:
                System.out.println("Kode golongan gak ada!");
                return;
        }

        int pasangan = 0;

        if (menikah.equalsIgnoreCase("ya")) {
            pasangan = pokok * 10 / 100;
        }

        int anak = pokok * 5 / 100 * banyakAnak;
        int tambahan = pasangan + anak;
        int bersih = pokok + tambahan;

        System.out.println("\n---DATA GAJI---");
        System.out.println("NIK                  : " + nomor);
        System.out.println("Nama                 : " + namaPegawai);
        System.out.println("Gaji Pokok           : Rp" + pokok);
        System.out.println("Tunjangan Pasangan   : Rp" + pasangan);
        System.out.println("Tunjangan Anak       : Rp" + anak);
        System.out.println("Total Tunjangan      : Rp" + tambahan);
        System.out.println("Gaji Bersih          : Rp" + bersih);
    }
}