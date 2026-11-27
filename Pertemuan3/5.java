package tgs3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class hitungMangga {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in));

        int mangga = 70;
        int jambu = 4 * 30;
        int manggaBusuk = 15;

        int totalBuah = mangga + jambu;
        int totalAkhir = totalBuah - manggaBusuk;

        System.out.println("Jumlah mangga: " + mangga);
        System.out.println("Jumlah jambu: " + jambu);
        System.out.println("Total buah dibeli: " + totalBuah);
        System.out.println("Mangga busuk: " + manggaBusuk);
        System.out.println("Total buah setelah dikembalikan: " + totalAkhir);
    }
}