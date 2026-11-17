package prak_p6;
public class sembilan {
    public static void main(String[] args) {

        int[] age = {12, 4, 5, 2, 6};

        System.out.println("FOR:");
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
        
        System.out.println("\nFor-Each:");
        for (int nilai : age) {
            System.out.println(nilai);
        }
    }
}
