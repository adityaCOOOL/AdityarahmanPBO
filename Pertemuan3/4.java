package tgs3;
import java.util.Scanner;

public class sentripental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input masa benda: ");
        double m = input.nextDouble();

        System.out.print("Input kecepatannya: ");
        double v = input.nextDouble();

        System.out.print("Input jari2: ");
        double r = input.nextDouble();

            double fc = m * v * v / r;

        System.out.println("Gaya sentripetal: " + fc + " n");

        input.close();
    }
}