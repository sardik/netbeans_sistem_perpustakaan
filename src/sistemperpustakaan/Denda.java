/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpustakaan;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author INDRA L GHAZALI
 */
public class Denda extends javax.swing.JFrame {
    private Connection conec;

    /**
     * Creates new form Jenisdenda
     */
    
    private void tabs(){
        String sql="select * from denda";
        DefaultTableModel ax=new DefaultTableModel();
        ax.addColumn("KD_Denda");
        ax.addColumn("Jenis_Denda");
        ax.addColumn("Biaya");
        
        tabdenda.setModel(ax);
        try{
            Statement stat=conec.createStatement();
            ResultSet rs=stat.executeQuery(sql);
            while(rs.next()){
                
                ax.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3)});
                System.out.println("koneksi sukses");

        }

        }
        catch(Exception e){
            System.out.println("Err koneksi gagal");
        }   
        }
    
    public Denda() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfkode = new javax.swing.JTextField();
        cbjenis = new javax.swing.JComboBox();
        tfbiaya = new javax.swing.JTextField();
        tblsave = new javax.swing.JButton();
        tbledit = new javax.swing.JButton();
        tbldelete = new javax.swing.JButton();
        tblcancel = new javax.swing.JButton();
        tblsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabdenda = new javax.swing.JTable();
        tblreset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Form Denda"));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENTRY JENIS DENDA");

        jLabel2.setText("KD Denda");

        jLabel3.setText("Jenis Denda");

        jLabel4.setText("Biaya");

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "::Pilih Jenis Denda::", "Hilang", "Rusak", "Telat" }));

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

        tabdenda.setModel(new javax.swing.table.DefaultTableModel(
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
        tabdenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabdendaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabdenda);

        tblreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ITransaksi.png"))); // NOI18N
        tblreset.setText("Reset");
        tblreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfkode, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbjenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfbiaya)))
                                .addGap(10, 10, 10)
                                .addComponent(tblsearch))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tblsave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbledit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbldelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tblcancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tblreset)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tblsearch))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfbiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tblsave)
                    .addComponent(tbledit)
                    .addComponent(tbldelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tblcancel)
                    .addComponent(tblreset))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblsearchActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT * FROM denda WHERE KD_Denda='"+tfkode.getText()+"'";
        try{
            Statement stat=conec.createStatement();
            ResultSet rs=stat.executeQuery(sql);
            if(rs.next())
            {
                cbjenis.setSelectedItem(rs.getString(2));
                tfbiaya.setText(rs.getString(3));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "kode tidak ada","PERHATIAN",JOptionPane.WARNING_MESSAGE);
                tfkode.requestFocus();
            }
            stat.close();
        }
        catch(Exception exc){
            System.err.println("Terjadi kesalahan : "+exc);
        }
    }//GEN-LAST:event_tblsearchActionPerformed

    private void tblsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblsaveActionPerformed
        // TODO add your handling code here:
        String vid       = tfkode.getText();
        String vjenis    = cbjenis.getSelectedItem().toString();
        String vbiaya    = tfbiaya.getText();
        if (tfbiaya.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Data belum lengkap !!!",
                "PERHATIAN", JOptionPane.WARNING_MESSAGE);
        }
        else {
            try {
                java.sql.Statement stat=conec.createStatement();
                ResultSet data=stat.executeQuery("SELECT * FROM denda WHERE KD_Denda='"+tfkode.getText()+"'");
                if (data.next()){
                    JOptionPane.showMessageDialog(null,"Kode Denda sudah dimasukkan");
                    tfkode.requestFocus();
                }
                else {
                    String sql = "INSERT INTO denda VALUES('"+vid+"','"+vjenis+"','"+vbiaya+"')";
                    stat.executeUpdate(sql);
                    tfkode.setText("");
                    cbjenis.setSelectedIndex(0);
                    tfbiaya.setText("");
                    tfkode.requestFocus();
                }
                nomoran();
                stat.close();
            }
            catch (Exception exc){
                System.err.println("Terjadi Kesalahan :"+exc);
            }
            tabs();
        }
    }//GEN-LAST:event_tblsaveActionPerformed

    private void tbleditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbleditActionPerformed
        // TODO add your handling code here:
        String sql="update denda set Jenis_Denda='"+cbjenis.getSelectedItem()+"',Biaya='"+tfbiaya.getText()+"'where KD_Denda='"+tfkode.getText().trim()+"'";
        if(tfkode.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Data masih kosong !","Edit Data",JOptionPane.WARNING_MESSAGE);
            tfkode.requestFocus();
        }
        else {
            try {
                Statement stat=conec.createStatement();
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data sudah di edit","Edit Data",JOptionPane.WARNING_MESSAGE);
                stat.close();
                //conec.close();
                tfkode.setText("");
                cbjenis.setSelectedIndex(0);
                tfbiaya.setText("");
                tfkode.requestFocus();

                nomoran();
                stat.close();

            }
            catch (Exception exc) {
                System.err.println("Error : "+exc);
            }
        }
        tabs();
    }//GEN-LAST:event_tbleditActionPerformed

    private void tbldeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbldeleteActionPerformed
        // TODO add your handling code here:
        String sql="delete from denda where KD_Denda='"+tfkode.getText().trim()+"'";
        if(tfkode.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "kode masih kosong !","Hapus Data",JOptionPane.WARNING_MESSAGE);
            tfkode.requestFocus();
        }
        else
        {
            try
            {
                Statement stat=conec.createStatement();
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data sudah dihapus","Hapus Data",JOptionPane.WARNING_MESSAGE);
                stat.close();
                tfkode.setText("");
                cbjenis.setSelectedIndex(0);
                tfbiaya.setText("");
                tfkode.requestFocus();

                nomoran();
            }
            catch(Exception exc)
            {
                System.err.println(sql);
                System.err.println("Error : "+exc);
            }
        }
        tabs();
    }//GEN-LAST:event_tbldeleteActionPerformed

    private void tblcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblcancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_tblcancelActionPerformed

    private void tabdendaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabdendaMouseReleased
        // TODO add your handling code here:
        int baris = tabdenda.getSelectedRow();
        int kolom = tabdenda.getSelectedColumn();
        String dataTerpilih = tabdenda.getValueAt(baris, kolom).toString();
        String kolom1 = tabdenda.getValueAt(baris, 0).toString();
        String kolom2 = tabdenda.getValueAt(baris, 1).toString();
        String kolom3 = tabdenda.getValueAt(baris, 2).toString();
        tfkode.setText(kolom1);       
        cbjenis.setSelectedItem(kolom2);
        tfbiaya.setText(kolom3);
    }//GEN-LAST:event_tabdendaMouseReleased

    private void tblresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblresetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_tblresetActionPerformed

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
            java.util.logging.Logger.getLogger(Denda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Denda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Denda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Denda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Denda().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbjenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabdenda;
    private javax.swing.JButton tblcancel;
    private javax.swing.JButton tbldelete;
    private javax.swing.JButton tbledit;
    private javax.swing.JButton tblreset;
    private javax.swing.JButton tblsave;
    private javax.swing.JButton tblsearch;
    private javax.swing.JTextField tfbiaya;
    private javax.swing.JTextField tfkode;
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
       // throw new UnsupportedOperationException("Not yet implemented");
        String sql = "select right (KD_Denda,3) as no from denda order by KD_Denda asc";
        
        try {
            Statement pst = conec.prepareStatement(sql);
            Statement stat = conec.createStatement();
            ResultSet rs = pst.executeQuery(sql);
            if (rs.first()==false)
            {
                tfkode.setText("D001");
            }
            else {
                rs.last();
                int no = rs.getInt(1)+1;
                String kbinasi = String.valueOf(no);
                int p_kmbinasi = kbinasi.length();
                String zero = "";
                for(int i=0; i<3-p_kmbinasi;i++){
                   // kbinasi = "0"+kbinasi;
                    zero = zero+"0";
                }
                tfkode.setText("D"+zero+kbinasi);
            }
            rs.close();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan:"+e);
            
        }

    }

    private void reset() {
        //throw new UnsupportedOperationException("Not yet implemented");
                cbjenis.setSelectedItem("::Pilih Jenis Denda::");
                tfbiaya.setText("");
                tfkode.requestFocus();

                nomoran();
    }
}
