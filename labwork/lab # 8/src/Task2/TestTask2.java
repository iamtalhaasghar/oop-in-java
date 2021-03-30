
// In Lab Manual # 8 : The class is originally named as "public class Lab7"

package Task2;

public class TestTask2 {

    
    public static void main(String[] args) {
    
        int a[] = new int[2];
        try{
        
            System.out.println("Access element three : " + a[3]);
        
        }
        catch(ArrayIndexOutOfBoundsException e){
        
                System.out.println("Exception Thrown : " + e);     
        }
        finally{
            
                a[0] = 6;
                System.out.println("First Element Value : " + a[0]);
                System.out.println("The finally statement is executed.");
         
        
        }
    }
}
