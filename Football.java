package Pack1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class Football extends JFrame {
    JButton but1 = new JButton("AC Milan");;
    JButton but2 = new JButton("Real Madrid");;
    int a1 = 0;
    int b1 = 0;
    static String comp1 = "AC Milan";
    static String comp2 ="Real Madrid";
    static String sit1 ="DRAW";
    static String sit2 ="N/A";
    String LS = "N/A";
    String win = "DRAW";
    void cheaker(int a, int b){
        if(a>b){
            win = comp1;
        }
        if(a<b){
            win = comp2;
        }
        if(a==b){
            win = sit1;
        }
    }
    public Football() {
        super("Таблица результатов матчей между командами Милан и Мадрид");
        setLayout(null);
        but1.setBounds(100,20,150,20);
        but2.setBounds(250,20,150,20);
        JLabel l1 = new JLabel("Result: "+ a1 +" X "+b1);
        JLabel l2 = new JLabel("Last Scorer: "+ LS);
        JLabel l3 = new JLabel("Winner: "+ win);

        but1.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {
                a1 = a1+1;
                LS = comp1;
                cheaker(a1, b1);
                l1.setText("Result: "+ a1 +" X "+b1);
                l2.setText("Last Scorer: "+ LS);
                l3.setText("Winner: "+ win);
            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
        but2.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {
                b1 = b1+1;
                LS = comp2;
                cheaker(a1, b1);
                l1.setText("Result: "+ a1 +" X "+b1);
                l2.setText("Last Scorer: "+ LS);
                l3.setText("Winner: "+ win);

            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
        JPanel[] buttonsPanel = new JPanel[4];

        setLayout(new GridLayout(4,1));
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
        buttonsPanel[3].add(but1, BorderLayout.WEST);
        buttonsPanel[3].add(but2, BorderLayout.EAST);


        setSize(500,500);


    }
    public static void main(String[]args){
        Football fo = new Football();
        fo.setVisible(true);
    }
}
