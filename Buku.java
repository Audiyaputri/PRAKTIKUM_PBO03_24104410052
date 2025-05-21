package TokoBuku;
/**
 *
 * @author audiya
 */
public class Buku {
    
    protected String judul;
    protected String namaPengarang;
    protected String penerbit;
    protected int tahunCetak;
    protected String kategori;

    public Buku(String judul, String pengarang, String penerbit, int tahunCetak, String kategori) {
        this.judul = judul;
        this.namaPengarang = pengarang;
        this.penerbit = penerbit;
        this.tahunCetak = tahunCetak;
        this.kategori = kategori;
    }

    public void tampilkanKategori() {
        System.out.println("Judul       : " + judul);
        System.out.println("Pengarang   : " + namaPengarang);
        System.out.println("Penerbit    : " + penerbit);
        System.out.println("Tahun Cetak : " + tahunCetak);
        System.out.println("Kategori    : " + kategoriToString());
    }

    protected String kategoriToString() {
        return switch (kategori) {
            case "a" -> "Anak";
            case "r" -> "Remaja";
            case "d" -> "Dewasa";
            case "su" -> "Semua Umur";
            default -> "Tidak diketahui";
        };
    }
}