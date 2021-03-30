package Task2;


import java.io.FileInputStream;

public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try{
        
            FileInputStream fin = new FileInputStream("files/Task2.txt");
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
