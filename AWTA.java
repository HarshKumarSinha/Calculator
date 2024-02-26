import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTA implements ActionListener
{
    String s,s1;
    int set=0;
    double num1,num2,check=0,r;
    JLabel l1 = new JLabel("Enter Number: ");
    JLabel l2 = new JLabel("Calculator");
    JButton percentage = new JButton("%");
    JButton CE = new JButton("AC");
    JButton C = new JButton("C");
    JButton delete = new JButton("←");
    JButton d_w_1 = new JButton("1/x");
    JButton sq = new JButton("x²");
    JButton sqroot = new JButton("√");
    JButton divide = new JButton("/");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton multiply = new JButton("X");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton subtract = new JButton("-");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton add = new JButton("+");
    JButton sign = new JButton("-x");
    JButton zero = new JButton("0");
    JButton point = new JButton(".");
    JButton equal = new JButton("=");
    JTextField tf3 = new JTextField();
    JTextField tf1 = new JTextField();
    public AWTA() {
        JFrame f = new JFrame("Calculator");
        f.setSize(300, 600);
        f.setVisible(true);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.black);
        l1.setForeground(Color.white);
        l2.setForeground(Color.white);
        equal.setBackground(Color.pink);
        equal.setForeground(Color.black);
        percentage.setBounds(10, 165, 60, 50);
        CE.setBounds(75, 165, 60, 50);
        C.setBounds(140, 165, 60, 50);
        delete.setBounds(205, 165, 60, 50);
        d_w_1.setBounds(10, 225, 60, 50);
        sq.setBounds(75, 225, 60, 50);
        sqroot.setBounds(140, 225, 60, 50);
        divide.setBounds(205, 225, 60, 50);
        seven.setBounds(10, 285, 60, 50);
        eight.setBounds(75, 285, 60, 50);
        nine.setBounds(140, 285, 60, 50);
        multiply.setBounds(205, 285, 60, 50);
        four.setBounds(10, 345, 60, 50);
        five.setBounds(75, 345, 60, 50);
        six.setBounds(140, 345, 60, 50);
        subtract.setBounds(205, 345, 60, 50);
        one.setBounds(10, 405, 60, 50);
        two.setBounds(75, 405, 60, 50);
        three.setBounds(140, 405, 60, 50);
        add.setBounds(205, 405, 60, 50);
        sign.setBounds(10, 465, 60, 50);
        zero.setBounds(75, 465, 60, 50);
        point.setBounds(140, 465, 60, 50);
        equal.setBounds(205, 465, 60, 50);
        l2.setBounds(80,10,150,30);
        l1.setBounds(10, 50, 100, 20);
        tf3.setBounds(10,80,255,40);
        tf1.setBounds(10, 120, 255, 40);
        l2.setFont(new Font("Times New Roman",Font.BOLD,25));
        tf1.setBackground(Color.black);
        tf1.setForeground(Color.yellow);
        tf3.setBackground(Color.black);
        tf3.setForeground(Color.yellow);
        f.add(tf1);
        f.add(tf3);
        f.add(l1);
        f.add(l2);
        f.add(percentage);
        f.add(CE);
        f.add(C);
        f.add(delete);
        f.add(d_w_1);
        f.add(sq);
        f.add(sqroot);
        f.add(divide);
        f.add(multiply);
        f.add(subtract);
        f.add(add);
        f.add(sign);
        f.add(equal);
        f.add(zero);
        f.add(point);
        f.add(one);
        f.add(two);
        f.add(three);
        f.add(four);
        f.add(five);
        f.add(six);
        f.add(seven);
        f.add(eight);
        f.add(nine);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
                System.out.println("Window Closed");
            }
        });
        zero.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        point.addActionListener(this);
        sign.addActionListener(this);
        delete.addActionListener(this);
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        equal.addActionListener(this);
        sq.addActionListener(this);
        sqroot.addActionListener(this);
        d_w_1.addActionListener(this);
        C.addActionListener(this);
        CE.addActionListener(this);
        percentage.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == zero)
            {
                s = tf1.getText();
                s1 = s + 0;
                tf1.setText(s1);
            }
            if (e.getSource() == one)
            {
                s = tf1.getText();
                s1 = s + 1;
                tf1.setText(s1);
            }
            if (e.getSource() == two)
            {
                s = tf1.getText();
                s1 = s + 2;
                tf1.setText(s1);
            }
            if (e.getSource() == three)
            {
                s = tf1.getText();
                s1 = s + 3;
                tf1.setText(s1);
            }
            if (e.getSource() == four)
            {
                s = tf1.getText();
                s1 = s + 4;
                tf1.setText(s1);
            }
            if (e.getSource() == five)
            {
                s = tf1.getText();
                s1 = s + 5;
                tf1.setText(s1);
            }
            if (e.getSource() == six)
            {
                s = tf1.getText();
                s1 = s + 6;
                tf1.setText(s1);
            }
            if (e.getSource() == seven)
            {
                s = tf1.getText();
                s1 = s + 7;
                tf1.setText(s1);
            }
            if (e.getSource() == eight)
            {
                s = tf1.getText();
                s1 = s + 8;
                tf1.setText(s1);
            }
            if (e.getSource() == nine)
            {
                s = tf1.getText();
                s1 = s + 9;
                tf1.setText(s1);
            }
            if(e.getSource() == point)
            {
                if(set == 1)
                {
                    s = tf1.getText();
                    s1 = s.substring(0,s.length()-1);
                    tf1.setText(s1);
                    set = 0;
                }
                else
                {
                    s = tf1.getText();
                    s1 = s + ".";
                    tf1.setText(s1);
                    set = 1;
                }
            }
            if(e.getSource() == sign)
            {
                if(set==0) {
                    s = tf1.getText();
                    s1 = "-" + s;
                    tf1.setText(s1);
                    set = 1;
                }
                else
                {
                    if(set==1)
                    {
                        s = tf1.getText();
                        s1 = s.substring(1,s.length());
                        tf1.setText(s1);
                        set = 0;
                    }
                }
            }
            if(e.getSource() == delete)
            {
                s = tf1.getText();
                try
                {
                    s1 = s.substring(0,s.length()-1);
                }
                catch (StringIndexOutOfBoundsException f)
                {
                    return;
                }
                tf1.setText(s1);
            }
            if (e.getSource()==add) {
                if (set == 1) {
                    return;
                } else {
                    try {
                        num1 = Double.parseDouble(tf1.getText());
                    } catch (NumberFormatException f) {
                        tf1.setText("ERROR");
                        return;
                    }
                    s1 = tf1.getText();
                    tf1.setText("");
                    tf3.setText(s1 + " + ");
                    set = 1;
                    check = 1;
                }
            }
            if(e.getSource() == subtract) {
                if (set == 1) {
                    return;
                } else {
                    try {
                        num1 = Double.parseDouble(tf1.getText());
                    } catch (NumberFormatException f) {
                        tf1.setText("ERROR");
                        return;
                    }
                    s1 = tf1.getText();
                    tf1.setText("");
                    tf3.setText(s1 + " - ");
                    set = 1;
                    check = 2;
                }
            }
            if(e.getSource()==multiply) {
                if (set == 1) {
                    return;
                } else {
                    try {
                        num1 = Double.parseDouble(tf1.getText());
                    } catch (NumberFormatException f) {
                        tf1.setText("ERROR");
                        return;
                    }
                    s1 = tf1.getText();
                    tf1.setText("");
                    tf3.setText(s1 + " * ");
                    check = 3;
                    set = 1;
                }
            }
            if(e.getSource()==divide)
            {
                if(set==1)
                {
                    return;
                }
                else {
                    try {
                        num1 = Double.parseDouble(tf1.getText());
                    } catch (NumberFormatException f) {
                        tf1.setText("ERROR");
                        return;
                    }
                    s1 = tf1.getText();
                    tf1.setText("");
                    tf3.setText(s1 + " / ");
                    check = 4;
                    set = 1;
                }
            }
            if (e.getSource()==sq)
            {
                try
                {
                    num1 = Double.parseDouble(tf1.getText());
                    num1 = num1*num1;
                }
                catch (NumberFormatException f)
                {
                    tf1.setText("ERROR");
                    return;
                }
                s1 = tf1.getText();
                tf1.setText(String.valueOf(num1));
                tf3.setText(s1+"^2");
            }
            if (e.getSource()==sqroot)
            {
                try
                {
                    num1 = Double.parseDouble(tf1.getText());
                    r = Math.sqrt(num1);
                }
                catch (NumberFormatException f)
                {
                    tf1.setText("ERROR");
                    return;
                }
                s1 = tf1.getText();
                tf1.setText(String.valueOf(r));
                tf3.setText("√"+s1);
            }
            if (e.getSource()==d_w_1)
            {
                try
                {
                    num1 = Double.parseDouble(tf1.getText());
                    r = 1/num1;
                }
                catch (NumberFormatException f)
                {
                    tf1.setText("ERROR");
                    return;
                }
                s1 = tf1.getText();
                tf1.setText(String.valueOf(r));
                tf3.setText("1/"+s1);
                check = 7;
            }
            if (e.getSource()==percentage)
            {
                if(set ==1)
                {
                    return;
                }
                else {
                    try {
                        num1 = Double.parseDouble(tf1.getText());
                    } catch (NumberFormatException f) {
                        tf1.setText("ERROR");
                        return;
                    }
                    s1 = tf1.getText();
                    tf1.setText("");
                    tf3.setText(s1);
                    check = 5;
                    set = 1;
                }
            }
            if (e.getSource()==CE)
            {
                num1 = 0;
                num2 = 0;
                tf1.setText("");
                tf3.setText("");
            }
            if(e.getSource()==C)
            {
                tf1.setText("");
            }
            if (e.getSource() == equal)
            {
                try
                {
                    num2 = Double.parseDouble(tf1.getText());
                    tf3.setText(tf3.getText()+tf1.getText());
                }
                catch(Exception f) {
                    tf1.setText("Error");
                    return;
                }
                if (check == 0)
                {
                    num1 =Double.parseDouble(tf1.getText());
                    r=num1;
                }
                if (check == 1)
                {
                    r = num1 + num2;
                }
                if (check == 2)
                {
                    r = num1 - num2;
                }
                if (check == 3)
                {
                    r = num1 * num2;
                }
                if(check == 4)
                {
                    r = num1 / num2;
                }
                if(check == 5) {
                    r = num1 * (num2 / 100);
                }
                tf1.setText(String.valueOf(r));
                set = 0;
            }
        }
    public static void main(String[] args)
    {
        AWTA ob = new AWTA();
    }
}