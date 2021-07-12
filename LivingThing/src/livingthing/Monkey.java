package livingthing;

/**
 * implements methods of abstract LivingThing for Monkey
 * @author Saif Ullah
 */
public class Monkey extends LivingThing{

    // parameterized constructor
    public Monkey(String name) {
        
        // calling superclass constructor
        super(name);
    }

    @Override
    // walking action of Monkey
    public void walk() {
        
        System.out.printf("Monkey %s is walking...\n", this.getName());
    }
    
} // end of Monkey class
