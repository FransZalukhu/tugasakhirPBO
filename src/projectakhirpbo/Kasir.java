/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectakhirpbo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import java.sql.SQLException;
//import java.sql.Statement;

/**
 *
 * @author Asus
 */
public class Kasir extends javax.swing.JFrame {

    public Kasir() {
        initComponents();
        ReadSeller();
        addTableListener();
    }

    public void ReadSeller() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Minimarket", "root", "");
            String query = "SELECT * FROM tbl_kasir";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            tbl_kasir.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addTableListener() {
        tbl_kasir.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                int row = tbl_kasir.getSelectedRow();
                if (row >= 0) {
                    id_kasir.setText(tbl_kasir.getValueAt(row, 0).toString());
                    nama_kasir.setText(tbl_kasir.getValueAt(row, 1).toString());
                    password.setText(tbl_kasir.getValueAt(row, 2).toString());
                    jenis_kelamin.setSelectedItem(tbl_kasir.getValueAt(row, 3).toString());
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        id_kasir = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        nama_kasir = new javax.swing.JTextField();
        label6 = new java.awt.Label();
        jenis_kelamin = new javax.swing.JComboBox<>();
        add_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        password = new javax.swing.JTextField();
        label7 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_kasir = new javax.swing.JTable();
        label5 = new java.awt.Label();
        data_kasir = new java.awt.Label();
        data_produk = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setForeground(new java.awt.Color(0, 153, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        id_kasir.setBackground(new java.awt.Color(255, 255, 255));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 153, 255));
        label1.setText("KASIR");

        label2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 153, 255));
        label2.setText("ID KASIR");

        label3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 153, 255));
        label3.setText("NAMA");

        nama_kasir.setBackground(new java.awt.Color(255, 255, 255));

        label6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 153, 255));
        label6.setText("JENIS KELAMIN");

        jenis_kelamin.setBackground(new java.awt.Color(0, 153, 255));
        jenis_kelamin.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jenis_kelamin.setForeground(new java.awt.Color(255, 255, 255));
        jenis_kelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));
        jenis_kelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenis_kelaminActionPerformed(evt);
            }
        });

        add_btn.setBackground(new java.awt.Color(0, 204, 51));
        add_btn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        add_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_btn.setText("Tambah");
        add_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_btnMouseClicked(evt);
            }
        });

        update_btn.setBackground(new java.awt.Color(255, 204, 0));
        update_btn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        update_btn.setForeground(new java.awt.Color(0, 0, 0));
        update_btn.setText("Update");
        update_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_btnMouseClicked(evt);
            }
        });

        delete_btn.setBackground(new java.awt.Color(255, 0, 51));
        delete_btn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(255, 255, 255));
        delete_btn.setText("Delete");
        delete_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_btnMouseClicked(evt);
            }
        });

        password.setBackground(new java.awt.Color(255, 255, 255));

        label7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label7.setForeground(new java.awt.Color(0, 153, 255));
        label7.setText("PASSWORD");

        tbl_kasir.setBackground(new java.awt.Color(255, 255, 255));
        tbl_kasir.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        tbl_kasir.setForeground(new java.awt.Color(0, 153, 255));
        tbl_kasir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID_KASIR", "NAMA", "JENIS_KELAMIN", "PASSWORD"
            }
        ));
        tbl_kasir.setRowHeight(25);
        tbl_kasir.setSelectionBackground(new java.awt.Color(0, 153, 255));
        tbl_kasir.setSelectionForeground(new java.awt.Color(102, 102, 102));
        tbl_kasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_kasirMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_kasir);

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 153, 255));
        label5.setText("DATA KASIR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama_kasir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_kasir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password)
                            .addComponent(jenis_kelamin, 0, 134, Short.MAX_VALUE))
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(396, 396, 396))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 49, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(372, 372, 372))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_kasir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama_kasir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jenis_kelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        data_kasir.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        data_kasir.setForeground(new java.awt.Color(255, 255, 255));
        data_kasir.setText("Data Kasir");
        data_kasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                data_kasirMouseClicked(evt);
            }
        });

        data_produk.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        data_produk.setForeground(new java.awt.Color(255, 255, 255));
        data_produk.setText("Data Produk");
        data_produk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                data_produkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(data_kasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(data_produk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(data_kasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(data_produk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jenis_kelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenis_kelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenis_kelaminActionPerformed

    private void add_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_btnMouseClicked
        String id = id_kasir.getText();
        String name = nama_kasir.getText();
        String pass = password.getText();
        String gender = jenis_kelamin.getSelectedItem().toString();

        if (id.isEmpty() || name.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mohon mengisi semua field", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Minimarket", "root", "");
            String query = "INSERT INTO tbl_kasir VALUES (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, id);
            pst.setString(2, name);
            pst.setString(3, pass);
            pst.setString(4, gender);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data kasir berhasil ditambahkan");
            con.close();
            ReadSeller();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_add_btnMouseClicked

    private void update_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_btnMouseClicked
        String id = id_kasir.getText();
        String name = nama_kasir.getText();
        String pass = password.getText();
        String gender = jenis_kelamin.getSelectedItem().toString();

        if (id.isEmpty() || name.isEmpty() || pass.isEmpty() || gender.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mohon mengisi semua field", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Minimarket", "root", "");
            String query = "UPDATE tbl_kasir SET nama_kasir = ?, password = ?, jenis_kelamin = ? WHERE id_kasir = ? ";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, pass);
            pst.setString(3, gender);
            pst.setString(4, id);
            int rowsUpdated = pst.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Data kasir berhasil diupdate");
            } else {
                JOptionPane.showMessageDialog(this, "ID kasir tidak ditemukan", "Error", JOptionPane.ERROR_MESSAGE);
            }

            con.close();
            ReadSeller();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_update_btnMouseClicked

    private void delete_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_btnMouseClicked
        String id = id_kasir.getText();

        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mohon mengisi ID kasir", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Minimarket", "root", "");
            String query = "DELETE FROM tbl_kasir WHERE id_kasir = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, id);
            int rowsDeleted = pst.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(this, "Data kasir berhasil dihapus");
            } else {
                JOptionPane.showMessageDialog(this, "ID kasir tidak ditemukan", "Error", JOptionPane.ERROR_MESSAGE);
            }

            con.close();
            ReadSeller();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_delete_btnMouseClicked

    private void data_kasirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_kasirMouseClicked
        // Membuat instance dari form kasir
        Kasir kasirForm = new Kasir();

        // Menampilkan form kasir
        kasirForm.setVisible(true);

        // Menutup form saat ini
        this.dispose();
    }//GEN-LAST:event_data_kasirMouseClicked

    private void data_produkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_produkMouseClicked
        // Membuat instance dari form produk
        Products productsForm = new Products();

        // Menampilkan form produk
        productsForm.setVisible(true);

        // Menutup form saat ini
        this.dispose();
    }//GEN-LAST:event_data_produkMouseClicked

    private void tbl_kasirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_kasirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_kasirMouseClicked

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
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private java.awt.Label data_kasir;
    private java.awt.Label data_produk;
    private javax.swing.JButton delete_btn;
    private javax.swing.JTextField id_kasir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jenis_kelamin;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private javax.swing.JTextField nama_kasir;
    private javax.swing.JTextField password;
    private javax.swing.JTable tbl_kasir;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
