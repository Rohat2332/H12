package H12;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H12_6 extends Applet {

    int array[] = {100,200,300,400,500,200,200,300,100,400,200};
    TextField input;
    Label label;
    int number;
    int amount = 0;
    boolean found;

    public void init() {
        label = new Label("Search a number");
        input = new TextField("",10);
        input.addActionListener(new Listener());
        add(label);
        add(input);
    }

    public void paint(Graphics g){
        setBackground(Color.DARK_GRAY);
        if (found) {
            g.drawString("Found: " + number, 10 ,40);
            g.drawString("Amount: " + amount,10,60);
        } else {
            g.drawString("Not found", 10, 40);
            g.drawString("",10,60);
        }
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String output = input.getText();
            number = Integer.parseInt(output);
            int counter = 0;
            amount = 0;
            found = false;
            while(counter < array.length) {
                if(array[counter] == number) {
                    found = true;
                    amount++;
                }
                counter++;
            }
            repaint();
        }
    }
}