package session12.visitors;

import session12.mathexpression.MathExpression;

import java.util.Scanner;

/**
 * In this exercise, you will apply the Visitor design pattern to count the
 * number of operations in a mathematical expression.
 *
 * For example, for the mathematical expression: "2 + 3 + 5 + 1 =", the output must be equal to 3.
 */

public class A_ExerciseCountOperations {
    public static void main(String[] args) {

        System.out.println("Enter the math expression (e.g., 3 + 2 = )");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        System.out.println();
        //We create the object
        MathExpression mathExpression = new MathExpression();
        mathExpression.parse(line);

        System.out.println("Printing the parsed expression:");
        System.out.println(mathExpression);
        System.out.println();
        System.out.println();


        System.out.println("Counting the number of operations: ");

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session12_A", I_did_finish, I_did_understand, comment);
        */
    }
}
