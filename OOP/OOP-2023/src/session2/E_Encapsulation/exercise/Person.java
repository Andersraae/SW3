package session2.E_Encapsulation.exercise;

import session2.E_Encapsulation.People.PrivatePerson;

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

    public static void main(String[] args) {

        PrivatePerson Lars = new PrivatePerson("Lars", "Loekke", "Rasmussen", 69);

        System.out.println(Lars.getFirstName() + " " + Lars.getMiddleName() + " " + Lars.getLastName() + " " + Lars.getAge());

        Lars.setAge(34);

        System.out.println(Lars.getFirstName() + " " + Lars.getMiddleName() + " " + Lars.getLastName() + " " + Lars.getAge());

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/

        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session2_D_Constructors", I_did_finish, I_did_understand, comment);

    }
}
