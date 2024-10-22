import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String namaBank;
    List<Nasabah> daftarNasabah;

    public Bank(String namaBank) {
        this.namaBank = namaBank;
        this.daftarNasabah = new ArrayList<>();
    }

    public void tambahNasabah(Nasabah nasabah) {
        daftarNasabah.add(nasabah);
    }

    public void tampilkanNasabah() {
        System.out.println("Daftar Nasabah di " + namaBank + ": ");
        for (Nasabah nasabah : daftarNasabah) {
            System.out.println("- " + nasabah.getNama());
        }
    }
}
