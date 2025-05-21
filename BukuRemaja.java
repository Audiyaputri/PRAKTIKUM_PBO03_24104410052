package TokoBuku;
/**
 *
 * @author audiya
 */
public class BukuRemaja extends Buku{
    public BukuRemaja(String judul, String pengarang, String penerbit, int tahunCetak) {
    super(judul, pengarang, penerbit, tahunCetak, "r");
    }

    public String rekomendasi() {
        return "Disarankan untuk pembaca usia remaja 13 s/d 17 tahun!";
    }

    @Override
    public void tampilkanKategori() {
        super.tampilkanKategori();
        System.out.println(rekomendasi());
    }
}