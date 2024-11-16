package isi.deso.tp.gui;

import isi.deso.tp.controllers.PagoController;
import isi.deso.tp.controllers.PedidoController;
import isi.deso.tp.excepciones.PedidoNoEncontradoException;
import isi.deso.tp.logicaNegocios.ESTADO;
import isi.deso.tp.logicaNegocios.Pago;
import isi.deso.tp.logicaNegocios.Pedido;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.ArrayList;

public class PedidosPanel extends javax.swing.JPanel {
    public PedidosPanel() {
        initComponents();
        initialize();
    }

    private void initialize(){

        List<Pedido> pedidos = PedidoController.listarPedidos();

        JPanel panelMenu2 = (JPanel) scrollPane.getViewport().getView();

        for(Pedido p: pedidos) {
            panelMenu2.setLayout(new FlowLayout(FlowLayout.LEFT));
            panelMenu2.setLayout(new BoxLayout(panelMenu2, BoxLayout.Y_AXIS));

            JLabel jLabel1 = new JLabel("Vendedor: " + p.getMiVendedor().getNombre() +" Cliente: "+ p.getMiCliente().getNombre());
            jLabel1.setMaximumSize(new Dimension(358, 23));
            jLabel1.setMinimumSize(new Dimension(358, 23));
            jLabel1.setPreferredSize(new Dimension(358, 23));

            JButton eliminarBtn = new JButton("Eliminar");
            eliminarBtn.setPreferredSize(new Dimension(80, 23));
            eliminarBtn.setMaximumSize(new Dimension(80, 23));
            eliminarBtn.setMinimumSize(new Dimension(80, 23));

            eliminarBtn.addMouseListener(
                    new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {

                            String[] options = {"Sí", "No"};

                            int resp = JOptionPane.showOptionDialog(null,
                                    "¿Está seguro que quiere eliminar el pedido?",
                                    "Cancelar registro",
                                    JOptionPane.YES_NO_OPTION,
                                    JOptionPane.WARNING_MESSAGE,
                                    null,
                                    options,
                                    options[1]
                            );

                            if (resp == JOptionPane.YES_OPTION) {
                                Pago pago = new Pago();
                                PagoController.crearPago(pago);

                                PedidoController.eliminarPedido(p.getID());
                            }
                        }
                    });

            JButton pagoBtn = new JButton();
            pagoBtn.setPreferredSize(new Dimension(80, 23));
            pagoBtn.setMaximumSize(new Dimension(80, 23));
            pagoBtn.setMinimumSize(new Dimension(80, 23));

            double precio = p.getPrecio();

            if(p.getEstado() == ESTADO.EN_ENVIO || p.getEstado() == ESTADO.ENTREGADO){
                pagoBtn.setText("Ver pago");
                pagoBtn.addMouseListener(
                        new MouseAdapter() {
                            @Override
                            public void mousePressed(MouseEvent e) {

                                JOptionPane.showMessageDialog(null, "Monto pagado: $" + precio,
                                        "Información sobre el pago del pedido", JOptionPane.INFORMATION_MESSAGE);
                            }
                        });
            }
            else{
                pagoBtn.setText("Pagar");

                pagoBtn.addMouseListener(
                        new MouseAdapter() {
                            @Override
                            public void mousePressed(MouseEvent e) {

                                String[] options = {"Sí", "No"};

                                int resp = JOptionPane.showOptionDialog(null,
                                        "El precio es de: $"+ precio +"\n¿Está seguro que quiere pagar el pedido?",
                                        "Pagar registro",
                                        JOptionPane.YES_NO_OPTION,
                                        JOptionPane.WARNING_MESSAGE,
                                        null,
                                        options,
                                        options[1]
                                );

                                if (resp == JOptionPane.YES_OPTION) {
                                    PedidoController.actualizarEstadoPedido(p.getID(), ESTADO.EN_ENVIO);
                                }
                            }
                        });
            }

            JPanel paux = new JPanel();
            paux.setMaximumSize(new Dimension(520, 24));
            paux.setMinimumSize(new Dimension(520, 24));
            paux.setPreferredSize(new Dimension(520, 24));

            paux.setLayout(new BoxLayout(paux, BoxLayout.X_AXIS));
            paux.add(jLabel1);
            paux.add(pagoBtn);
            paux.add(eliminarBtn);

            // Añadir el JSpinner y el JLabel al panel
            panelMenu2.add(paux);
        }
        scrollPane.setViewportView(panelMenu2);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloPedidos = new javax.swing.JLabel();
        nuevoPedidoButton = new javax.swing.JButton();
        busquedaField = new javax.swing.JTextField();
        buscarButton = new javax.swing.JButton();
        buscarPedidoLabel = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        panelContenedor = new javax.swing.JPanel();

        tituloPedidos.setBackground(new java.awt.Color(153, 153, 153));
        tituloPedidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tituloPedidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPedidos.setText("Lista de pedidos");
        tituloPedidos.setOpaque(true);

