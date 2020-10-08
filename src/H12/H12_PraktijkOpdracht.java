package H12;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class H12_PraktijkOpdracht extends Applet {

    TextField name;
    TextField number;
    Label label;
    Label label1;
    Button confirm;
    String display[] = new String[10];
    int counter = 0;

    public void init() {

        name = new TextField("",10);
        number = new TextField("",10);

        label = new Label("Name: ");
        label1 = new Label(" Number: ");

        confirm = new Button("Ok");
        confirm.addActionListener(new Listener());

        add(label);
        add(name);
        add(label1);
        add(number);
        add(confirm);
    }

    public void paint(Graphics g) {
        setBackground(Color.cyan);
        if (counter < display.length) {
            int arraycount = counter - 1;
            g.drawString("" + display[arraycount], 10, 40);
        } else {
            int counter2;
            int y = 40;
            for(counter2 = 0; counter2 < 10; counter2++) {
                g.drawString("" + display[counter2], 10 , y);
                y += 20;
            }
        }
    }
    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String nameoutput = name.getText();
            String numberoutput = number.getText();

            int number = Integer.parseInt(numberoutput);

            display[counter] = "Name: " + nameoutput + " Number: " + number;

            repaint();
            counter++;
        }
    }
}