package TokoBuku;
/**
 *
 * @author audiya
 */
public class BukuSemuaUmur extends Buku{
    public BukuSemuaUmur(String judul, String pengarang, String penerbit, int tahunCetak) {
        super(judul, pengarang, penerbit, tahunCetak, "su");
    }
    public String rekomendasi() {
        return "DIsarankan untuk pembaca semua usis!";
    }

    @Override
    public void tampilkanKategori() {
        super.tampilkanKategori();
        System.out.println(rekomendasi());
    }
}