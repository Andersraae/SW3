package session2.E_Encapsulation.exercise;

import feedback.Feedback;

/**
 * Exercise:
 *  * Now a Person can have a first name, a last name and, optionally, a middle name. And also an age.
 *  * Create constructors for this class.
 *  * Create the getter and setters that you think are needed here.
 *  * Write code in the main method that illustrates the use of the getters and setters.
 **/

/**
 * Example solution
 */
class Person {

    private String firstName, middleName, lastName;
    private int age;
    public Person(String firstName, String middleName, String lastName, int age){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args) {

        Person Lars = new Person("Lars", "Loekke", "Rasmussen", 69);

        System.out.println(Lars.getFirstName() + " " + Lars.getMiddleName());

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/

        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session2_D_Constructors", I_did_finish, I_did_understand, comment);
        */

    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getMiddleName(){
        return this.middleName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
