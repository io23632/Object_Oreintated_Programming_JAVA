package CreditCard;

import Offers.OffersVisitor;

public class SilverCreditCard implements CreditCard{
    @Override
    public void getName() {
        System.out.println("Silver Card");
    }

    @Override
    public void accept(OffersVisitor v) {
        v.visitSilverCreditCard(this);
    }
}
