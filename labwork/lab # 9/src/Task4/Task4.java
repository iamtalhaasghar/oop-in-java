
package Task4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader("files/Task4_R.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("files/Task4_W.txt",true));
            )
        {
            int s=0 ;
            do{
                writer.write(s);
                System.out.print((char)s);
                s = reader.read();
            }while(s != -1);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
    
}
