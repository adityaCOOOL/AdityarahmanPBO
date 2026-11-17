package prak_p6;
public class tiga_Array{
    public static void main(String[] args) {

        //1
        int[] angka1 = new int[3];
        angka1[0] = 1;
        angka1[1] = 2;
        angka1[2] = 3;
        //2
        int angka2[] = new int[]{4, 5, 6};

        //3
        int[] angka3 = {7, 8, 9};

        System.out.println("Array ke-1:");
        for (int i = 0; i < angka1.length; i++) {
            System.out.println(angka1[i]);
        }
        System.out.println("\nArray ke-2:");
        for (int i = 0; i < angka2.length; i++) {
            System.out.println(angka2[i]);
        }
        System.out.println("\nArray ke-3:");
        for (int i = 0; i < angka3.length; i++) {
            System.out.println(angka3[i]);
        }
    }
}
