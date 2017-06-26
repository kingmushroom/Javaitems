package picture;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

class DrawPanel extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.blue);

        for (int i = 0; i <= 1000; i++) {

            Dimension size = getSize();
            Insets insets = getInsets();

            int w = size.width - insets.left - insets.right;
            int h = size.height - insets.top - insets.bottom;

            Random r = new Random();
            int x = Math.abs(r.nextInt()) % w;
            int y = Math.abs(r.nextInt()) % h;
            g2d.drawLine(x, y, x, y);
        }
        Graphics2D g2d2 = (Graphics2D) g;

        g2d2.setColor(Color.red);
        
        for (int i = 0; i <= 500; i++) {

        
         //  g2d2.drawRect(20+(i*2), 20, 1+i, 1+(2*i));
        }
        g2d2.setColor(Color.cyan);
        for (int i = 500; i >= 0; i--) {

            
          // g2d2.drawRect(500-(i*2), 500-(i*2), 1+(i*2), 1+i);
        }
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}

public class PointsEx extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PointsEx() {
        
        initUI();
    }

    private void initUI() {

        DrawPanel dpnl = new DrawPanel();
        add(dpnl);

        setSize(350, 250);
        setTitle("Points");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            PointsEx ex = new PointsEx();
            ex.setVisible(true);
        });
    }
}