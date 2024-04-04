package CreditCard;

import Offers.OffersVisitor;

public class BronzeCreditCard implements CreditCard {

    @Override
    public void getName() {
        System.out.println("Bronze Card");
    }

    @Override
    public void accept(OffersVisitor v) {
        v.visitBronzeCreditCard(this);
    }
}
