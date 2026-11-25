package P7;
import java.util.Scanner;

public class SOAL2 {
    public static double HitungKeliling(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Masukkan panjang: ");
        double p = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        double l = input.nextDouble();

        double keliling = HitungKeliling(p, l);
        System.out.println("Keliling Persegi Panjang: " + keliling);
        
    }
}
