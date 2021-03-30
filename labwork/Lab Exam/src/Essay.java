
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ***REMOVED***
 */
public class Essay extends TestQuestion{

    private String[] answer;
    private final int NO_OF_LINES;

    public Essay(int NO_OF_LINES) {
        
        this.NO_OF_LINES = NO_OF_LINES;
    }
    
    public int getNoOfLines(){
    
        return NO_OF_LINES;
    }

    public String toString(){
    
        return String.format("%s%nAnswer : ",this.getTestQ());
        
    }
    public void setAnswer(String[] answer){
    
        this.answer = answer;
    }
    
    @Override
    protected void readQuestion() {
        
        System.out.print(this.toString());
        
        
    }
    
}
