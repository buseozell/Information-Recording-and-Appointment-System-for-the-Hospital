package JavaProject;

import javax.swing.JOptionPane;

import JavaProject.MainMenu;
import JavaProject.StaffHomePage;
import JavaProject.StaffLogin;


public class StaffLogin extends javax.swing.JFrame {


    public StaffLogin() {
        initComponents();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanelStaffNullBackground = new javax.swing.JPanel();
        jLabelStaffUsername = new javax.swing.JLabel();
        jLabelStaffPassword = new javax.swing.JLabel();
        jButtonStaffCancel = new javax.swing.JButton();
        jButtonStaffSignIn = new javax.swing.JButton();
        jCheckBoxStaff = new javax.swing.JCheckBox();
        jPasswordFieldStaffPassword = new javax.swing.JPasswordField();
        jTextFieldStaffUsername = new javax.swing.JTextField();
        jLabeStafflBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelStaffNullBackground.setLayout(null);

        jLabelStaffUsername.setFont(new java.awt.Font("Century", 0, 14));
        jLabelStaffUsername.setText(" Username :");
        jPanelStaffNullBackground.add(jLabelStaffUsername);
        jLabelStaffUsername.setBounds(50, 60, 80, 17);

        jLabelStaffPassword.setFont(new java.awt.Font("Century", 0, 14));
        jLabelStaffPassword.setText(" Password :");
        jPanelStaffNullBackground.add(jLabelStaffPassword);
        jLabelStaffPassword.setBounds(50, 100, 80, 17);

        jButtonStaffCancel.setBackground(new java.awt.Color(153, 204, 255));
        jButtonStaffCancel.setFont(new java.awt.Font("Century", 0, 11));
        jButtonStaffCancel.setText("Cancel");
        jButtonStaffCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonStaffCancelMouseClicked(evt);
            }
        });
        jButtonStaffCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStaffCancelActionPerformed(evt);
            }
        });
        jPanelStaffNullBackground.add(jButtonStaffCancel);
        jButtonStaffCancel.setBounds(150, 160, 70, 23);

        jButtonStaffSignIn.setBackground(new java.awt.Color(153, 204, 255));
        jButtonStaffSignIn.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        jButtonStaffSignIn.setText("Sign In");
        jButtonStaffSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStaffSignInActionPerformed(evt);
            }
        });
        jPanelStaffNullBackground.add(jButtonStaffSignIn);
        jButtonStaffSignIn.setBounds(60, 160, 69, 23);

        jCheckBoxStaff.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        jCheckBoxStaff.setText("Check to see Password");
        jCheckBoxStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxStaffActionPerformed(evt);
            }
        });
        jPanelStaffNullBackground.add(jCheckBoxStaff);
        jCheckBoxStaff.setBounds(310, 100, 150, 23);
        jPanelStaffNullBackground.add(jPasswordFieldStaffPassword);
        jPasswordFieldStaffPassword.setBounds(150, 100, 140, 30);
        jPanelStaffNullBackground.add(jTextFieldStaffUsername);
        jTextFieldStaffUsername.setBounds(150, 60, 140, 30);

        jLabeStafflBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\BUSE OZEL\\Desktop\\Images&Files\\modern-blue-medical-background_1055-6880 (1).jpg"));
        jPanelStaffNullBackground.add(jLabeStafflBackground);
        jLabeStafflBackground.setBounds(0, -10, 630, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelStaffNullBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelStaffNullBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
        );

        pack();
    }

    private void jButtonStaffCancelMouseClicked(java.awt.event.MouseEvent evt) {
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        menu.pack();
        menu.setLocationRelativeTo(null);
        menu.setDefaultCloseOperation(MainMenu.EXIT_ON_CLOSE);
        this.dispose();
    }

    private void jCheckBoxStaffActionPerformed(java.awt.event.ActionEvent evt) {

        if(jCheckBoxStaff.isSelected()){
            jPasswordFieldStaffPassword.setEchoChar((char)0);
        }
        else{
            jPasswordFieldStaffPassword.setEchoChar('*');
        }

    }

    private void jButtonStaffSignInActionPerformed(java.awt.event.ActionEvent evt) {

        String userName= "Staff";
        String password = "12345";
        if (jTextFieldStaffUsername.getText().equals(userName)&&jPasswordFieldStaffPassword.getText().equals(password)){
            JOptionPane.showMessageDialog(null,"Signed In...");
            StaffHomePage staffHomePage = new StaffHomePage();
            staffHomePage.setVisible(true);
            staffHomePage.pack();
            staffHomePage.setLocationRelativeTo(null);
            staffHomePage.setDefaultCloseOperation(MainMenu.EXIT_ON_CLOSE);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null,"Failed to sign in");
        }
    }

    private void jButtonStaffCancelActionPerformed(java.awt.event.ActionEvent evt) {

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
            java.util.logging.Logger.getLogger(StaffLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffLogin().setVisible(true);
            }
        });
    }


    private javax.swing.JButton jButtonStaffCancel;
    private javax.swing.JButton jButtonStaffSignIn;
    private javax.swing.JCheckBox jCheckBoxStaff;
    private javax.swing.JLabel jLabeStafflBackground;
    private javax.swing.JLabel jLabelStaffPassword;
    private javax.swing.JLabel jLabelStaffUsername;
    private javax.swing.JPanel jPanelStaffNullBackground;
    private javax.swing.JPasswordField jPasswordFieldStaffPassword;
    private javax.swing.JTextField jTextFieldStaffUsername;

}


