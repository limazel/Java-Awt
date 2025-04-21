package demo05;

import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo extends Frame {
    private TextField tfInput;
    private TextArea taDisplay;
    
    KeyEventDemo() {
        setLayout(new FlowLayout());

        add(new Label("Enter text: "));

        tfInput = new TextField(10);
        add(tfInput);

        taDisplay = new TextArea(5, 40);
        add(taDisplay);

        tfInput.addKeyListener(new MyKeyListener());

        setTitle("KeyEvent Demo");
        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyEventDemo();
    }

    private class MyKeyListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent evt) {
            taDisplay.append("You have typed " + evt.getKeyChar() + "\n");
         }

        @Override public void keyPressed(KeyEvent evt) { }
        @Override public void keyReleased(KeyEvent evt) { }
    }
}
