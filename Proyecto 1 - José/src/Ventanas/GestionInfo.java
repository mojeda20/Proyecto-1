/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

/**
 *
 * @author moise
 */
public class GestionInfo extends javax.swing.JFrame {

    public static Principal v1;
    
    public GestionInfo(Principal v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        TITULO_PRINCIPAL = new javax.swing.JLabel();
        TITULO_AggNewAlm1 = new javax.swing.JLabel();
        TITULO_IngreseNombre = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Agg_almacen = new javax.swing.JButton();
        TITULO_AggProduct = new javax.swing.JLabel();
        TITULO_NameProduct = new javax.swing.JLabel();
        name_product = new javax.swing.JTextField();
        TITULO_CantidadProdut = new javax.swing.JLabel();
        cantidad_product = new javax.swing.JTextField();
        TITULO_NameAlmacen = new javax.swing.JLabel();
        name_almacen = new javax.swing.JTextField();
        Agg_product = new javax.swing.JButton();
        Volver = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TITULO_PRINCIPAL.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        TITULO_PRINCIPAL.setText("GESTION DE INFO");
        jPanel1.add(TITULO_PRINCIPAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        TITULO_AggNewAlm1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TITULO_AggNewAlm1.setText("Agregar Almacen:");
        jPanel1.add(TITULO_AggNewAlm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 150, -1));

        TITULO_IngreseNombre.setText("Ingrese el nombre:");
        jPanel1.add(TITULO_IngreseNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 126, -1, 20));
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 152, 190, 20));

        Agg_almacen.setText("Agg");
        jPanel1.add(Agg_almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        TITULO_AggProduct.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TITULO_AggProduct.setText("Agregar Productos:");
        jPanel1.add(TITULO_AggProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 180, -1));

        TITULO_NameProduct.setText("Nombre del Producto:");
        jPanel1.add(TITULO_NameProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));
        jPanel1.add(name_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 180, -1));

        TITULO_CantidadProdut.setText("Cantidad:");
        jPanel1.add(TITULO_CantidadProdut, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));
        jPanel1.add(cantidad_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 202, 180, 20));

        TITULO_NameAlmacen.setText("Almacen:");
        jPanel1.add(TITULO_NameAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 226, 60, 20));

        name_almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_almacenActionPerformed(evt);
            }
        });
        jPanel1.add(name_almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 180, -1));

        Agg_product.setText("Agg");
        jPanel1.add(Agg_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        Volver.setText("Volver");
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void name_almacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_almacenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_almacenActionPerformed

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
            java.util.logging.Logger.getLogger(GestionInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionInfo(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agg_almacen;
    private javax.swing.JButton Agg_product;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel TITULO_AggNewAlm1;
    private javax.swing.JLabel TITULO_AggProduct;
    private javax.swing.JLabel TITULO_CantidadProdut;
    private javax.swing.JLabel TITULO_IngreseNombre;
    private javax.swing.JLabel TITULO_NameAlmacen;
    private javax.swing.JLabel TITULO_NameProduct;
    private javax.swing.JLabel TITULO_PRINCIPAL;
    private javax.swing.JButton Volver;
    private javax.swing.JTextField cantidad_product;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField name_almacen;
    private javax.swing.JTextField name_product;
    // End of variables declaration//GEN-END:variables
}
