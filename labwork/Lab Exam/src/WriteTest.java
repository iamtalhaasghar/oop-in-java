
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ***REMOVED***
 */
public class WriteTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int totalQuestion = 0;
        ArrayList<TestQuestion> fileQuestions = new ArrayList<>();
        
        try(FileInputStream fin = new FileInputStream("Questions.txt");
                Scanner fileReader = new Scanner(fin)
                ) 
        {
            
            if(fileReader.hasNext()){
            
                totalQuestion = Integer.parseInt(fileReader.nextLine());
                //System.out.println("Total" + totalQuestion);
                for(int i=0; i<totalQuestion; i++){
                
                    String s = fileReader.nextLine();
                    //System.out.println("Type : "+s);
                    if(s.equals("e")){

                        int n = Integer.parseInt(fileReader.nextLine());
                       // System.out.println("n : "+n);
                        Essay essay = new Essay(n);
                        essay.setTestQ(fileReader.nextLine());
                        fileQuestions.add(essay);

                    }
                    else if(s.equals("m")){
                                                
                        int n = Integer.parseInt(fileReader.nextLine());
                        //System.out.println("n : "+n);
                        MCQs mcq = new MCQs(n);
                        mcq.setTestQ(fileReader.nextLine());
                        
                        String choices = "";
                        for(int j=0; j<n ; j++){
                        
                            if(j==n-1)
                            {
                                choices += fileReader.nextLine();
                               // System.out.println(choices);
                            }
                            else{
                            
                                choices += fileReader.nextLine().concat("=");
                               // System.out.println(choices);
                            }
                          
                        }
                       /* String c[] =choices.split("=");
                        for(String t : c){
                            System.out.println(t);
                        }
                        System.out.println("choices split : "+c.length);
                           */
                        mcq.setMcq(choices.split("="));
                        fileQuestions.add(mcq);
 

                    }else
                        System.out.println("Invalid Type of Question!");
            
                }
              
            } 
                   
        } catch (IOException ex) {
            System.out.println("IO Exception : " + ex);
        }
        
        
        TestQuestion testQuestions[] = new TestQuestion[totalQuestion];
        testQuestions = fileQuestions.toArray(testQuestions);
        
        Scanner input = new Scanner(System.in);
        
        for(int k=0; k<totalQuestion; k++){
        
            System.out.print((k+1)+")");
            testQuestions[k].readQuestion();
            if(testQuestions[k] instanceof Essay){
                Essay temp = (Essay)testQuestions[k];
                String ans[] = new String[temp.getNoOfLines()];
                for(int i=0; i<temp.getNoOfLines(); i++){
                    ans[0] = input.nextLine();
                }
                temp.setAnswer(ans);
            }
            else{
            
                MCQs temp = (MCQs) testQuestions[k];
                String ans = input.nextLine();
                temp.setRightOption(ans);
                
            
            }
        }
   
        System.exit(0);
        
    }
    
}
