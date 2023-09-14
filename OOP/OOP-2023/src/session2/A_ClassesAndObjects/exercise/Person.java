package session2.A_ClassesAndObjects.exercise;

import feedback.Feedback;

/**
 * a) Write a class to represent a person. A person has a first name, last name, and an age.
 * b) Write code that create a person object and outputs the person's information as a string
 * formatted as ”Anders, Madsen, 28”
 */
public class Person {

    String firstName, lastName;

    int age;

    public static void main(String[] args) {

        Person Anders = new Person();

        Anders.firstName = "Anders";
        Anders.lastName = "Madsen";
        Anders.age = 28;

        System.out.println(Anders.firstName + ", " + Anders.lastName + ", " + Anders.age);

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/


        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session2_A_Classes", I_did_finish, I_did_understand, comment);

    }

}
