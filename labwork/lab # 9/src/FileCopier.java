


import java.io.*;
import java.util.*;

public class FileCopier {
    public static void main(String[] args) {

         
        try(
            FileInputStream fin = new FileInputStream("files/FileCopier_R.txt");
            FileOutputStream fout = new FileOutputStream("files/FileCopier_W.txt");
            Scanner reader = new Scanner(fin);
            Formatter writer = new Formatter(fout);
            ) 
        {
            while(reader.hasNext()){
                
                writer.format("%s%n", reader.nextLine());
                
            }
        
        
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
    
}
