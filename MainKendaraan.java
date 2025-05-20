package Inheritance;
/**
 *
 * @author audiya
 */
public class MainKendaraan extends Kendaraan{    
    @Override
    public void jalankan(){
        System.out.println("Matic");        
    }    
    
    //Method getMesin dan setMesin yang ditambahkan 
    @Override
    public String getMesin() {
        return super.getMesin();
    }
    @Override
    public void setMesin(String mesin) {
        super.setMesin(mesin);
    }                  
    public static void main(String[] args) {
        MainKendaraan mainKendaraan = new MainKendaraan();
        mainKendaraan.jalankan();
        
        // Menggunakan method setMesin dan getMesin
        mainKendaraan.setMesin("1500cc");
        System.out.println("Mesin: " + mainKendaraan.getMesin());
    }    
}
