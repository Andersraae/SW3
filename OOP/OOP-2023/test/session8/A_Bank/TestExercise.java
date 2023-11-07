package session8.A_Bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Exercise: Test the method "withdraw":
 * a) Create an account with 100 dkk.
 * b) Withdraw 25 dkk.
 * c) Test using "assertEquals" that the balance is equal to 75 dkk
 *
 */
public class TestExercise {

    @Test
    public void balanceIs75(){
        BankAccount account = new BankAccount(100);
        account.withdraw(25);
        assertEquals(75, account.getBalance());
    }


    /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/

    @Test
    public void feedback() {
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session8_A", I_did_finish, I_did_understand, comment);
        }

}
