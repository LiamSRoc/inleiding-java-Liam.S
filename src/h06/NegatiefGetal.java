package h06;

import javax.swing.*;
import java.awt.*;
public class NegatiefGetal extends JApplet {

    int getal01;
    int getal02;
    int getal03 = getal01 + getal02;

    public void init() {
        getal01 = 2147483647;
        getal02 = 1073780000;
        System.out.printf("" + getal03);
    }

    public void paint(Graphics g) {
    g.drawString("" + getal03,50,50);

    }
}