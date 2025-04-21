package demo04;

import java.awt.*;
import java.awt.event.*;

public class MouseMotionDemo extends Frame{
    private TextField tfMouseClickX, tfMouseClickY, tfMousePositionX, tfMousePositionY;

    public MouseMotionDemo() {
        setLayout(new FlowLayout());

        add(new Label("X-Click:"));

        tfMouseClickX = new TextField(10);
        tfMouseClickX.setEditable(false);
        add(tfMouseClickX);

        add(new Label("Y-Click:"));

        tfMouseClickY = new TextField(10);
        tfMouseClickY.setEditable(false);
        add(tfMouseClickY);

        add(new Label("X-Position:"));

        tfMousePositionX = new TextField(10);
        tfMousePositionX.setEditable(false);
        add(tfMousePositionX);

        add(new Label("Y-Position:"));

        tfMousePositionY = new TextField(10);
        tfMousePositionY.setEditable(false);
        add(tfMousePositionY);

        MyMouseListener listener = new MyMouseListener();
        addMouseListener(listener);
        addMouseMotionListener(listener);

        setTitle("Mouse Motion Demo");
        setSize(400, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseMotionDemo();
    }

    private class MyMouseListener implements MouseListener, MouseMotionListener {
        @Override
      public void mouseClicked(MouseEvent evt) {
         tfMouseClickX.setText(evt.getX() + "");
         tfMouseClickY.setText(evt.getY() + "");
      }

      // Not Used, but need to provide an empty body for compilation
      @Override public void mousePressed(MouseEvent evt) { }
      @Override public void mouseReleased(MouseEvent evt) { }
      @Override public void mouseEntered(MouseEvent evt) { }
      @Override public void mouseExited(MouseEvent evt) { }

      @Override
      public void mouseMoved(MouseEvent evt) {
         tfMousePositionX.setText(evt.getX() + "");
         tfMousePositionY.setText(evt.getY() + "");
      }

      // Not Used, but need to provide an empty body for compilation
      @Override public void mouseDragged(MouseEvent evt) { }
    }
}
