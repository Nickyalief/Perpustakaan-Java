/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

/**
 *
 * @author TOSHIBA
 */
public class FormBuku extends javax.swing.JFrame {

    private DefaultTableModel DftTblModel_buku;
    private String SQL;

    public void TampilData() {
        DftTblModel_buku = new DefaultTableModel();
        DftTblModel_buku.addColumn("ID Buku");
        DftTblModel_buku.addColumn("Judul Buku");
        DftTblModel_buku.addColumn("Pengarang");
        DftTblModel_buku.addColumn("Penerbit");
        DftTblModel_buku.addColumn("Kode Rak");
        DftTblModel_buku.addColumn("Jumlah Buku");
        jTable_buku.setModel(DftTblModel_buku);
        Connection conn = koneksi.getConnection();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select * from buku";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while (res.next()) {
                DftTblModel_buku.addRow(new Object[]{
                    res.getString("id_buku"),
                    res.getString("judul"),
                    res.getString("pengarang"),
                    res.getString("penerbit"),
                    res.getString("kode_rak"),
                    res.getString("jumlah_buku")
                });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }
    }

    /**
     * Creates new form FormBuku
     */
    public FormBuku() {
        initComponents();
        this.TampilData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_idBuku = new javax.swing.JTextField();
        jTextField_judulBuku = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_pengarang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_penerbit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_kodeRak = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_jumlahBuku = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_buku = new javax.swing.JTable();
        jButton_edit = new javax.swing.JButton();
        jButton_hapus = new javax.swing.JButton();
        jButton_baru = new javax.swing.JButton();
        jButton_simpan = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("ID Buku");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 20));
        getContentPane().add(jTextField_idBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 210, -1));
        getContentPane().add(jTextField_judulBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 210, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Judul Buku");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 20));
        getContentPane().add(jTextField_pengarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 210, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Pengarang");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 20));
        getContentPane().add(jTextField_penerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 210, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Penerbit");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 20));
        getContentPane().add(jTextField_kodeRak, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 210, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Kode Rak");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 100, 20));
        getContentPane().add(jTextField_jumlahBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 210, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Jumlah Buku");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, 20));

        jTable_buku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Buku", "Judul Buku", "Pengarang", "Penerbit", "Kode Rak", "Jumlah Buku"
            }
        ));
        jTable_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_bukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_buku);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 10, 480, 280));

        jButton_edit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton_edit.setText("Edit");
        jButton_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 150, 30));

        jButton_hapus.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton_hapus.setText("Hapus");
        jButton_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hapusActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 150, 30));

        jButton_baru.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton_baru.setText("Baru");
        jButton_baru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_baruMouseClicked(evt);
            }
        });
        getContentPane().add(jButton_baru, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 30));

        jButton_simpan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton_simpan.setText("Simpan");
        jButton_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_simpanActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 150, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form/bgPerpus.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_simpanActionPerformed
        try {
            Connection conn = koneksi.getConnection();
            PreparedStatement stmt = conn.prepareStatement("insert into buku (judul,pengarang,penerbit,kode_rak,jumlah_buku) values (?,?,?,?,?)");
            stmt.setString(1, jTextField_judulBuku.getText());
            stmt.setString(2, jTextField_pengarang.getText());
            stmt.setString(3, jTextField_penerbit.getText());
            stmt.setString(4, jTextField_kodeRak.getText());
            stmt.setString(5, jTextField_jumlahBuku.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            TampilData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton_simpanActionPerformed

    private void jTable_bukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_bukuMouseClicked
        int baris = jTable_buku.getSelectedRow();
        jTextField_idBuku.setText(DftTblModel_buku.getValueAt(baris, 0).toString());
        jTextField_judulBuku.setText(DftTblModel_buku.getValueAt(baris, 1).toString());
        jTextField_pengarang.setText(DftTblModel_buku.getValueAt(baris, 2).toString());
        jTextField_penerbit.setText(DftTblModel_buku.getValueAt(baris, 3).toString());
        jTextField_kodeRak.setText(DftTblModel_buku.getValueAt(baris, 4).toString());
        jTextField_jumlahBuku.setText(DftTblModel_buku.getValueAt(baris, 5).toString());
    }//GEN-LAST:event_jTable_bukuMouseClicked

    private void jButton_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editActionPerformed
        try {
            Connection conn = koneksi.getConnection();
            PreparedStatement stmt = conn.prepareStatement("update buku set judul=?, pengarang=?, penerbit=?, kode_rak=?, jumlah_buku=? where id_buku=?");
            stmt.setString(1, jTextField_judulBuku.getText());
            stmt.setString(2, jTextField_pengarang.getText());
            stmt.setString(3, jTextField_penerbit.getText());
            stmt.setString(4, jTextField_kodeRak.getText());
            stmt.setString(5, jTextField_jumlahBuku.getText());
            stmt.setString(6, jTextField_idBuku.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            TampilData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton_editActionPerformed

    private void jButton_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hapusActionPerformed
        Connection conn = koneksi.getConnection();
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data tersebut?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirm == 0) {
            try {
                java.sql.PreparedStatement stmt = conn.prepareStatement("delete from buku where id_buku='" + jTextField_idBuku.getText() + "'");
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                TampilData();
                jTextField_idBuku.setText("");
                jTextField_judulBuku.setText("");
                jTextField_pengarang.setText("");
                jTextField_penerbit.setText("");
                jTextField_kodeRak.setText("");
                jTextField_jumlahBuku.setText("");
                jTextField_idBuku.requestFocus();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus" + e.getMessage(), "Pesan", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton_hapusActionPerformed

    private void jButton_baruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_baruMouseClicked
  
    }//GEN-LAST:event_jButton_baruMouseClicked

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
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_baru;
    private javax.swing.JButton jButton_edit;
    private javax.swing.JButton jButton_hapus;
    private javax.swing.JButton jButton_simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_buku;
    private javax.swing.JTextField jTextField_idBuku;
    private javax.swing.JTextField jTextField_judulBuku;
    private javax.swing.JTextField jTextField_jumlahBuku;
    private javax.swing.JTextField jTextField_kodeRak;
    private javax.swing.JTextField jTextField_penerbit;
    private javax.swing.JTextField jTextField_pengarang;
    // End of variables declaration//GEN-END:variables
}
