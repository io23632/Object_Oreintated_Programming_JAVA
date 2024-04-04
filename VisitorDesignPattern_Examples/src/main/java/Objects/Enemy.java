package Objects;

import Player.Player;

public class Enemy implements ObjectTypes{
    @Override
    public void getName() {
        System.out.println("This is an Enemy");
    }

    @Override
    public void accept(Player p) {
        p.visitEnemy(this);
    }
}
