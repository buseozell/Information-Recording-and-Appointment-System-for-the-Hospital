package JavaProject;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class DoctorHomePage extends javax.swing.JFrame implements Serializable{

    public static final long serialVersionUID =-3745752517293934724L;


    public DoctorHomePage() {
        initComponents();
        addRowToJTable();
    }

    ArrayList<Patients> tempPatients = new ArrayList<>();

//tempPatients serialized olduktan sonra table'a aktarmak istemi�tik ama yapamad�k. Onun yerine override methodu printInfo çalışıyor.

    public void addRowToJTable(){

        DefaultTableModel model = (DefaultTableModel) jTablePat.getModel();

        Object rowData[] = new Object[6];

        for(int i =0;i<tempPatients.size();i++){
            rowData[0]=tempPatients.get(i).getPatientID();
            rowData[1]=tempPatients.get(i).getFullName2();
            rowData[2]=tempPatients.get(i).getAge3();
            rowData[3]=tempPatients.get(i).getDisturbance();
            rowData[4]=tempPatients.get(i).getPhoneNumber();
            rowData[5]=tempPatients.get(i).getEmail();

            model.addRow(rowData);

        }

    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        layeredPane = new javax.swing.JPanel();
        jPanelBackground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();
        jPanelNewPatient = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel = new javax.swing.JPanel();
        jButtonSeeProgram = new javax.swing.JButton();
        jButtonSee = new javax.swing.JButton();
        jButtonAddPatient = new javax.swing.JButton();
        jLabelChangePatient = new javax.swing.JLabel();
        jLabelAddNewPatient = new javax.swing.JLabel();
        jLabelDoctorProgram = new javax.swing.JLabel();
        jButtonCancel = new javax.swing.JButton();
        jTablePat = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        layeredPane.setLayout(new java.awt.CardLayout());

        jPanelBackground.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24));
        jLabel1.setText("We wish you healthy days :)");
        jPanelBackground.add(jLabel1);
        jLabel1.setBounds(250, 200, 420, 50);

        jLabelBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\BUSE OZEL\\Desktop\\Images&Files\\AdamsNeilson_NarrativeMedicine_735 (1).jpg"));
        jPanelBackground.add(jLabelBackground);
        jLabelBackground.setBounds(-20, 0, 700, 460);

        layeredPane.add(jPanelBackground, "card4");

        jTablePat.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "ID", "Name", "Age", "Patient's Disturbance", "Phone Number", "Email"
                }
        ));
        jScrollPane1.setViewportView(jTablePat);



        javax.swing.GroupLayout jPanelNewPatientLayout = new javax.swing.GroupLayout(jPanelNewPatient);
        jPanelNewPatient.setLayout(jPanelNewPatientLayout);
        jPanelNewPatientLayout.setHorizontalGroup(
                jPanelNewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelNewPatientLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanelNewPatientLayout.setVerticalGroup(
                jPanelNewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelNewPatientLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(99, Short.MAX_VALUE))
        );

        layeredPane.add(jPanelNewPatient, "card3");

        jButtonSeeProgram.setBackground(new java.awt.Color(153, 204, 255));
        jButtonSeeProgram.setFont(new java.awt.Font("Century", 0, 11));
        jButtonSeeProgram.setText("Program");
        jButtonSeeProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeProgramActionPerformed(evt);
            }
        });

        jButtonSee.setBackground(new java.awt.Color(153, 204, 255));
        jButtonSee.setFont(new java.awt.Font("Century", 0, 11));
        jButtonSee.setText("Here");
        jButtonSee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButtonSeeActionPerformed(evt);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        jButtonAddPatient.setBackground(new java.awt.Color(153, 204, 255));
        jButtonAddPatient.setFont(new java.awt.Font("Century", 0, 11));
        jButtonAddPatient.setText("Here");
        jButtonAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddPatientActionPerformed(evt);
            }
        });

        jLabelChangePatient.setFont(new java.awt.Font("Century", 0, 12));
        jLabelChangePatient.setText("Change/Add patient:");

        jLabelAddNewPatient.setFont(new java.awt.Font("Century", 0, 12));
        jLabelAddNewPatient.setText("See new patients:");

        jLabelDoctorProgram.setFont(new java.awt.Font("Century", 0, 12));
        jLabelDoctorProgram.setText("See doctor's program:");

        jButtonCancel.setBackground(new java.awt.Color(95, 154, 255));
        jButtonCancel.setFont(new java.awt.Font("Century", 0, 11));
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
                jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCancel)
                                .addGap(30, 30, 30))
                        .addGroup(jPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabelDoctorProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelLayout.createSequentialGroup()
                                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelAddNewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonSee, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonAddPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelChangePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonSeeProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
                jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelDoctorProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSeeProgram)
                                .addGap(42, 42, 42)
                                .addComponent(jLabelAddNewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSee)
                                .addGap(36, 36, 36)
                                .addComponent(jLabelChangePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAddPatient)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addComponent(jButtonCancel)
                                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(layeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(layeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButtonSeeProgramActionPerformed(java.awt.event.ActionEvent evt) {


        layeredPane.removeAll();
        layeredPane.add(jPanelBackground);
        layeredPane.repaint();
        layeredPane.revalidate();

        String FILE = "C:\\Users\\BUSE OZEL\\Desktop\\Images&Files\\doc (1).xlsx";

        try {
            if ((new File(FILE)).exists()) {
                Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + FILE);
                p.waitFor();
            } else {
                System.out.println("File does not exists");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {

        DoctorLogin DL = new DoctorLogin();
        DL.setVisible(true);
        DL.pack();
        DL.setLocationRelativeTo(null);
        DL.setDefaultCloseOperation(MainMenu.EXIT_ON_CLOSE);
        this.dispose();
    }

    private void jButtonAddPatientActionPerformed(java.awt.event.ActionEvent evt) {


        layeredPane.removeAll();
        layeredPane.add(jPanelBackground);
        layeredPane.repaint();
        layeredPane.revalidate();

        String FILE = "C:\\Users\\BUSE OZEL\\Desktop\\Images&Files\\doc (1).docx";

        try {
            if ((new File(FILE)).exists()) {
                Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + FILE);
                p.waitFor();
            } else {
                System.out.println("File does not exists");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private void jButtonSeeActionPerformed(java.awt.event.ActionEvent evt)  throws Exception{

        layeredPane.removeAll();
        layeredPane.add(jPanelNewPatient);
        layeredPane.repaint();
        layeredPane.revalidate();


        JScrollPane sp= new JScrollPane(jTablePat, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        layeredPane.add(sp);




        try
        {
            FileInputStream fis = new FileInputStream("patients.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            tempPatients = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        }
        catch(FileNotFoundException io){

            System.out.println("File not found");

        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }

        for(Patients content: tempPatients){
            content.printInfo();
            System.out.println();
        }

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
            java.util.logging.Logger.getLogger(DoctorHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorHomePage().setVisible(true);
            }
        });


    }


    private javax.swing.JButton jButtonAddPatient;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSee;
    private javax.swing.JButton jButtonSeeProgram;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAddNewPatient;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelChangePatient;
    private javax.swing.JLabel jLabelDoctorProgram;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelNewPatient;
    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JPanel layeredPane;
    private javax.swing.JTable jTablePat;

}

