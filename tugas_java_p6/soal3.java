package prak_p6;
import java.util.Scanner;
import java.util.Arrays;

public class tiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = input.nextInt();

        int[] angka = new int[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }
        int terbesar = angka[0];
        int terkecil = angka[0];
        int indeksTerbesar = 0;
        int indeksTerkecil = 0;
        int total = 0;
        int jumlahIndeksGanjil = 0;
        int jumlahIndeksGenap = 0;

 
        for (int i = 0; i < jumlah; i++) {
            total = total + angka[i];
            if (angka[i] > terbesar) {
                terbesar = angka[i];
                indeksTerbesar = i;
            }
            if (angka[i] < terkecil) {
                terkecil = angka[i];
                indeksTerkecil = i;
            }
            if (i % 2 == 1) {
                jumlahIndeksGanjil = jumlahIndeksGanjil + angka[i];
            } else {
                jumlahIndeksGenap = jumlahIndeksGenap + angka[i];
            }
        }
        double rataRata = (double) total / jumlah;

        System.out.println("\nData Array:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Indeks " + i + ": " + angka[i]);
        }

        System.out.println("\nNilai terbesar: " + terbesar);
        System.out.println("Indeks terbesar: " + indeksTerbesar);
        System.out.println("Nilai terkecil: " + terkecil);
        System.out.println("Indeks terkecil: " + indeksTerkecil);
        System.out.println("Jumlah seluruh elemen: " + total);
        System.out.println("Nilai rata-rata: " + rataRata);

        System.out.println("\nJumlah elemen indeks ganjil: "+ jumlahIndeksGanjil);
        System.out.println("Jumlah elemen indeks genap: "+ jumlahIndeksGenap);

    
        if (jumlahIndeksGanjil % 2 == 0) {
            System.out.println("Jumlah indeks ganjil bernilai Genap");
        } else {
            System.out.println("Jumlah indeks ganjil bernilai Ganjil");
        }
        if (jumlahIndeksGenap % 2 == 0) {
            System.out.println("Jumlah indeks genap bernilai Genap");
        } else {
            System.out.println("Jumlah indeks genap bernilai Ganjil");
        }
        Arrays.sort(angka);

        System.out.println("\nArray setelah diurutkan:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println(angka[i]);
        }
    }
}
