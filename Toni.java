package Inheritance;
/**
 *
 * @author audiya
 */
public class Toni extends Kakek implements AyahInterface, IbuInterface{
    
    @Override
    public void cetak(){
        AyahInterface.super.cetak();
        IbuInterface.super.cetak();
        super.cetak();
    }        
    public static void main(String[] args) {
        Toni toni = new Toni();
        toni.cetak();        
    }    
}
