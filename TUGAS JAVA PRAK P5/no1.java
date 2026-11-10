package p5;
import java.util.Scanner;
public class no1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nilai;
        int max = 0;
        int min = 0;
        int nomor = 1;

        while (nomor <= 10) {
            System.out.print("Masukkan angka ke-" + nomor + " : ");
            nilai = scan.nextInt();
            if (nomor == 1) {
                max = nilai;
                min = nilai;
            } else {
                if (nilai >= max) {
                    max = nilai;
                }
                if (nilai <= min) {
                    min = nilai;
                }
            }
            nomor++;
        }
        System.out.println("Bilangan terbesar : " + max);
        System.out.println("Bilangan terkecil : " + min);
    }
}