package isi.deso.tp.gui;
public class PedidosPanel extends javax.swing.JPanel {
    public PedidosPanel() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloPedidos = new javax.swing.JLabel();
        nuevoPedidoButton = new javax.swing.JButton();
        busquedaField = new javax.swing.JTextField();
        buscarButton = new javax.swing.JButton();
        buscarPedidoLabel = new javax.swing.JLabel();
        listadoScrollPane = new javax.swing.JScrollPane();
        listadoPedidosTable = new javax.swing.JTable();

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
        buscarButton.setForeground(new java.awt.Color(255, 255, 255));
        buscarButton.setText("Buscar");
        buscarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buscarPedidoLabel.setText("Buscar pedido");

        listadoPedidosTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listadoPedidosTable.setModel(new javax.swing.table.DefaultTableModel(
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
        listadoPedidosTable.setGridColor(new java.awt.Color(255, 255, 255));
        listadoScrollPane.setViewportView(listadoPedidosTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(buscarPedidoLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(busquedaField)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1))
                        .addComponent(listadoScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                        .addComponent(tituloPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(nuevoPedidoButton)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tituloPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(busquedaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buscarButton)
                        .addComponent(buscarPedidoLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(listadoScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarButton;
    private javax.swing.JLabel buscarPedidoLabel;
    private javax.swing.JTextField busquedaField;
    private javax.swing.JTable listadoPedidosTable;
    private javax.swing.JScrollPane listadoScrollPane;
    private javax.swing.JButton nuevoPedidoButton;
    private javax.swing.JLabel tituloPedidos;
    // End of variables declaration//GEN-END:variables
}
