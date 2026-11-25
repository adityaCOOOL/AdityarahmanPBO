package P7;
class Civitas {
    String nama;
    String status;

    Civitas(String nama, String status) {
        this.nama = nama;
        this.status = status;
    }
    void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Status: " + status);
        System.out.println();
    }
}
class Dosen extends Civitas {
    Dosen(String nama) {
        super(nama, "Dosen");
    }
}
class Mahasiswa extends Civitas {
    Mahasiswa(String nama) {
        super(nama, "Mahasiswa");
    }
}
class Staff extends Civitas {
    Staff(String nama) {
        super(nama, "Staff");
    }
}
public class SOAL6 {
    public static void main(String[] args) {

        Dosen d = new Dosen("Denis");
        Mahasiswa m = new Mahasiswa("Sopo");
        Staff s = new Staff("Jarwo");

        d.tampilkanData();
        m.tampilkanData();
        s.tampilkanData();
    }
}