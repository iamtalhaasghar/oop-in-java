

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ***REMOVED***
 */

    // abstract class TestQuestion

public abstract class TestQuestion {
    
    protected String testQ;

    abstract protected void readQuestion();

    
    public String getTestQ() {
        return testQ;
    }

    public void setTestQ(String testQ) {
        this.testQ = testQ;
    }
    
    
}
