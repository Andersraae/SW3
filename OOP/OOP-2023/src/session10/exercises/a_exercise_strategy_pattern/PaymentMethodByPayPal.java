package session10.exercises.a_exercise_strategy_pattern;

import session10.exercises.a_exercise_strategy_pattern.payments_apis.MasterCard;
import session10.exercises.a_exercise_strategy_pattern.payments_apis.PayPal;

public class PaymentMethodByPayPal implements PaymentMethod{
    private PayPal payPal;

    public PaymentMethodByPayPal(PayPal payPal){
        this.payPal = payPal;
    }

    public boolean pay(double quantity){
        return payPal.pay(quantity);
    }
}
