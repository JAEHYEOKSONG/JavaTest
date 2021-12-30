package SwingTest.MainTest1;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

class ImagePanel extends JPanel {

    private Image image;

    public ImagePanel() {
        image = new ImageIcon("background1.jpg").getImage();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
    }

}


