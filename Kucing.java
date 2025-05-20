package Inheritance;
/**
 *
 * @author audiya
 */
public class Kucing extends Mamalia{    
    @Override
    public void speak(){
        super.speak();
        System.out.println("Kucing suaranya meow");        
    }    
}
