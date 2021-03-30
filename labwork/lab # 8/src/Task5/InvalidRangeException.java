
package Task5;


public class InvalidRangeException extends Exception {
    
    private final int minimumNum;
    private final int maximumNum;

    public InvalidRangeException(int minimumNum, int maximumNum) {
        this.minimumNum = minimumNum;
        this.maximumNum = maximumNum;
    }
    
    @Override
    public String toString(){
    
        return String.format("Invalid Range : %d is greater than or equal to %d. ",
                getMinimumNum(), getMaximumNum());
    
    }

    public int getMinimumNum() {
        return minimumNum;
    }

    public int getMaximumNum() {
        return maximumNum;
    }
    
    
    
}
