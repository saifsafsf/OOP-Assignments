package livingthing;

public class Main {

    public static void main(String[] args) {
        // Create Human object instance
        // and assign it to Human type.
        Human human1 = new Human("Will Rodman");
        human1.walk();

        // Create Human object instance
        // and assign it to LivingThing type.
        LivingThing livingthing1 = human1;
        livingthing1.walk();

        // Create a Monkey object instance
        // and assign it to LivingThing type.
        LivingThing livingthing2 = new Monkey("Caesar");
        livingthing2.walk();

        // Display data from human1 and livingthing1.
        // Observe that they refer to the same object instance.
        System.out.println("human1.getName() = " + human1.getName());
        System.out.println("livingthing1.getName() = " + livingthing1.getName());

        // Check of object instance that is referred by x and
        // y is the same object instance.
        boolean b1 = (human1 == livingthing1);
        System.out.println("Do human1 and livingthing1 point to the same object instance? " + b1);
    }
}
