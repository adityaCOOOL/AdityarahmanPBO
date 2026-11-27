package belajar.tes;
public class KonversiSuhu {
    public static void main(String[] args) {
        double c = 10;
        double f = 15;
        double r = 5;

        System.out.println("Celsius ke Fahrenheit = " + (c * 9 / 5 + 32));
        System.out.println("Fahrenheit ke Celsius = " + ((f - 32) * 5 / 9));

        System.out.println("Celsius ke Reamur = " + (c * 4 / 5));
        System.out.println("Reamur ke Celsius = " + (r * 5 / 4));

        System.out.println("Fahrenheit ke Reamur = " + ((f - 32) * 4 / 9));
        System.out.println("Reamur ke Fahrenheit = " + (r * 9 / 4 + 32));
    }
}
```[cite: 1]