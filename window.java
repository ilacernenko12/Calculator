import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Window extends JFrame implements WindowListener, ActionListener {
    private TextField f = new TextField();
    private JButton b9 = new JButton("9");
    private JButton b8 = new JButton("8");
    private JButton b7 = new JButton("7");
    private JButton b6 = new JButton("6");
    private JButton b5 = new JButton("5");
    private JButton b4 = new JButton("4");
    private JButton b3 = new JButton("3");
    private JButton b2 = new JButton("2");
    private JButton b1 = new JButton("1");
    private JButton b0 = new JButton("0");
    private JButton Del = new JButton("C");
    private JButton Plus = new JButton("+");
    private JButton Minus = new JButton("-");
    private JButton Divide = new JButton("/");
    private JButton Multiply = new JButton("*");
    private JButton Equals = new JButton("=");

    private String text = "";
    private double a = 0;
    private double b = 0;
    private char z;
    public Window () {
        Font font = new Font("Impact", Font.BOLD,40); // стиль и размер шрифта
        setLayout(null); // зануляем слои
        setSize(400, 600); // размер окна
        ;
        setVisible(true);
        setLocation(700, 250); // место открытия на экране
        f.setFont(font);
        f.setBackground(Color.lightGray);
        f.setSize(330,60);
        f.setLocation(25, 25);
        f.setVisible(true);
        add(f);
        b9.setFont(font);
        b9.setSize(60, 60);
        b9.setLocation(185, 225);
        b9.setVisible(true);
        add(b9);
        b9.addActionListener(this);
        b8.setFont(font);
        b8.setSize(60, 60);
        b8.setLocation(105, 225);
        b8.setVisible(true);
        add(b8);
        b8.addActionListener(this);
        b7.setFont(font);
        b7.setSize(60, 60);
        b7.setLocation(25, 225);
        b7.setVisible(true);
        add(b7);
        b7.addActionListener(this);
        b6.setFont(font);
        b6.setSize(60, 60);
        b6.setLocation (185, 300);
        b6.setVisible(true);
        add(b6);
        b6.addActionListener(this);
        b5.setFont(font);
        b5.setSize(60, 60);
        b5.setLocation(105, 300);
        b5.setVisible(true);
        add(b5);
        b5.addActionListener(this);
        b4.setFont(font);
        b4.setSize(60, 60);
        b4.setLocation(25, 300);
        b4.setVisible(true);
        add(b4);
        b4.addActionListener(this);
        b3.setFont(font);
        b3.setSize(60, 60);
        b3.setLocation(185, 375);
        b3.setVisible(true);
        add(b3);
        b3.addActionListener(this);
        b2.setFont(font);
        b2.setSize(60, 60);
        b2.setLocation(105, 375);
        b2.setVisible(true);
        add(b2);
        b2.addActionListener(this);
        b1.setFont(font);
        b1.setSize(60, 60);
        b1.setLocation(25, 375);
        b1.setVisible(true);
        add(b1);
        b1.addActionListener(this);
        b0.setFont(font);
        b0.setSize(60, 60);
        b0.setLocation(25, 450);
        b0.setVisible(true);
        add(b0);
        b0.addActionListener(this);
        Del.setFont(font);
        Del.setSize(60, 60);
        Del.setLocation(265, 225);
        Del.setVisible(true);
        add(Del);
        Del.addActionListener(this);
        Plus.setFont(font);
        Plus.setSize(60, 60);
        Plus.setLocation(265, 300);
        Plus.setVisible(true);
        add(Plus);
        Plus.addActionListener(this);
        Minus.setFont(font);
        Minus.setSize(60, 60);
        Minus.setLocation(265, 375);
        Minus.setVisible(true);
        add(Minus);
        Minus.addActionListener(this);
        Divide.setFont(font);
        Divide.setSize(60, 60);
        Divide.setLocation(185, 450);
        Divide.setVisible(true);
        add(Divide);
        Divide.addActionListener(this);
        Multiply.setFont(font);
        Multiply.setSize(60, 60);
        Multiply.setLocation(185, 450);
        Multiply.setVisible(true);
        add(Multiply);
        Multiply.addActionListener(this);
        Equals.setFont(font);
        Equals.setSize(60, 60);
        Equals.setLocation(265, 450);
        Equals.setVisible(true);
        add(Equals);
        Equals.addActionListener(this);
        Multiply.setFont(font);
        Multiply.setSize(60, 60);
        Multiply.setLocation(105, 450);
        Multiply.setVisible(true);
        add(Multiply);
        Multiply.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) { // обработчик событий
        if (e.getSource()==Del) {
            text = "";
            f.setText(text);
        }
        if (e.getSource()==b9) { // если нажали "9", то
            text = text + b9.getText(); // для ввода n-значных чисел
            f.setText(text); // выводим на экран 9
        }
        if (e.getSource()==b8) {
            text = text + b8.getText();
            f.setText(text);
        }
        if (e.getSource()==b7) {
            text = text + b7.getText();
            f.setText(text);
        }
        if (e.getSource()==b6) {
            text = text + b6.getText();
            f.setText(text);
        }
        if (e.getSource()==b5) {
            text = text + b5.getText();
            f.setText(text);
        }
        if (e.getSource()==b4) {
            text = text + b4.getText();
            f.setText(text);
        }
        if (e.getSource()==b3) {
            text = text + b3.getText();
            f.setText(text);
        }
        if (e.getSource()==b2) {
            text = text + b2.getText();
            f.setText(text);
        }
        if (e.getSource()==b1) {
            text = text + b1.getText();
            f.setText(text);
        }
        if (e.getSource()==b0) {
            text = text + b0.getText();
            f.setText(text);
        }
        if (e.getSource()==Plus) {
            a = Integer.parseInt(text);
            f.setText(text+Plus.getText()); // +
            text = ""; // зануляем строку
            z = '+';
        }
        if (e.getSource()==Minus) {
            a = Integer.parseInt(text);
            f.setText(text+Minus.getText());
            text = ""; // зануляем строку
            z = '-';
        }
        if (e.getSource()==Multiply) {
            a = Integer.parseInt(text);
            f.setText(text+Multiply.getText());
            text = ""; // зануляем строку
            z = '*';
        }
        if (e.getSource()==Divide) {
            a = Integer.parseInt(text);
            f.setText(text+Divide.getText());
            text = ""; // зануляем строку
            z = '/';
        }
        if (e.getSource()==Equals) {
            if (z=='+') {
                b=Double.parseDouble(text);
                f.setText(String.valueOf(a+b));
            }
            if (z=='-') {
                b=Double.parseDouble(text);
                f.setText(String.valueOf(a-b));
            }
            if (z=='*') {
                b=Double.parseDouble(text);
                f.setText(String.valueOf(a*b));
            }
            if (z=='/') {
                b=Double.parseDouble(text);
                f.setText(String.valueOf(a/b));
            }
        }

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
