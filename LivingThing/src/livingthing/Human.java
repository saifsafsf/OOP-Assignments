package livingthing;

/**
 * implements methods of abstract LivingThing for human
 * @author Saif Ullah
 */
public class Human extends LivingThing {

    // parameterized constrcutor
    public Human(String name) {
        
        // calling superclass constructor
        super(name);
    }

    @Override
    // walking action of Human
    public void walk() {
        
        System.out.printf("Human %s is walking...\n", this.getName());
    }
    
} // end of Human class
