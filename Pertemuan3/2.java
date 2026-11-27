package tgs3;
import java.io.*;
public class hitungTotal {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(
            new InputStreamReader(System.in));

        System.out.print("Nama pembeli: ");
        String nama = input.readLine();

        System.out.print("Total belanja: ");
        double belanja = Double.parseDouble(input.readLine());

        System.out.print("Diskon (%): ");
        double diskon = Double.parseDouble(input.readLine());

        System.out.print("Uang pembayaran: ");
        double bayar = Double.parseDouble(input.readLine());

        double potongan = belanja * diskon / 100;
        double totalBayar = belanja - potongan;
        double kembalian = bayar - totalBayar;

        DataOutputStream output = new DataOutputStream(
            new FileOutputStream("belanja.dat"));

        output.writeUTF(nama);
        output.writeDouble(belanja);
        output.writeDouble(diskon);
        output.writeDouble(totalBayar);
        output.writeDouble(bayar);
        output.writeDouble(kembalian);

        DataInputStream baca = new DataInputStream(
            new FileInputStream("belanja.dat"));

        String namaBaca = baca.readUTF();
        double belanjaBaca = baca.readDouble();
        double diskonBaca = baca.readDouble();
        double totalBaca = baca.readDouble();
        double bayarBaca = baca.readDouble();
        double kembaliBaca = baca.readDouble();

        System.out.println("\n==== STRUK BELANJA ===");
        System.out.println("Nama pembeli: " + namaBaca);
        System.out.println("Total belanja: " + belanjaBaca);
        System.out.println("Diskon: " + diskonBaca + "%");
        System.out.println("Total pembayaran: " + totalBaca);
        System.out.println("Uang pembayaran: " + bayarBaca);
        System.out.println("Kembalian: " + kembaliBaca);

        baca.close();
    }
}