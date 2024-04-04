package Offers;

import CreditCard.BronzeCreditCard;
import CreditCard.GoldCreditCard;
import CreditCard.SilverCreditCard;

public class OfferHotel implements OffersVisitor{

    @Override
    public void visitBronzeCreditCard(BronzeCreditCard bronze) {
        System.out.println("1 night free");
    }

    @Override
    public void visitSilverCreditCard(SilverCreditCard silver) {
        System.out.println("2 nights free");
    }

    @Override
    public void visitGoldCreditCard(GoldCreditCard gold) {
        System.out.println("3 nights free");
    }
}
