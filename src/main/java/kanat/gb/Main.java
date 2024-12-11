package kanat.gb;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main extends JFrame {
    private final Scanner scan = new Scanner(System.in);

    private JLabel display;
    private JLabel displayAns;
    public Main() {

        setTitle("Chat");
        setBounds(300, 300, 450, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        final JLabel text = new JLabel("Enter text: ");
        final JPanel sendText = new JPanel();
        final JTextField tf = new JTextField(20);

        final ActionListener actionListener = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                final JButton source = (JButton) e.getSource();
                String str = tf.getText();
                display.setText(str);
                System.out.println(str);
                String ans = scan.toString();
                displayAns.setText(ans);

            }
        };

        final JButton send = new JButton("SEND");
        send.addActionListener(actionListener);

        final JButton reset = new JButton("RESET");
        final JTextArea ta = new JTextArea(5,40);




        sendText.add(text);
        sendText.add(tf);
        sendText.add(send);
        sendText.add(reset);

        display = new JLabel("Your message");
        display.setHorizontalAlignment(SwingConstants.LEFT);
        display.setFont(new Font("Serif",Font.PLAIN,15));


        displayAns = new JLabel("Answer");
        displayAns.setHorizontalAlignment(SwingConstants.LEFT);
        displayAns.setFont(new Font("Serif",Font.PLAIN,15));

        add(display, BorderLayout.NORTH);
        add(displayAns,BorderLayout.CENTER);
        add(sendText, BorderLayout.SOUTH);





        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}
