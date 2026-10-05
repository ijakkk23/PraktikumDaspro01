import java.util.Scanner;

public class Studikasus2_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int jumlahDokumen = 0;
        int peringkatJuara = 0;
        int statusPKM = 0;

        System.out.print("Nama mahasiswa : ");
        String nama = scanner.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisKegiatan = scanner.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Peringkat juara (1/2/3, isi 0 jika bukan): ");
            peringkatJuara = scanner.nextInt();

            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                System.out.print("Jumlah dokumen: ");
                jumlahDokumen = scanner.nextInt();

                if (jumlahDokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan.");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }
       
        scanner.close();
    }
}