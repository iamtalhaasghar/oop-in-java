/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ***REMOVED***
 */
public class MCQs extends TestQuestion{

    private final String [] mcq;
    private final int NO_OF_CHOICES;
    private String rightOption;

    public MCQs( int noOfChoices) {
        
        this.NO_OF_CHOICES = noOfChoices;
        mcq = new String[this.NO_OF_CHOICES+1];
        //System.out.println("mcq.length : "+mcq.length);
    }

    public String[] getMcq() {
        return mcq;
    }

    public void setMcq(String[] mcq) {
        
        //System.out.println(mcq.length);
        this.mcq[0] = this.getTestQ();
        for(int i=1 ; i<NO_OF_CHOICES; i++){
            
                this.mcq[i] = mcq[i];
        
        }
    }

    @Override
    public String toString(){
    
        String s = "";
        String temp[]= this.getMcq();
        for(int i=0; i<NO_OF_CHOICES; i++){
        
            s += temp[i].concat("   ("+Integer.toString(i+1)+")   ");
        }
        return s;
    }
    
    
    
    @Override
    protected void readQuestion() {
        
        System.out.println(this.toString());
    }

    public String getRightOption() {
        return rightOption;
    }

    public void setRightOption(String rightOption) {
        this.rightOption = rightOption;
    }
    
    
    
}
