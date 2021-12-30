package SwingTest.PanelMainTest;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


class MyFrame extends JFrame {

    MyPanel panel;

    public MyFrame() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("그리기 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        panel = new MyPanel();
    }

    private void setInitLayout() {
        setVisible(true);
        this.add(panel);
    }

    // 내부 클래스
    private class MyPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            System.out.println("test");
//			g.drawString("안녕하세요 JAVA", 10, 20);
//			g.drawLine(20, 30, 100, 100);
//			g.drawRect(100, 100, 150, 150);
            g.drawLine(300, 100, 200, 200);
            g.drawLine(300, 100, 400, 200);
            g.drawRect(200, 200, 200, 200);

        }

    }

}

