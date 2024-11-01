package isi.deso.tp.gui;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class inicio extends javax.swing.JFrame {
    
    public inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        vendedoresButton = new javax.swing.JButton();
        clientesButton = new javax.swing.JButton();
        itemMenuButton = new javax.swing.JButton();
        pedidosButton = new javax.swing.JButton();
        panelMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PedidosApp");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        vendedoresButton.setBackground(new java.awt.Color(96, 86, 120));
        vendedoresButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        vendedoresButton.setForeground(new java.awt.Color(255, 255, 255));
        vendedoresButton.setText("Vendedores");
        vendedoresButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vendedoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendedoresButtonActionPerformed(evt);
            }
        });

        clientesButton.setBackground(new java.awt.Color(96, 86, 120));
        clientesButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clientesButton.setForeground(new java.awt.Color(255, 255, 255));
        clientesButton.setText("Clientes");
        clientesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesButtonActionPerformed(evt);
            }
        });

        itemMenuButton.setBackground(new java.awt.Color(96, 86, 120));
        itemMenuButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        itemMenuButton.setForeground(new java.awt.Color(255, 255, 255));
        itemMenuButton.setText("ItemMenus");
        itemMenuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuButtonActionPerformed(evt);
            }
        });

        pedidosButton.setBackground(new java.awt.Color(96, 86, 120));
        pedidosButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pedidosButton.setForeground(new java.awt.Color(255, 255, 255));
        pedidosButton.setText("Pedidos");
        pedidosButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pedidosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pedidosButton, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(itemMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(clientesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(vendedoresButton, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vendedoresButton, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(clientesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(itemMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pedidosButton, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccione una opción de la barra lateral");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("seleccionarOpcionLabel");

        jSplitPane1.setRightComponent(panelMenu);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesButtonActionPerformed
        // TODO add your handling code here:
        ClientePanel panel = new ClientePanel();
        panel.setSize(579, 374);
        panel.setLocation(0,0);
        
        panelMenu.removeAll();
        panelMenu.setLayout(new java.awt.BorderLayout());
        panelMenu.add(panel);
        panelMenu.revalidate();
        panelMenu.repaint();
    }//GEN-LAST:event_clientesButtonActionPerformed

    private void itemMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuButtonActionPerformed
        // TODO add your handling code here:
        ItemMenuPanel panel = new ItemMenuPanel();
        panel.setSize(579, 374);
        panel.setLocation(0,0);
        
        panelMenu.removeAll();
        panelMenu.setLayout(new java.awt.BorderLayout());
        panelMenu.add(panel);
        panelMenu.revalidate();
        panelMenu.repaint();
    }//GEN-LAST:event_itemMenuButtonActionPerformed

    private void vendedoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendedoresButtonActionPerformed
        VendedorPanel panel = new VendedorPanel();
        panel.setSize(579, 374);
        panel.setLocation(0,0);
        
        panelMenu.removeAll();
        panelMenu.setLayout(new java.awt.BorderLayout());
        panelMenu.add(panel);
        panelMenu.revalidate();
        panelMenu.repaint();
    }//GEN-LAST:event_vendedoresButtonActionPerformed

    private void pedidosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidosButtonActionPerformed
        // TODO add your handling code here:
        PedidosPanel panel = new PedidosPanel();
        panel.setSize(579, 374);
        panel.setLocation(0,0);
        
        panelMenu.removeAll();
        panelMenu.setLayout(new java.awt.BorderLayout());
        panelMenu.add(panel);
        panelMenu.revalidate();
        panelMenu.repaint();
    }//GEN-LAST:event_pedidosButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatMacLightLaf());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clientesButton;
    private javax.swing.JButton itemMenuButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JButton pedidosButton;
    private javax.swing.JButton vendedoresButton;
    // End of variables declaration//GEN-END:variables
}
