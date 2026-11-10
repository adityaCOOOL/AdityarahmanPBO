package p5;
public class no5 {
    public static void main(String[] args) {
        int baris = 1;
        System.out.println("Half Triangle");
        while (baris <= 5) {
            int spasi = 5 - baris;
            int bintang = 1;
            while (spasi > 0) {
                System.out.print(" ");
                spasi--;
            }
            while (bintang <= (2 * baris - 1)) {
                System.out.print("*");
                bintang++;
            }
            System.out.println();
            baris++;
        }
        System.out.println("\nFull Triangle");
        baris = 1;
        while (baris <= 5) {
            int spasi = 5 - baris;
            int bintang = 1;
            while (spasi > 0) {
                System.out.print(" ");
                spasi--;
            }
            while (bintang <= (2 * baris - 1)) {
                System.out.print("*");
                bintang++;
            }
            System.out.println();
            baris++;
        }
        baris = 4;
        while (baris >= 1) {
            int spasi = 5 - baris;
            int bintang = 1;
            while (spasi > 0) {
                System.out.print(" ");
                spasi--;
            }
            while (bintang <= (2 * baris - 1)) {
                System.out.print("*");
                bintang++;
            }
            System.out.println();
            baris--;
        }
    }
}
