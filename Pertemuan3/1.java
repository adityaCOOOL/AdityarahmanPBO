package tgs3;
import java.util.Scanner;
public class hitung_gaji_bersih {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nomor Induk Karyawan: ");
        String npm = input.nextLine();

        System.out.print("Nama Karyawan: ");
        String nama = input.nextLine();

        System.out.print("Alamat: ");
        String alamat = input.nextLine();

        System.out.print("Jabatan: ");
        String jabatan = input.nextLine();

        System.out.print("Gaji Pokok: ");
        int gajiPokok = input.nextInt();

        System.out.print("Tunjangan Jabatan: ");
        int tunjanganJabatan = input.nextInt();

        System.out.print("Tunjangan Istri: ");
        int tunjanganIstri = input.nextInt();

        System.out.print("Tunjangan Anak: ");
        int tunjanganAnak = input.nextInt();

        int totalGaji = gajiPokok + tunjanganJabatan + tunjanganIstri + tunjanganAnak;

        int pajak = (gajiPokok + tunjanganJabatan + tunjanganIstri) * 10 / 100;

        int gajiBersih = totalGaji - pajak;

        System.out.println("\n----DATA GAJI PEGAWAI------");
        System.out.println("Nomor Induk: " + npm);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan Jabatan: " + tunjanganJabatan);
        System.out.println("Tunjangan Istri: " + tunjanganIstri);
        System.out.println("Tunjangan Anak: " + tunjanganAnak);
        System.out.println("Total Gaji: " + totalGaji);
        System.out.println("Pajak Penghasilan: " + pajak);
        System.out.println("Gaji Bersih: " + gajiBersih);

    }

}