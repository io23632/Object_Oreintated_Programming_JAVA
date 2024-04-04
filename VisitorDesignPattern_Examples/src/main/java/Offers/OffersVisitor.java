package Offers;

import CreditCard.BronzeCreditCard;
import CreditCard.GoldCreditCard;
import CreditCard.SilverCreditCard;

public interface OffersVisitor {
    void visitBronzeCreditCard(BronzeCreditCard bronze);
    void visitSilverCreditCard(SilverCreditCard silver);

    void visitGoldCreditCard(GoldCreditCard gold);
}
