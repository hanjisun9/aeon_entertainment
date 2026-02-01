package aeon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.awt.Image;
import java.awt.Dimension;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BorderFactory;

public class MemberPage extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MemberPage.class.getName());
    
Group currentGroup;
   
    public MemberPage(Group g) {
    currentGroup = g;
    initComponents();
    setTitle("Member of " + g.name);
    
    setBackgroundFromGroup();   
    
    jPanel3.setLayout(new java.awt.FlowLayout(
            java.awt.FlowLayout.LEFT, 15, 15));

    jScrollPane2.setViewportView(jPanel3);
    
    loadMembers();
    }
    
    private void loadMembers() {
        try {
            Connection conn = convig.convig.ConvigDB();
            String sql = "SELECT * FROM members WHERE group_id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
                pst.setInt(1, currentGroup.getId());


            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Member m = new Member(
                    rs.getString("name_member"),
                    rs.getString("stage_name"),
                    rs.getString("birthdate"),
                    rs.getString("position"),
                    rs.getString("nationality"),
                    rs.getBytes("image_member")
                );
                addMemberCard(m);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    public void addMemberCard(Member m) {
     JPanel card = new JPanel();
    card.setPreferredSize(new Dimension(180, 260));
    card.setBackground(Color.WHITE);
    card.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    card.setLayout(new java.awt.BorderLayout());

    // FOTO
    JLabel photoLabel = new JLabel();
    photoLabel.setPreferredSize(new Dimension(150, 200));
    photoLabel.setHorizontalAlignment(JLabel.CENTER);

    if (m.photo != null) {
        ImageIcon icon = new ImageIcon(m.photo);
        Image img = icon.getImage().getScaledInstance(
                150, 200, Image.SCALE_SMOOTH);
        photoLabel.setIcon(new ImageIcon(img));
    }

    // TEXT
    JLabel nameLabel = new JLabel(m.name, JLabel.CENTER);
    JLabel stageLabel = new JLabel(m.stage, JLabel.CENTER);

    JPanel textPanel = new JPanel(new java.awt.GridLayout(2, 1));
    textPanel.setBackground(Color.WHITE);
    textPanel.add(nameLabel);
    textPanel.add(stageLabel);

    card.add(photoLabel, java.awt.BorderLayout.CENTER);
    card.add(textPanel, java.awt.BorderLayout.SOUTH);

    jPanel3.add(card);
    jPanel3.revalidate();
    jPanel3.repaint();  
}
private void setBackgroundFromGroup() {
    if (currentGroup.imageUrl != null && !currentGroup.imageUrl.isEmpty()) {
        ImageIcon icon = new ImageIcon(currentGroup.imageUrl);
        Image img = icon.getImage().getScaledInstance(
                jLabel2.getWidth(),
                jLabel2.getHeight(),
                Image.SCALE_SMOOTH
        );
        jLabel2.setIcon(new ImageIcon(img));
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        TambahMember = new javax.swing.JButton();
        dashboard = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Member NCT Page");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(135, 119, 107, 150));
        jPanel1.setForeground(new java.awt.Color(103, 89, 75));
        jPanel1.setToolTipText("");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(66, 33, 4));

        TambahMember.setBackground(new java.awt.Color(103, 89, 75));
        TambahMember.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TambahMember.setText("Tambah Member");
        TambahMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahMemberActionPerformed(evt);
            }
        });

        dashboard.setBackground(new java.awt.Color(103, 89, 75));
        dashboard.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dashboard.setForeground(new java.awt.Color(255, 255, 255));
        dashboard.setText("←");
        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MEMBERS");

        jScrollPane2.setForeground(new java.awt.Color(103, 89, 75));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel3.setBackground(new java.awt.Color(119, 108, 96));
        jPanel3.setForeground(new java.awt.Color(103, 89, 75));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1068, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224)))
                .addComponent(TambahMember, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dashboard)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(TambahMember, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(114, 114, 114)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        setSize(new java.awt.Dimension(1086, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TambahMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahMemberActionPerformed
        FormMember FormMemberForm = new FormMember();
        FormMemberForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TambahMemberActionPerformed

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        dashboard dashboardForm = new dashboard();
        dashboardForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashboardActionPerformed

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
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TambahMember;
    private javax.swing.JButton dashboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}