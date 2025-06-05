package encapsulation;

// Encapsulation in OOP
/*
 * - encapsulation is the binding of properties/attributes and the behaviours/methods such that the 
 *   methods/behaviours are used for manipulating the data. 
 * - encapsulation provides security for the properties/attributes that is present inside the class or object.
 * - encapsulation validates the data before assigning it to the properties/attributes through the methods present.
 */

class Person {
    String firstName;
    String lastName;
    private int age;

    public void setAge(int age) {
        if (age < 18){
            System.out.println("age is less than 18");
        } else {
            this.age = age;
        }
    }

    public int getAge () {
        return this.age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();

        person.firstName = "Simu";
        person.lastName = "Sohil";

        System.out.println(person.firstName + " " + person.lastName);

        // We can't directly assign the value to the variable i.e. property/attribute since it is declared 'private' here.
        // If the property/attribute is declared 'private' in Java, We cannot access it from another class rather we can access only within the class.
        // person.age = 12; 

        /*
         * Here, we are not directly assigning the value to the property/attribute 'age', rather we are using an 
         * indirect approach.
         * 
         */
        person.setAge(12);
    }
}
