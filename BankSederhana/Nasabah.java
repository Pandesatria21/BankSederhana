public class Nasabah extends Person {
    private Rekening rekening;

    public Nasabah(String nama, String alamat, String nomorTelepon, Rekening rekening) {
        super(nama, alamat, nomorTelepon);  // Pewarisan dari Person
        this.rekening = rekening;
    }

    public void setor(double jumlah) {
        rekening.setor(jumlah);
    }

    public void tarik(double jumlah) {
        rekening.tarik(jumlah);
    }

    public void tampilkanSaldo() {
        System.out.println("Saldo " + getNama() + ": " + rekening.getSaldo());
    }
}
