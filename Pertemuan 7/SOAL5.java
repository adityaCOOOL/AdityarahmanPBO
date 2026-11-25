
public class SOAL5{
    public static int hitungJumlah(int angka) {
        if (angka == 1) {
            return 1;
        } else {
            return angka + hitungJumlah(angka - 1);
        }
    }
    public static void main(String[] args) {
        int angka = 5;
        int hasil = hitungJumlah(angka);
        System.out.println("Hasil penjumlahan: " + hasil);
    }
}
