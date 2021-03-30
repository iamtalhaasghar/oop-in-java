/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task4;

/**
 *
 * @author ***REMOVED***
 */
public class Tape extends Publication{
    
    private float playTime;
    
    Tape(){}
    
    Tape(String t, double p, float minutes){
    
            super(t,p);
            playTime = minutes;    
    }
    
    public float getPlayTime(){
        
        return playTime;
    }
    
    public void setPlayTime(float time){
    
        playTime = time;
    }
    
    @Override
       public void getData(){
   
       System.out.print("Enter Tape Title : ");
       setTitle(input.nextLine());
       
       System.out.print("Enter Tape Price : ");
       setPrice(input.nextDouble());
       
       System.out.print("Enter Play Time :");
       setPlayTime(input.nextFloat());
   
   }
    
    @Override
       public void putData(){
   
       System.out.println("************Summary of Tapes************");
       System.out.printf("%-10s : %-20s %n" ,"Tape Title" , getTitle());
       System.out.printf("%-10s : %-4.2f$ %n","Tape Price", getPrice());
       System.out.printf("%-10s : %.2f min  %n","Tape Play Time", getPlayTime());   
   }
    
}
