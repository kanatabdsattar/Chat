package kanat.gb;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JLabel display;
    public Main() {

        setTitle("Calculator");
        setBounds(300, 300, 450, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        final ActionListener actionListener = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                final JTextField message = (JTextField) e.getSource();
                final String text = message.getText();

                String displayText = display.getText();
                if("Your message".equals(displayText)){
                    displayText = "";

                }
                displayText += text;
                display.setText(displayText);

            }
        };

        final JLabel text = new JLabel("Enter text: ");
        final JPanel sendText = new JPanel();
        final JTextField tf = new JTextField(20);
        final JButton send = new JButton("SEND");
        send.addActionListener(actionListener);

        final JButton reset = new JButton("RESET");
        final JTextArea ta = new JTextArea(5,40);




        sendText.add(text);
        sendText.add(tf);
        sendText.add(send);
        sendText.add(reset);

        display = new JLabel("Your message");
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font("Arial",Font.BOLD,20));

        send.setActionCommand(display.getText());
        add(display, BorderLayout.NORTH);
        add(sendText, BorderLayout.SOUTH);
        add(ta);




        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}
