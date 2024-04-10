package Package01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    UI ui = new UI();
    ChoiceHandler cHandler = new ChoiceHandler();
    VisibilityManager vM = new VisibilityManager(ui);
    public static void main(String[] args) {
        new Game();

    }
    public Game(){
        ui.createUI(cHandler);
        vM.showTitleScreen();

    }

    public class ChoiceHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String yourChoice = e.getActionCommand();
            switch (yourChoice) {
                case "start":
                    vM.showGameScreen();
                    break;
                case  "c1": break;
                case "c2": break;
                case "c3": break;
                case "c4": break;

            }

        }
    }


}
