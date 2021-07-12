package concreteline;

/**
 * declares methods to be defined in an inherited class for a line
 * @author Saif Ullah
 */
abstract class AbstractLine {
    
    public abstract double getLength();
    
    public abstract boolean isGreater(Object a, Object b);
    
    public abstract boolean isLess(Object a, Object b);
    
    public abstract boolean isEqual(Object a, Object b);
    
}
