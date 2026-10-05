import java.util.Scanner;

public class StudiKasus2_21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMhs, jenisKegiatan;
        int jumlahDoc;

        System.out.print("Nama mahasiswa : ");
        namaMhs = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah dokumen : ");
        jumlahDoc = sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Peringkat juara : ");
            int peringkat = sc.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDoc == 4) {
                    System.out.println("Status : Dokumen lengkap. Selamat! Memperoleh dana penghargaan.");
                } else {
                    int kurang = 4 - jumlahDoc;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Dana penghargaan tidak diberikan (hanya untuk juara 1, 2, atau 3).");
            }
        }
    }
}