/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kutuphaneyonetim;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author yigit
 */
public class uyeOlmaEkrani extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;
    /**
     * Creates new form uyeOlmaEkrani
     */
    public uyeOlmaEkrani() {
        super ("Üye ol");
        initComponents();
        conn=baglanti.getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adLBL = new javax.swing.JLabel();
        soyadLBL = new javax.swing.JLabel();
        sifreLBL = new javax.swing.JLabel();
        yasLBL = new javax.swing.JLabel();
        telNOLBL = new javax.swing.JLabel();
        ad = new javax.swing.JTextField();
        sifre = new javax.swing.JTextField();
        soyad = new javax.swing.JTextField();
        yas = new javax.swing.JTextField();
        telefonNO = new javax.swing.JTextField();
        kayitOlBtn = new javax.swing.JButton();
        geriDonBtn = new javax.swing.JButton();
        baslikLBL = new javax.swing.JLabel();
        kimlikNoLBL = new javax.swing.JLabel();
        kimlikNO = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adLBL.setText("Ad");

        soyadLBL.setText("Soyad");

        sifreLBL.setText("Şifre");

        yasLBL.setText("Yaş");

        telNOLBL.setText("Telefon Numarası");

        kayitOlBtn.setText("Kayıt Ol");
        kayitOlBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitOlBtnActionPerformed(evt);
            }
        });

        geriDonBtn.setText("Geri Dön");
        geriDonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriDonBtnActionPerformed(evt);
            }
        });

        baslikLBL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        baslikLBL.setText("Üye Ol");

        kimlikNoLBL.setText("TC Kimlik Numarası");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(kimlikNoLBL)
                        .addGap(18, 18, 18)
                        .addComponent(kimlikNO, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(baslikLBL)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(geriDonBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kayitOlBtn))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(telNOLBL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telefonNO, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sifreLBL)
                                .addComponent(yasLBL))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sifre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(yas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(adLBL)
                                .addComponent(soyadLBL))
                            .addGap(78, 78, 78)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(baslikLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adLBL)
                    .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soyadLBL)
                    .addComponent(soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifre, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(sifreLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yasLBL))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telNOLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kimlikNoLBL)
                    .addComponent(kimlikNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kayitOlBtn)
                    .addComponent(geriDonBtn))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kayitOlBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitOlBtnActionPerformed
        String mesaj;
       
        String ogrenciAd=ad.getText();
        String ogrenciSoyad=soyad.getText();
        String ogrenciSifre=sifre.getText();
        String ogrenciYas=yas.getText();
        String ogrenciTelefon=telefonNO.getText();
        String ogrenciKimlik=kimlikNO.getText();
            try 
            {
                Connection con=baglanti.getConnection();
                Statement st=con.createStatement();
                st.executeUpdate("INSERT INTO kullanici(ad,soyad,sifre,yas,telefonNO,kimlikNO) VALUES('"+ogrenciAd+"','"+ogrenciSoyad+"','"+ogrenciSifre+"','"+ogrenciYas+"','"+ogrenciTelefon+"','"+ogrenciKimlik+"')");
                JOptionPane.showMessageDialog(null, "Başarılı");
                new girisEkrani().setVisible(true);
                dispose();
            } catch (Exception e) 
            {
               JOptionPane.showMessageDialog(null, "Hata");
               e.printStackTrace();
               /* setVisible(false);
                new uyeOlmaEkrani().setVisible(true);*/
            }
       /*
        //INSERT INTO kullanici (ad,soyad,sifre,yas,email,telefonNO,kimlikNO) values (?,?,?,?,?,?,?))
      //  pst=conn.prepareStatement(sql);
        pst.setString(1,ad.getText());
        pst.setString(2,soyad.getText());
        pst.setString(3,sifre.getText());
        pst.setString(4,yas.getText());
        pst.setString(5, telefonNO.getText());
        pst.setString(6,kimlikNO.getText());
        pst.execute();
        JOptionPane.showMessageDialog(null, "Üyelik oluşturuldu");
        rs.close();
        pst.close();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
        e.printStackTrace();
        System.out.println(pst);
    }    */

// TODO add your handling code here:
    }//GEN-LAST:event_kayitOlBtnActionPerformed

    private void geriDonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriDonBtnActionPerformed
        setVisible(false);
        girisEkrani gE= new girisEkrani();
        gE.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_geriDonBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new uyeOlmaEkrani().setVisible(true);
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
            java.util.logging.Logger.getLogger(uyeOlmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uyeOlmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uyeOlmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uyeOlmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uyeOlmaEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad;
    private javax.swing.JLabel adLBL;
    private javax.swing.JLabel baslikLBL;
    private javax.swing.JButton geriDonBtn;
    private javax.swing.JButton kayitOlBtn;
    private javax.swing.JTextField kimlikNO;
    private javax.swing.JLabel kimlikNoLBL;
    private javax.swing.JTextField sifre;
    private javax.swing.JLabel sifreLBL;
    private javax.swing.JTextField soyad;
    private javax.swing.JLabel soyadLBL;
    private javax.swing.JLabel telNOLBL;
    private javax.swing.JTextField telefonNO;
    private javax.swing.JTextField yas;
    private javax.swing.JLabel yasLBL;
    // End of variables declaration//GEN-END:variables
}
