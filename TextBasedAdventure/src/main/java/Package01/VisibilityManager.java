package Package01;

public class VisibilityManager {
    // This class handles transitions
    UI ui;
    public VisibilityManager(UI userInterface){
    ui = userInterface;
    }

    public void showTitleScreen(){
        // Whenever you want to display the title screen you call this method
        // This method makes only the title screen visible, making all other screens
        // like the game screen invisible
        ui.titleNamePanel.setVisible(true);
        ui.startButtonPanel.setVisible(true);

        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);


    }


    public void showGameScreen(){
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);

        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);
    }
}
