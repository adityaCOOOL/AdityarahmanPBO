//Class (kelas) adalah rancangan atau cetakan yang digunakan untuk membuat objek.
//Di dalam class terdapat atribut dan method.

//Object (objek) adalah hasil dari pembuatan sebuah class yang dapat digunakan 
//dalam program.

//Mekanisme pembuatan objek disebut instansiasi. Dalam Java, proses ini menggunakan 
//kata kunci new untuk membuat objek berdasarkan class yang telah dibuat.
class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void tampilkanBuku() {
        System.out.println("Judul Buku: " + judul);
        System.out.println("Penulis: " + penulis);
    }
}

public class SOAL1 {
    public static void main(String[] args) {

        Buku buku1 = new Buku("KEHUTANAN","DEAS");

        buku1.tampilkanBuku();
    }
}
