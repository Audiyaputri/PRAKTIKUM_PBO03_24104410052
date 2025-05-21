package TokoBuku;
/**
 *
 * @author audiya
 */
public class BukuAnakAnak extends Buku{
    
    public BukuAnakAnak(String judul, String pengarang, String penerbit, int tahunCetak) {
        super(judul, pengarang, penerbit, tahunCetak, "a");
    }

    @Override
    public void tampilkanKategori() {
        super.tampilkanKategori();
        System.out.println("Disarankan pembaca untuk pembaca anak-anak");
    }
}
