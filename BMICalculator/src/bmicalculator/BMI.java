/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalculator;

/**
 * Calculates BMI by given data, provides necessary methods & fields
 * @author Saif Ullah
 */
public final class BMI {
    
    // instance variables used
    private String name;
    private int age;
    private double weight, height;
    
    // constructor
    public BMI (String name, int age, double weight, double height) {
        setName(name);
        setAge(age);
        setWeight(weight);
        setHeight(height);
        
    } // end of constructor BMI
    
    // constructor
    public BMI (String name, double weight, double height) {
        this(name, 0, weight, height);
        
    } // end of BMI constructor
    
    // copy constructor
    public BMI (BMI user) {
        this(user.getName(), user.getAge(), user.getWeight(), user.getHeight());
        
    } // end of copy constructor
    
    /**
     * setters for private fields
     */
    
    public void setName(String name) {
        this.name = name;
        
    } // end of setName method
    
    public void setAge(int age) {
        this.age = age;
        
    } // end of setAge method
    
    public void setWeight(double weight) {
        this.weight = weight;
        
    } // end of setWeight
    
    public void setHeight(double height) {
        this.height = height;
        
    } // end of setHeight
    
    /**
     * getters to retrieve data from private fields
     */
    
    public double getHeight() {
        return this.height;
        
    } // end of getHeight
    
    public double getWeight() {
        return this.weight;
        
    } // end of getWeight method
    
    public int getAge() {
        return this.age;
        
    } // end of getAge method
    
    public String getName() {
        return this.name;
        
    } // end of getName method
    
    public double getBMI() {
        return (this.weight * 0.45359237) / Math.pow(this.height * 0.0254, 2.0);
        
    } // end of getBMI method
    
    // to retrieve feedback on BMI
    public String getStatus() {
        // according to the given standards
        if (this.getBMI() < 18.5)
            return "Underweight";
        
        else if (this.getBMI() < 25)
            return "Normal";
        
        else if (this.getBMI() < 30)
            return "Overweight";
        
        else
            return "Obese";
        
    } // end of getStatus
    
} // end of class BMI
