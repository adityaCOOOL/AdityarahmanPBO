package p5;
    
import java.util.Scanner;
public class no4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int banyakAngka;
        int bilangan = 1;
        int hasil = 0;
        int urutan = 1;

        System.out.print("Masukkan banyak angka : ");
        banyakAngka = scan.nextInt();

        while (urutan <= banyakAngka) {
            System.out.print(bilangan + " ");

            hasil = hasil + bilangan;
            bilangan = bilangan + 2;

            urutan++;
        }

        System.out.println("\nTotal penjumlahan : " + hasil);
    }
}