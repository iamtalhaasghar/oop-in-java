
// In Lab Manual # 8 : The class is originally named as "public class ABC"

package Task3;

/**
 *
 * @author ***REMOVED***
 */
public class TestTask3 {

    public static void main(String[] args) {
        
        try{
            
            A();
            B();
        }
        catch(Exception e){
        
                System.out.println("In Main .......");
                System.out.println(e);
                
        }  
    }               // end of "main"
    
    public static void A(){
        
        try{
        
            B();
        
        }
        catch(Exception e){
            
                System.out.println("In A......");
                System.out.println(e);
        
        }
    }           // end of "A"
    
    public static void B() throws Exception{
    
        C();
        
    }       // end of "B"
    
    public static void C() throws Exception{
    
        throw new Exception(" C is throwing a new Exception explicitily.");
    
    }       // end of "C"
    
}
