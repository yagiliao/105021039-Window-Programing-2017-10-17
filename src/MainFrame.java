import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JTextField jtf = new JTextField();
    private JButton jbtn[] = new JButton[9];
    private JPanel jpn = new JPanel(new GridLayout(3, 3));
    Container cp;
    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    private int frmW = 400, frmH = 500, screenW, screenH;

    public MainFrame() {
        initComp();
    }

    private void initComp() {
        screenW = dim.width;
        screenH = dim.height;
        this.setBounds(screenW / 2 - frmW / 2, screenH / 2 - frmH / 2, frmW, frmH);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(5, 5));
        for (int i = 0; i < 9; i++) {
            jbtn[i] = new JButton(Integer.toString(i));
            jpn.add(jbtn[i]);
            jbtn[i].addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton tmpButton = (JButton) e.getSource();
                    jtf.setText(jtf.getText() + tmpButton.getText());
                }
            });
        }
        cp.add(jtf , BorderLayout.NORTH);
        cp.add(jpn ,BorderLayout.CENTER);
    }
}
