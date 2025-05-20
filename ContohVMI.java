package Inheritance;
/**
 *
 * @author audiya
 */
public class ContohVMI {
    
    public static void main(String[] args) {
        HitungLuas hitungLuas = new  PersegiPanjang();
        System.out.println("Panjang = " + hitungLuas.panjang);
        System.out.println("Lebar = " + hitungLuas.lebar);
        hitungLuas.luas();
    }
}
