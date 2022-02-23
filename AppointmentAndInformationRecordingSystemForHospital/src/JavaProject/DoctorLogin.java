package JavaProject;

import javax.swing.JOptionPane;

import JavaProject.DoctorHomePage;
import JavaProject.DoctorLogin;
import JavaProject.MainMenu;

public class DoctorLogin extends javax.swing.JFrame {



    public DoctorLogin() {
        initComponents();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanelNull = new javax.swing.JPanel();
        jTextFieldDoctorUsername = new javax.swing.JTextField();
        jPasswordFieldDoctorLogin = new javax.swing.JPasswordField();
        jCheckBoxDoctorLogin = new javax.swing.JCheckBox();
        jLabelDoctorUsername = new javax.swing.JLabel();
        jLabelDoctorPassword = new javax.swing.JLabel();
        jButtonDoctorCancel = new javax.swing.JButton();
        jButtonDoctorSignIn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelNull.setLayout(null);

        jTextFieldDoctorUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDoctorUsernameActionPerformed(evt);
            }
        });
        jPanelNull.add(jTextFieldDoctorUsername);
        jTextFieldDoctorUsername.setBounds(580, 300, 130, 30);

        jPasswordFieldDoctorLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldDoctorLoginActionPerformed(evt);
            }
        });
        jPanelNull.add(jPasswordFieldDoctorLogin);
        jPasswordFieldDoctorLogin.setBounds(580, 350, 130, 30);

        jCheckBoxDoctorLogin.setFont(new java.awt.Font("Century", 0, 11));
        jCheckBoxDoctorLogin.setText("Check to see password");
        jCheckBoxDoctorLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDoctorLoginActionPerformed(evt);
            }
        });
        jPanelNull.add(jCheckBoxDoctorLogin);
        jCheckBoxDoctorLogin.setBounds(570, 390, 150, 23);

        jLabelDoctorUsername.setFont(new java.awt.Font("Century", 0, 14));
        jLabelDoctorUsername.setText(" USERNAME : ");
        jPanelNull.add(jLabelDoctorUsername);
        jLabelDoctorUsername.setBounds(460, 300, 110, 30);

        jLabelDoctorPassword.setFont(new java.awt.Font("Century", 0, 14));
        jLabelDoctorPassword.setText(" PASSWORD : ");
        jPanelNull.add(jLabelDoctorPassword);
        jLabelDoctorPassword.setBounds(450, 350, 110, 20);

        jButtonDoctorCancel.setText("Cancel");
        jButtonDoctorCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDoctorCancelMouseClicked(evt);
            }
        });
        jButtonDoctorCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoctorCancelActionPerformed(evt);
            }
        });
        jPanelNull.add(jButtonDoctorCancel);
        jButtonDoctorCancel.setBounds(530, 440, 80, 30);

        jButtonDoctorSignIn.setText("Sign In");
        jButtonDoctorSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoctorSignInActionPerformed(evt);
            }
        });
        jPanelNull.add(jButtonDoctorSignIn);
        jButtonDoctorSignIn.setBounds(640, 440, 80, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\BUSE OZEL\\Desktop\\Images&Files\\background powerpoint medical stethoscope (1).JPG"));
        jLabel1.setText("jLabel1");
        jPanelNull.add(jLabel1);
        jLabel1.setBounds(-70, -20, 830, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelNull, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelNull, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }

    private void jButtonDoctorCancelMouseClicked(java.awt.event.MouseEvent evt) {

        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        menu.pack();
        menu.setLocationRelativeTo(null);
        menu.setDefaultCloseOperation(MainMenu.EXIT_ON_CLOSE);
        this.dispose();
    }

    private void jButtonDoctorSignInActionPerformed(java.awt.event.ActionEvent evt) {
        String userName= "Doctor";
        String password = "1234";
        if (jTextFieldDoctorUsername.getText().equals(userName)&&jPasswordFieldDoctorLogin.getText().equals(password)){
            JOptionPane.showMessageDialog(null,"Signed In...");
            DoctorHomePage doctorHomePage = new DoctorHomePage();
            doctorHomePage.setVisible(true);
            doctorHomePage.pack();
            doctorHomePage.setLocationRelativeTo(null);
            doctorHomePage.setDefaultCloseOperation(MainMenu.EXIT_ON_CLOSE);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null,"Failed to sign in");
        }
    }

    private void jCheckBoxDoctorLoginActionPerformed(java.awt.event.ActionEvent evt) {

        if(jCheckBoxDoctorLogin.isSelected()){
            jPasswordFieldDoctorLogin.setEchoChar((char)0);
        }
        else{
            jPasswordFieldDoctorLogin.setEchoChar('*');
        }

    }

    private void jButtonDoctorCancelActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jPasswordFieldDoctorLoginActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jTextFieldDoctorUsernameActionPerformed(java.awt.event.ActionEvent evt) {

    }


    public static void main(String args[]) {


        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorLogin().setVisible(true);
            }
        });
    }


    private javax.swing.JButton jButtonDoctorCancel;
    private javax.swing.JButton jButtonDoctorSignIn;
    private javax.swing.JCheckBox jCheckBoxDoctorLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDoctorPassword;
    private javax.swing.JLabel jLabelDoctorUsername;
    private javax.swing.JPanel jPanelNull;
    private javax.swing.JPasswordField jPasswordFieldDoctorLogin;
    private javax.swing.JTextField jTextFieldDoctorUsername;

}


