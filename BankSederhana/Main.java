import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Identitas
        System.out.println("BANK SEDERHANA");
        System.out.println("Nama : Pande Made Satria Praja Dinatha");
        System.out.println("NIM  : 2215101045");

        // Membuat bank baru
        Bank bank = new Bank("Bank Indonesia");

        Scanner input = new Scanner(System.in);

        // Input data nasabah
        System.out.println("Masukkan jumlah nasabah: ");
        int jumlahNasabah = input.nextInt();
        input.nextLine();  // Konsumsi newline

        for (int i = 0; i < jumlahNasabah; i++) {
            System.out.println("\nMasukkan data nasabah ke-" + (i + 1) + ":");

            System.out.print("Nama: ");
            String nama = input.nextLine();

            System.out.print("Alamat: ");
            String alamat = input.nextLine();

            System.out.print("Nomor Telepon: ");
            String nomorTelepon = input.nextLine();

            System.out.print("Nomor Rekening: ");
            String nomorRekening = input.nextLine();

            System.out.print("Saldo Awal: ");
            double saldoAwal = input.nextDouble();
            input.nextLine();  // Konsumsi newline

            // Membuat rekening baru
            Rekening rekening = new Rekening(nomorRekening, saldoAwal);

            // Membuat nasabah baru
            Nasabah nasabah = new Nasabah(nama, alamat, nomorTelepon, rekening);

            // Tambahkan nasabah ke dalam daftar nasabah bank
            bank.tambahNasabah(nasabah);
        }

        // Tampilkan semua nasabah
        bank.tampilkanNasabah();

        // Interaksi dengan salah satu nasabah
        System.out.println("\nPilih nasabah ke berapa untuk melakukan transaksi (1-" + jumlahNasabah + "): ");
        int pilihan = input.nextInt();
        input.nextLine();  // Konsumsi newline

        // Akses nasabah terpilih
        Nasabah nasabahTerpilih = bank.daftarNasabah.get(pilihan - 1);

        System.out.println("\nMasukkan jumlah yang ingin disetor: ");
        double jumlahSetor = input.nextDouble();
        nasabahTerpilih.setor(jumlahSetor);

        System.out.println("\nMasukkan jumlah yang ingin ditarik: ");
        double jumlahTarik = input.nextDouble();
        nasabahTerpilih.tarik(jumlahTarik);

        // Tampilkan saldo akhir
        nasabahTerpilih.tampilkanSaldo();

        input.close();
    }
}
