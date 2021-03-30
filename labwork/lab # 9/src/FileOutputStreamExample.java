
// Example 1 : Write Byte

import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamExample {
    public static void main(String []args){
    
        try{
        
            FileOutputStream fout = new FileOutputStream("files/FileOutputStreamTest.txt");
            
            fout.write(65);
            fout.close();
            System.out.println("Success");
            
        }
        catch(IOException e){
        
            System.out.println(e);
        }
    
    }
    
    
}
