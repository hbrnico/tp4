package isi.deso.tp.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ItemMenuPanel extends javax.swing.JPanel {

    public ItemMenuPanel() {
        initComponents();
        initialize();
    }

    private void initialize(){
        
        JPanel panelMenu2 = (JPanel) scrollPane.getViewport().getView();
        panelMenu2.setLayout(new FlowLayout(FlowLayout.LEFT)); 
        panelMenu2.setLayout(new BoxLayout(panelMenu2, BoxLayout.Y_AXIS));

        JLabel jLabel1 = new JLabel("Nombre del itemMenu");        
        jLabel1.setMaximumSize(new Dimension(363, 23));
        jLabel1.setMinimumSize(new Dimension(363, 23));
        jLabel1.setPreferredSize(new Dimension(363, 23));
        
        JButton editarBtn = new JButton("Editar");
        editarBtn.setPreferredSize(new Dimension(73,23));
        editarBtn.setMaximumSize(new Dimension(73,23));
        editarBtn.setMinimumSize(new Dimension(73,23));
        
        editarBtn.addMouseListener(
            new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {


                
            }
        });
        
        JButton eliminarBtn = new JButton("Eliminar");
        eliminarBtn.setPreferredSize(new Dimension(80,23));
        eliminarBtn.setMaximumSize(new Dimension(80,23));
        eliminarBtn.setMinimumSize(new Dimension(80,23));
        
        eliminarBtn.addMouseListener(
            new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                        String[] options = {"Sí", "No"};

                int resp = JOptionPane.showOptionDialog(null,
                    "¿Está seguro que quiere eliminar el itemMenu?",
                    "Eliminar ItemMenu",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null,
                    options, 
                    options[1] 
                );

                if(resp == JOptionPane.YES_OPTION); // METODO ELIMINAR BACKEND
            }
        });
                
        JPanel paux = new JPanel();
        paux.setMaximumSize(new Dimension(520, 24));
        paux.setMinimumSize(new Dimension(520, 24));
        paux.setPreferredSize(new Dimension(520, 24));

        paux.setLayout(new BoxLayout(paux, BoxLayout.X_AXIS));
        paux.add(jLabel1);
        paux.add(editarBtn);
        paux.add(eliminarBtn);
        
        
        // Añadir el JSpinner y el JLabel al panel
        panelMenu2.add(paux);

        scrollPane.setViewportView(panelMenu2);

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloItemMenus = new javax.swing.JLabel();
        nuevoItemMenuButton = new javax.swing.JButton();
        busquedaField = new javax.swing.JTextField();
        buscarButton = new javax.swing.JButton();
        buscarItemMenuLabel = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        panelContenedor = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(579, 125));

        tituloItemMenus.setBackground(new java.awt.Color(153, 153, 153));
        tituloItemMenus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tituloItemMenus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloItemMenus.setText("Lista de itemMenu");
        tituloItemMenus.setOpaque(true);

        nuevoItemMenuButton.setBackground(new java.awt.Color(96, 86, 120));
        nuevoItemMenuButton.setForeground(new java.awt.Color(255, 255, 255));
        nuevoItemMenuButton.setText("Crear nuevo itemMenu");
        nuevoItemMenuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevoItemMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoItemMenuButtonActionPerformed(evt);
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
        buscarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buscarButtonMousePressed(evt);
            }
        });

        buscarItemMenuLabel.setText("Buscar ItemMenu");

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        scrollPane.setViewportView(panelContenedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(buscarItemMenuLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busquedaField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(tituloItemMenus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevoItemMenuButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloItemMenus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busquedaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarButton)
                    .addComponent(buscarItemMenuLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nuevoItemMenuButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoItemMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoItemMenuButtonActionPerformed
        CrearItemMenuGUI cv = new CrearItemMenuGUI();
        cv.setVisible(true);
    }//GEN-LAST:event_nuevoItemMenuButtonActionPerformed

    private void buscarButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarButtonMousePressed
        String busqueda = buscarItemMenuLabel.getText();
        
        
        
        initialize(); // BORRAR 
    }//GEN-LAST:event_buscarButtonMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarButton;
    private javax.swing.JLabel buscarItemMenuLabel;
    private javax.swing.JTextField busquedaField;
    private javax.swing.JButton nuevoItemMenuButton;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JLabel tituloItemMenus;
    // End of variables declaration//GEN-END:variables
}
