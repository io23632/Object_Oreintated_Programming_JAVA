package CreditCard;

import Offers.OffersVisitor;

public interface CreditCard {
    void getName();

    public void accept(OffersVisitor v);
}
