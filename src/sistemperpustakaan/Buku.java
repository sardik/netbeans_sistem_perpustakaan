/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpustakaan;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author INDRA L GHAZALI
 */
public class Buku extends javax.swing.JFrame {
    private Connection conec;

    /**
     * Creates new form Buku
     */
    
    private void tabs(){
        String sql="select * from buku";
        DefaultTableModel ax=new DefaultTableModel();
        ax.addColumn("ID_Buku");
        ax.addColumn("Judul");
        ax.addColumn("Pengarang");
        ax.addColumn("Penerbit");
        ax.addColumn("ISBN");
        ax.addColumn("Tahun");
        ax.addColumn("Kategori");
        
        table.setModel(ax);
        try{
            Statement stat=conec.createStatement();
            ResultSet rs=stat.executeQuery(sql);
            while(rs.next()){
                
                ax.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),});
                System.out.println("koneksi sukses");

        }

        }
        catch(Exception e){
            System.out.println("Err koneksi gagal");
        }   
        }
    
    public Buku() {
        initComponents();
        koneksiDatabase();
        nomoran();
        tabs();
        setLocationRelativeTo(this);
        tfjudul.setWrapStyleWord(true);
        tfjudul.setLineWrap(true);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfidbuku = new javax.swing.JTextField();
        tfpengarang = new javax.swing.JTextField();
        tfpenerbit = new javax.swing.JTextField();
        tfisbn = new javax.swing.JTextField();
        tftahun = new javax.swing.JTextField();
        tfkat = new javax.swing.JTextField();
        tblsave = new javax.swing.JButton();
        tbledit = new javax.swing.JButton();
        tbldelete = new javax.swing.JButton();
        tblcancel = new javax.swing.JButton();
        tblsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfjudul = new javax.swing.JTextArea();
        tblreset = new javax.swing.JButton();
        tfcari = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Form Buku"));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENTRY BUKU");

        jLabel2.setText("ID_Buku");

        jLabel3.setText("Judul");

        jLabel4.setText("Pengarang");

        jLabel5.setText("Penerbit");

        jLabel6.setText("ISBN");

        jLabel7.setText("Tahun");

        jLabel8.setText("Kategori");

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

        tfjudul.setColumns(20);
        tfjudul.setRows(5);
        jScrollPane1.setViewportView(tfjudul);

        tblreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ITransaksi.png"))); // NOI18N
        tblreset.setText("Reset");
        tblreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblresetActionPerformed(evt);
            }
        });

        tfcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfcariKeyReleased(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jLabel9.setText("Cari berdasarkan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfkat, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(tfcari))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tfidbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tblsearch)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jScrollPane1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfpengarang))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfpenerbit)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tftahun, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(tfisbn))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(tblsave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbledit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbldelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblcancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tblreset)
                .addGap(0, 171, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfidbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tblsearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfpengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfpenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfisbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tftahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tblsave)
                        .addComponent(tbledit)
                        .addComponent(tbldelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tblcancel)
                            .addComponent(tblreset))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblsearchActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT * FROM buku WHERE ID_Buku='"+tfidbuku.getText()+"'";
        try{
            Statement stat=conec.createStatement();
            ResultSet rs=stat.executeQuery(sql);
            if(rs.next())
            {
                tfjudul.setText(rs.getString(2));
                tfpengarang.setText(rs.getString(3));
                tfpenerbit.setText(rs.getString(4));
                tfisbn.setText(rs.getString(5));
                tftahun.setText(rs.getString(6));
                tfkat.setText(rs.getString(7));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "kode tidak ada","PERHATIAN",JOptionPane.WARNING_MESSAGE);
                tfidbuku.requestFocus();
            }
            stat.close();
        }
        catch(Exception exc){
            System.err.println("Terjadi kesalahan : "+exc);
        }
    }//GEN-LAST:event_tblsearchActionPerformed

    private void tblsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblsaveActionPerformed
        // TODO add your handling code here:
        String vid       = tfidbuku.getText();
        String vjudul    = tfjudul.getText();
        String vpeng     = tfpengarang.getText();
        String vpenerbit = tfpenerbit.getText();
        String visbn     = tfisbn.getText();
        String vtahun    = tftahun.getText();
        String vkat      = tfkat.getText();
        if (tfjudul.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Data belum lengkap !!!",
                "PERHATIAN", JOptionPane.WARNING_MESSAGE);
        }
        else {
            try {
                java.sql.Statement stat=conec.createStatement();
                ResultSet data=stat.executeQuery("SELECT * FROM buku WHERE ID_Buku='"+tfidbuku.getText()+"'");
                if (data.next()){
                    JOptionPane.showMessageDialog(null,"ID Buku sudah dimasukkan");
                    tfidbuku.requestFocus();
                }
                else {
                    String sql = "INSERT INTO buku VALUES('"+vid+"','"+vjudul+"','"+vpeng+"','"+vpenerbit+"','"+visbn+"','"+vtahun+"','"+vkat+"')";
                    stat.executeUpdate(sql);
                    tfidbuku.setText("");
                    tfjudul.setText("");
                    tfpengarang.setText("");
                    tfpenerbit.setText("");
                    tfisbn.setText("");
                    tftahun.setText("");
                    tfkat.setText("");
                    tfidbuku.requestFocus();
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
        String sql="update buku set Judul='"+tfjudul.getText()+"',Pengarang='"+tfpengarang.getText()+"',Penerbit='"+tfpenerbit.getText()+"',ISBN='"+tfisbn.getText()+"',Tahun='"+tftahun.getText()+"',Kategori='"+tfkat.getText()+"'"+ "where ID_Buku='"+tfidbuku.getText().trim()+"'";
        if(tfidbuku.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Data masih kosong !","Edit Data",JOptionPane.WARNING_MESSAGE);
            tfidbuku.requestFocus();
        }
        else {
            try {
                Statement stat=conec.createStatement();
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data sudah di edit","Edit Data",JOptionPane.WARNING_MESSAGE);
                stat.close();
                //conec.close();
                tfidbuku.setText("");
                tfjudul.setText("");
                tfpengarang.setText("");
                tfpenerbit.setText("");
                tfisbn.setText("");
                tftahun.setText("");
                tfkat.setText("");
                tfidbuku.requestFocus();

                nomoran();
                stat.close();

            }
            catch (Exception exc) {
                System.err.println("Error : "+exc);
            }
            tabs();
        }
    }//GEN-LAST:event_tbleditActionPerformed

    private void tbldeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbldeleteActionPerformed
        // TODO add your handling code here:
        String sql="delete from buku where ID_Buku='"+tfidbuku.getText().trim()+"'";
        if(tfidbuku.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "kode masih kosong !","Hapus Data",JOptionPane.WARNING_MESSAGE);
            tfidbuku.requestFocus();
        }
        else
        {
            try
            {
                Statement stat=conec.createStatement();
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data sudah dihapus","Hapus Data",JOptionPane.WARNING_MESSAGE);
                stat.close();
                tfidbuku.setText("");
                tfjudul.setText("");
                tfpengarang.setText("");
                tfpenerbit.setText("");
                tfisbn.setText("");
                tftahun.setText("");
                tfkat.setText("");
                tfidbuku.requestFocus();

                nomoran();
            }
            catch(Exception exc)
            {
                System.err.println(sql);
                System.err.println("Error : "+exc);
            }
            tabs();
        }
    }//GEN-LAST:event_tbldeleteActionPerformed

    private void tblcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblcancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_tblcancelActionPerformed

    private void tblresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblresetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_tblresetActionPerformed

    private void tfcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfcariKeyReleased
        // TODO add your handling code here:
        caritabel();
    }//GEN-LAST:event_tfcariKeyReleased

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased
        // TODO add your handling code here:
        int baris = table.getSelectedRow();
        int kolom = table.getSelectedColumn();
        String dataTerpilih = table.getValueAt(baris, kolom).toString();
        String kolom1 = table.getValueAt(baris, 0).toString();
        String kolom2 = table.getValueAt(baris, 1).toString();
        String kolom3 = table.getValueAt(baris, 2).toString();
        String kolom4 = table.getValueAt(baris, 3).toString();
        String kolom5 = table.getValueAt(baris, 4).toString();
        String kolom6 = table.getValueAt(baris, 5).toString();
        String kolom7 = table.getValueAt(baris, 6).toString();
        tfidbuku.setText(kolom1);       
        tfjudul.setText(kolom2);
        tfpengarang.setText(kolom3);
        tfpenerbit.setText(kolom4);
        tfisbn.setText(kolom5);
        tftahun.setText(kolom6);
        tfkat.setText(kolom7);
    }//GEN-LAST:event_tableMouseReleased

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
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buku().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    private javax.swing.JButton tblcancel;
    private javax.swing.JButton tbldelete;
    private javax.swing.JButton tbledit;
    private javax.swing.JButton tblreset;
    private javax.swing.JButton tblsave;
    private javax.swing.JButton tblsearch;
    private javax.swing.JTextField tfcari;
    private javax.swing.JTextField tfidbuku;
    private javax.swing.JTextField tfisbn;
    private javax.swing.JTextArea tfjudul;
    private javax.swing.JTextField tfkat;
    private javax.swing.JTextField tfpenerbit;
    private javax.swing.JTextField tfpengarang;
    private javax.swing.JTextField tftahun;
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
                String sql = "select right (ID_Buku,3) as no from buku order by ID_Buku asc";
        
        try {
            Statement pst = conec.prepareStatement(sql);
            Statement stat = conec.createStatement();
            ResultSet rs = pst.executeQuery(sql);
            if (rs.first()==false)
            {
                tfidbuku.setText("B001");
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
                tfidbuku.setText("B"+jebot+kbinasi);
            }
            rs.close();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan:"+e);
            
        }
    }

    private void reset() {
      //  throw new UnsupportedOperationException("Not yet implemented");
                tfjudul.setText("");
                tfpengarang.setText("");
                tfpenerbit.setText("");
                tfisbn.setText("");
                tftahun.setText("");
                tfkat.setText("");
                tfidbuku.requestFocus();

                nomoran();
    }

    private void caritabel() {
       // throw new UnsupportedOperationException("Not yet implemented");
        String sql = "SELECT * FROM buku where ID_Buku like '%"+tfcari.getText()+"%' or Judul like '%"+tfcari.getText()+"%' or Kategori like '%"+tfcari.getText()+"%'";
        DefaultTableModel a = new DefaultTableModel();
        a.addColumn("ID_Buku");
        a.addColumn("Judul");
        a.addColumn("Pengarang");
        a.addColumn("Penerbit");
        a.addColumn("ISBN");
        a.addColumn("Tahun");
        a.addColumn("Kategori");
        table.setModel(a);
        try {
            Statement stat = conec.createStatement();
            ResultSet rs=stat.executeQuery(sql);
            while(rs.next()){
                a.addRow(new Object[]{
                    rs.getString("ID_Buku"),
                    rs.getString("Judul"),
                    rs.getString("Pengarang"),
                    rs.getString("Penerbit"),
                    rs.getString("ISBN"),
                    rs.getString("Tahun"),
                    rs.getString("Kategori"),
                });
                    System.out.println("Tabel Sukses");
            }
        } catch (Exception e) {
            System.out.println("Tabel Gagal");
        }
    }
}
