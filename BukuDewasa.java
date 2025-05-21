package TokoBuku;
/**
 *
 * @author audiya
 */
public class BukuDewasa extends Buku{
        public BukuDewasa(String judul, String pengarang, String penerbit, int tahunCetak) {
        super(judul, pengarang, penerbit, tahunCetak, "d");
    }
    public String rekomendasi() {
        return "Disarankan untuk pembaca 18 tahun keatas!";
    }

        @Override
    public void tampilkanKategori() {
        super.tampilkanKategori();
        System.out.println(rekomendasi());
    }
}