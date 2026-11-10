package p5;
import java.util.Scanner;
public class no3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jumlahBaris;
        int bilangan = 1;
        int baris = 1;

        System.out.print("Masukkan banyak baris : ");
        jumlahBaris = scan.nextInt();

        while (baris <= jumlahBaris) {
            int kolom = 1;

            while (kolom <= baris) {
                System.out.print(bilangan + " ");

                bilangan++;
                kolom++;
            }

            System.out.println();
            baris++;
        }
    }
}