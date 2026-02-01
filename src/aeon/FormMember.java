package aeon;

import convig.convig;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FormMember extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormMember.class.getName());
    
private byte[] photoBytes;

private MemberPage parent;

    public FormMember() {
        initComponents();
}
    public FormMember(MemberPage p) {
        parent = p;
        initComponents();
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        stage = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        nama = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        birthday = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        posisi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nasional = new javax.swing.JTextField();
        uploadPhoto = new javax.swing.JButton();
        lblPhoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Member");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255, 150));

        jLabel2.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(104, 67, 31));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADD NEW MEMBER");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(133, 95, 65));
        jLabel5.setText("Member Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(133, 95, 65));
        jLabel6.setText("Stage Name");

        stage.setBackground(new java.awt.Color(103, 89, 75));
        stage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        stage.setForeground(new java.awt.Color(255, 255, 255));
        stage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stageActionPerformed(evt);
            }
        });

        save.setBackground(new java.awt.Color(119, 87, 59));
        save.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        nama.setBackground(new java.awt.Color(103, 89, 75));
        nama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nama.setForeground(new java.awt.Color(255, 255, 255));
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(133, 95, 65));
        jLabel7.setText("Birthday");

        birthday.setBackground(new java.awt.Color(103, 89, 75));
        birthday.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        birthday.setForeground(new java.awt.Color(255, 255, 255));
        birthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthdayActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(133, 95, 65));
        jLabel8.setText("Position");

        posisi.setBackground(new java.awt.Color(103, 89, 75));
        posisi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        posisi.setForeground(new java.awt.Color(255, 255, 255));
        posisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posisiActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(133, 95, 65));
        jLabel9.setText("Image");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(133, 95, 65));
        jLabel10.setText("Nationality");

        nasional.setBackground(new java.awt.Color(103, 89, 75));
        nasional.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nasional.setForeground(new java.awt.Color(255, 255, 255));
        nasional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nasionalActionPerformed(evt);
            }
        });

        uploadPhoto.setBackground(new java.awt.Color(103, 89, 75));
        uploadPhoto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        uploadPhoto.setForeground(new java.awt.Color(255, 255, 255));
        uploadPhoto.setText("Upload Photo");
        uploadPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadPhotoActionPerformed(evt);
            }
        });

        lblPhoto.setBackground(new java.awt.Color(103, 89, 75));
        lblPhoto.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblPhoto.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stage, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(nasional, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(325, 325, 325))
                        .addComponent(posisi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(uploadPhoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(save)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(posisi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nasional, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 69, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(save)
                            .addComponent(uploadPhoto))
                        .addGap(33, 33, 33)))
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 430, 520));

        jLabel1.setBackground(new java.awt.Color(103, 89, 75));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\SMK_ijahh\\KELAS_11\\PBTGM\\project-kelompok(login-regis-crud)\\aeon_entertainment\\src\\assets\\bg-form-member.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1070, 600));

        setSize(new java.awt.Dimension(1086, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void stageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stageActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
    try {
            Connection conn = convig.ConvigDB();

            String sql = "INSERT INTO members "
                       + "(name_member, stage_name, birthdate, position, nationality, image_member) "
                       + "VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, nama.getText());
            pst.setString(2, stage.getText());
            pst.setString(3, birthday.getText());
            pst.setString(4, posisi.getText());
            pst.setString(5, nasional.getText());
            pst.setBytes(6, photoBytes);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
            this.dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Gagal menyimpan: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void birthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthdayActionPerformed

    private void posisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_posisiActionPerformed

    private void nasionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nasionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nasionalActionPerformed

    private void uploadPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadPhotoActionPerformed
       try {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);

            File file = chooser.getSelectedFile();
            FileInputStream fis = new FileInputStream(file);

            photoBytes = fis.readAllBytes();

            ImageIcon icon = new ImageIcon(photoBytes);
            Image img = icon.getImage().getScaledInstance(
                    lblPhoto.getWidth(),
                    lblPhoto.getHeight(),
                    Image.SCALE_SMOOTH);

            lblPhoto.setIcon(new ImageIcon(img));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Upload gagal");
        }
    }//GEN-LAST:event_uploadPhotoActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormMember().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField birthday;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nasional;
    private javax.swing.JTextField posisi;
    private javax.swing.JButton save;
    private javax.swing.JTextField stage;
    private javax.swing.JButton uploadPhoto;
    // End of variables declaration//GEN-END:variables
}
