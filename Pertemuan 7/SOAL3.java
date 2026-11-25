package P7;
import java.util.Scanner;

public class SOAL3 {
    static int tebakTanggal(int bulan, int tanggal) {
        int hasil = bulan * 100 + tanggal;
        return hasil;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bulan lahir (1-12): ");
        int bulan = input.nextInt();
        System.out.print("Masukkan tanggal lahir: ");
        int tanggal = input.nextInt();

        int hasil = tebakTanggal(bulan, tanggal);

        System.out.println("Hasil akhir: " + hasil);
    }
}
