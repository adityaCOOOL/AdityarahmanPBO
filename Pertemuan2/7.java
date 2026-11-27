package belajar.tes;
public class Tes {
    public static void main(String[] args) {
        String kalimatKecil = "Saya Belajar Java";
        String kalimatBesar = "Saya Belajar Java";

        kalimatKecil = kalimatKecil.toLowerCase();
        kalimatBesar = kalimatBesar.toUpperCase();

        System.out.println("kecil : " + kalimatKecil);
        System.out.println("besar : " + kalimatBesar);
    }
}