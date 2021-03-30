/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task5;

import java.util.Scanner;

public class CountEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Minimun Range : ");
        int minimum = input.nextInt();
        
        System.out.print("Enter Maximum Range : ");
        int maximum = input.nextInt();
        
        try{
        
                int result = countEven(minimum, maximum);
                System.out.printf("Even Numbers between %d and %d are : %d %n%n", minimum, maximum, result);
        }catch(InvalidRangeException e){
        
                System.out.println(e);
                e.printStackTrace();
            
        }
        
        
        
    }
    
    public static int countEven(int min, int max) throws InvalidRangeException{
    
        int count = 0;
        
        if(min>= max){
        
            throw new InvalidRangeException(min, max);
        
        }
        
        for(int i = min; i<=max; i++){
        
            if(i%2==0){
                
                count++;
            }
        
        }
        
        return count;
    }
    
    
}       // end of class "CountEven"
