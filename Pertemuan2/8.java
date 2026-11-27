package belajar.tes;
public class Tes{
    public static void main(String[] args) {
        double bulan = 384400;
        double matahari = 152100000;
        double cahaya = 300000;

        double waktuBulan = bulan / cahaya;
        double waktuMatahari = matahari / cahaya;

        System.out.println("Perjalanan Cahaya");
        System.out.println("Waktu ke Bulan = " + waktuBulan + " detik");
        System.out.println("Waktu ke Matahari = " + waktuMatahari + " detik");
        System.out.println("Waktu ke Matahari = " + (waktuMatahari / 60) + " menit");
    }
}