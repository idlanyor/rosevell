import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author rosevell
 */
public class mahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form mahasiswa
     */
    public mahasiswa() {
        initComponents();

        tampil();
        setcombo();

        try {
            BufferedImage beam = ImageIO.read(getClass().getResource("library.jpg"));
            setIconImage(beam);
        } catch (IOException ex) {
            Logger.getLogger(splashscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setTitle("Aplikasi Perpustakaan");
    }

    private void setcombo() {

        cmbprodi.addItem("S1 Sistem Informasi");
        cmbprodi.addItem("S1 Teknik Informatika");
        cmbprodi.addItem("S1 Teknik Informatika E Commerce");
        cmbprodi.addItem("D3 Teknik Informatika");
        cmbprodi.addItem("D3 Komputerisasi Akuntansi");

    }

    private void tampil() {
        try {
            String ID = session.getid();
            String sql = "select*from mahasiswa where nim = '" + ID + "'";
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {

                txtnim.setText(res.getString(1));
                txtnama.setText(res.getString(2));
                // cmbfakultas.getModel().setSelectedItem(res.getString(3));
                cmbprodi.getModel().setSelectedItem(res.getString(3));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtnama = new javax.swing.JTextField();
        txtnim = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        // cmbfakultas = new javax.swing.JComboBox<>();
        cmbprodi = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnama.setText("Nama");
        txtnama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnamaMouseClicked(evt);
            }
        });
        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        jPanel1.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 410, 40));

        txtnim.setText("NIM");
        txtnim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnimMouseClicked(evt);
            }
        });
        txtnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnimActionPerformed(evt);
            }
        });
        txtnim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnimKeyReleased(evt);
            }
        });
        jPanel1.add(txtnim, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 410, 40));

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));

        // cmbfakultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
        // "Fakultas" }));
        // cmbfakultas.addActionListener(new java.awt.event.ActionListener() {
        // public void actionPerformed(java.awt.event.ActionEvent evt) {
        // cmbfakultasActionPerformed(evt);
        // }
        // });
        // jPanel1.add(cmbfakultas, new
        // org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 100, 30));

        cmbprodi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prodi" }));
        jPanel1.add(cmbprodi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnamaMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtnamaMouseClicked
        txtnama.setText(null);
        //
    }// GEN-LAST:event_txtnamaMouseClicked

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtnamaActionPerformed
        //
    }// GEN-LAST:event_txtnamaActionPerformed

    private void txtnimMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtnimMouseClicked
        txtnim.setText(null);
        //
    }// GEN-LAST:event_txtnimMouseClicked

    private void txtnimActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtnimActionPerformed

        //
    }// GEN-LAST:event_txtnimActionPerformed

    private void txtnimKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtnimKeyReleased
        //
    }// GEN-LAST:event_txtnimKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        String nim = txtnim.getText();
        String nama = txtnama.getText();
        if (nim.equals("") || nama.equals("")) {
            JOptionPane.showMessageDialog(null, "Isi Semua Form Yang Tersedia ");

        } else {
            try {
                String query = "UPDATE mahasiswa SET nim = '" + txtnim.getText()
                        + "',name = '" + txtnama.getText()
                        + "',prodi = '" + cmbprodi.getSelectedItem()
                        + "' WHERE nim = '" + txtnim.getText() + "'";
                java.sql.Connection kon = (Connection) koneksi.koneksi();
                java.sql.PreparedStatement pdt = kon.prepareStatement(query);
                pdt.execute();
                JOptionPane.showMessageDialog(null, "data berhasil di edit");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Perubahan Data Gagal" + e.getMessage());
            }
            new datamahasiswa().setVisible(true);
            dispose();
        }
        //
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        new datamahasiswa().setVisible(true);
        dispose();
        //
    }// GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        try {
            String sql = "delete from mahasiswa where nim='" + txtnim.getText() + "'";
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "berhasil di hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        new datamahasiswa().setVisible(true);
        this.dispose();
        //
    }// GEN-LAST:event_jButton2ActionPerformed

    // private void cmbfakultasActionPerformed(java.awt.event.ActionEvent evt)
    // {//GEN-FIRST:event_cmbfakultasActionPerformed
    // if(cmbfakultas.getSelectedItem().equals("Prodi")){

    // cmbprodi.setSelectedItem("Prodi");
    // cmbprodi.setEditable(false);
    // }
    // else if(cmbfakultas.getSelectedItem().equals("MIPA")){
    // cmbprodi.setEditable(true);
    // cmbprodi.removeAllItems();
    // cmbprodi.addItem("Ilmu Komputer");
    // cmbprodi.addItem("Farmasi");
    // cmbprodi.addItem("Biologi");
    // cmbprodi.addItem("Kimia");
    // }
    // else if(cmbfakultas.getSelectedItem().equals("FKIP")){
    // cmbprodi.setEditable(true);
    // cmbprodi.removeAllItems();
    // cmbprodi.addItem("PGSD");
    // cmbprodi.addItem("Arsitektur");
    // }
    // else if(cmbfakultas.getSelectedItem().equals("Ekonomi")){
    // cmbprodi.setEditable(true);
    // cmbprodi.removeAllItems();
    // cmbprodi.addItem("Akutansi");
    // cmbprodi.addItem("Management");
    // }
    // else if(cmbfakultas.getSelectedItem().equals("Hukum")){
    // cmbprodi.setEditable(true);
    // cmbprodi.removeAllItems();
    // cmbprodi.addItem("Ilmu Hukum");
    // } //
    // }//GEN-LAST:event_cmbfakultasActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // private javax.swing.JComboBox<String> cmbfakultas;
    private javax.swing.JComboBox<String> cmbprodi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnim;
    // End of variables declaration//GEN-END:variables
}
