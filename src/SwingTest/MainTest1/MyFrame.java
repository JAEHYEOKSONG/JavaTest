package SwingTest.MainTest1;

import SwingTest.MainTest1.ImagePanel;

import javax.swing.JFrame;



class MyFrame extends JFrame {

    ImagePanel imagePanel;

    public MyFrame() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("JPanel 에 이미지 넣기");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        imagePanel = new ImagePanel();
    }

    private void setInitLayout() {
        setVisible(true);
        add(imagePanel);
    }

}


