/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package isi.deso.tp.gui;

/**
 *
 * @author nicoh
 */
public class VendedorPanel extends javax.swing.JPanel {

    /**
     * Creates new form administradorPanel
     */
    public VendedorPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloVendedores = new javax.swing.JLabel();
        nuevoVendedorButton = new javax.swing.JButton();
        busquedaField = new javax.swing.JTextField();
        buscarButton = new javax.swing.JButton();
        buscarVendedorLabel = new javax.swing.JLabel();
        listadoScrollPane = new javax.swing.JScrollPane();
        listadoVendedoresTable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(579, 125));

        tituloVendedores.setBackground(new java.awt.Color(153, 153, 153));
        tituloVendedores.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tituloVendedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVendedores.setText("Lista de vendedores");
        tituloVendedores.setOpaque(true);

        nuevoVendedorButton.setBackground(new java.awt.Color(96, 86, 120));
        nuevoVendedorButton.setForeground(new java.awt.Color(255, 255, 255));
        nuevoVendedorButton.setText("Crear nuevo vendedor");

        busquedaField.setBackground(new java.awt.Color(204, 204, 204));
        busquedaField.setToolTipText("");
        busquedaField.setName(""); // NOI18N
        busquedaField.setOpaque(true);

        buscarButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        buscarButton.setForeground(new java.awt.Color(255, 255, 255));
        buscarButton.setText("Buscar");

        buscarVendedorLabel.setText("Buscar vendedor");

        listadoVendedoresTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listadoVendedoresTable.setModel(new javax.swing.table.DefaultTableModel(
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
        listadoVendedoresTable.setGridColor(new java.awt.Color(255, 255, 255));
        listadoScrollPane.setViewportView(listadoVendedoresTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(buscarVendedorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busquedaField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(listadoScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                    .addComponent(tituloVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevoVendedorButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busquedaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarButton)
                    .addComponent(buscarVendedorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listadoScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nuevoVendedorButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarButton;
    private javax.swing.JLabel buscarVendedorLabel;
    private javax.swing.JTextField busquedaField;
    private javax.swing.JScrollPane listadoScrollPane;
    private javax.swing.JTable listadoVendedoresTable;
    private javax.swing.JButton nuevoVendedorButton;
    private javax.swing.JLabel tituloVendedores;
    // End of variables declaration//GEN-END:variables
}