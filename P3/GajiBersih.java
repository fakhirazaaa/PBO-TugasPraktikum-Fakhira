package P3;

public class GajiBersih {
    public static void main(String[] args) {
        String npm = "20245678"; // Ubah dengan NPM kamu
        String nama = "Fakhira";  // Ubah dengan Nama kamu
        String alamat = "Cianjur"; // Ubah dengan Alamat kamu
        String jabatan = "Manajer";

        double p1 = 2000000; // Gaji Pokok
        double p2 = 300000;  // Tunjangan Jabatan
        double p3 = 200000;  // Tunjangan Istri
        double p4 = 150000;  // Tunjangan Anak

        double totalGaji = p1 + p2 + p3 + p4;
        double pajak = 0.10 * (p1 + p2 + p4);
        double gajiBersih = totalGaji - pajak;

        System.out.println("=== LAPORAN GAJI PEGAWAI ===");
        System.out.println("Nomor Induk Karyawan : " + npm);
        System.out.println("Nama Karyawan        : " + nama);
        System.out.println("Alamat               : " + alamat);
        System.out.println("Jabatan              : " + jabatan);
        System.out.println("Gaji Pokok           : Rp " + p1);
        System.out.println("Tunjangan Jabatan    : Rp " + p2);
        System.out.println("Tunjangan Istri      : Rp " + p3);
        System.out.println("Tunjangan Anak       : Rp " + p4);
        System.out.println("Total Gaji           : Rp " + totalGaji);
        System.out.println("Pajak Penghasilan    : Rp " + pajak);
        System.out.println("Gaji Bersih          : Rp " + gajiBersih);
    }
}