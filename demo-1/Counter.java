import java.awt.*;
import java.awt.event.*;

public class Counter extends Frame {
    private Label lblCount;
    private TextField tfCount;
    private Button btnCount;
    private int count = 0;
    private Button btnReset; 

    public Counter () {
        setLayout(new FlowLayout());

        lblCount = new Label("Counter");
        add(lblCount);

        tfCount = new TextField(count + "", 10);
        tfCount.setEditable(false);
        add(tfCount);

        btnCount = new Button("Count");
        add(btnCount);

        btnCount.addActionListener(new BtnCountListener());
        
        btnReset = new Button("Reset");
        add(btnReset);

        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                count = 0;
                tfCount.setText(count + "");
            }
        });

        addWindowListener(new MyWindowListener());

        setTitle("AWT Counter");
        setSize(300, 200);
        setVisible(true);

    }

    public static void main(String[] args) {
        Counter app = new Counter();
    }

    private class BtnCountListener implements ActionListener {
        @Override 
        public void actionPerformed(ActionEvent evt) {
            ++count;
            tfCount.setText(count + "");
        }
    }

    private class MyWindowListener implements WindowListener {
        @Override
      public void windowClosing(WindowEvent evt) {
         System.exit(0);  // Terminate the program
      }

      // Not Used, BUT need to provide an empty body to compile.
      @Override public void windowOpened(WindowEvent evt) { }
      @Override public void windowClosed(WindowEvent evt) { }
      // For Debugging
      @Override public void windowIconified(WindowEvent evt) { System.out.println("Window Iconified"); }
      @Override public void windowDeiconified(WindowEvent evt) { System.out.println("Window Deiconified"); }
      @Override public void windowActivated(WindowEvent evt) { System.out.println("Window Activated"); }
      @Override public void windowDeactivated(WindowEvent evt) { System.out.println("Window Deactivated"); }
    }
}