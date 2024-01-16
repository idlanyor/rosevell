/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rosevelt
 */
public class databuku extends javax.swing.JFrame {

    /**
     * Creates new form databuku
     */
    public databuku(){
        initComponents();
        loadtable();
       
        try {
            BufferedImage beam = ImageIO.read(getClass().getResource("library.jpg"));
             setIconImage(beam); 
        } catch (IOException ex) {
            Logger.getLogger(splashscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.setTitle("Data Buku");
    }
private void loadtable(){
   DefaultTableModel model =  new DefaultTableModel();
    model.addColumn("ID");
    model.addColumn("Judul");
    model.addColumn("Pengarang");
    model.addColumn("Penerbit");
    model.addColumn("Kategori");
    model.addColumn("Deskripsi");
    model.addColumn("Stok");
    try{
        
       String query = "select * from buku";
       java.sql.Connection kon = (Connection) koneksi.koneksi();
       java.sql.Statement stm = kon.createStatement();
       java.sql.ResultSet data = stm.executeQuery(query);
       while(data.next()){
        model.addRow(new Object []{data.getString(1),data.getString(2),data.getString(3),
        data.getString(4),data.getString(5),data.getString(6),data.getString(7)});
       }
       tblbuku.setModel(model);
    }
    catch(Exception b){
        JOptionPane.showMessageDialog(null,b.getMessage());
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbuku = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtsrc = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("PEMINJAMAN BUKU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(394, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 730, 60));

        tblbuku.setModel(new javax.swing.table.DefaultTableModel(
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
        tblbuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblbuku);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 800, 320));

        jButton1.setText("+INPUT BUKU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        txtsrc.setText("Search ID");
        txtsrc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsrcMouseClicked(evt);
            }
        });
        txtsrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsrcActionPerformed(evt);
            }
        });
        txtsrc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsrcKeyReleased(evt);
            }
        });
        jPanel1.add(txtsrc, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 110, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new inputbuku().setVisible(true);
dispose();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtsrcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsrcMouseClicked
txtsrc.setText(null);
       
    }//GEN-LAST:event_txtsrcMouseClicked

    private void txtsrcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsrcKeyReleased
if(txtsrc.getText().equals("")){
 loadtable();   
}
else{
        DefaultTableModel model =  new DefaultTableModel();
    model.addColumn("ID");
    model.addColumn("Judul");
    model.addColumn("Pengarang");
    model.addColumn("Penerbit");
    model.addColumn("Kategori");
    model.addColumn("Deskripsi");
    model.addColumn("Stok");
    try{
        
       String query = "select * from buku where id_buku = '"+txtsrc.getText()+"'";
       java.sql.Connection kon = (Connection) koneksi.koneksi();
       java.sql.Statement stm = kon.createStatement();
       java.sql.ResultSet data = stm.executeQuery(query);
       while(data.next()){
        model.addRow(new Object []{data.getString(1),data.getString(2),data.getString(3),
        data.getString(4),data.getString(5),data.getString(6),data.getString(7)});
       }
       tblbuku.setModel(model);
    }
    catch(Exception b){
        JOptionPane.showMessageDialog(null,b.getMessage());
    }
}
       
    }//GEN-LAST:event_txtsrcKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new beranda().setVisible(true);
dispose();
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtsrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsrcActionPerformed
       
    }//GEN-LAST:event_txtsrcActionPerformed

    private void tblbukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbukuMouseClicked
 int baris = tblbuku.getSelectedRow();
        String id= tblbuku.getValueAt(baris, 0).toString();
      session.setid(id);
      new buku().setVisible(true);
       this.dispose();       
    }//GEN-LAST:event_tblbukuMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblbuku;
    private javax.swing.JTextField txtsrc;
    // End of variables declaration//GEN-END:variables
}
