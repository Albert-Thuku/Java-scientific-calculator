import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.lang.Math;

public class Elementary extends JFrame implements ActionListener {

    JFrame calc = new JFrame();

    JButton but0 = new JButton("0");
    JButton but1 = new JButton("1");
    JButton but2 = new JButton("2");
    JButton but3 = new JButton("3");
    JButton but4 = new JButton("4");
    JButton but5 = new JButton("5");
    JButton but6 = new JButton("6");
    JButton but7 = new JButton("7");
    JButton but8 = new JButton("8");
    JButton but9 = new JButton("9");
    JButton point = new JButton(".");

    JButton butplus = new JButton("+");
    JButton butminus = new JButton("-");
    JButton butdivide = new JButton("÷");
    JButton butmultiply = new JButton("*");
    JButton butequal = new JButton("=");

    JButton square = new JButton("x^2");
    JButton cube = new JButton("x^3");
    JButton expoon = new JButton("x^y");
    JButton dix = new JButton("10^x");
    JButton butclr = new JButton("C");
    JButton plusmin = new JButton("+/-");
    JButton pourcent = new JButton("%");
    JButton oneover = new JButton("1/x");
    JButton sqroot = new JButton("√x");
    JButton cuberoot = new JButton("3√x");
    JButton yroot = new JButton("y√x");
    JButton sinee = new JButton("sin");
    JButton cosinee = new JButton("cos");
    JButton tangentt = new JButton("tan");
    JButton sineh = new JButton("sinh");
    JButton cosineh = new JButton("cosh");
    JButton tangenth = new JButton("tanh");
    JButton ex = new JButton("e^x");
    JButton ln = new JButton("ln");
    JButton log10 = new JButton("log10");
    JButton x = new JButton("x!");
    JButton e = new JButton("e");
    JButton EE = new JButton("EE");
    JButton RAD = new JButton("RAD");
    JButton pii = new JButton("π");
    JButton bck = new JButton("del");

    private JButton numbuttons[] = { but0, but1, but2, but3, but4, but5, but6, but7, but8, but9, point };

    private JButton opbuttons[] = { butplus, butminus, butdivide, butmultiply, butequal };

    private JButton complexbuttons[] = { square, cube, expoon, dix, butclr, plusmin, pourcent,
            oneover, sqroot, cuberoot, yroot, sinee, cosinee, tangentt, sineh, cosineh, tangenth,
            ex, ln, log10, x, e, EE, RAD, pii, bck };

    JPanel pan = new JPanel();

    JTextField text = new JTextField();

    String Operator;
    Double num1;
    Double num2;
    Double r;

    Elementary() {
        calc.setMinimumSize(new Dimension(1000, 500));
        calc.setTitle("Calculator");
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.getContentPane().setBackground(Color.BLACK);
        calc.setLayout(new BorderLayout());

        pan.setBackground(new Color(30, 30, 30));
        pan.setSize(700, 300);
        pan.setLayout(new GridLayout(6, 7));

        text.setBounds(0, 0, 300, 200);
        text.setBackground(new Color(30, 30, 30));
        text.setForeground(Color.white);
        text.setEditable(false);

        for (int i = 0; i < numbuttons.length; i++) {
            numbuttons[i].setFocusable(false);
            numbuttons[i].setForeground(Color.white);
            numbuttons[i].setBackground(new Color(90, 90, 90));
            numbuttons[i].setBorder(new LineBorder(new Color(30, 30, 30)));
            numbuttons[i].addActionListener(this);
        }

        for (int i = 0; i < opbuttons.length; i++) {
            opbuttons[i].setFocusable(false);
            opbuttons[i].setForeground(Color.white);
            opbuttons[i].setBackground(new Color(255, 140, 0));
            opbuttons[i].setBorder(new LineBorder(new Color(30, 30, 30)));
            opbuttons[i].addActionListener(this);
        }

        for (int i = 0; i < complexbuttons.length; i++) {
            complexbuttons[i].setFocusable(false);
            complexbuttons[i].setForeground(Color.white);
            complexbuttons[i].setBackground(new Color(50, 50, 50));
            complexbuttons[i].setBorder(new LineBorder(new Color(30, 30, 30)));
            complexbuttons[i].addActionListener(this);
        }

        pan.add(square);
        pan.add(cube);
        pan.add(expoon);
        pan.add(plusmin);
        pan.add(bck);
        pan.add(butclr);
        pan.add(pourcent);
        pan.add(oneover);
        pan.add(sqroot);
        pan.add(cuberoot);
        pan.add(yroot);
        pan.add(ln);
        pan.add(log10);
        pan.add(butdivide);
        pan.add(x);
        pan.add(e);
        pan.add(EE);
        pan.add(but7);
        pan.add(but8);
        pan.add(but9);
        pan.add(butmultiply);
        pan.add(sinee);
        pan.add(cosinee);
        pan.add(tangentt);
        pan.add(but4);
        pan.add(but5);
        pan.add(but6);
        pan.add(butminus);
        pan.add(sineh);
        pan.add(cosineh);
        pan.add(tangenth);
        pan.add(but1);
        pan.add(but2);
        pan.add(but3);
        pan.add(butplus);
        pan.add(ex);
        pan.add(pii);
        pan.add(RAD);
        pan.add(dix);
        pan.add(but0);
        pan.add(point);
        pan.add(butequal);

        calc.add(pan);
        calc.add(text, BorderLayout.NORTH);
        calc.setResizable(false);
        calc.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == but0) {
            text.setText(text.getText().concat("0"));
        }
        if (e.getSource() == but1) {
            text.setText(text.getText().concat("1"));
        }
        if (e.getSource() == but2) {
            text.setText(text.getText().concat("2"));
        }
        if (e.getSource() == but3) {
            text.setText(text.getText().concat("3"));
        }
        if (e.getSource() == but4) {
            text.setText(text.getText().concat("4"));
        }
        if (e.getSource() == but5) {
            text.setText(text.getText().concat("5"));
        }
        if (e.getSource() == but6) {
            text.setText(text.getText().concat("6"));
        }
        if (e.getSource() == but7) {
            text.setText(text.getText().concat("7"));
        }
        if (e.getSource() == but8) {
            text.setText(text.getText().concat("8"));
        }
        if (e.getSource() == but9) {
            text.setText(text.getText().concat("9"));
        }
        if (e.getSource() == point) {
            text.setText(text.getText().concat("."));
        }

