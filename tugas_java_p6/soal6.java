package prak_p6;
import java.util.Scanner;

public class enam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jmlh bilangan: ");
        int jumlah = input.nextInt();

        double[] angka = new double[jumlah];
        double total = 0;
        for (int i = 0; i < jumlah; i++) {
            try {
                System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                angka[i] = input.nextDouble();

                total = total + angka[i];

            } catch (java.util.InputMismatchException e) {
                System.out.println("Inputan harus bilangan!");

                input.next();
                i--;
            }
        }
        double rataRata = total / jumlah;

        System.out.println("\nJumlah seluruh bilangan: " + total);
        System.out.println("rata-rata: " + rataRata);
    }
}
