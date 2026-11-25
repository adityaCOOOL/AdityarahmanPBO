package P7;
import java.util.Scanner;

class DataMhs {
    String nama;
    String npm;
    String kelas;
    void isiData(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }
    void tampilkanData() {
        System.out.println("Nama  : " + this.nama);
        System.out.println("NPM   : " + this.npm);
        System.out.println("Kelas : " + this.kelas);
    }
}
public class SOAL7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        DataMhs mhs = new DataMhs();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NPM: ");
        String npm = input.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = input.nextLine();

        mhs.isiData(nama, npm, kelas);

        System.out.println("\nData Mahasiswa:");
        mhs.tampilkanData();
    }
}