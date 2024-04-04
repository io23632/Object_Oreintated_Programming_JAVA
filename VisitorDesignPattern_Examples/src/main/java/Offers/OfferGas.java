package Offers;

import CreditCard.BronzeCreditCard;
import CreditCard.GoldCreditCard;
import CreditCard.SilverCreditCard;

public class OfferGas implements OffersVisitor{
    @Override
    public void visitBronzeCreditCard(BronzeCreditCard bronze) {
        System.out.println("£10 free gas");
    }

    @Override
    public void visitSilverCreditCard(SilverCreditCard silver) {
        System.out.println("£20 free gas");
    }

    @Override
    public void visitGoldCreditCard(GoldCreditCard gold) {
        System.out.println("£50 free gas");
    }
}
