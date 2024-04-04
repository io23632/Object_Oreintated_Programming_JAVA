package Player;

import Objects.Enemy;
import Objects.Orb;
import Objects.Platform;

public class Collision implements Player{
    @Override
    public void visitPlatform(Platform pl) {
        System.out.println("Player Collided with Platform");
    }

    @Override
    public void visitEnemy(Enemy e) {
        System.out.println("Player Collided with Enemy");
    }

    @Override
    public void visitOrb(Orb o) {
        System.out.println("Player Collided with Orb");
    }
}
