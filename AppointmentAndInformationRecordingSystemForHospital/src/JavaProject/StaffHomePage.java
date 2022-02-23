package JavaProject;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JScrollPane;

import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;



public class StaffHomePage extends javax.swing.JFrame implements Serializable {

    public static final long serialVersionUID =-3745752517293934724L;

    ArrayList<Patients> tempPatients = new ArrayList<>();


    ArrayList<employees> employeesInformation = new ArrayList<>();
    ArrayList<employeeSalaries> salariedEmployeesInformation = new ArrayList<>();
    ArrayList<hourlyEmployees> hourlyEmployeesInformation = new ArrayList<>();


    private PatientLogin patient = new PatientLogin();

    ArrayList<Patients> array= patient.getTempPatients();


    public StaffHomePage() {
        initComponents();
        addRowToJTable();
    }

    public ArrayList listUsers0(){

        employeesInformation.add(new employeeSalaries("Elif Ölmez", "Female", 29, "Nurse", 750.94));
        employeesInformation.add(new employeeSalaries("Hüseyin Yatýr", "Male", 41, "Nurse", 810.10));
        employeesInformation.add(new employeeSalaries("Ayþe Öksüz", "Female", 35, "Nurse", 790.65));
        employeesInformation.add(new hourlyEmployees("Kadir Bilmez", "Male", 36, "Cleaning staff", 16.75, 36));
        employeesInformation.add(new hourlyEmployees("Neslihan Ýnanýr", "Female", 21, "Ýntern", 13.90, 19));
        employeesInformation.add(new hourlyEmployees("Suna Durmuþ", "Female", 47, "Cleaning staff", 19.23, 40));



        return employeesInformation;
    }


    public ArrayList listUsers1(){


        salariedEmployeesInformation.add(new employeeSalaries("Elif Ölmez", "Female", 29, "Nurse", 750.94));
        salariedEmployeesInformation.add(new employeeSalaries("Hüseyin Yatýr", "Male", 41, "Nurse", 810.10));
        salariedEmployeesInformation.add(new employeeSalaries("Ayþe Öksüz", "Female", 35, "Nurse", 790.65));


        return salariedEmployeesInformation;

    }

    public ArrayList listUsers2(){

        hourlyEmployeesInformation.add(new hourlyEmployees("Kadir Bilmez", "Male", 36, "Cleaning staff", 16.75, 36));
        hourlyEmployeesInformation.add(new hourlyEmployees("Neslihan Ýnanýr", "Female", 21, "Ýntern", 13.90, 19));
        hourlyEmployeesInformation.add(new hourlyEmployees("Suna Durmuþ", "Female", 47, "Cleaning staff", 19.23, 40));

        return hourlyEmployeesInformation;
    }

    public void addRowToJTable(){

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        ArrayList<employeeSalaries> salariedEmployeesInformation  = listUsers1();

        Object rowData[] = new Object[5];

        for(int i=0;i<salariedEmployeesInformation.size();i++){

            rowData[0]=salariedEmployeesInformation.get(i).getFullName1();
            rowData[1]=salariedEmployeesInformation.get(i).getGender2();
            rowData[2]=salariedEmployeesInformation.get(i).getAge2();
            rowData[3]=salariedEmployeesInformation.get(i).getEmployeesPosition();
            rowData[4]=salariedEmployeesInformation.get(i).getWeeklySalary();


            model.addRow(rowData);
        }

        DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();
        ArrayList<hourlyEmployees> hourlyEmployeesInformation = listUsers2();

        Object rowData2[] = new Object[6];

        for(int i=0;i<hourlyEmployeesInformation.size();i++){
            rowData2[0]=hourlyEmployeesInformation.get(i).getFullName1();
            rowData2[1]=hourlyEmployeesInformation.get(i).getGender2();
            rowData2[2]=hourlyEmployeesInformation.get(i).getAge2();
            rowData2[3]=hourlyEmployeesInformation.get(i).getEmployeesPosition();
            rowData2[4]=hourlyEmployeesInformation.get(i).getWage();
            rowData2[5]=hourlyEmployeesInformation.get(i).getHours();

            model2.addRow(rowData2);
        }


    }



    @SuppressWarnings("unchecked")

    private void initComponents() {

        layeredPane = new javax.swing.JPanel();
        jPanelBackground = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelNewPatientINFO = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jPanelTables = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanelButtons = new javax.swing.JPanel();
        jButtonPatientINFO = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonEmployeeINFO = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonEmployeeSchedule = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        layeredPane.setBackground(new java.awt.Color(51, 0, 51));
        layeredPane.setLayout(new java.awt.CardLayout());

        jPanelBackground.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\BUSE OZEL\\Desktop\\Images&Files\\6710030.jpg"));
        jPanelBackground.add(jLabel4);
        jLabel4.setBounds(-40, -10, 560, 500);

        layeredPane.add(jPanelBackground, "card1");

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane3.setViewportView(jTextArea);

        javax.swing.GroupLayout jPanelNewPatientINFOLayout = new javax.swing.GroupLayout(jPanelNewPatientINFO);
        jPanelNewPatientINFO.setLayout(jPanelNewPatientINFOLayout);
        jPanelNewPatientINFOLayout.setHorizontalGroup(
                jPanelNewPatientINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelNewPatientINFOLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanelNewPatientINFOLayout.setVerticalGroup(
                jPanelNewPatientINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelNewPatientINFOLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(22, Short.MAX_VALUE))
        );

        layeredPane.add(jPanelNewPatientINFO, "card4");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Full Name", "Gender", "Age", "Position", "Weekly Salary"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Full Name", "Gender", "Age", "Position", "Wage", "Hours"
                }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel5.setFont(new java.awt.Font("Garamond", 1, 18));
        jLabel5.setText("Salaried Employees");

