package H12;
import java.applet.*;
import java.awt.*;

public class H12_2 extends Applet{

    public void init() {

// ik heb hier 26 buttons gedaan omdat bij 25 zie je er maar 24

        Button[] Buttons = new Button[26];
        int counter;

        for(counter = 0; counter < Buttons.length; counter++) {
            Buttons[counter] = new Button("" + counter);
            add(Buttons[counter]);
        }

    }

}