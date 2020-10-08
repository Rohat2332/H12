package H12;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class H12_3 extends Applet {

    TextField[] input = new TextField[5];
    Button confirm;
    int[] number = new int[5];

    public void init() {

        int counter;

        for(counter = 0; counter < input.length; counter++) {

            input[counter] = new TextField("",10);
            input[counter].addActionListener(new Listener());
            add(input[counter]);
        }
        confirm = new Button("ok");
        confirm.addActionListener(new Listener());
        add(confirm);

    }

    public void paint(Graphics g) {
        int counter;
        int x = 10;
        int max;
        for (counter = 0; counter < input.length; counter++) {
            g.drawString("" + number[counter], x,100);
            x += 50;
        }
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int counter;
            String[] output = new String[input.length];
            for(counter = 0; counter < input.length; counter++) {
                output[counter] = input[counter].getText();
                number[counter] = Integer.parseInt(output[counter]);
            }
            Arrays.sort(number);
            repaint();
        }
    }

}