        jLabel6.setFont(new java.awt.Font("Garamond", 1, 18));
        jLabel6.setText("Hourly Employees");

        javax.swing.GroupLayout jPanelTablesLayout = new javax.swing.GroupLayout(jPanelTables);
        jPanelTables.setLayout(jPanelTablesLayout);
        jPanelTablesLayout.setHorizontalGroup(
                jPanelTablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelTablesLayout.createSequentialGroup()
                                .addGroup(jPanelTablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelTablesLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanelTablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanelTablesLayout.createSequentialGroup()
                                                .addGap(149, 149, 149)
                                                .addComponent(jLabel6))
                                        .addGroup(jPanelTablesLayout.createSequentialGroup()
                                                .addGap(149, 149, 149)
                                                .addComponent(jLabel5)))
                                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanelTablesLayout.setVerticalGroup(
                jPanelTablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelTablesLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        layeredPane.add(jPanelTables, "card3");

        jPanelButtons.setBackground(new java.awt.Color(213, 201, 255));

        jButtonPatientINFO.setBackground(new java.awt.Color(102, 0, 102));
        jButtonPatientINFO.setFont(new java.awt.Font("Century", 0, 11));
        jButtonPatientINFO.setForeground(new java.awt.Color(204, 204, 255));
        jButtonPatientINFO.setText("Here");
        jButtonPatientINFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPatientINFOActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century", 0, 11));
        jLabel1.setText("Click here to see new patient information:");

        jLabel2.setFont(new java.awt.Font("Century", 0, 11));
        jLabel2.setText("Click here to see employee information:");

        jButtonEmployeeINFO.setBackground(new java.awt.Color(102, 0, 102));
        jButtonEmployeeINFO.setFont(new java.awt.Font("Century", 0, 11));
        jButtonEmployeeINFO.setForeground(new java.awt.Color(204, 204, 255));
        jButtonEmployeeINFO.setText("Here");
        jButtonEmployeeINFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmployeeINFOActionPerformed(evt);
            }
        });

        jButtonCancel.setFont(new java.awt.Font("Century", 0, 11));
        jButtonCancel.setText("CANCEL");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century", 0, 11));
        jLabel3.setText("Click here to see employee schedule:");

        jButtonEmployeeSchedule.setBackground(new java.awt.Color(102, 0, 102));
        jButtonEmployeeSchedule.setFont(new java.awt.Font("Century", 0, 11));
        jButtonEmployeeSchedule.setForeground(new java.awt.Color(204, 204, 255));
        jButtonEmployeeSchedule.setText("Here");
        jButtonEmployeeSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmployeeScheduleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelButtonsLayout = new javax.swing.GroupLayout(jPanelButtons);
        jPanelButtons.setLayout(jPanelButtonsLayout);
        jPanelButtonsLayout.setHorizontalGroup(
                jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonsLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonCancel)
                                .addGap(25, 25, 25))
                        .addGroup(jPanelButtonsLayout.createSequentialGroup()
                                .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelButtonsLayout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelButtonsLayout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanelButtonsLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel3))
                                        .addGroup(jPanelButtonsLayout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addComponent(jButtonEmployeeINFO))
                                        .addGroup(jPanelButtonsLayout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(jButtonPatientINFO))
                                        .addGroup(jPanelButtonsLayout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(jButtonEmployeeSchedule)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelButtonsLayout.setVerticalGroup(
                jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelButtonsLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPatientINFO)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEmployeeINFO)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEmployeeSchedule)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(layeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(layeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        layeredPane.getAccessibleContext().setAccessibleName("");

        pack();
    }

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {

        StaffLogin SL = new StaffLogin();
        SL.setVisible(true);
        SL.pack();
        SL.setLocationRelativeTo(null);
        SL.setDefaultCloseOperation(MainMenu.EXIT_ON_CLOSE);
        this.dispose();
    }

    private void jButtonEmployeeINFOActionPerformed(java.awt.event.ActionEvent evt) {

        layeredPane.removeAll();
        layeredPane.add(jPanelTables);
        layeredPane.repaint();
        layeredPane.revalidate();

        listUsers0();

        for(employees content: employeesInformation){
            content.printInfo();
            System.out.println();
        }


    }

    private void jButtonEmployeeScheduleActionPerformed(java.awt.event.ActionEvent evt) {

        layeredPane.removeAll();
        layeredPane.add(jPanelBackground);
        layeredPane.repaint();
        layeredPane.revalidate();

        String FILE = "C:\\Users\\BUSE OZEL\\Desktop\\Images&Files\\staff.xltx";

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

    private void jButtonPatientINFOActionPerformed(java.awt.event.ActionEvent evt) {


        layeredPane.removeAll();
        layeredPane.add(jPanelNewPatientINFO);
        layeredPane.repaint();
        layeredPane.revalidate();


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

        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }

        for(Patients content: tempPatients){
            content.printInfo();
        }

        //Bu sefer de textArea olarak basmaya çalýþtýk ama tekrar olmayýnca override methodu printInfo'yu kullandýk.

        JTextArea jTextArea = new JTextArea();
        jTextArea.setEditable (false);

        JScrollPane sp= new JScrollPane(jTextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        layeredPane.add(sp);

        jTextArea.setText(tempPatients.toString());
        jTextArea.getText();



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
            java.util.logging.Logger.getLogger(StaffHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffHomePage().setVisible(true);
            }
        });
    }


    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonEmployeeINFO;
    private javax.swing.JButton jButtonEmployeeSchedule;
    private javax.swing.JButton jButtonPatientINFO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JPanel jPanelNewPatientINFO;
    private javax.swing.JPanel jPanelTables;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JPanel layeredPane;

}
