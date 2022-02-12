package SwingTest;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Mycomponents extends JFrame {

    private JPanel panel;
    private JButton button;
    private JLabel label;
    JTextField textField;
    private JPasswordField pwField;
    private JCheckBox checkBox;

    public Mycomponents() {
        initData();
        setIniLayout();
    }

    // 객체를 생성하는 메서드
    private void initData() {
        this.setTitle("컴포넌트 연습");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 800);
        panel = new JPanel();
        button = new JButton("button1");
        label = new JLabel("Hollo 안녕하세요");
        textField = new JTextField("가나다", 20);
        pwField = new JPasswordField(20);
        checkBox = new JCheckBox("box", false);
    }

    private void setIniLayout() {
        setVisible(true);
        this.add(panel);

        panel.add(button);
        panel.add(label);
        panel.add(textField);
        panel.add(pwField);
        panel.add(checkBox);

        panel.setBackground(Color.YELLOW);
    }

}

