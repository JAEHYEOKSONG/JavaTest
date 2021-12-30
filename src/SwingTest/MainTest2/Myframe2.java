package SwingTest.MainTest2;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Myframe2 extends JFrame {

    BufferedImage backgroundImage;
    BufferedImage imageIcon;
    MyImagePanel imagePanel;

    // 내부 클래스로 선언
    private class MyImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, 500, 500, null);
            g.drawImage(imageIcon, 200, 200, 100, 100, null);
        }
    } // end of inner class

    public Myframe2() {
        iniData();
        setInitLayout();
    }

    private void iniData() {
        setTitle("이미지 백그라운드 연습");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            backgroundImage = ImageIO.read(new File("D:\\demo\\JavaTest\\src\\SwingTest\\MainTest2\\images\\background1.jpg"));
            imageIcon = ImageIO.read(new File("D:\\demo\\JavaTest\\src\\SwingTest\\MainTest2\\images\\among1.png"));
        } catch (IOException e) {
            System.out.println("파일이 없습니다.");
            System.exit(0);
        }

        imagePanel = new MyImagePanel();
    } // end of iniData

    private void setInitLayout() {
        setVisible(true);
        this.add(imagePanel);
    }

}


