import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.lang.reflect.Array;
import java.util.*;

public class ConnectTheDots {
  static Graphics g;
  public static void mainDraw(Graphics graphics){
    // create a function that takes 1 parameter:
    // an array of {x, y} points
    // and connects them with green lines.
    // connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
    // connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
    // {120, 100}, {85, 130}, {50, 100}}
    int[][] firstArray = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
    int[][] secondArray = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
    arrayFunction(firstArray);


  }

  private static void arrayFunction(int[][] myArray) {
    for (int i = 0; i < myArray.length - 1; i++) {
      g.drawLine(myArray[i][0], myArray[i][1], myArray[i + 1][0], myArray[i + 1][1]);
    }
    g.drawLine(myArray[myArray.length - 1][0], myArray[myArray.length - 1][1], myArray[0][0], myArray[0][1]);
  }

  //    Don't touch the code below
  static int WIDTH = 300;
  static int HEIGHT = 300;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      g = graphics;
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}


// create a 300x300 canvas.