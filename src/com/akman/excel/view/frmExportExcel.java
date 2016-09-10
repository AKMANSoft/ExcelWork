/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akman.excel.view;

import com.akman.excel.controller.CURDInvoice;
import com.akman.excel.model.Invoice;
import com.akman.excel.utils.Javaconnect;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author AKL SOFT
 */
public class frmExportExcel extends javax.swing.JFrame {

    /**
     * Creates new form frmExportExcel
     */
    String fileName = null;
    Collection Invoices;
    private ImageIcon format = null;

    String fileNameSignature = null;

    int s = 0;

    byte[] person_image = null;

    public frmExportExcel() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/Wood.png")));
        initComponents();

    }

    public void getImage() {
        Connection conn = Javaconnect.ConnecrDb();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {

            String sql = "SELECT MAX(ID), Image FROM ExcelData";

            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery();

            if (rs.next()) {
                byte[] imagedata = rs.getBytes("Image");
                format = new ImageIcon(imagedata);
                Rectangle rect = lblImage.getBounds();
                //Scaling the image to fit in the picLabel
                Image scaledimage = format.getImage().getScaledInstance(rect.width, rect.height, Image.SCALE_DEFAULT);
                //converting the image back to image icon to make an acceptable picLabel
                format = new ImageIcon(scaledimage);

                lblImage.setIcon(format);
            }

        } catch (SQLException ex) {
            Logger.getLogger(frmSelectImage.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbUtils.closeQuietly(rs);
            DbUtils.closeQuietly(pst);
            DbUtils.closeQuietly(conn);
        }
    }

    public BufferedImage getSignature() {
        Connection conn = Javaconnect.ConnecrDb();
        PreparedStatement pst = null;
        ResultSet rs = null;

        BufferedImage img = null;
        try {

            String sql = "SELECT MAX(ID), Image FROM ExcelData";

            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery();

            if (rs.next()) {

                byte[] blob = rs.getBytes("Image");
                InputStream in = new ByteArrayInputStream(blob);
                img = ImageIO.read(in);

            }

        } catch (SQLException ex) {
            Logger.getLogger(frmSelectImage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frmExportExcel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbUtils.closeQuietly(rs);
            DbUtils.closeQuietly(pst);
            DbUtils.closeQuietly(conn);
        }

        return img;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UploadSignature = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        txtPathSig = new javax.swing.JTextField();
        btnSelectImage = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPath = new javax.swing.JTextField();
        btnAddFile = new javax.swing.JButton();
        btnExportData = new javax.swing.JButton();
        cmbReports = new javax.swing.JComboBox<>();
        btnPreveiw = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        UploadSignature.setMinimumSize(new java.awt.Dimension(450, 383));
        UploadSignature.setPreferredSize(new java.awt.Dimension(450, 383));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 383));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Select Image File");
        jLabel2.setOpaque(true);

        lblImage.setBackground(new java.awt.Color(102, 102, 102));
        lblImage.setOpaque(true);

        txtPathSig.setEnabled(false);

        btnSelectImage.setText("Attach Image");
        btnSelectImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectImageActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPathSig, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(btnSelectImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(txtPathSig, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelectImage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout UploadSignatureLayout = new javax.swing.GroupLayout(UploadSignature.getContentPane());
        UploadSignature.getContentPane().setLayout(UploadSignatureLayout);
        UploadSignatureLayout.setHorizontalGroup(
            UploadSignatureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        UploadSignatureLayout.setVerticalGroup(
            UploadSignatureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Input File");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" INPUT EXCEL FILE");
        jLabel1.setOpaque(true);

        txtPath.setEditable(false);

        btnAddFile.setText("Browse");
        btnAddFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFileActionPerformed(evt);
            }
        });

        btnExportData.setText("Generate Report");
        btnExportData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportDataActionPerformed(evt);
            }
        });

        cmbReports.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lables", "Invoices", "Custome" }));

        btnPreveiw.setText("Preveiw");
        btnPreveiw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreveiwActionPerformed(evt);
            }
        });

        jButton1.setText("Upload Signature");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbReports, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPath, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnPreveiw, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(btnExportData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddFile, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtPath, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbReports)
                    .addComponent(btnPreveiw, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddFileActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddFileActionPerformed
    {//GEN-HEADEREND:event_btnAddFileActionPerformed

        JFileChooser chooser = new JFileChooser();

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel files", "xlsx", "xlsm", "xlt", "xlsb", "xltx", "xltm", "xls", "xlt", "xls");

        chooser.setFileFilter(filter);
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setDialogTitle("Select The Image");
        chooser.setMultiSelectionEnabled(false);

        int res = chooser.showOpenDialog(null);

        if (res == JFileChooser.APPROVE_OPTION) {

            File file = chooser.getSelectedFile();

            // checking file extension. it must be excel file. 
            if (file.equals(filter)) {
                JOptionPane.showMessageDialog(null, "Wrong File selected", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            fileName = file.getAbsolutePath();
            txtPath.setText(fileName);

        }

    }//GEN-LAST:event_btnAddFileActionPerformed

    private void btnExportDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportDataActionPerformed
        if (txtPath.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Kindly select the template file", "ERROR", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Invoices = TestFactory.generateCollection(fileName);

        CURDInvoice.Delete();

        for (Object Inv : Invoices) {

            CURDInvoice.Save((Invoice) Inv);
        }

        JOptionPane.showMessageDialog(null, "Sucessfully generated reports. ");
    }//GEN-LAST:event_btnExportDataActionPerformed

    private void btnPreveiwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreveiwActionPerformed
        Connection conn = Javaconnect.ConnecrDb();

        try {

            String RName = null;
            Map map = new HashMap();

            switch (cmbReports.getSelectedIndex()) {
                case 0:
                    RName = "Label.jrxml";
                    break;
                case 1:
                    RName = "Invoice.jrxml";
                    map.put("image", getSignature());
                    break;
                case 2:
                    RName = "Custom.jrxml";
                    map.put("image", getSignature());
                    break;
                default:
                    break;
            }

            JasperDesign jd = JRXmlLoader.load("reports\\" + RName);

            JasperReport jr = JasperCompileManager.compileReport(jd);

            JasperPrint jp = JasperFillManager.fillReport(jr, map, conn);

            JasperViewer.viewReport(jp, false);
            


        } catch (JRException e) {

            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {

            DbUtils.closeQuietly(conn);
        }
    }//GEN-LAST:event_btnPreveiwActionPerformed

    private void btnSelectImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectImageActionPerformed
        JFileChooser chooser = new JFileChooser();

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image files", "jpg", "png", "gif", "bmp");
        chooser.setFileFilter(filter);

        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setDialogTitle("Select The Image");
        chooser.setMultiSelectionEnabled(false);
        int res = chooser.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {

            //Saving file inside the file
            File file = chooser.getSelectedFile();

            //        if(!file.equals(filter))
            //        {
            //        JOptionPane.showMessageDialog(null, "Wrong File Selected","ERROR",JOptionPane.ERROR_MESSAGE);
            //        return;
            //        }
            //System.out.println(file.getAbsolutePath());
            ImageIcon image = new ImageIcon(file.getAbsolutePath());

            fileNameSignature = file.getAbsolutePath();

            // Get Width And Height of PicLabel
            Rectangle rect = lblImage.getBounds();

            //System.out.println(lblImage.getBounds());
            //Scaling the image to fit in the picLabel
            Image scaledimage = image.getImage().getScaledInstance(rect.width, rect.height, Image.SCALE_DEFAULT);
            //converting the image back to image icon to make an acceptable picLabel
            image = new ImageIcon(scaledimage);

            lblImage.setIcon(image);

            txtPathSig.setText(fileNameSignature);

            try {

                File images = new File(fileNameSignature);

                FileInputStream fis = new FileInputStream(images);

                ByteArrayOutputStream bos = new ByteArrayOutputStream();

                byte[] buf = new byte[1024];

                for (int readNum; (readNum = fis.read(buf)) != -1;) {
                    bos.write(buf, 0, readNum);
                }

                person_image = bos.toByteArray();

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e);
            }

        }
    }//GEN-LAST:event_btnSelectImageActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Connection conn = Javaconnect.ConnecrDb();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
//            String sql = "INSERT INTO ExcelData (Image) VALUES (?)";
            String sql = "Update ExcelData SET Image = ? ";
            pst = conn.prepareStatement(sql);

            pst.setBytes(1, person_image);

            pst.execute();

            System.out.println(person_image);

            JOptionPane.showMessageDialog(null, "Update Image");

            getImage();

        } catch (SQLException ex) {
            Logger.getLogger(frmSelectImage.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbUtils.closeQuietly(rs);
            DbUtils.closeQuietly(pst);
            DbUtils.closeQuietly(conn);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        UploadSignature.setLocationRelativeTo(null);
        UploadSignature.setVisible(true);

        getImage();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmExportExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmExportExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmExportExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmExportExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmExportExcel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog UploadSignature;
    private javax.swing.JButton btnAddFile;
    private javax.swing.JButton btnExportData;
    private javax.swing.JButton btnPreveiw;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSelectImage;
    private javax.swing.JComboBox<String> cmbReports;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTextField txtPath;
    private javax.swing.JTextField txtPathSig;
    // End of variables declaration//GEN-END:variables
}
