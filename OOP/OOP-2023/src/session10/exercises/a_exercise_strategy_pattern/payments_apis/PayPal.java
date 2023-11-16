package session10.exercises.a_exercise_strategy_pattern.payments_apis;

import session10.exercises.a_exercise_strategy_pattern.PaymentMethod;

public class PayPal {

    private String email;
    private double balance;

    public PayPal(String email, int initialBalance) {
        this.email = email;
        this.balance = initialBalance;
    }

    public boolean pay(double quantity){
        if (this.balance>quantity){
            this.balance-=quantity;
            return true;
        }else {
            return false;
        }
    }

}
