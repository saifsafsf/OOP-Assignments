/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integerset;

/**
 * Creates Integer Sets & provides appropriate methods
 * @author Saif Ullah
 */
public class IntegerSet {
    
    // variables used
    private boolean[] set;
    
    /**
     * a no-arg constructor to initialize an empty set
     */
    public IntegerSet() {
        set = new boolean[101];
        
    } // end of no-arg constructor
    
    /**
     * a public setter to assign a made-up set
     */
    public void setSet(boolean[] set) {
        this.set = set;
        
    } // end of setSet method
    
    /**
     * to retrieve the set out of an object
     */
    public boolean[] getSet() {
        return this.set;
        
    } // end of getSet method
    
    /**
     * to enter an element into a set
     */
    public void insertElement(int k) {
        // true represents element's presence
        this.set[k] = true;
        
    } // end of insertElement method
    
    /**
     * to delete an element from the set
     */
    public void deleteElement(int j) {
        // fasle represents element's absence
        this.set[j] = false;
        
    } // end of deleteElement method
    
    /**
     * Takes two boolean arrays as sets, creates union, returns Union Set
     */
    public static boolean[] union(boolean[] set1, boolean[] set2) {
        // resultant set
        boolean[] unionSet = new boolean[101];
        
        // iterating through elements of sets
        for(int i = 0; i < 101; i++) {
            
            // initializing value when found
            if (set1[i] || set2[i])
                unionSet[i] = true;
        
        } // end of if body
        
        // returning Union of passed param sets
        return unionSet;
        
    } // end of union method
    
    /**
     * Takes two boolean arrays as sets, creates intersection, returns Intersection Set
     */
    public static boolean[] intersection(boolean[] set1, boolean[] set2) {
        // resultant set
        boolean[] intersectionSet = new boolean[101];
        
        // iterating through elements of sets
        for(int i = 0; i < 101; i++) {
            
            // initializing value when found
            if (set1[i] && set2[i])
                intersectionSet[i] = true;
        
        } // end of for body
        
        // returning Union of passed param sets
        return intersectionSet;
        
    } // end of intersection method
    
    /**
     * compares two boolean arrays as sets, returns true/false if equal or not
     */
    public boolean isEqualTo(boolean[] set) {
        
        // iterating through elements of sets
        for(int i = 0; i < 101; i++) {
            
            // if difference is found
            if (this.set[i] != set[i])
                return false;
            
        } // end of for body
        
        // if no difference found
        return true;
        
    } // end of isEqualTo
    
} // end of class IntegerSet
