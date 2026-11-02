import java.util.Scanner;

public class kasir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Kartu member (Y/T): ");
        String kartu = sc.nextLine();
        
        System.out.print("Total belanja: Rp");
        int belanja = sc.nextInt();
        
        int potongan = 0;
        if (kartu.equalsIgnoreCase("Y")) {
            if (belanja > 500000) {
                potongan = 50000;
            } else if (belanja > 100000) {
                potongan = 15000;
            }
        } else if (belanja > 100000) {
            potongan = 10000;
        }
        
        int tagihan = belanja - potongan;
        System.out.println("\n--- PEMBAYARAN ---");
        System.out.println("Belanja             : Rp" + belanja);
        System.out.println("Diskon              : Rp" + potongan);
        System.out.println("Tagihan             : Rp" + tagihan);
        
        System.out.print("Uang tunai          : Rp");
        int tunai = sc.nextInt();
        
        if (tunai >= tagihan) {
            System.out.println("Kembalian           : Rp" + (tunai - tagihan));
        } else {
            System.out.println("Uang kurang         : Rp" + (tagihan - tunai));
        }
    }
}