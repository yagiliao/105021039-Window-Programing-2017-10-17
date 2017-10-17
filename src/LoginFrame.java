import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame{
    private JLabel jlbID = new JLabel("ID:");
    private JLabel jlbPW = new JLabel("Password:");
    private JTextField jtfID = new JTextField();
    private JPasswordField jtfPW = new JPasswordField();
    private JButton jbExit = new JButton("Exit");
    private JButton jbLogin = new JButton("Login");
    private Container cp;
    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    private int frmW=300, frmH=150, screenW, screenH;
    public LoginFrame(){
        InitComp();
    }
    private void InitComp(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        screenW=dim.width;
        screenH=dim.height;
        this.setBounds(screenW/2-frmW/2,screenH/2-frmH/2,frmW,frmH);
        cp=this.getContentPane();
        cp.setLayout(new GridLayout(3,2,5,6));
        jlbID.setHorizontalAlignment(JLabel.RIGHT);
        jlbPW.setHorizontalAlignment(JLabel.RIGHT);
        cp.add(jlbID);
        cp.add(jtfID);
        cp.add(jlbPW);
        cp.add(jtfPW);
        cp.add(jbExit);

        jbExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        cp.add(jbLogin);

        jbLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(jtfID.getText().equals("h304") && (new String(jtfPW.getPassword())).equals("23323456")){
                    MainFrame mf=new MainFrame();
                    mf.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(LoginFrame.this,"Error");
                }
            }
        });
    }
}
