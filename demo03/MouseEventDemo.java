package demo03;

import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame{
    private TextField tfMouseX, tfMouseY;

    public MouseEventDemo() {
        setLayout(new FlowLayout());

        add(new Label("X-Click:"));

        tfMouseX = new TextField(10);
        tfMouseX.setEditable(false);
        add(tfMouseX);

        add(new Label("Y-Click:"));

        tfMouseY = new TextField(10);
        tfMouseY.setEditable(false);
        add(tfMouseY);

        addMouseListener(new MyMouseListener());

        setTitle("MouseEventDemo");
        setSize(350, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }

    private class MyMouseListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent event) {
            tfMouseX.setText(event.getX() + "");
            tfMouseY.setText(event.getY() + "");
        }

        @Override public void mousePressed(MouseEvent evt) { }
        @Override public void mouseReleased(MouseEvent evt) { }
        @Override public void mouseEntered(MouseEvent evt) { }
        @Override public void mouseExited(MouseEvent evt) { }
    }
}
