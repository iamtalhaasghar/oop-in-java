
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderExample {

 
    public static void main(String[] args) {
 
        try {
            FileReader fr = new FileReader("files/FileReaderTest.txt");
            int i;
            do{
                i = fr.read();
                System.out.print((char)i);
                
            }while(i!=-1);
            fr.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        
    }
    
}
