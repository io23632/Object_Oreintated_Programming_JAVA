package Objects;

import Player.Player;

public class Orb implements ObjectTypes{
    @Override
    public void getName() {
        System.out.println("This is an Orb");
    }

    @Override
    public void accept(Player p) {
        p.visitOrb(this);
    }
}
