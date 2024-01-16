/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
/**
 *
 * @author rosevell
 */
public class inputpinjam extends javax.swing.JFrame {
String pinjam;
String balik;
    /**
     * Creates new form inputpinjam
     */
    public inputpinjam(){
        initComponents();
    txtnm.setEditable(false);
    txtjdl.setEditable(false);
   
        try {
             BufferedImage beam = ImageIO.read(getClass().getResource("library.jpg"));
             setIconImage(beam); 
        } catch (IOException ex) {
            Logger.getLogger(splashscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.setTitle("Input Data Peminjaman Buku");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtjmlh = new javax.swing.JTextField();
        txtnpm = new javax.swing.JTextField();
        txtnm = new javax.swing.JTextField();
        txtidbk = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtjdl = new javax.swing.JTextField();
        tgl = new com.toedter.calendar.JDateChooser();
        tglbalik = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtjmlh.setText("Jumlah");
        txtjmlh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtjmlhMouseClicked(evt);
            }
        });
        txtjmlh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjmlhActionPerformed(evt);
            }
        });
        txtjmlh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtjmlhKeyTyped(evt);
            }
        });
        jPanel2.add(txtjmlh, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 470, 30));

        txtnpm.setText("NPM");
        txtnpm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnpmMouseClicked(evt);
            }
        });
        txtnpm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnpmKeyReleased(evt);
            }
        });
        jPanel2.add(txtnpm, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 470, 30));

        txtnm.setText("Nama");
        txtnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnmKeyReleased(evt);
            }
        });
        jPanel2.add(txtnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 470, 30));

        txtidbk.setText("Id Buku");
        txtidbk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtidbkMouseClicked(evt);
            }
        });
        txtidbk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidbkActionPerformed(evt);
            }
        });
        txtidbk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtidbkKeyReleased(evt);
            }
        });
        jPanel2.add(txtidbk, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 470, 30));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));

        jButton2.setText("Reset");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));

        txtjdl.setText("Judul");
        jPanel2.add(txtjdl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 470, 30));

        tgl.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tglPropertyChange(evt);
            }
        });
        jPanel2.add(tgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 110, -1));

        tglbalik.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tglbalikPropertyChange(evt);
            }
        });
        jPanel2.add(tglbalik, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 120, -1));

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Tanggal Kembali");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Tanggal Pinjam");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel3.setText("FORM INPUT PINJAM BUKU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel3)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 630, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnpmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnpmMouseClicked
txtnpm.setText("");
        // 
    }//GEN-LAST:event_txtnpmMouseClicked

    private void txtidbkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtidbkMouseClicked
txtidbk.setText("");
        // 
    }//GEN-LAST:event_txtidbkMouseClicked

    private void txtnmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnmKeyReleased

        // 
    }//GEN-LAST:event_txtnmKeyReleased

    private void txtnpmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnpmKeyReleased
try{
  String query = "select nama from mahasiswa where npm = '"+txtnpm.getText()+"'";
 java.sql.Connection kon = (Connection) koneksi.koneksi();
 java.sql.Statement stm = kon.createStatement();
 java.sql.ResultSet data = stm.executeQuery(query);
 
 if(data.next()){
     txtnm.setText(data.getString("nama"));
 }
 else{
  txtnm.setText("Nama");  
 }
}
catch(Exception b){
 JOptionPane.showMessageDialog(null, b.getMessage());
}
        // 
    }//GEN-LAST:event_txtnpmKeyReleased

    private void txtidbkKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidbkKeyReleased
