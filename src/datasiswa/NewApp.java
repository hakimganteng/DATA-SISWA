/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package datasiswa;

import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmad luqman hakim
 */
public class NewApp extends javax.swing.JFrame {

    /**
     * Creates new form NewApp
     */
    public NewApp() {
        initComponents();
        reset();
    }
    void  reset(){
        Tnis.setText(null);
        Tnama.setText(null);
        TEMPATlahir.setText(null);
        ALAMAT.setText(null);
        PHOTO.setText(null);
        Vnis.setText(null);
        Vnama.setText(null);
        Vttl.setText(null);
        Valamat.setText(null);
        Vphoto.setText(null);
        Vgender.setText(null);
        Vjurusan.setText(null);
        GENDER.clearSelection();
        TGLlahir.setCalendar(null);
        Jurusan.setSelectedItem(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GENDER = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Tnis = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Tnama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        LAKI = new javax.swing.JRadioButton();
        WANITA = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        TEMPATlahir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TGLlahir = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        Jurusan = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        ALAMAT = new javax.swing.JTextField();
        PHOTO = new javax.swing.JLabel();
        Tphoto = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        SIMPAN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Vnis = new javax.swing.JLabel();
        Vnama = new javax.swing.JLabel();
        Vgender = new javax.swing.JLabel();
        Vttl = new javax.swing.JLabel();
        Vtglahir = new javax.swing.JLabel();
        Vjurusan = new javax.swing.JLabel();
        Valamat = new javax.swing.JLabel();
        Vphoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(52, 73, 94));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("DATA SISWA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(429, 429, 429))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(149, 165, 166));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NIS");

        Tnis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TnisActionPerformed(evt);
            }
        });
        Tnis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TnisKeyTyped(evt);
            }
        });

        jLabel3.setText("NAMA");

        Tnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TnamaActionPerformed(evt);
            }
        });
        Tnama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TnamaKeyTyped(evt);
            }
        });

        jLabel4.setText("GENDER");

        GENDER.add(LAKI);
        LAKI.setText("Laki-laki");
        LAKI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LAKIActionPerformed(evt);
            }
        });

        GENDER.add(WANITA);
        WANITA.setText("Wanita");
        WANITA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WANITAActionPerformed(evt);
            }
        });

        jLabel5.setText("TEMPAT LAHIR");

        TEMPATlahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEMPATlahirActionPerformed(evt);
            }
        });
        TEMPATlahir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TEMPATlahirKeyTyped(evt);
            }
        });

        jLabel6.setText("TANGGAL LAHIR");

        jLabel7.setText("JURUSAN");

        Jurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IPA", "IPS", "AGAMA" }));

        jLabel8.setText("ALAMAT");

        PHOTO.setText("PHOTO");
        PHOTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PHOTO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PHOTOMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(36, 36, 36))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(54, 54, 54)))
                            .addGap(41, 41, 41)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Tnis, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ALAMAT, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(LAKI)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(WANITA))
                                        .addComponent(Tnama, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TEMPATlahir, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TGLlahir, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(263, 263, 263))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(221, 221, 221))
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(PHOTO, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tphoto)
                .addGap(198, 198, 198))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Tnis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(LAKI)
                            .addComponent(WANITA))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TEMPATlahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(TGLlahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(Tphoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ALAMAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(PHOTO, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        reset.setBackground(new java.awt.Color(255, 0, 0));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        SIMPAN.setBackground(new java.awt.Color(0, 204, 0));
        SIMPAN.setText("SIMPAN");
        SIMPAN.setActionCommand("SIMPAN");
        SIMPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIMPANActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(149, 165, 166));

        Vphoto.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                VphotoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Valamat)
                            .addComponent(Vjurusan)
                            .addComponent(Vtglahir)
                            .addComponent(Vttl)
                            .addComponent(Vgender)
                            .addComponent(Vnama))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Vnis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Vphoto)
                        .addGap(311, 311, 311))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vnis)
                    .addComponent(Vphoto))
                .addGap(18, 18, 18)
                .addComponent(Vnama)
                .addGap(18, 18, 18)
                .addComponent(Vgender)
                .addGap(18, 18, 18)
                .addComponent(Vttl)
                .addGap(18, 18, 18)
                .addComponent(Vtglahir)
                .addGap(18, 18, 18)
                .addComponent(Vjurusan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Valamat)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reset)
                .addGap(41, 41, 41)
                .addComponent(SIMPAN)
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(SIMPAN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TnisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TnisActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_TnisActionPerformed

    private void LAKIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LAKIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LAKIActionPerformed

    private void WANITAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WANITAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WANITAActionPerformed

    private void PHOTOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PHOTOMouseClicked
        // TODO add your handling code here:
        try {
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        ImageIcon icon = new ImageIcon(file.toString());
        Image image = icon.getImage().getScaledInstance(PHOTO.getWidth(),PHOTO.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ic = new ImageIcon(image);
        PHOTO.setText(null);
        PHOTO.setIcon(ic);
        String filename = file.getAbsolutePath();
        Tphoto.setText(filename);
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"upload error"+ e);
        }
    }//GEN-LAST:event_PHOTOMouseClicked

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_resetActionPerformed

    private void SIMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIMPANActionPerformed
        // TODO add your handling code here:
        Vnis.setText("NIS: " + Tnis.getText());
        Vnama.setText("NAMA: " + Tnama.getText());
        Vjurusan.setText("JURUSAN: " + Jurusan.getSelectedItem().toString());
        Valamat.setText("ALAMAT: " + ALAMAT.getText());
        if (LAKI.isSelected()){
          Vgender.setText("JENIS GENDER : LAKI LAKI");
          
        }else if (WANITA.isSelected()){
            Vgender.setText("JENIS GENDER : WANITA");
            
        }else {
            Vgender.setText("JENIS GENDER : TIDAK TERIDWNTIFIKASI");
        }
        SimpleDateFormat sd = new  SimpleDateFormat("yyyy-MM-dd-hh-ss");
        String tgllahir = String.valueOf(sd.format(TGLlahir.getDate()));
        Vttl.setText("TTL: " + TEMPATlahir.getText()+","+ tgllahir);
        
        String filename;
        try {
            filename = Tphoto.getText();
            String filepath = "src/photo/";
            File folder = new File(filepath);
            if (!folder.exists()){
                folder.mkdir();
                
            
        }
        File sourcFile = null;
        File destfFile = null;
        String ekstensi = filename.substring(filename.lastIndexOf('.') +1);
        sourcFile = new  File(filename);
        Date tglUpload = new Date();
        SimpleDateFormat fr = new SimpleDateFormat("yyyy-MM-dd-hh-ss");
        String tglBaru = String.valueOf(fr.format(tglUpload));
        destfFile = new File(filepath + tglBaru.toString() + "." +ekstensi);
        Files.copy(sourcFile.toPath(),destfFile.toPath());
        Vphoto.setText("FOTO: " + destfFile.toString());
        
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"upload error"+ e);
        }
        
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
        
    }//GEN-LAST:event_SIMPANActionPerformed

    private void TnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TnamaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TnamaActionPerformed

    private void TEMPATlahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEMPATlahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEMPATlahirActionPerformed

    private void TnisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TnisKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_TnisKeyTyped

    private void TnamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TnamaKeyTyped
        // TODO add your handling code here:
        if (!Character.isAlphabetic(evt.getKeyChar()) &&
            !Character.isSpaceChar(evt.getKeyChar())) {
            evt.consume();
    }//GEN-LAST:event_TnamaKeyTyped
    }
    private void TEMPATlahirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TEMPATlahirKeyTyped
        // TODO add your handling code here:
        if (!Character.isAlphabetic(evt.getKeyChar()) &&
            !Character.isSpaceChar(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_TEMPATlahirKeyTyped

    private void VphotoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_VphotoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_VphotoAncestorAdded

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
            java.util.logging.Logger.getLogger(NewApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ALAMAT;
    private javax.swing.ButtonGroup GENDER;
    private javax.swing.JComboBox<String> Jurusan;
    private javax.swing.JRadioButton LAKI;
    private javax.swing.JLabel PHOTO;
    private javax.swing.JButton SIMPAN;
    private javax.swing.JTextField TEMPATlahir;
    private com.toedter.calendar.JDateChooser TGLlahir;
    private javax.swing.JTextField Tnama;
    private javax.swing.JTextField Tnis;
    private javax.swing.JLabel Tphoto;
    private javax.swing.JLabel Valamat;
    private javax.swing.JLabel Vgender;
    private javax.swing.JLabel Vjurusan;
    private javax.swing.JLabel Vnama;
    private javax.swing.JLabel Vnis;
    private javax.swing.JLabel Vphoto;
    private javax.swing.JLabel Vtglahir;
    private javax.swing.JLabel Vttl;
    private javax.swing.JRadioButton WANITA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
