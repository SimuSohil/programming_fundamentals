package classes_and_objects;

/*
 * Object Oriented Programming (OOP) Basics
 * 
 * object: -> instance of a class (This def is to summarize)
 * - objects represent any real-world entities. eg: a person, a car, a cat, anything...
 * - objects also represents the abstract real-world entities. eg: bank account, a ticket for a movie,.... 
 * - why do we create objects? 
 *   objects are created to represent the real-world entities so that we can process & store the data associated with them.
 * 
 * class: -> a template or a blueprint to define & create objects (this def is to summarize)
 * - classes are a piece of code that is used to define an object.
 * - classes are a piece of code that enables us to create multiple objects.
 * - (A class is also a 'type'. Like int, String but not exactly like them.)
 * 
 * a class contains the properties for an object -> Attributes
 * a class also contains the behaviours associated with an object -> Methods
 */

class Cat {
    // Attributes or Properties that defines the object. Here, properties that a Cat might have.
    String name;
    String breed;
    String diet;

    // Behaviours or methods that defines the object. Here, behaviours that a Cat might have.
    public void sayHello() {
        System.out.println("Meow!");
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Cat c1 = new Cat(); // creating an object for the Cat class.

        // Assigning the values for the attributes of the 'c1' object of type 'Cat'.
        // Also we can notice that we are assigning the values for the properties just like assigning values to variables.
        c1.name = "fluffy"; 
        c1.breed = "moggy";
        c1.diet = "fish";

        // behaviour or method of the 'c1' object is called. NOTE: The method is defined only once in the 'Cat' class.
        c1.sayHello();

        System.out.println(c1.name + " " + c1.breed + " " + c1.diet);
    }
}