        if (e.getSource() == butplus) {
            num1 = Double.parseDouble(text.getText());
            Operator = "+";
            text.setText("");
        }
        if (e.getSource() == plusmin) {
            num1 = Double.parseDouble(text.getText());
            r = -num1;
            text.setText(String.valueOf(r));
        }

        if (e.getSource() == butminus) {
            num1 = Double.parseDouble(text.getText());
            Operator = "-";
            text.setText("");
        }
        if (e.getSource() == butdivide) {
            num1 = Double.parseDouble(text.getText());
            Operator = "/";
            text.setText("");
        }
        if (e.getSource() == butmultiply) {
            num1 = Double.parseDouble(text.getText());
            Operator = "*";
            text.setText("");
        }
        if (e.getSource() == expoon) {
            num1 = Double.parseDouble(text.getText());
            Operator = "^";
            text.setText("");
        }

        if (e.getSource() == dix) {
            num1 = Double.parseDouble(text.getText());
            r = Math.pow(10.0, num1);
            text.setText(String.valueOf(r));
        }
        if (e.getSource() == sinee) {
            num1 = Double.parseDouble(text.getText());
            r = Math.sin(Math.toRadians(num1));
            text.setText(String.valueOf(r));
        }
        if (e.getSource() == cosinee) {
            num1 = Double.parseDouble(text.getText());
            r = Math.cos(Math.toRadians(num1));
            text.setText(String.valueOf(r));
        }
        if (e.getSource() == tangentt) {
            num1 = Double.parseDouble(text.getText());
            r = Math.tan(Math.toRadians(num1));
            text.setText(String.valueOf(r));
        }
        if (e.getSource() == sineh) {
            num1 = Double.parseDouble(text.getText());
            r = Math.sinh(Math.toRadians(num1));
            text.setText(String.valueOf(r));
        }
        if (e.getSource() == cosineh) {
            num1 = Double.parseDouble(text.getText());
            r = Math.cosh(Math.toRadians(num1));
            text.setText(String.valueOf(r));
        }
        if (e.getSource() == tangenth) {
            num1 = Double.parseDouble(text.getText());
            r = Math.tanh(Math.toRadians(num1));
            text.setText(String.valueOf(r));
        }
        if (e.getSource() == square) {
            num1 = Double.parseDouble(text.getText());
            r = Math.pow(num1, 2);
            text.setText(String.valueOf(r));
        }
        if (e.getSource() == cube) {
            num1 = Double.parseDouble(text.getText());
            r = Math.pow(num1, 3);
            text.setText(String.valueOf(r));
        }
        if (e.getSource() == sqroot) {
            num1 = Double.parseDouble(text.getText());
            r = Math.sqrt(num1);
            text.setText(String.valueOf(r));
        }
        if (e.getSource() == cuberoot) {
            num1 = Double.parseDouble(text.getText());
            r = Math.cbrt(num1);
            text.setText(String.valueOf(r));
        }
        if (e.getSource() == pourcent) {
            num1 = Double.parseDouble(text.getText());
            r = num1 / 100;
            text.setText(String.valueOf(r));
        }
        if (e.getSource() == oneover) {
            num1 = Double.parseDouble(text.getText());
            r = 1 / num1;
            text.setText(String.valueOf(r));
        }
        if (e.getSource() == yroot) {
            num1 = Double.parseDouble(text.getText());
            Operator = "y";
            text.setText("");
        }

        if (e.getSource() == butequal) {
            num2 = Double.parseDouble(text.getText());
            switch (Operator) {
                case "+":
                    r = num1 + num2;
                    break;

                case "-":
                    r = num1 - num2;
                    break;

                case "*":
                    r = num1 * num2;
                    break;

                case "/":
                    r = num1 / num2;
                    break;

                case "^":
                    r = Math.pow(num1, num2);

                case "y":
                    double c = 1 / num2;
                    r = Math.pow(num1, c);

                default:
                    r = num1;
                    break;

            }
            if (r == null) {
                text.setText("ERROR!");
            } else {
                text.setText(String.valueOf(r));
                num1 = r;
            }
        }
        if (e.getSource() == butclr) {
            text.setText("");
        }
        if (e.getSource() == bck) {
            String temp = text.getText();
            text.setText("");
            for (int i = 0; i < temp.length() - 1; i++) {
                text.setText(text.getText() + temp.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        new Elementary();
    }
}
