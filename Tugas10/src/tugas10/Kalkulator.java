import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator extends JFrame implements ActionListener {

    private JTextField display;
    private double num1 = 0, num2 = 0, result = 0;
    private String operator = "";

    public Kalkulator() {
        setTitle("Kalkulator");
        setSize(320, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        display = new JTextField("0");
        display.setFont(new Font("Arial", Font.BOLD, 28));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setEditable(false);
        display.setBackground(Color.WHITE);
        display.setForeground(Color.BLACK);
        display.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        String[] buttons = {
                "C", "DEL", "%", "/",
                "7", "8", "9", "×",
                "4", "5", "6", "-",
                "1", "2", "3", "+",
                "±", "0", ".", "="
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            btn.addActionListener(this);
            btn.setFocusable(false);

            if (text.matches("[0-9]") || text.equals(".")) {
                btn.setBackground(Color.BLACK);
                btn.setForeground(Color.WHITE);
            } else {
                btn.setBackground(new Color(255, 140, 0)); // ORANGE
                btn.setForeground(Color.WHITE);
            }

            btn.setOpaque(true);
            btn.setBorderPainted(false);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        try {
            if (cmd.matches("[0-9]") || cmd.equals(".")) {
                if (display.getText().equals("0") && !cmd.equals(".")) {
                    display.setText(cmd);
                } else {
                    display.setText(display.getText() + cmd);
                }
            }

            else if (cmd.equals("C")) {
                display.setText("0");
                num1 = num2 = result = 0;
                operator = "";
            }

            else if (cmd.equals("DEL")) {
                String text = display.getText();
                display.setText(text.length() > 1 ? text.substring(0, text.length() - 1) : "0");
            }

            else if (cmd.equals("±")) {
                double value = Double.parseDouble(display.getText());
                value *= -1;
                display.setText(removeTrailingZero(value));
            }

            else if (cmd.equals("%")) {
                double value = Double.parseDouble(display.getText()) / 100;
                display.setText(removeTrailingZero(value));
            }

            else if (cmd.matches("[+\\-×/]")) {
                num1 = Double.parseDouble(display.getText());
                operator = cmd;
                display.setText("0");
            }

            else if (cmd.equals("=")) {
                num2 = Double.parseDouble(display.getText());

                switch (operator) {
                    case "+" -> result = num1 + num2;
                    case "-" -> result = num1 - num2;
                    case "×" -> result = num1 * num2;
                    case "/" -> result = num2 != 0 ? num1 / num2 : 0;
                }

                display.setText(removeTrailingZero(result));
                operator = "";
            }

        } catch (Exception ex) {
            display.setText("Error");
        }
    }

    private String removeTrailingZero(double value) {
        return (value % 1 == 0) ? String.valueOf((int) value) : String.valueOf(value);
    }

    public static void main(String[] args) {
        new Kalkulator();
    }
}
