package session2.D_Constructors.exercise;

import feedback.Feedback;

/**
 * Exercise:
 *  * Now a Person can have a first name, a last name and, optionally, a middle name.
 *  a) Create two constructors for this class.
 *      * A constructor to create Person objects with middle name.
 *      * A constructor to create Person objects without middle name.
 *  b) Add a method that return true/false to indicate if the person has or does not have a middle name.
 *  c) Add a method that outputs the person's information as a string formatted as:
 *      * E.g. ”Anders, Madsen” if there is no middle name.
 *      * E.g. ”Anders, M., Madsen” if there is a middle name.
 **/
class Person {

    String firstName, middleName, lastName;

    public Person(String firstName, String middleName, String lastName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String[] args) {

        Person Anders = new Person("Anders", "Mueller", "Madsen");
        Person Lars = new Person("Lars", "Rasmussen");

        System.out.println("Anders " + Anders.hasMiddleName());
        System.out.println("Lars " + Lars.hasMiddleName());

        System.out.println(Anders.toString());
        System.out.println(Lars.toString());

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/

        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session2_D_Constructors", I_did_finish, I_did_understand, comment);

    }

    public boolean hasMiddleName(){
        if (this.middleName == null){
            return false;
        } else {
            return true;
        }
    }

    public String toString(){
        if (this.hasMiddleName()){
            return this.firstName + ", " + this.middleName.substring(0, 1) + "., " + this.lastName;
        } else {
            return this.firstName + ", " + this.lastName;
        }
    }
}
