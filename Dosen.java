public class Dosen {
    private String nip;
    private String nama;
    private String bidang;

    public Dosen(String nip, String nama, String bidang) {
        this.nip = nip;
        this.nama = nama;
        this.bidang = bidang;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public void displayInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Bidang: " + bidang);
    }
}
