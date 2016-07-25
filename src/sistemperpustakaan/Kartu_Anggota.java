/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpustakaan;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.File;
import java.sql.*;
import java.text.MessageFormat;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author INDRA L GHAZALI
 */
public class Kartu_Anggota extends javax.swing.JFrame {
    private Connection conec;

    /**
     * Creates new form Kartu_Anggota
     */
    public Kartu_Anggota() {
        initComponents();
        koneksiDatabase();
        nomoran();
        tabs();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfidang = new javax.swing.JTextField();
        tfnip = new javax.swing.JTextField();
        tfidpen = new javax.swing.JTextField();
        tfviewnama = new javax.swing.JTextField();
        tfviewjenis = new javax.swing.JTextField();
        tfviewjurusan = new javax.swing.JTextField();
        tblprint = new javax.swing.JButton();
        tblsave = new javax.swing.JButton();
        tbledit = new javax.swing.JButton();
        tbldelete = new javax.swing.JButton();
        tblcancel = new javax.swing.JButton();
        tblsearch = new javax.swing.JButton();
        tblreset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        tfnamakartu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Form Kartu"));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("KARTU ANGGOTA");

        jLabel4.setText("ID_Pendaftar");

        jLabel5.setText("Jenis_Kelamin");

        jLabel6.setText("Jurusan");

        tfnip.setBackground(new java.awt.Color(204, 204, 204));
        tfnip.setEnabled(false);

        tfidpen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfidpenKeyPressed(evt);
            }
        });

        tfviewnama.setBackground(new java.awt.Color(204, 204, 204));
        tfviewnama.setEnabled(false);
        tfviewnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfviewnamaActionPerformed(evt);
            }
        });

        tfviewjenis.setBackground(new java.awt.Color(204, 204, 204));
        tfviewjenis.setEnabled(false);

        tfviewjurusan.setBackground(new java.awt.Color(204, 204, 204));
        tfviewjurusan.setEnabled(false);

        tblprint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/printer.png"))); // NOI18N
        tblprint.setText("Print");
        tblprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblprintActionPerformed(evt);
            }
        });

        tblsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SAVE.jpg"))); // NOI18N
        tblsave.setText("Save");
        tblsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblsaveActionPerformed(evt);
            }
        });

        tbledit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit.png"))); // NOI18N
        tbledit.setText("Edit");
        tbledit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbleditActionPerformed(evt);
            }
        });

        tbldelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete16.gif"))); // NOI18N
        tbldelete.setText("Delete");
        tbldelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbldeleteActionPerformed(evt);
            }
        });

        tblcancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close.jpg"))); // NOI18N
        tblcancel.setText("Cancel");
        tblcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblcancelActionPerformed(evt);
            }
        });

        tblsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/searchtext.png"))); // NOI18N
        tblsearch.setText("Search");
        tblsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblsearchActionPerformed(evt);
            }
        });

        tblreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ITransaksi.png"))); // NOI18N
        tblreset.setText("Reset");
        tblreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblresetActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        tfnamakartu.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tfnamakartu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfnamakartu.setText("KARTU ANGGOTA PERPUSTAKAAN");
        tfnamakartu.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(79, 79, 79))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tblprint))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfidang, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tblsearch))
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(tblsave)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tbledit)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tbldelete)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tblcancel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tblreset)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfviewjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(28, 28, 28)
                                        .addComponent(tfidpen, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfviewjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfnip, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfviewnama, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfnamakartu, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfidang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tblsearch))
                .addGap(24, 24, 24)
                .addComponent(tfnamakartu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfnip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfidpen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfviewnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfviewjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tblprint))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfviewjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbldelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tblsave)
                        .addComponent(tblcancel)
                        .addComponent(tblreset))
                    .addComponent(tbledit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfviewnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfviewnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfviewnamaActionPerformed

    private void tblsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblsaveActionPerformed
        // TODO add your handling code here:
        String vidk       = tfidang.getText();
        String vid        = tfidpen.getText();
        String vnama      = tfnamakartu.getText();
        //String valamat   = tfviewalamat.getText();
        //String vtelp     = tfviewnotelp.getText();
        //String vjurusan  = tfviewjurusan.getText();
        //String vruang    = tfruang.getText();
        //String vwaktu    = tfwaktu.getText();
        //String vjam      = tfjam.getText();
        if (tfidang.getText().trim().equals("")){
          JOptionPane.showMessageDialog(null,"Data Masih Kosong",
                "PERHATIAN", JOptionPane.WARNING_MESSAGE);
        }
        else {
            try {
                java.sql.Statement stat=conec.createStatement();
                ResultSet data=stat.executeQuery("SELECT * FROM kartu WHERE ID_Anggota='"+tfidang.getText()+"'");
                if (data.next()){
                    JOptionPane.showMessageDialog(null,"ID Anggota sudah dimasukkan");
                    tfidpen.requestFocus();
                }
                else {
                    String sql = "INSERT INTO kartu VALUES('"+vidk+"','"+vid+"','"+vnama+"')";
                    stat.executeUpdate(sql);
                    tfidang.setText("");
                    tfnip.setText("");
                    tfidpen.setText("");
                    tfnip.setText("");
                    tfviewnama.setText("");
                    tfviewjenis.setText("");
                    tfviewjurusan.setText("");
                    tfidang.requestFocus();
                }
                nomoran();
                stat.close();
            }
            catch (Exception exc){
                System.err.println("Terjadi Kesalahan :"+exc);
            }
        }
    }//GEN-LAST:event_tblsaveActionPerformed

    private void tblsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblsearchActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT * FROM kartu WHERE ID_Anggota='"+tfidang.getText()+"'";
        try{
            Statement stat=conec.createStatement();
            ResultSet rs=stat.executeQuery(sql);
            if(rs.next())
            {
                tfidpen.setText(rs.getString(2));
                aaActionPerformed(new ActionEvent(evt.getSource(),evt.getID(),"KEY PRESS PROCESS"));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "kode tidak ada","PERHATIAN",JOptionPane.WARNING_MESSAGE);
               tfidang.requestFocus();
            }
          stat.close();
        }
        catch(Exception exc){
            System.err.println("Terjadi kesalahan : "+exc);
        }
    }//GEN-LAST:event_tblsearchActionPerformed

    private void tbleditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbleditActionPerformed
        // TODO add your handling code here:
        String sql="update kartu set ID_Pendaftar='"+tfidpen.getText()+"', " + "Nama_Kartu='"+tfnamakartu.getText()+"'" + "where ID_Anggota='"+tfidang.getText().trim()+"'";
        if(tfidang.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Data masih kosong !","Edit Data",JOptionPane.WARNING_MESSAGE);
            tfidang.requestFocus();
        }
        else {
            try {
                Statement stat=conec.createStatement();
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data sudah di edit","Edit Data",JOptionPane.WARNING_MESSAGE);
                stat.close();
                //conec.close();
                tfidpen.setText("");
                tfnip.setText("");
                tfviewnama.setText("");
                tfviewjenis.setText("");
                tfviewjurusan.setText("");
                tfidang.requestFocus();

                nomoran();
                stat.close();

            }
            catch (Exception exc) {
                System.err.println("Error : "+exc);
            }
        }
    }//GEN-LAST:event_tbleditActionPerformed

    private void tbldeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbldeleteActionPerformed
        // TODO add your handling code here:
        String sql="delete from kartu where ID_Anggota='"+tfidang.getText().trim()+"'";
        if(tfidang.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "kode masih kosong !","Hapus Data",JOptionPane.WARNING_MESSAGE);
            tfidang.requestFocus();
        }
        else
        {
            try
            {
                Statement stat=conec.createStatement();
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data sudah dihapus","Hapus Data",JOptionPane.WARNING_MESSAGE);
                stat.close();
                tfidang.setText("");
                tfidpen.setText("");
                tfnip.setText("");
                tfviewnama.setText("");
                tfviewjenis.setText("");
                tfviewjurusan.setText("");
                tfidang.requestFocus();

                nomoran();
            }
            catch(Exception exc)
            {
                System.err.println(sql);
                System.err.println("Error : "+exc);
            }
        }
    }//GEN-LAST:event_tbldeleteActionPerformed

    private void tblcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblcancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_tblcancelActionPerformed

    private void tblprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblprintActionPerformed
        // TODO add your handling code here:
        try {
            String report ="src\\report\\kartu.jrxml";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conec = DriverManager.getConnection("jdbc:mysql://localhost/sistemperpustakaan","root","");
            @SuppressWarnings("rawtypes")
            HashMap hash = new HashMap();
            hash.put("idang", tfidang.getText());
            
            File file = new File(report);
          JasperReport jasperReport = (JasperReport) JRLoader.loadObject(report);
            //JasperReport jasperReport = (JasperReport) JRLoader.loadObject(report);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hash, conec);
            JasperViewer.viewReport(jasperPrint,false);
        } catch (Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_tblprintActionPerformed

    private void tfidpenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfidpenKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            aaActionPerformed(new ActionEvent(evt.getSource(),evt.getID(),"KEY PRESS PROCESS"));
        }
    }//GEN-LAST:event_tfidpenKeyPressed

    private void tblresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblresetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_tblresetActionPerformed

    private void tabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseReleased
        // TODO add your handling code here:
        int baris = tabel.getSelectedRow();
        int kolom = tabel.getSelectedColumn();
        String dataTerpilih = tabel.getValueAt(baris, kolom).toString();
        String kolom1 = tabel.getValueAt(baris, 0).toString();
        String kolom2 = tabel.getValueAt(baris, 1).toString();
        String kolom3 = tabel.getValueAt(baris, 2).toString();
        String kolom4 = tabel.getValueAt(baris, 3).toString();
        String kolom5 = tabel.getValueAt(baris, 4).toString();
        String kolom6 = tabel.getValueAt(baris, 5).toString();
        String kolom7 = tabel.getValueAt(baris, 6).toString();
        tfidang.setText(kolom1);
        tfnamakartu.setText(kolom2);
        tfidpen.setText(kolom3); 
        tfnip.setText(kolom4);        
        tfviewnama.setText(kolom5);
        tfviewjenis.setText(kolom6);
        tfviewjurusan.setText(kolom7);
        
    }//GEN-LAST:event_tabelMouseReleased

        private void aaActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        String sql = "SELECT * FROM anggota WHERE ID_Pendaftar='"+tfidpen.getText()+"'";
        try{
            Statement stat=conec.createStatement();
            ResultSet rs=stat.executeQuery(sql);
            if(rs.next())
            {
                tfnip.setText(rs.getString(2));
                tfviewnama.setText(rs.getString(3));
                tfviewjenis.setText(rs.getString(6));
                tfviewjurusan.setText(rs.getString(8));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "kode tidak ada","PERHATIAN",JOptionPane.WARNING_MESSAGE);
                tfidpen.requestFocus();
            }
            stat.close();
        }
        catch(Exception exc){
            System.err.println("Terjadi kesalahan : "+exc);
        }
        }
    
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
            java.util.logging.Logger.getLogger(Kartu_Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kartu_Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kartu_Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kartu_Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kartu_Anggota().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    private javax.swing.JButton tblcancel;
    private javax.swing.JButton tbldelete;
    private javax.swing.JButton tbledit;
    private javax.swing.JButton tblprint;
    private javax.swing.JButton tblreset;
    private javax.swing.JButton tblsave;
    private javax.swing.JButton tblsearch;
    private javax.swing.JTextField tfidang;
    private javax.swing.JTextField tfidpen;
    private javax.swing.JTextField tfnamakartu;
    private javax.swing.JTextField tfnip;
    private javax.swing.JTextField tfviewjenis;
    private javax.swing.JTextField tfviewjurusan;
    private javax.swing.JTextField tfviewnama;
    // End of variables declaration//GEN-END:variables
    private void koneksiDatabase() {
        //throw new UnsupportedOperationException("Not yet implemented");
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException cnf){}
        try {conec = DriverManager.getConnection("jdbc:mysql://localhost/sistemperpustakaan","root","");
        System.out.println("Koneksi Sukses");
                }
        catch(SQLException se){
            System.out.println("Koneksi Gagal : "+se);
        }
        catch(Exception e){}
    }

    private void nomoran() {
        //throw new UnsupportedOperationException("Not yet implemented");
                String sql = "select right (ID_Anggota,3) as no from kartu order by ID_Anggota asc";
        
        try {
            Statement pst = conec.prepareStatement(sql);
            Statement stat = conec.createStatement();
            ResultSet rs = pst.executeQuery(sql);
            if (rs.first()==false)
            {
                tfidang.setText("A001");
            }
            else {
                rs.last();
                int no = rs.getInt(1)+1;
                String kbinasi = String.valueOf(no);
                int pjg_kbinasi = kbinasi.length();
                String jebot = "";
                for(int i=0; i<3-pjg_kbinasi;i++){
                   // kbinasi = "0"+kbinasi;
                    jebot = jebot+"0";
                }
                tfidang.setText("A"+jebot+kbinasi);
            }
            rs.close();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan:"+e);
            
        }
    }

    private void reset() {
       // throw new UnsupportedOperationException("Not yet implemented");
                tfidpen.setText("");
                tfnip.setText("");
                tfviewnama.setText("");
                tfviewjenis.setText("");
                tfviewjurusan.setText("");
                tfidang.requestFocus();
                
                nomoran();
    }

    private void tabs() {
        String sql="select kartu.ID_Anggota, kartu.Nama_Kartu, kartu.ID_Pendaftar, anggota.NIP_NIS, anggota.Nama, anggota.Jenis_Kelamin, anggota.Jurusan an from kartu "
                + "inner join anggota on anggota.ID_Pendaftar=kartu.ID_Pendaftar order by kartu.ID_Anggota asc";
        DefaultTableModel ax=new DefaultTableModel();
        ax.addColumn("ID_Anggota");
        ax.addColumn("Nama_Kartu");
        ax.addColumn("ID_Pendaftar");
        ax.addColumn("NIP_NIS");
        ax.addColumn("Nama");
        ax.addColumn("Jenis_Kelamin");
        ax.addColumn("Jurusan");
        
        tabel.setModel(ax);
        try{
            Statement stat=conec.createStatement();
            ResultSet rs=stat.executeQuery(sql);
            while(rs.next()){
                
                ax.addRow(new Object[]{rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7)});
                System.out.println("koneksi sukses");

        }

        }
        catch(Exception e){
            System.out.println("Err koneksi gagal");
        }
    }

}
