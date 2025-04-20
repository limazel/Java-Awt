import java.awt.*;
import java.awt.event.*;

public class Counter extends Frame {
    private Label lblCount;
    private TextField tfCount;
    private Button btnCount;
    private int count = 0;

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
}