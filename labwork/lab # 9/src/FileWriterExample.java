
import java.io.FileWriter;
import java.io.IOException;


// Example 5

public class FileWriterExample {

    public static void main(String[] args) {
        
        FileWriter fw = null;
        try {
            
            fw = new FileWriter("files/FileWriterTest.txt");
            String s = "I love my Country Pakistan.";
            fw.write(s);
            fw.close();
            System.out.println("Success!");
        } catch (IOException ex) {
            System.out.println(ex);
        } 
        
    }
    
}