try{
  String query = "select judul from buku where id_buku = '"+txtidbk.getText()+"'";
 java.sql.Connection kon = (Connection) koneksi.koneksi();
 java.sql.Statement stm = kon.createStatement();
 java.sql.ResultSet data = stm.executeQuery(query);
 
 if(data.next()){
     txtjdl.setText(data.getString("judul"));
 }
 else{
  txtjdl.setText("Judul");  
 }
}
catch(Exception b){
 JOptionPane.showMessageDialog(null, b.getMessage());
}
        // 
    }//GEN-LAST:event_txtidbkKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 if(tgl.getDate().equals("")&&tglbalik.getDate().equals("")){
   JOptionPane.showMessageDialog(null,"Tidak Boleh Ada yang kosong");  
 }
 else{
        try{
     String aidi1;
      aidi1=txtidbk.getText();
            String query = "select*from buku where id_buku = '"+aidi1+"'";
            java.sql.Connection kon = (Connection) koneksi.koneksi();
            java.sql.Statement stm = kon.createStatement();
            java.sql.ResultSet data = stm.executeQuery(query);
            
            while(data.next()){
            String jmlh = txtjmlh.getText();
            String stk = data.getString(7);
           int stok = Integer.parseInt(stk);
           int jumlah = Integer.parseInt(jmlh);
           if(stok == 0){
              JOptionPane.showMessageDialog(null,"Stok Buku Telah Kosong!"); 
           }
           else if(jumlah>stok){
             JOptionPane.showMessageDialog(null,"Jumlah Buku Tidak Cukup!"); 
           }
           else{
               
    try{
    String sql1="select*from pinjaman order by id_pinjam desc";
    java.sql.Connection conn=(Connection) koneksi.koneksi();
    java.sql.Statement stm1 = conn.createStatement();
    java.sql.ResultSet res1 = stm1.executeQuery(sql1);
     String aidi;
    if(res1.next()){
       
        String no=res1.getString("id_pinjam").substring(1);
      String id = ""+(Integer.parseInt(no)+1);
      String nol=null;
      if(id.length()==1){
          nol="000";
      } 
      else if(id.length()==2){
          nol="00";
      }
       else if(id.length()==3){
          nol="0";
      }
       else if(id.length()==4){
          nol="";
      }
      aidi = "P"+nol+id; 
    }
    else{
       aidi = "P0001"; 
    }
    try {
         
     int denda=0;
            String query1 = "INSERT INTO pinjaman VALUES "
                    + "('" + aidi+"','"+txtnpm.getText() + "','" + txtnm.getText() 
                    + "','" + txtidbk.getText() + "','" + txtjdl.getText()  
                    + "','" + txtjmlh.getText()+ "','" + pinjam
                    + "','" + balik+ "','" + denda+ "','" + "Belum Kembali"+ "')";
            java.sql.Connection kon1 = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement mts = kon1.prepareStatement(query1);
            mts.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
            
         try{
  String query2 = "select*from buku where id_buku = '"+txtidbk.getText()+"'";
 java.sql.Connection kon2 = (Connection) koneksi.koneksi();
 java.sql.Statement st = kon2.createStatement();
 java.sql.ResultSet data2 = st.executeQuery(query2);
 
 while(data2.next()){
     int jumlah1= Integer.parseInt(data2.getString(7));
     int jumlahpinjam = Integer.parseInt(txtjmlh.getText());
     int total = jumlah1-jumlahpinjam;
    try {
            String sql3 ="UPDATE buku SET stok = '"+total
                    +"' WHERE id_buku = '"+txtidbk.getText()+"'";
            java.sql.Connection conn1=(Connection)koneksi.koneksi();
            java.sql.PreparedStatement pst=conn1.prepareStatement(sql3);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
     
        }
        }
          catch(Exception b){
            JOptionPane.showMessageDialog(null, b.getMessage());
        }

new datapinjam().setVisible(true);
dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
       
        }   
        catch(Exception b){
         JOptionPane.showMessageDialog(null,b.getMessage());
        }            
        
        }
        
        }
            
        }
        catch(Exception b){
         JOptionPane.showMessageDialog(null,b.getMessage());    
        }
     
      }  
   
 


        // 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtjmlhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjmlhActionPerformed
        // 
    }//GEN-LAST:event_txtjmlhActionPerformed

    private void txtjmlhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtjmlhMouseClicked
txtjmlh.setText(null);
// 
    }//GEN-LAST:event_txtjmlhMouseClicked

    private void txtidbkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidbkActionPerformed
        // 
    }//GEN-LAST:event_txtidbkActionPerformed

    private void tglPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglPropertyChange
if (tgl.getDate() != null) {
     SimpleDateFormat FormatTanggal = new SimpleDateFormat("dd MMMM yyyy");
     pinjam = FormatTanggal.format(tgl.getDate());
}
        // 
    }//GEN-LAST:event_tglPropertyChange

    private void tglbalikPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglbalikPropertyChange
     if (tglbalik.getDate() != null) {
     SimpleDateFormat FormatTanggal = new SimpleDateFormat("dd MMMM yyyy");
     balik = FormatTanggal.format(tglbalik.getDate());
}
        // 
    }//GEN-LAST:event_tglbalikPropertyChange

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new datapinjam().setVisible(true);
        dispose();
        // 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtjmlhKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjmlhKeyTyped
char c = evt.getKeyChar();
        if (! ((Character.isDigit(c) ||
                (c == KeyEvent.VK_BACK_SPACE) ||
                (c == KeyEvent.VK_DELETE))
                )
            )
        {
            evt.consume();
        }            // 
    }//GEN-LAST:event_txtjmlhKeyTyped

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser tgl;
    private com.toedter.calendar.JDateChooser tglbalik;
    private javax.swing.JTextField txtidbk;
    private javax.swing.JTextField txtjdl;
    private javax.swing.JTextField txtjmlh;
    private javax.swing.JTextField txtnm;
    private javax.swing.JTextField txtnpm;
    // End of variables declaration//GEN-END:variables
}
