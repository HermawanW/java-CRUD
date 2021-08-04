/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormSiswa extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel;
    Connection cn = koneksi.Koneksi.Koneksi();
    /**
     * Creates new form FormSiswa
     */
    public void judul() {
        Object[] judul = {
          "NIS", "Nama", "Jurusan", "JK", "Alamat"
        };
        tabModel = new DefaultTableModel(null, judul);
        tableSiswa.setModel(tabModel);
    }

    public void tampilData(String where) {
        try {
          st = cn.createStatement();
          tabModel.getDataVector().removeAllElements();
          tabModel.fireTableDataChanged();
          rs = st.executeQuery("SELECT * FROM students " + where);

          while (rs.next()) {
            Object[] data = {
              rs.getString("nis"),
              rs.getString("nama"),
              rs.getString("jurusan"),
              rs.getString("jk"),
              rs.getString("alamat"),
            };

              tabModel.addRow(data);
          }
        } catch(Exception e) {
          e.printStackTrace();
        }
    }

    public FormSiswa() {
        initComponents();
        judul();
        tampilData("");
        
        jButton4.setEnabled(false);
    }
    public void reset() {
        inputUsername.setText("");
        inputNama.setText("");
        inputJurusan.setSelectedItem("");
        inputJK.setSelectedItem("");
        inputAlamat.setText("");
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputAlamat = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputJurusan = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        inputJK = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSiswa = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Form Siswa");

        inputUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUsernameActionPerformed(evt);
            }
        });

        inputAlamat.setColumns(20);
        inputAlamat.setRows(5);
        jScrollPane1.setViewportView(inputAlamat);

        jLabel2.setText("NIS");

        inputNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama");

        inputJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rekayasa Perangkat Lunak", "Multimedia", "Mekatronika", "Teknik Informasi dan Komputer" }));
        inputJurusan.setToolTipText("");
        inputJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputJurusanActionPerformed(evt);
            }
        });

        jLabel4.setText("Jurusan");

        inputJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        inputJK.setToolTipText("");
        inputJK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputJKActionPerformed(evt);
            }
        });

        jLabel5.setText("JK");

        jLabel6.setText("Alamat");

        tableSiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tableSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSiswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableSiswa);

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Hapus");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Resest");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(16, 16, 16)
                                            .addComponent(jLabel3))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(jLabel4)))
                                    .addGap(2, 2, 2))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inputJK, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inputNama)
                                .addComponent(inputJurusan, 0, 182, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUsernameActionPerformed

    private void inputNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaActionPerformed

    private void inputJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputJurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputJurusanActionPerformed

    private void inputJKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputJKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputJKActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            st = cn.createStatement();
            st.executeUpdate("INSERT INTO students VALUES('" 
                + inputUsername.getText() + "','"
                + inputNama.getText() + "','"
                + inputJurusan.getSelectedItem() + "','"
                + inputJK.getSelectedItem() + "','"
                + inputAlamat.getText() + "')");
            tampilData("");
            JOptionPane.showMessageDialog(null, "Simpan Berhasil");
            inputUsername.setText("");
            inputNama.setText("");
            inputAlamat.setText("");
            inputJurusan.setSelectedItem("");
          } catch (Exception e) {
            e.printStackTrace();
          }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            st = cn.createStatement();
            st.executeUpdate("UPDATE students set " 
                + "nis='"       + inputUsername.getText() + "', "
                + "nama='"      + inputNama.getText() + "', "
                + "jurusan='"   + inputJurusan.getSelectedItem() + "', "
                + "jk='"        + inputJK.getSelectedItem() + "', "
                + "alamat='"    + inputAlamat.getText() + "'");
            tampilData("");
            JOptionPane.showMessageDialog(null, "Update Berhasil");
            reset();
          } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tableSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSiswaMouseClicked
        // TODO add your handling code here:                                        
        inputUsername.setText(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 0).toString());
        inputNama.setText(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 1).toString());
        inputJurusan.setSelectedItem(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 2).toString());
        inputJK.setSelectedItem(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 3).toString());
        inputAlamat.setText(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 4).toString());
        
        jButton4.setEnabled(true);
      
    }//GEN-LAST:event_tableSiswaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            int jawab;

            if ((jawab = JOptionPane.showConfirmDialog(null, "Ingin menghapus data?", "konfirmasi", JOptionPane.YES_NO_OPTION)) == 0) {
              st = cn.createStatement();
              st.executeUpdate("DELETE FROM students WHERE nis='"
                  + tabModel.getValueAt(tableSiswa.getSelectedRow(), 0) + "'");
              tampilData("");
              reset();
            }
          } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea inputAlamat;
    private javax.swing.JComboBox<String> inputJK;
    private javax.swing.JComboBox<String> inputJurusan;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tableSiswa;
    // End of variables declaration//GEN-END:variables

}




