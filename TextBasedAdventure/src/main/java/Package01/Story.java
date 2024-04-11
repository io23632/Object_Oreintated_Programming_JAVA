package Package01;

import Package02.Knife;

public class Story {

   Game game;
   UI userInterface;
   VisibilityManager visibilityManager;

   Player player = new Player();

    public Story(Game game, UI userInterface, VisibilityManager visibilityManager){
        this.game = game;
        this.userInterface = userInterface;
        this.visibilityManager = visibilityManager;

    }

    /* Set the default value for the player hp and weapon of choice */

    public void setPlayerDefault(){
        player.hp = 10;
        userInterface.hpNumberLabel.setText("" + player.hp);
        player.weapon  = new Knife();
        userInterface.weaponTypeLabel.setText(player.weapon.name);

    }
}
