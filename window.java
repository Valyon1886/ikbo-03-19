import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Scanner;

public class window extends JFrame
{
    public static BufferedImage myImage;
    public static Image img1;
    public static Image img2;
    public static Image img3;
    public JFrame jf;


    public window()
    {
        JFrame jf = new JFrame();
        /*
        for(int i = 0 ; i < pnl.length ;
            i++)
        {
            int r = (int) (Math.random() *
                    255); int b = (int)
                (Math.random() * 255); int g =
                (int) (Math.random() * 255);
            pnl[i] = new JPanel();
            pnl[i].setBackground(new
                    Color(r,g,b)); add(pnl[i]);
        }
        */
        jf.setSize(800,800);
        JPanel pnl = new JPanel(){
            @Override
            public void paint(Graphics g){
                super.paint(g);
                g.drawImage(img1, 200, 300, jf);
                g.drawImage(img2, 0, 0, jf);
                g.drawImage(img3, 700, 100, jf);
            }
        };
    jf.add(pnl);
    jf.setVisible(true);

/*
        pnl[4].setLayout(new BorderLayout());
        pnl[4].add(new
                JButton("one"),BorderLayout.WEST);
        pnl[4].add(new
                JButton("two"),BorderLayout.EAST);
        pnl[4].add(new
                JButton("three"),BorderLayout.SOUTH);
        pnl[4].add(new
                JButton("four"),BorderLayout.NORTH);
        pnl[4].add(new
                JButton("five"),BorderLayout.CENTER);
        pnl[10].setLayout(new
                FlowLayout()); pnl[10].add(new
            JButton("one"));
        pnl[10].add(new JButton("two"));
        pnl[10].add(new JButton("three"));
        pnl[10].add(new JButton("four"));
        pnl[10].add(new JButton("fve"));
        setSize(800,500);
        */

    }
    public static void main(String[]args) throws IOException
    {
        /*Scanner scanner = new Scanner("Введите путь к изображению (Подсказка: C://10.png, C://12.jpg, C://13.jpg): ");
        String s = scanner.nextLine();*/
        img1 = (Image) ImageIO.read(new File("C://12.jpg"));
        img2 = (Image) ImageIO.read(new File("C://13.jpg"));
        img3 = (Image) ImageIO.read(new File("C://10.png"));
        window w = new window();
    }

}
