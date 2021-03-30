
// Example 2 : Read a character from file

import java.io.FileInputStream;

public class FileInputStreamExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try{
        
            FileInputStream fin = new FileInputStream("files/FileInputStreamTest.txt");
            int i;
            do{
                i = fin.read();
                System.out.print((char)i);
                
            }while(i!=-1);
            fin.close();
        }
        catch(Exception e){
        
            System.out.println(e);
        }
        
    }
    
}
