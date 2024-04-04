package CreditCard;

import Offers.OffersVisitor;

public class GoldCreditCard implements CreditCard{
    @Override
    public void getName() {
        System.out.println("Gold Card");
    }

    @Override
    public void accept(OffersVisitor v) {
        v.visitGoldCreditCard(this);
    }
}
