package tgs3;
import java.util.Scanner;

public class selisihWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jam ke-1: ");
        int jam1 = input.nextInt();

        System.out.print("Masukkan menit ke-1: ");
        int menit1 = input.nextInt();

        System.out.print("Masukkan jam ke-2: ");
        int jam2 = input.nextInt();

        System.out.print("Masukkan menit ke-2: ");
        int menit2 = input.nextInt();

        int waktu1 = jam1 * 60 + menit1;
        int waktu2 = jam2 * 60 + menit2;
        int selisih = Math.abs(waktu2 - waktu1);
        int jam = selisih / 60;
        int menit = selisih % 60;

        System.out.println("Selisih waktu: " + jam + " jam "+ menit + " menit");
    }
}