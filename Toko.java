package TokoBuku;
/**
 *
 * @author audiya
 */
public class Toko {
    public static void main(String[] args) {
        Buku[] rakBuku = new Buku[4];
        
        rakBuku[0] = new BukuAnakAnak("Lima Sekawan", "Enid Blyton", "Hodder & Stoughton", 1942);
        rakBuku[1] = new BukuRemaja("The Courage to Be Disliked", "Ichiro Kishimi & Fumitake Koga", "PT. Gramedia Pustaka Utama", 2019);
        rakBuku[2] = new BukuDewasa("Ayat-Ayat Kiri", "Karl Mrx, dll", "Vice Versa", 2019);
        rakBuku[3] = new BukuSemuaUmur("Dunia Sophie", "Jostein Gaarder", "Mirzan Pustaka", 1996);

        System.out.println("============= DAFTAR BUKU DI TOKO =============");
        for (Buku buku : rakBuku) {
            buku.tampilkanKategori();
            System.out.println("-----------------------------------------------------------------");
        }
    }
}
