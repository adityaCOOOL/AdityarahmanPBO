package prak_p6;
import java.util.Scanner;

class Threadchild extends Thread {

    int nomor;

    Threadchild(int nomor) {
        this.nomor = nomor;
    }
    @Override
    public void run() {
        System.out.println("Thread ke- " + nomor + " sedang berjalan");
    }
}

public class delapan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah thread: ");
        int jumlah = input.nextInt();

        Threadchild[] thread = new Threadchild[jumlah];
        for (int i = 0; i < jumlah; i++) {
            thread[i] = new Threadchild(i + 1);
        }
        for (int i = 0; i < jumlah; i++) {
            thread[i].start();
        }
    }
}
