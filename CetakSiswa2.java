public class CetakSiswa2{

    public static void main(String[] args){
        Siswa data= new Siswa();
        data.infoSiswa();

        data.no_absen = 1;
        System.out.println("No. Absen\t\t: "+data.no_absen);

        data.setNis("160001");
        System.out.println("Nis\t\t: "+data.nis);

        data.setNama("Zidna Aisya Karima");
        System.out.println("Nama\t\t: "+data.nama_siswa);

        data.setTtl("Pekalongan", "14-06-1997");
        System.out.println("Tempat tanggal lahir\t\t: "+data.tmp_lahir +", "+data.tgl_lahir);

        data.setNilai(75.5, 80.75);
            System.out.println("Nilai Ipa\t\t: "+data.nilai_ipa);
            System.out.println("Nilai Ips\t\t: "+data.nilai_ips);

    }
}