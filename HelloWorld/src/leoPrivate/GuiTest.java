package leoPrivate;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GuiTest {

    JPanel jpanelMain;
    private JTextField textField1;
    private JTextField textField3;
    private JButton 登录Button;

    public GuiTest() {
        登录Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("单击登录按键!");
            }
        });
    }
}
