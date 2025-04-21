package demo02;

import java.awt.*;
import java.awt.event.*;

public class Accumulator extends Frame {
    // private Label lblInteger, lblSum;
    private TextField tfInput, tfOutput;
    private int sum;

    public Accumulator() {
        setLayout(new GridLayout(2,2));
        
        add(new Label("Enter an integer:"));

        tfInput = new TextField(10);
        add(tfInput);
        tfInput.addActionListener(new TFInputListener());

        add(new Label("The accumulated sum is:"));

        tfOutput = new TextField(10);
        tfOutput.setEditable(false);
        add(tfOutput);

        setTitle("Accumulator");
        setSize(350, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Accumulator();
    }

    private class TFInputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            int numberIn = Integer.parseInt(tfInput.getText());
            sum += numberIn;
            tfInput.setText("");
            tfOutput.setText(sum + "");
        }
    }
}
