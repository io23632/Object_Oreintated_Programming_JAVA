package Player;

import Objects.Enemy;
import Objects.Orb;
import Objects.Platform;

public interface Player {
  void visitPlatform(Platform pl);
  void visitEnemy(Enemy e);
  void visitOrb(Orb o);
}
