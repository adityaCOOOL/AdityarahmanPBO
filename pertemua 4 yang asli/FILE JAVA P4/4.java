package tgsPrak;

import java.util.Scanner;

public class thunKabisat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan tahunnya: ");
        int thn = sc.nextInt();
        
        boolean kabisat = false;
        
        if (thn % 400 == 0) {
            kabisat = true;
        } else if (thn % 100 == 0) {
            kabisat = false;
        } else if (thn % 4 == 0) {
            kabisat = true;
        }
        
        System.out.println("Tahun " + thn);
        
        if (kabisat) {
            System.out.println("kabisat.");
        } else {
            System.out.println("Bukan tahun kabisat.");
        }
    }
}