        nuevoPedidoButton.setBackground(new java.awt.Color(96, 86, 120));
        nuevoPedidoButton.setForeground(new java.awt.Color(255, 255, 255));
        nuevoPedidoButton.setText("Crear nuevo pedido");
        nuevoPedidoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevoPedidoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nuevoPedidoButtonMousePressed(evt);
            }
        });
        nuevoPedidoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoPedidoButtonActionPerformed(evt);
            }
        });

        busquedaField.setBackground(new java.awt.Color(204, 204, 204));
        busquedaField.setToolTipText("");
        busquedaField.setName(""); // NOI18N
        busquedaField.setOpaque(true);

        buscarButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        buscarButton.setText("Buscar");
        buscarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                try{
                    buscarButtonMousePressed(evt);
                }
                catch(PedidoNoEncontradoException p){
                    System.out.println("Pedido no encontrado");
                }
            }
        });

        buscarPedidoLabel.setText("Buscar pedido");

        scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        scrollPane.setViewportView(panelContenedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(buscarPedidoLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(busquedaField, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buscarButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE))
                        .addComponent(tituloPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(nuevoPedidoButton)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tituloPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(busquedaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buscarButton)
                        .addComponent(buscarPedidoLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                    .addComponent(nuevoPedidoButton)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoPedidoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoPedidoButtonActionPerformed

    }//GEN-LAST:event_nuevoPedidoButtonActionPerformed

    private void nuevoPedidoButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoPedidoButtonMousePressed
        CrearPedidoGUI cpg = new CrearPedidoGUI();
        cpg.setVisible(true);
    }//GEN-LAST:event_nuevoPedidoButtonMousePressed

    private void buscarButtonMousePressed(java.awt.event.MouseEvent evt) throws PedidoNoEncontradoException {//GEN-FIRST:event_buscarButtonMousePressed
        String busqueda = busquedaField.getText();

        List<Pedido> pedidos = new ArrayList<>();
        
        try{
            pedidos = PedidoController.buscarPedido(busqueda);
        }catch(PedidoNoEncontradoException p){
            System.out.println("Pedido no encontrado");
        }
        

        JPanel panelMenu2 = (JPanel) scrollPane.getViewport().getView();

        panelMenu2.removeAll();
        for(Pedido p: pedidos) {
            panelMenu2.setLayout(new FlowLayout(FlowLayout.LEFT));
            panelMenu2.setLayout(new BoxLayout(panelMenu2, BoxLayout.Y_AXIS));

            JLabel jLabel1 = new JLabel("Vendedor: " + p.getMiVendedor().getNombre() +" Cliente: "+ p.getMiCliente().getNombre());
            jLabel1.setMaximumSize(new Dimension(358, 23));
            jLabel1.setMinimumSize(new Dimension(358, 23));
            jLabel1.setPreferredSize(new Dimension(358, 23));

            JButton eliminarBtn = new JButton("Eliminar");
            eliminarBtn.setPreferredSize(new Dimension(80, 23));
            eliminarBtn.setMaximumSize(new Dimension(80, 23));
            eliminarBtn.setMinimumSize(new Dimension(80, 23));

            eliminarBtn.addMouseListener(
                    new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {

                            String[] options = {"Sí", "No"};

                            int resp = JOptionPane.showOptionDialog(null,
                                    "¿Está seguro que quiere eliminar el pedido?",
                                    "Cancelar registro",
                                    JOptionPane.YES_NO_OPTION,
                                    JOptionPane.WARNING_MESSAGE,
                                    null,
                                    options,
                                    options[1]
                            );

                            if (resp == JOptionPane.YES_OPTION) {
                                PedidoController.eliminarPedido(p.getID());
                            }
                        }
                    });

            JButton pagoBtn = new JButton();
            pagoBtn.setPreferredSize(new Dimension(80, 23));
            pagoBtn.setMaximumSize(new Dimension(80, 23));
            pagoBtn.setMinimumSize(new Dimension(80, 23));

            double precio = p.getPrecio();

            if(p.getEstado() == ESTADO.EN_ENVIO || p.getEstado() == ESTADO.ENTREGADO){
                pagoBtn.setText("Ver pago");
                pagoBtn.addMouseListener(
                        new MouseAdapter() {
                            @Override
                            public void mousePressed(MouseEvent e) {

                                JOptionPane.showMessageDialog(null, "Monto pagado: $" + precio,
                                        "Información sobre el pago del pedido", JOptionPane.INFORMATION_MESSAGE);
                            }
                        });
            }
            else{
                pagoBtn.setText("Pagar");

                pagoBtn.addMouseListener(
                        new MouseAdapter() {
                            @Override
                            public void mousePressed(MouseEvent e) {

                                String[] options = {"Sí", "No"};

                                int resp = JOptionPane.showOptionDialog(null,
                                        "El precio es de: $"+ precio +"\n¿Está seguro que quiere pagar el pedido?",
                                        "Pagar registro",
                                        JOptionPane.YES_NO_OPTION,
                                        JOptionPane.WARNING_MESSAGE,
                                        null,
                                        options,
                                        options[1]
                                );

                                if (resp == JOptionPane.YES_OPTION) {
                                    PedidoController.actualizarEstadoPedido(p.getID(), ESTADO.EN_ENVIO);
                                }
                            }
                        });
            }

            JPanel paux = new JPanel();
            paux.setMaximumSize(new Dimension(520, 24));
            paux.setMinimumSize(new Dimension(520, 24));
            paux.setPreferredSize(new Dimension(520, 24));

            paux.setLayout(new BoxLayout(paux, BoxLayout.X_AXIS));
            paux.add(jLabel1);
            paux.add(pagoBtn);
            paux.add(eliminarBtn);

            // Añadir el JSpinner y el JLabel al panel
            panelMenu2.add(paux);
        }
        scrollPane.setViewportView(panelMenu2);

    }





//GEN-LAST:event_buscarButtonMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarButton;
    private javax.swing.JLabel buscarPedidoLabel;
    private javax.swing.JTextField busquedaField;
    private javax.swing.JButton nuevoPedidoButton;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JLabel tituloPedidos;
    // End of variables declaration//GEN-END:variables
}
