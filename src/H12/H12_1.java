package H12;
import java.applet.*;
import java.awt.*;

public class H12_1 extends Applet {

    public void paint(Graphics g) {

        int counter;
        double[] number = new double[10];
        number[0] = 5;
        number[1] = 7;
        number[2] = 3.2;
        number[3] = 8.6;
        number[4] = 1.4;
        number[5] = 6.1;
        number[6] = 7.2;
        number[7] = 3.1;
        number[8] = 4;
        number[9] = 7.4;
        int y = 20;
        double av = 0;

        for(counter = 0; counter < number.length; counter++) {

            g.drawString("" + number[counter], 10,y);
            y += 20;
            av += number[counter];

        }
        av = av / number.length;
        g.drawString(""+av,10,240);

    }

}