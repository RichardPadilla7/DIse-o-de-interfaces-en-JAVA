import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Mi aplicación calculadora");
        frame.setContentPane(new Richard().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.pack();
        frame.setVisible(true);

        }
    }
