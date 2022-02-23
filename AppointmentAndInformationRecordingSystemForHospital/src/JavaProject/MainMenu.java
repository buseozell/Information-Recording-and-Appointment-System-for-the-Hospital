package JavaProject;

import JavaProject.DoctorLogin;
import JavaProject.MainMenu;
import JavaProject.PatientLogin;
import JavaProject.StaffLogin;

public class MainMenu extends javax.swing.JFrame {


    public MainMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonStaffLoginPageUp = new javax.swing.JButton();
        jButtonDoctorLoginPageUp = new javax.swing.JButton();
        jButtonPatientLoginPageUp = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel1.setText("WELCOME TO ***** HOSPITAL");

        jLabel2.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel2.setText("Please choose who you want to login as:");

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        jButtonStaffLoginPageUp.setBackground(new java.awt.Color(153, 204, 255));
        jButtonStaffLoginPageUp.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        jButtonStaffLoginPageUp.setText("STAFF");
        jButtonStaffLoginPageUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonStaffLoginPageUpMouseClicked(evt);
            }
        });
        jButtonStaffLoginPageUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStaffLoginPageUpActionPerformed(evt);
            }
        });

        jButtonDoctorLoginPageUp.setBackground(new java.awt.Color(153, 204, 255));
        jButtonDoctorLoginPageUp.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        jButtonDoctorLoginPageUp.setText("DOCTOR");
        jButtonDoctorLoginPageUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDoctorLoginPageUpMouseClicked(evt);
            }
        });
        jButtonDoctorLoginPageUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoctorLoginPageUpActionPerformed(evt);
            }
        });

        jButtonPatientLoginPageUp.setBackground(new java.awt.Color(153, 204, 255));
        jButtonPatientLoginPageUp.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        jButtonPatientLoginPageUp.setText("PATIENT");
        jButtonPatientLoginPageUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPatientLoginPageUpMouseClicked(evt);
            }
        });
        jButtonPatientLoginPageUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPatientLoginPageUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(216, 216, 216)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonDoctorLoginPageUp, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonStaffLoginPageUp, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonPatientLoginPageUp))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jButtonStaffLoginPageUp)
                                .addGap(40, 40, 40)
                                .addComponent(jButtonPatientLoginPageUp)
                                .addGap(42, 42, 42)
                                .addComponent(jButtonDoctorLoginPageUp)
                                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(38, Short.MAX_VALUE))
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void jButtonDoctorLoginPageUpMouseClicked(java.awt.event.MouseEvent evt) {
        DoctorLogin doctor = new DoctorLogin();
        doctor.setVisible(true);
        doctor.pack();
        doctor.setLocationRelativeTo(null);
        doctor.setDefaultCloseOperation(MainMenu.EXIT_ON_CLOSE);
        this.dispose();
    }

    private void jButtonDoctorLoginPageUpActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButtonPatientLoginPageUpMouseClicked(java.awt.event.MouseEvent evt) {
        PatientLogin patient = new PatientLogin();
        patient.setVisible(true);
        patient.pack();
        patient.setLocationRelativeTo(null);
        patient.setDefaultCloseOperation(MainMenu.EXIT_ON_CLOSE);
        this.dispose();

    }

    private void jButtonPatientLoginPageUpActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jButtonStaffLoginPageUpActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jButtonStaffLoginPageUpMouseClicked(java.awt.event.MouseEvent evt) {
        StaffLogin staff = new StaffLogin();
        staff.setVisible(true);
        staff.pack();
        staff.setLocationRelativeTo(null);
        staff.setDefaultCloseOperation(MainMenu.EXIT_ON_CLOSE);
        this.dispose();
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }


    private javax.swing.JButton jButtonDoctorLoginPageUp;
    private javax.swing.JButton jButtonPatientLoginPageUp;
    private javax.swing.JButton jButtonStaffLoginPageUp;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;

}



