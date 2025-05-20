package Inheritance;
/**
 *
 * @author audiya
 */
public class Mamalia {    
    protected String nama;    
    public void  makan(String input){
        System.out.println(nama + "Makan: " + input);
    }
    public void speak(){
        System.out.println("Mamalia bersuara...");
    }
    
}
