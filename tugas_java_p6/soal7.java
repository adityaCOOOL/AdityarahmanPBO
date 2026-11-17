package prak_p6;
class ThreadBaru extends Thread {
    @Override
    public void run() {
        System.out.println("Thread lagi jalan");
    }
}
public class tujuh {
    public static void main(String[] args) {

        ThreadBaru t1 = new ThreadBaru();

        t1.start();
    }
}
