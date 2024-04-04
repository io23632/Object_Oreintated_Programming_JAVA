package Runner;

import CreditCard.CreditCard;
import Objects.Enemy;
import Objects.ObjectTypes;
import Objects.Orb;
import Objects.Platform;
import Offers.OfferGas;
import Offers.OfferHotel;
import Offers.OffersVisitor;
import CreditCard.BronzeCreditCard;
import CreditCard.SilverCreditCard;
import CreditCard.GoldCreditCard;
import Player.Player;
import Player.Collision;

public class Main {
    public static void main(String[] args) {

        OffersVisitor hotelVisitor = new OfferHotel();
        OffersVisitor gasVisitor = new OfferGas();

        CreditCard bronze = new BronzeCreditCard();
        CreditCard silver = new SilverCreditCard();
        CreditCard gold = new GoldCreditCard();



        Player playerCollisions = new Collision();

        ObjectTypes platforms = new Platform();
        ObjectTypes enemies = new Enemy();
        ObjectTypes orbs = new Orb();


        platforms.getName();
        platforms.accept(playerCollisions);

        enemies.getName();
        enemies.accept(playerCollisions);

        orbs.getName();
        orbs.accept(playerCollisions);


    }
}
