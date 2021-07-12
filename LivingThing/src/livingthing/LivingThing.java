package livingthing;

/**
 * defines few methods for Living Things
 * @author Saif Ullah
 */
public abstract class LivingThing {

    private String name;
    
    // parameterized constructor
    public LivingThing(String name) {
        
        // variable initialized
        this.name = name;
    }

    // to retrieve name of LivingThing
    public String getName() {
        
        return name;
    }

    // to set the name of LivingThing
    public void setName(String name) {
        
        this.name = name;
    }

    @Override
    // string representation of the class LivingThing
    public String toString() {
        
        return "Name: " + name + '\n';
    }
    
    // defining breathing action of LivingThing
    public void breathe() {
        
        System.out.printf("Living thing %s is now breathing...\n", name);
    }
    
    // defining eating action of LivingThing
    public void eat() {
        
        System.out.printf("Living thing %s is now eating...\n", name);
    }
    
    // walking action to be defined by subclasses
    public abstract void walk();
    
} // end of class LivingThing
