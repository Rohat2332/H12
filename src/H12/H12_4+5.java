package H12;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H12_4 extends Applet {

    int array[] = {5,27,34,42,57};
    TextField tekstfield;
    Label label;
    int number;
    boolean found;
    Button button;

    public void init() {
        button = new Button("Ok");
        button.addActionListener(new Listener());

        label = new Label("Guess the number");

        tekstfield = new TextField("",10);
        tekstfield.addActionListener(new Listener());

        add(label);
        add(tekstfield);
        add(button);
    }

    public void paint(Graphics g){
        setBackground(Color.cyan);
        if (found == true) {
            g.drawString("Found: " + number, 10 ,40);
        } else {
            g.drawString("Not Found", 10, 40);
        }
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String output = tekstfield.getText();
            number = Integer.parseInt(output);
            int counter = 0;
            found = false;
            while(counter < array.length) {
                if(array[counter] == number) {
                    found = true;
                }
                counter ++;
            }
            repaint();
        }
    }
}
