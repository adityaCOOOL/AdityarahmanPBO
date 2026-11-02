package tgsPrak;

import java.util.Scanner;

public class perhitunganLuasBangunDatar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("4. Trapesium");
        System.out.println("5. Layang-layang");
        System.out.print("Pilih nomor: ");
        
        int menu = sc.nextInt();
        double luas;
        
        switch (menu) {
            case 1:
                System.out.print("Panjang sisi: ");
                double s = sc.nextDouble();
                luas = s * s;
                System.out.println("Hasil luas persegi: " + luas);
                break;
                
            case 2:
                System.out.print("Alas: ");
                double a = sc.nextDouble();
                System.out.print("Tinggi: ");
                double t = sc.nextDouble();
                luas = a * t / 2;
                System.out.println("Hasil luas segitiga: " + luas);
                break;
                
            case 3:
                System.out.print("Jari-jari: ");
                double r = sc.nextDouble();
                luas = 3.14 * r * r;
                System.out.println("Hasil luas lingkaran: " + luas);
                break;
                
            case 4:
                System.out.print("Sisi sejajar pertama: ");
                double x = sc.nextDouble();
                System.out.print("Sisi sejajar kedua: ");
                double y = sc.nextDouble();
                System.out.print("Tinggi: ");
                double tinggi = sc.nextDouble();
                luas = (x + y) * tinggi / 2;
                System.out.println("Hasil luas trapesium: " + luas);
                break;
                
            case 5:
                System.out.print("Diagonal pertama: ");
                double diagonalA = sc.nextDouble();
                System.out.print("Diagonal kedua: ");
                double diagonalB = sc.nextDouble();
                luas = diagonalA * diagonalB / 2;
                System.out.println("Hasil luas layang-layang: " + luas);
                break;
                
            default:
                System.out.println("Menu tidak tersedia!");
                break;
        }
    }
}