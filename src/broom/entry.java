package broom;

import java.sql.PreparedStatement;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class entry extends javax.swing.JFrame {
       public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new entry().setVisible(true);
            }
        });
    }

    public entry() {
       initComponents();
        Connect();
       entry_load();

    }

    Connection con =null;
    PreparedStatement pst = null;
    ResultSet rs= null;
    DefaultTableModel d= null;

    public void Connect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             System.out.println("successful 1");
     
             con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hogwarts","root","Maysha4567@4");
           
            System.out.println("successful 2");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public void entry_load() {
        int c;
        try {
            pst = con.prepareStatement("select * from magic");
            rs = pst.executeQuery();
System.out.println("successful 3");
            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            d = (DefaultTableModel)txtmagic.getModel();
            d.setRowCount(0);

            while (rs.next()) {

                Vector v2 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v2.add(rs.getString("name"));
                    v2.add(rs.getString("age"));
                    v2.add(rs.getString("hometown"));
                    v2.add(rs.getString("wand"));
                    v2.add(rs.getString("bloodtype"));
                    v2.add(rs.getString("house"));
                    v2.add(rs.getString("year"));

                }

                d.addRow(v2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(entry.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txthometown = new javax.swing.JTextField();
        txtwand = new javax.swing.JTextField();
        txtbloodtype = new javax.swing.JTextField();
        txtgroup = new javax.swing.JTextField();
        txtyear = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        hi = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtmagic = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 0));
        jLabel1.setText("Hogwarts School of Witchcraft and Wizardry");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 520, 30));

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Age");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 60, 60));

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Hometown");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 100, -1));

        jLabel5.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Wand");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("Bloodtype");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("Group");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 70, -1));

        jLabel8.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 204));
        jLabel8.setText("Year");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 70, -1));

        txtname.setBackground(new java.awt.Color(255, 255, 204));
        txtname.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtname.setForeground(new java.awt.Color(102, 102, 0));
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 170, 30));

        txtage.setBackground(new java.awt.Color(255, 255, 204));
        txtage.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtage.setForeground(new java.awt.Color(102, 102, 0));
        getContentPane().add(txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 170, 30));

        txthometown.setBackground(new java.awt.Color(255, 255, 204));
        txthometown.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txthometown.setForeground(new java.awt.Color(102, 102, 0));
        getContentPane().add(txthometown, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 170, 30));

        txtwand.setBackground(new java.awt.Color(255, 255, 204));
        txtwand.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtwand.setForeground(new java.awt.Color(102, 102, 0));
        getContentPane().add(txtwand, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 170, 30));

        txtbloodtype.setBackground(new java.awt.Color(255, 255, 204));
        txtbloodtype.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtbloodtype.setForeground(new java.awt.Color(102, 102, 0));
        getContentPane().add(txtbloodtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 170, 30));

        txtgroup.setBackground(new java.awt.Color(255, 255, 204));
        txtgroup.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtgroup.setForeground(new java.awt.Color(102, 102, 0));
        getContentPane().add(txtgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 170, 30));

        txtyear.setBackground(new java.awt.Color(255, 255, 204));
        txtyear.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtyear.setForeground(new java.awt.Color(102, 102, 0));
        getContentPane().add(txtyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 170, 30));

        saveButton.setBackground(new java.awt.Color(255, 255, 204));
        saveButton.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        saveButton.setForeground(new java.awt.Color(204, 204, 0));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        editButton.setBackground(new java.awt.Color(255, 255, 204));
        editButton.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        editButton.setForeground(new java.awt.Color(204, 204, 0));
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 460, 80, -1));

        deleteButton.setBackground(new java.awt.Color(255, 255, 204));
        deleteButton.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(204, 204, 0));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, -1, -1));

        clearButton.setBackground(new java.awt.Color(255, 255, 204));
        clearButton.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        clearButton.setForeground(new java.awt.Color(204, 204, 0));
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, -1, -1));

        hi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/broom/neww.jpg"))); // NOI18N
        hi.setText("jLabel9");
        hi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hiMouseClicked(evt);
            }
        });
        getContentPane().add(hi, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -140, 820, 720));

        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 140, 70));

        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        txtmagic.setBackground(new java.awt.Color(0, 0, 0));
        txtmagic.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtmagic.setForeground(new java.awt.Color(255, 255, 204));
        txtmagic.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "name", "age", "hometown", "wand", "bloodtype", "group", "year"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        txtmagic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtmagicMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtmagic);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 0, 810, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:

        try {
            String name = txtname.getText();
            String age = txtage.getText();
            String wand = txtwand.getText();
            String hometown = txthometown.getText();
            String bloodtype = txtbloodtype.getText();
            String house = txtgroup.getText();
            String year = txtyear.getText();

            pst = con.prepareStatement("insert into magic(name,age,hometown,wand,bloodType,house,year) values(?,?,?,?,?,?,?)");
            pst.setString(1, name);
            pst.setString(2, age);
            pst.setString(3, hometown);
            pst.setString(4, wand);
            pst.setString(5, bloodtype);
            pst.setString(6, house);
            pst.setString(7, year);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "User Added");
            txtname.setText(" ");
            txtage.setText(" ");
            txthometown.setText(" ");
            txtwand.setText(" ");
            txtbloodtype.setText(" ");
            txtgroup.setText(" ");
            txtyear.setText(" ");
            txtname.requestFocus();
            entry_load();

        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_saveButtonActionPerformed

    private void hiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hiMouseClicked
        // TODO add your handling code here:

        d = (DefaultTableModel)txtmagic.getModel();
        int selectIndex = txtmagic.getSelectedRow();

        //String id = d.getValueAt(selectIndex, 0).toString();
        txtname.setText(d.getValueAt(selectIndex, 0).toString());
        txtage.setText(d.getValueAt(selectIndex, 1).toString());
        txthometown.setText(d.getValueAt(selectIndex, 2).toString());
        txtwand.setText(d.getValueAt(selectIndex, 3).toString());
        txtbloodtype.setText(d.getValueAt(selectIndex, 4).toString());
        txtgroup.setText(d.getValueAt(selectIndex, 5).toString());
        txtyear.setText(d.getValueAt(selectIndex, 6).toString());
        
        
        
        saveButton.setEnabled(false);
        
        
    }//GEN-LAST:event_hiMouseClicked

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        
        
        
        

        try {
            d = (DefaultTableModel)txtmagic.getModel();
            int selectIndex = txtmagic.getSelectedRow();

            String id = d.getValueAt(selectIndex, 0).toString();
            String name = txtname.getText();
            String age = txtage.getText();
            String wand = txtwand.getText();
            String hometown = txthometown.getText();
            String bloodtype = txtbloodtype.getText();
            String house = txtgroup.getText();
            String year = txtyear.getText();

            pst = con.prepareStatement("update magic set name=?,age=?,hometown=?,wand=?,bloodtype=? ,house=?,year=? ");
            pst.setString(1, name);
            pst.setString(2, age);
            pst.setString(3, hometown);
            pst.setString(4, wand);
            pst.setString(5, bloodtype);
            pst.setString(6, house);
            pst.setString(7, year);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "User Editedded");
            
            saveButton.setEnabled(true);
            
            
            
            
            
            txtname.setText(" ");
            txtage.setText(" ");
            txthometown.setText(" ");
            txtwand.setText(" ");
            txtbloodtype.setText(" ");
            txtgroup.setText(" ");
            txtyear.setText(" ");
            txtname.requestFocus();
            entry_load();

        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_editButtonActionPerformed

    private void txtmagicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmagicMouseClicked
        // TODO add your handling code here:
        
        
        d = (DefaultTableModel)txtmagic.getModel();
        int selectIndex= txtmagic.getSelectedRow();
        
        
        //String name= d.getValueAt(selectIndex, 0).toString();
        txtname.setText(d.getValueAt(selectIndex, 0).toString());
        txtage.setText(d.getValueAt(selectIndex, 1).toString()); 
        txthometown.setText(d.getValueAt(selectIndex, 2).toString());
        txtwand.setText(d.getValueAt(selectIndex, 3).toString());
        txtbloodtype.setText(d.getValueAt(selectIndex, 4).toString());
        txtgroup.setText(d.getValueAt(selectIndex, 5).toString());
        txtyear.setText(d.getValueAt(selectIndex, 6).toString());
        
        
        
        saveButton.setEnabled(false);
        
        
        
        
        
        
    }//GEN-LAST:event_txtmagicMouseClicked

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed

        
        
        
        
        clearButton.setEnabled(true);
            
            
            
            
            
            txtname.setText(" ");
            txtage.setText(" ");
            txthometown.setText(" ");
            txtwand.setText(" ");
            txtbloodtype.setText(" ");
            txtgroup.setText(" ");
            txtyear.setText(" ");
            txtname.requestFocus();
            entry_load();
        // TODO add your handling code here:
        
        
        
       
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_clearButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
        try {
            d = (DefaultTableModel)txtmagic.getModel();
            int selectIndex = txtmagic.getSelectedRow();

           
            pst = con.prepareStatement("delete from    magic ");
            //pst.setString(1, name);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "User deleted");
            
            saveButton.setEnabled(true);
            
            
            
            
            
            txtname.setText(" ");
            txtage.setText(" ");
            txthometown.setText(" ");
            txtwand.setText(" ");
            txtbloodtype.setText(" ");
            txtgroup.setText(" ");
            txtyear.setText(" ");
            txtname.requestFocus();
            entry_load();

        } catch (Exception e) {
            System.out.println(e);
        }

        
        
        
        
        
        
        
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel hi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtbloodtype;
    private javax.swing.JTextField txtgroup;
    private javax.swing.JTextField txthometown;
    private javax.swing.JTable txtmagic;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtwand;
    private javax.swing.JTextField txtyear;
    // End of variables declaration//GEN-END:variables
}
