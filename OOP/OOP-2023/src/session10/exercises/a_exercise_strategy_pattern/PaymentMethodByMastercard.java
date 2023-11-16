package session10.exercises.a_exercise_strategy_pattern;

import session10.exercises.a_exercise_strategy_pattern.payments_apis.MasterCard;

public class PaymentMethodByMastercard implements PaymentMethod{

    private MasterCard card;
    public PaymentMethodByMastercard (MasterCard card){
        this.card = card;
    }

    public boolean pay(double quantity){
        return card.chargeToTheCreditCard(quantity);
    }
}
