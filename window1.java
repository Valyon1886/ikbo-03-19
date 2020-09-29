package Pack1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.lang.Math.*;
import java.util.Scanner;


public class window extends JFrame {
    JButton but1 = new JButton("Сделать предположение");
    JTextField jta = new JTextField(10);
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    int a1 = 0;
    int b1 = (int)(Math.random()*20);;
    static String comp1 = "Загаданное число больше";
    static String comp2 ="Загаданное число меньше";
    static String sit1 ="Угадали))";
    static String sit2 ="Чтож, в следующий раз повезет...";
    int LS = 3;
    String win = "";
    void cheaker(int a, int b){
        if(a>b){
            win = comp2;
        }
        if(a<b){
            win = comp1;
        }
        if(a==b){
            win = sit1;
        }
    }
    public window() {
        super("Угадайка");
        setLayout(null);
        but1.setBounds(100,20,150,20);


        JLabel l1 = new JLabel("Попробуйте отгадать число от 0 до 20");
        JLabel l2 = new JLabel("У вас "+ LS+ " попыток");

        JLabel l3 = new JLabel(win);

        but1.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {
                LS = LS-1;
                if(LS<0){ setVisible(false);
                    dispose();}
                a1 =Integer.parseInt(jta.getText());
                cheaker(a1, b1);
                l1.setText("Попробуйте отгадать число от 0 до 20");
                l2.setText("У вас "+ LS+ " попыток");
                if((LS<1)&&(win!=sit1)){
                    l3.setText(sit2);
                }
                else
                    l3.setText(win);
            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });


        JPanel[] buttonsPanel = new JPanel[5];

        setLayout(new GridLayout(5,1));
        for(int i = 0 ; i < buttonsPanel.length ; i++)
        {
            buttonsPanel[i] = new JPanel();
            add(buttonsPanel[i]);
        }
        buttonsPanel[0].setLayout(new BorderLayout());
        buttonsPanel[0].add(l1,BorderLayout.CENTER);
        buttonsPanel[1].setLayout(new BorderLayout());
        buttonsPanel[1].add(l2,BorderLayout.CENTER);
        buttonsPanel[2].setLayout(new BorderLayout());
        buttonsPanel[2].add(l3,BorderLayout.CENTER);
        buttonsPanel[3].setLayout(new BorderLayout());
        buttonsPanel[3].add(jta, BorderLayout.CENTER);
        buttonsPanel[4].setLayout(new BorderLayout());
        buttonsPanel[4].add(but1, BorderLayout.CENTER);
       // buttonsPanel[3].add(but2, BorderLayout.EAST);


        setSize(500,500);
        System.out.print(b1);

    }
    public static void main(String[]args){
        window fo = new window();
        fo.setVisible(true);
    }
}


