package isi.deso.tp.gui;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import isi.deso.tp.controllers.PedidoController;
import isi.deso.tp.excepciones.ClienteNoEncontradoException;
import isi.deso.tp.excepciones.ItemNoEncontradoException;
import isi.deso.tp.logicaNegocios.*;
import isi.deso.tp.persistencia.ClienteMemory;
import isi.deso.tp.persistencia.VendedorMemory;

import java.util.ArrayList;
import java.util.List;
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                Vendedor v1 = new Vendedor("Pedro", "Av. de las Americas 1000", new Coordenada(-31.746894632549242, -60.52480784560017));
                Vendedor v2 = new Vendedor("Lucas", "Bv. Galvez 1200", new Coordenada(-31.638385317681948, -60.68820680511817));
                Vendedor v3 = new Vendedor("Mariano", "Cordoba 700", new Coordenada(-31.720648806383995, -60.52989301773252));
                VendedorMemory bdd = new VendedorMemory();
                bdd.crearVendedor(v1);
                bdd.crearVendedor(v2);
                bdd.crearVendedor(v3);
                Cliente c1 = new Cliente("20-34567892-4","Pedro Sanchez", "pedrosanches@gmail.com", "Las Heras 6664", new Coordenada(-31.607585631151917, -60.688909841851526));
                Cliente c2 = new Cliente( "27-45678901-6", "Nayib Bukele","maria123@gmail.com", "Castelli 1399", new Coordenada(-31.65805720316965, -60.76379753347072));
                Cliente c3 = new Cliente ("30-78901234-5","El Javo", "corralonpepe@gmail.com", "Saavedra 4599", (new Coordenada(-31.690958263178747, -60.77288831761002)));
                ClienteMemory bdd2 = new ClienteMemory();
                bdd2.crearCliente(c1);
                bdd2.crearCliente(c2);
                bdd2.crearCliente(c3);

                //ItemMenuController.crearBebida( "Coca-Cola", "Gaseosa de cola", 1000.0, "cat1", 0.0f, 500, v1.getNombre());
                //ItemMenuController.crearBebida( "Fanta", "Gaseosa de Naranja", 2000.0, "cat1", 0.0f, 600, v1.getNombre());
                //ItemMenuController.crearPlato( "Suprema", "Pechuga de pollo rebosada", 5000.00, "cat1", 600, false, false, 300.00f, v1.getNombre());
                //ItemMenuController.crearPlato("Empanadas de carne", "Media docena de empanadas de carne", 4500.00, "cat1", 1020, false, false, 700.00f,v3.getNombre());

                ItemMenuDTO aux1 = new ItemMenuDTO("Fanta",4,"Pedro");
                ItemMenuDTO aux2 = new ItemMenuDTO("Suprema",3,"Pedro");

                List<ItemMenuDTO> auxiliar=new ArrayList<>();
                auxiliar.add(aux1);
                auxiliar.add(aux2);

                try {
                    PedidoController.crearPedido(4,"Pedro",auxiliar);
                } catch (ItemNoEncontradoException e) {
                    throw new RuntimeException(e);
                } catch (ClienteNoEncontradoException e) {
                    throw new RuntimeException(e);
                }

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
