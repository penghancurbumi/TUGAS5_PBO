import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //mahasiswa
        System.out.println("=== INPUT DATA MAHASISWA ===");
        System.out.print("NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Nama: ");
        String namaMhs = scanner.nextLine();
        System.out.print("Jurusan: ");
        String jurusan = scanner.nextLine();
        Mahasiswa mhs = new Mahasiswa(nim, namaMhs, jurusan);

        //dosen
        System.out.println("\n=== INPUT DATA DOSEN ===");
        System.out.print("NIP: ");
        String nip = scanner.nextLine();
        System.out.print("Nama: ");
        String namaDosen = scanner.nextLine();
        System.out.print("Bidang: ");
        String bidang = scanner.nextLine();
        Dosen dosen = new Dosen(nip, namaDosen, bidang);
        
        //matakuliah
        System.out.println("\n=== INPUT DATA MATA KULIAH ===");
        System.out.print("Kode MK: ");
        String kode = scanner.nextLine();
        System.out.print("Nama MK: ");
        String namaMk = scanner.nextLine();
        System.out.print("SKS: ");
        int sks = scanner.nextInt();
        MataKuliah mk = new MataKuliah(kode, namaMk, sks);
        
        // Menampilkan semua data
        System.out.println("\n=== DATA MAHASISWA ===");
        mhs.displayInfo();
        
        System.out.println("\n=== DATA DOSEN ===");
        dosen.displayInfo();
        
        System.out.println("\n=== DATA MATA KULIAH ===");
        mk.displayInfo();
        
        scanner.close();
    }
}
