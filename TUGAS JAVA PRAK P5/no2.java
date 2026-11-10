package p5;
import java.util.Scanner;
public class no2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int banyakData;
        int nilai;
        int hasil = 0;
        int urutan = 1;

        System.out.print("Masukkan banyak bilangan : ");
        banyakData = scan.nextInt();

        while (urutan <= banyakData) {
            System.out.print("Masukkan bilangan ke-" + urutan + " : ");
            nilai = scan.nextInt();

            hasil = hasil + nilai;

            urutan++;
        }

        double rata = hasil * 1.0 / banyakData;

        System.out.println("Total jumlah : " + hasil);
        System.out.println("Rata-rata : " + rata);
    }
}