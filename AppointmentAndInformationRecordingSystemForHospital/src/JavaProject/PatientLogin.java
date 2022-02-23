package JavaProject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;



    public class PatientLogin extends javax.swing.JFrame implements Serializable {

        public static final long serialVersionUID =2L;


        String fullName;
        String patientID;
        String age;
        String disturbance;
        String phoneNumber;
        String email;

        ArrayList<Patients> tempPatients = new ArrayList<>();

        public PatientLogin() {
            initComponents();
            addRowToJTable();

        }

        public ArrayList listUsers(){

            ArrayList<doctors> doctorsInformation = new ArrayList<doctors>();


            doctors d1= new doctors("Ezgi", "Özgün", "Female", 32, "526 402 32");
            doctors d2= new doctors("Arda", "Durmuþ", "Male", 45, "526 324 89");
            doctors d3= new doctors("Deniz", "Sönmez", "Male", 54, "526 897 55");

            doctorsInformation.add(d1);
            doctorsInformation.add(d2);
            doctorsInformation.add(d3);


            return doctorsInformation;

        }

        public void addRowToJTable(){
            DefaultTableModel model = (DefaultTableModel) jTableDoctors.getModel();
            ArrayList<doctors> doctorsInformation  = listUsers();
            Object rowData[] = new Object[5];

            for(int i=0;i<doctorsInformation.size();i++){
                rowData[0]=doctorsInformation.get(i).getFirstName();
                rowData[1]=doctorsInformation.get(i).getLastName();
                rowData[2]=doctorsInformation.get(i).getGender1();
                rowData[3]=doctorsInformation.get(i).getAge1();
                rowData[4]=doctorsInformation.get(i).getContactNumber();

                model.addRow(rowData);
            }
        }


        @SuppressWarnings("unchecked")

        private void initComponents() {

            layeredPane = new javax.swing.JPanel();
            jPanelBackground = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jPanelAppointment = new javax.swing.JPanel();
            jTextFieldNameLastName = new javax.swing.JTextField();
            jLabelPatientName = new javax.swing.JLabel();
            jLabelAge = new javax.swing.JLabel();
            jTextFieldID = new javax.swing.JTextField();
            jTextFieldAge = new javax.swing.JTextField();
            jLabelID = new javax.swing.JLabel();
            jLabelPhoneNumber = new javax.swing.JLabel();
            jTextFieldPhoneNumber = new javax.swing.JTextField();
            jTextFieldEmail = new javax.swing.JTextField();
            jLabelEmail = new javax.swing.JLabel();
            jTextFieldDisturbance = new javax.swing.JTextField();
            jLabelDisturbance = new javax.swing.JLabel();
            jButtonCreate = new javax.swing.JButton();
            jPanelInfo = new javax.swing.JPanel();
            jPanel3 = new javax.swing.JPanel();
            jButtonINFODoc = new javax.swing.JButton();
            appointment = new javax.swing.JButton();
            jButtonCancel = new javax.swing.JButton();
            jLabelappointment = new javax.swing.JLabel();
            jLabelINFO = new javax.swing.JLabel();
            jTableDoctors = new javax.swing.JTable();
            jScrollPane1 = new javax.swing.JScrollPane();
            jLabel = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            layeredPane.setLayout(new java.awt.CardLayout());

            jPanelBackground.setLayout(null);

            jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\BUSE OZEL\\Desktop\\Images&Files\\AdobeStock_177452394-1024x682 (1).jpeg"));
            jLabel1.setText("jLabel1");
            jPanelBackground.add(jLabel1);
            jLabel1.setBounds(-140, -220, 930, 910);

            layeredPane.add(jPanelBackground, "card4");

            jTextFieldNameLastName.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextFieldNameLastNameActionPerformed(evt);
                }
            });

            jLabelPatientName.setText("NAME and LAST NAME:");

            jLabelAge.setText("AGE:");

            jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextFieldIDActionPerformed(evt);
                }
            });

            jTextFieldAge.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextFieldAgeActionPerformed(evt);
                }
            });

            jLabelID.setText("ID:");

            jLabelPhoneNumber.setText("PHONE NUMBER: ");

            jLabelEmail.setText("EMAIL:");

            jLabelDisturbance.setText("DISTURBANCE:");

            jButtonCreate.setText("CREATE");
            jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    try {
                        jButtonCreateActionPerformed(evt);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

            javax.swing.GroupLayout jPanelAppointmentLayout = new javax.swing.GroupLayout(jPanelAppointment);
            jPanelAppointment.setLayout(jPanelAppointmentLayout);
            jPanelAppointmentLayout.setHorizontalGroup(
                    jPanelAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAppointmentLayout.createSequentialGroup()
                                    .addContainerGap(54, Short.MAX_VALUE)
                                    .addGroup(jPanelAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelAge, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelEmail)
                                            .addGroup(jPanelAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabelDisturbance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabelPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabelPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanelAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldNameLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                            .addComponent(jTextFieldAge, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                            .addComponent(jTextFieldID, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                            .addComponent(jTextFieldPhoneNumber)
                                            .addComponent(jTextFieldEmail)
                                            .addComponent(jTextFieldDisturbance))
                                    .addContainerGap(155, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAppointmentLayout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(62, 62, 62))
            );
            jPanelAppointmentLayout.setVerticalGroup(
                    jPanelAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAppointmentLayout.createSequentialGroup()
                                    .addGap(61, 61, 61)
                                    .addGroup(jPanelAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldNameLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                            .addComponent(jLabelPatientName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanelAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanelAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelAge, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanelAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabelPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanelAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanelAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabelDisturbance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldDisturbance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(44, 44, 44)
                                    .addComponent(jButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(145, Short.MAX_VALUE))
            );

            layeredPane.add(jPanelAppointment, "card3");

            jTableDoctors.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {

                    },
                    new String [] {
                            "First Name", "Last Name", "Gender", "Age", "Contact"
                    }
            ));
            jScrollPane1.setViewportView(jTableDoctors);

            jLabel.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
            jLabel.setText("Our Doctors' Information:");

            javax.swing.GroupLayout jPanelInfoLayout = new javax.swing.GroupLayout(jPanelInfo);
            jPanelInfo.setLayout(jPanelInfoLayout);
            jPanelInfoLayout.setHorizontalGroup(
                    jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInfoLayout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelInfoLayout.createSequentialGroup()
                                                    .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanelInfoLayout.createSequentialGroup()
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                                                    .addGap(18, 18, 18))))
            );
            jPanelInfoLayout.setVerticalGroup(
                    jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInfoLayout.createSequentialGroup()
                                    .addGap(82, 82, 82)
                                    .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(220, Short.MAX_VALUE))
            );

            layeredPane.add(jPanelInfo, "card2");

            jPanel3.setBackground(new java.awt.Color(153, 204, 255));

            jButtonINFODoc.setFont(new java.awt.Font("Century", 0, 11));
            jButtonINFODoc.setText("Click Here");
            jButtonINFODoc.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonINFODocActionPerformed(evt);
                }
            });

            appointment.setFont(new java.awt.Font("Century", 0, 11));
            appointment.setText("Click Here");
            appointment.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    appointmentActionPerformed(evt);
                }
            });

            jButtonCancel.setBackground(new java.awt.Color(153, 204, 255));
            jButtonCancel.setFont(new java.awt.Font("Century", 0, 11));
            jButtonCancel.setText("Cancel");
            jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonCancelActionPerformed(evt);
                }
            });

            jLabelappointment.setFont(new java.awt.Font("Century", 0, 12));
            jLabelappointment.setText("To make an appointment:");

            jLabelINFO.setFont(new java.awt.Font("Century", 0, 12));
            jLabelINFO.setText("To see doctor's information:");

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                                    .addGap(51, 51, 51)
                                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(jButtonCancel)
                                                                            .addComponent(jButtonINFODoc, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                                    .addContainerGap()
                                                                    .addComponent(jLabelappointment, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGap(0, 11, Short.MAX_VALUE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(jLabelINFO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addContainerGap())
            );
            jPanel3Layout.setVerticalGroup(
                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(89, 89, 89)
                                    .addComponent(jLabelINFO, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButtonINFODoc)
                                    .addGap(58, 58, 58)
                                    .addComponent(jLabelappointment, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(appointment)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonCancel)
                                    .addGap(47, 47, 47))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(layeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(layeredPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addContainerGap())
            );

            pack();
        }

        private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {

            MainMenu menu = new MainMenu();
            menu.setVisible(true);
            menu.pack();
            menu.setLocationRelativeTo(null);
            menu.setDefaultCloseOperation(MainMenu.EXIT_ON_CLOSE);
            this.dispose();
        }


        private void jTextFieldNameLastNameActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void appointmentActionPerformed(java.awt.event.ActionEvent evt) {

            layeredPane.removeAll();
            layeredPane.add(jPanelAppointment);
            layeredPane.repaint();
            layeredPane.revalidate();


        }

        private void jButtonINFODocActionPerformed(java.awt.event.ActionEvent evt) {

            layeredPane.removeAll();
            layeredPane.add(jPanelInfo);
            layeredPane.repaint();
            layeredPane.revalidate();
        }

        private void jTextFieldAgeActionPerformed(java.awt.event.ActionEvent evt) {


        }

        private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {


        }

        public void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {


            Patients patients =new Patients();

            fullName = jTextFieldNameLastName.getText();
            patients.setFullName2(fullName);

            patientID=jTextFieldID.getText();

            try {
                int i;
                i = Integer.parseInt(patientID.trim());
                patients.setPatientID(i);
            } catch(NumberFormatException nfe){
                System.out.println("NumberFormatException: " + nfe.getMessage());
            }

            age=jTextFieldAge.getText();
            try{
                int i;
                i= Integer.parseInt(age.trim());
                patients.setAge3(i);
            }catch(NumberFormatException nfe){
                System.out.println("NumberFormatException: " + nfe.getMessage());
            }

            phoneNumber=jTextFieldPhoneNumber.getText();
            try{
                int i;
                i=Integer.parseInt(phoneNumber.trim());
                patients.setPhoneNumber(i);
            } catch(NumberFormatException nfe){
                System.out.println("NumberFormatException: " + nfe.getMessage());
            }

            email=jTextFieldEmail.getText();
            patients.setEmail(email);

            disturbance=jTextFieldDisturbance.getText();
            patients.setDisturbance(disturbance);

            tempPatients.add(patients);

            try
            {
                FileOutputStream fos = new FileOutputStream("patients.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(tempPatients);
                oos.close();
                fos.close();
            }
            catch (IOException ioe)
            {
                ioe.printStackTrace();
            }



            JOptionPane.showMessageDialog(null,"Thank you for your patience.");

            jTextFieldNameLastName.setText("");
            jTextFieldID.setText("");
            jTextFieldAge.setText("");
            jTextFieldPhoneNumber.setText("");
            jTextFieldEmail.setText("");
            jTextFieldDisturbance.setText("");


        }

        public ArrayList<Patients> getTempPatients() {
            return tempPatients;
        }




        public static void main(String args[]) throws Exception {


            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(PatientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(PatientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(PatientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(PatientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }


            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new PatientLogin().setVisible(true);
                }
            });

        }


        private javax.swing.JButton appointment;
        private javax.swing.JButton jButtonCancel;
        private javax.swing.JButton jButtonCreate;
        private javax.swing.JButton jButtonINFODoc;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabelAge;
        private javax.swing.JLabel jLabelDisturbance;
        private javax.swing.JLabel jLabelEmail;
        private javax.swing.JLabel jLabelID;
        private javax.swing.JLabel jLabelINFO;
        private javax.swing.JLabel jLabelPatientName;
        private javax.swing.JLabel jLabelPhoneNumber;
        private javax.swing.JLabel jLabelappointment;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanelAppointment;
        private javax.swing.JPanel jPanelBackground;
        private javax.swing.JPanel jPanelInfo;
        private javax.swing.JTextField jTextFieldAge;
        private javax.swing.JTextField jTextFieldDisturbance;
        private javax.swing.JTextField jTextFieldEmail;
        private javax.swing.JTextField jTextFieldID;
        private javax.swing.JTextField jTextFieldNameLastName;
        private javax.swing.JTextField jTextFieldPhoneNumber;
        private javax.swing.JPanel layeredPane;
        private javax.swing.JTable jTableDoctors;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel jLabel;

    }




