/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;

/**
 *
 * @author ***REMOVED***
 */

public class ClassA {
    
    public String publicVar;
    protected String protectedVar;
    String defaultVar;
    private final String privateVar;

    public ClassA() {
        this.publicVar = "This is public variable.";
        this.protectedVar = "This is protected variable.";
        this.defaultVar = "This is default variable.";
        this.privateVar = "This is private variable.";
    }

    public String getPublicVar() {
        return publicVar;
    }

    public String getProtectedVar() {
        return protectedVar;
    }

    public String getDefaultVar() {
        return defaultVar;
    }

    public String getPrivateVar() {
        return privateVar;
    }
    
    
}