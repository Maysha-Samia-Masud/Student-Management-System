
package broom;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author maysh
 */
public class Teacher extends javax.swing.JFrame {

    /**
     * Creates new form Teacher
     */
    public Teacher() {
        initComponents();
        Connect();
        
        Teacher_load();
        
        
        
        
        
    }
    
    Connection con =null;
    PreparedStatement pst = null;
    ResultSet rs= null;
    DefaultTableModel d= null;

    
    
    public void Connect(){
        
        
        
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
        public void Teacher_load(){
            
        int t;
        try {
            pst = con.prepareStatement("select*from marks");
            rs = pst.executeQuery();
System.out.println("successful 3");
            ResultSetMetaData rsd = rs.getMetaData();
            t = rsd.getColumnCount();
            d = (DefaultTableModel)markss.getModel();
            d.setRowCount(0);

            while (rs.next()) {

                Vector v3 = new Vector();
                for (int i = 1; i <= t; i++) {
                    v3.add(rs.getString("charms"));
                    v3.add(rs.getString("history of magic"));
                    v3.add(rs.getString("transfiguration"));
                    v3.add(rs.getString("astronomy and herbology"));
                    v3.add(rs.getString("potions"));
                    v3.add(rs.getString("dark arts"));
                    v3.add(rs.getString("name"));
                    v3.add(rs.getString("year"));
                    v3.add(rs.getString("comment box"));
                }

                d.addRow(v3);
            }

        } catch (SQLException ex) {
            Logger.getLogger(entry.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stuname = new javax.swing.JTextField();
        stuyear = new javax.swing.JTextField();
        commentbox = new javax.swing.JTextField();
        txtcharms = new javax.swing.JTextField();
        txthistory = new javax.swing.JTextField();
        txttransfiguration = new javax.swing.JTextField();
        txtastronomy = new javax.swing.JTextField();
        txtarts = new javax.swing.JTextField();
        txtpotion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        markss = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 550));
        setPreferredSize(new java.awt.Dimension(1700, 590));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stuname.setBackground(new java.awt.Color(204, 51, 0));
        stuname.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        stuname.setForeground(new java.awt.Color(255, 255, 255));
        stuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stunameActionPerformed(evt);
            }
        });
        getContentPane().add(stuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 250, 40));

        stuyear.setBackground(new java.awt.Color(204, 51, 0));
        stuyear.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        stuyear.setForeground(new java.awt.Color(255, 255, 255));
        stuyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuyearActionPerformed(evt);
            }
        });
        getContentPane().add(stuyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 250, 40));

        commentbox.setBackground(new java.awt.Color(204, 51, 0));
        commentbox.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        commentbox.setForeground(new java.awt.Color(255, 255, 255));
        commentbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commentboxActionPerformed(evt);
            }
        });
        getContentPane().add(commentbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 250, 70));

        txtcharms.setBackground(new java.awt.Color(204, 51, 0));
        txtcharms.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        txtcharms.setForeground(new java.awt.Color(255, 255, 255));
        txtcharms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcharmsActionPerformed(evt);
            }
        });
        getContentPane().add(txtcharms, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 250, 40));

        txthistory.setBackground(new java.awt.Color(204, 51, 0));
        txthistory.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        txthistory.setForeground(new java.awt.Color(255, 255, 255));
        txthistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthistoryActionPerformed(evt);
            }
        });
        getContentPane().add(txthistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 250, 40));

        txttransfiguration.setBackground(new java.awt.Color(204, 51, 0));
        txttransfiguration.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        txttransfiguration.setForeground(new java.awt.Color(255, 255, 255));
        txttransfiguration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttransfigurationActionPerformed(evt);
            }
        });
        getContentPane().add(txttransfiguration, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 250, -1));

        txtastronomy.setBackground(new java.awt.Color(204, 51, 0));
        txtastronomy.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        txtastronomy.setForeground(new java.awt.Color(255, 255, 255));
        txtastronomy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtastronomyActionPerformed(evt);
            }
        });
        getContentPane().add(txtastronomy, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 250, 40));

        txtarts.setBackground(new java.awt.Color(204, 51, 0));
        txtarts.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        txtarts.setForeground(new java.awt.Color(255, 255, 255));
        txtarts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtartsActionPerformed(evt);
            }
        });
        getContentPane().add(txtarts, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 250, 40));

        txtpotion.setBackground(new java.awt.Color(204, 51, 0));
        txtpotion.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        txtpotion.setForeground(new java.awt.Color(255, 255, 255));
        txtpotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpotionActionPerformed(evt);
            }
        });
        getContentPane().add(txtpotion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 250, 40));

        markss.setBackground(new java.awt.Color(0, 102, 102));
        markss.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        markss.setForeground(new java.awt.Color(255, 255, 255));
        markss.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "charms", "history of magic", "transfiguration", "astronomy and herbology", "potions", "dark arts", "name", "year", "comment box"
            }
        ));
        markss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                markssMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(markss);
        if (markss.getColumnModel().getColumnCount() > 0) {
            markss.getColumnModel().getColumn(7).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 870, 657));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,90));
        jPanel1.setForeground(new java.awt.Color(204, 51, 0));

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Year");

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Name");

        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("Transfiguration ");

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("History of Magic ");

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("Charms ");

        jLabel9.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 204));
        jLabel9.setText(" Astronomy and Herbology ");

        jLabel11.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 204));
        jLabel11.setText("Defence Against the Dark Arts ");

        jLabel10.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 204));
        jLabel10.setText(" Potions ");

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("comment box");

        jLabel1.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Course Name");

        save.setBackground(new java.awt.Color(0, 51, 51));
        save.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 51, 51));
        jButton5.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 550));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/broom/b527efb3db904b50e59ff206f2a142d3 (1).jpg"))); // NOI18N
        jLabel19.setText("jLabel19");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        
        try{
        String charms= txtcharms.getText();
        String history =txthistory.getText();
        String trans = txttransfiguration.getText();
        String astronomyy= txtastronomy.getText();
        String potions= txtpotion.getText();
        String darkarts = txtarts.getText();
        
        
        String name= stuname.getText();
        String year=stuyear.getText();
        String comment = commentbox.getText();
//        pst = con.prepareStatement("insert into marks(charms) values (?)");
        pst = con.prepareStatement("INSERT INTO marks (`charms`, `history of magic`, `transfiguration`, `astronomy and herbology`, `potions`, `dark arts`, `name`, `year`, `comment box`) VALUES (?,?,?,?,?,?,?,?,?);");
            pst.setString(1, charms);
            pst.setString(2, history);
            pst.setString(3, trans);
            pst.setString(4, astronomyy);
            pst.setString(5, potions);
            pst.setString(6, darkarts);
            
             pst.setString(7, name);
              pst.setString(8, year);
               pst.setString(9, comment);
//            
            
            
            System.out.println("ki shomossha1");
            
        
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "User Added");
            txtcharms.setText(" ");
            txthistory.setText(" ");
            txttransfiguration.setText(" ");
            txtastronomy.setText(" ");
            txtpotion.setText(" ");
            stuname.setText(" ");
            stuyear.setText(" ");
            commentbox.setText(" ");
            stuname.requestFocus();
            Teacher_load();

        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }

       System.out.println("ki shomossha2");
               
               
              
               
               
               
           
           
           
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_saveActionPerformed

    private void stuyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stuyearActionPerformed

    private void stunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stunameActionPerformed

    private void txtcharmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcharmsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcharmsActionPerformed

    private void txttransfigurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttransfigurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttransfigurationActionPerformed

    private void txtastronomyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtastronomyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtastronomyActionPerformed

    private void txtpotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpotionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpotionActionPerformed

    private void markssMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_markssMouseClicked
        // TODO add your handling code here:
        
        
        
        
        
        
         
        d = (DefaultTableModel)markss.getModel();
        int selectIndex= markss.getSelectedRow();
        
        
        //String name= d.getValueAt(selectIndex, 0).toString();
        txtcharms.setText(d.getValueAt(selectIndex, 0).toString());
        txthistory.setText(d.getValueAt(selectIndex, 1).toString()); 
        txttransfiguration.setText(d.getValueAt(selectIndex, 2).toString());
        txtastronomy.setText(d.getValueAt(selectIndex, 3).toString());
        txtpotion.setText(d.getValueAt(selectIndex, 4).toString());
        txtarts.setText(d.getValueAt(selectIndex, 5).toString());
        stuname.setText(d.getValueAt(selectIndex, 6).toString());
         stuyear.setText(d.getValueAt(selectIndex, 7).toString());
         commentbox.setText(d.getValueAt(selectIndex, 8).toString());
        
        save.setEnabled(false);
        
        
        
        
        
        
    }//GEN-LAST:event_markssMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
            d = (DefaultTableModel)markss.getModel();
        int selectIndex = markss.getSelectedRow();

        //String id = d.getValueAt(selectIndex, 0).toString();
       txtcharms .setText(d.getValueAt(selectIndex, 0).toString());
       txthistory.setText(d.getValueAt(selectIndex, 1).toString());
        txttransfiguration.setText(d.getValueAt(selectIndex, 2).toString());
        txtastronomy.setText(d.getValueAt(selectIndex, 3).toString());
         txtpotion.setText(d.getValueAt(selectIndex, 4).toString());
      txtarts .setText(d.getValueAt(selectIndex, 5).toString());
        stuname.setText(d.getValueAt(selectIndex, 6).toString());
        
        stuyear.setText(d.getValueAt(selectIndex, 7).toString());
         commentbox.setText(d.getValueAt(selectIndex, 8).toString());
        
        save.setEnabled(false);
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void txtartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtartsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtartsActionPerformed

    private void txthistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthistoryActionPerformed

    private void commentboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commentboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commentboxActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        
        
        d = (DefaultTableModel)markss.getModel();
        int selectIndex = markss.getSelectedRow();

        
        stuname.setText(d.getValueAt(selectIndex, 7).toString());
        
        
         try{
        String charms= txtcharms.getText();
        String history =txthistory.getText();
        String trans = txttransfiguration.getText();
        String astronomyy= txtastronomy.getText();
        String potions= txtpotion.getText();
        String darkarts = txtarts.getText();
        
        
        String name= stuname.getText();
        String year=stuyear.getText();
        String comment = commentbox.getText();
//        //pst = con.prepareStatement("insert into marks(charms) values (?)");
        //pst = con.prepareStatement("update marks charms = ?, history of magic = ?, transfiguration = ?, astronomy and herbology = ?, potions = ?, dark arts = ?,  year = ?, comment box = ? where name = ?");
        pst= con.prepareStatement(" delete  from marks ");
            pst.setString(1, charms);
            pst.setString(2, history);
            pst.setString(3, trans);
            pst.setString(4, astronomyy);
            pst.setString(5, potions);
            pst.setString(6, darkarts);
            
             pst.setString(7, name);
              pst.setString(8, year);
               pst.setString(9, comment);
//            
            
            
            System.out.println("ki shomossha1");
            
        
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "User Editted");
            save.setEnabled(true);
            
            
            
            txtcharms.setText(" ");
            txthistory.setText(" ");
            txttransfiguration.setText(" ");
            txtastronomy.setText(" ");
            txtpotion.setText(" ");
            stuname.setText(" ");
            stuyear.setText(" ");
            commentbox.setText(" ");
            stuname.requestFocus();
            Teacher_load();

        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }

       System.out.println("ki shomossha2");
               
               
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField commentbox;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable markss;
    private javax.swing.JButton save;
    private javax.swing.JTextField stuname;
    private javax.swing.JTextField stuyear;
    private javax.swing.JTextField txtarts;
    private javax.swing.JTextField txtastronomy;
    private javax.swing.JTextField txtcharms;
    private javax.swing.JTextField txthistory;
    private javax.swing.JTextField txtpotion;
    private javax.swing.JTextField txttransfiguration;
    // End of variables declaration//GEN-END:variables
}
