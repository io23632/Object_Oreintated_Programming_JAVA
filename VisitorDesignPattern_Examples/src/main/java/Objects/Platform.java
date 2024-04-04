package Objects;

import Player.Player;

public class Platform implements ObjectTypes{
    @Override
    public void getName() {
        System.out.println("This is a platform");
    }

    @Override
    public void accept(Player p) {
       p.visitPlatform(this);
    }
}
