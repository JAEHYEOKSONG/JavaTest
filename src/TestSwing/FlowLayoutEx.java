package TestSwing;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class FlowLayoutEx extends JFrame {
        JButton[] buttons = new JButton[7];
        public FlowLayoutEx() {
            initData();
            setInitLayout();
        }
        // 메서드
        private void initData() {
            this.setTitle("Flow Layout");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//종료시 윈도우까지 깔끔하게 닫음.
            this.setSize(500, 500);//창사이즈 구하고

            for (int i = 0; i < buttons.length; i++) {
                buttons[i] = new JButton("button" + i);
            }
        }
        private void setInitLayout() {
            this.setVisible(true); //창을 화면에 나타낼것인가.
            // 배치 관리자 -> 메서드 안에서 바로 생성
            this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
            for (int i = 0; i < buttons.length; i++) {
                this.add(buttons[i]);
            }
        }
    }

