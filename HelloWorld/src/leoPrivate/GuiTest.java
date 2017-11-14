package leoPrivate;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GuiTest {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    JPanel panel1;

    public GuiTest() {
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Button1 检测到单击事件");
            }
        });
    }
}
