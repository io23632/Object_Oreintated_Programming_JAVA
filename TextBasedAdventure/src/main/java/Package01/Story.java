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

    public void setPlayerDefault(){

        player.hp = 10;
        userInterface.hpNumberLabel.setText("" + player.hp);
        player.weapon = new Knife();
        userInterface.weaponTypeLabel.setText(player.weapon.name);
    }

    public void toTown(){
        /**/
        userInterface.mainTextArea.setText("Welcome to the main Town Area, this is the central Hub of everything, you can choose to go to " +
                "Different locations here, choose your journey from the options below");

    }
}
