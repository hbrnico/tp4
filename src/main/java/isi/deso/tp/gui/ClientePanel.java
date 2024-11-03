package isi.deso.tp.gui;

import isi.deso.tp.controllers.ClienteController;
import isi.deso.tp.controllers.VendedorController;
import isi.deso.tp.excepciones.ClienteNoEncontradoExeption;
import isi.deso.tp.logicaNegocios.Cliente;
import isi.deso.tp.logicaNegocios.Vendedor;

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

public class ClientePanel extends javax.swing.JPanel {

    public ClientePanel() {
        initComponents();
        initialize();
    }

    private void initialize(){

        List<Cliente> listaClientes= ClienteController.listarClientes();

        JPanel panelMenu2 = (JPanel) scrollPane.getViewport().getView();
        for (Cliente c: listaClientes) {
            panelMenu2.setLayout(new FlowLayout(FlowLayout.LEFT));
            panelMenu2.setLayout(new BoxLayout(panelMenu2, BoxLayout.Y_AXIS));

            JLabel jLabel1 = new JLabel(c.getNombre());
            jLabel1.setMaximumSize(new Dimension(363, 23));
            jLabel1.setMinimumSize(new Dimension(363, 23));
            jLabel1.setPreferredSize(new Dimension(363, 23));

            JButton editarBtn = new JButton("Editar");
            editarBtn.setPreferredSize(new Dimension(73, 23));
            editarBtn.setMaximumSize(new Dimension(73, 23));
            editarBtn.setMinimumSize(new Dimension(73, 23));

            editarBtn.addMouseListener(
                    new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            EditarClienteGUI ec = new EditarClienteGUI();
                            ec.setMailViejo(c.getEmail());
                            ec.setVisible(true);
                        }
                    });

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
                                    "¿Está seguro que quiere eliminar el cliente?",
                                    "Eliminar Cliente",
                                    JOptionPane.YES_NO_OPTION,
                                    JOptionPane.WARNING_MESSAGE,
                                    null,
                                    options,
                                    options[1]
                            );

                            if (resp == JOptionPane.YES_OPTION) {
                                try{
                                    ClienteController.eliminarCliente(c.getEmail());
                                } catch (ClienteNoEncontradoExeption ex) {
                                    System.out.println(ex);
                                }
                            }
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
        }
        scrollPane.setViewportView(panelMenu2);

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloClientes = new javax.swing.JLabel();
        nuevoClienteBtn = new javax.swing.JButton();
        busquedaField = new javax.swing.JTextField();
        buscarButton = new javax.swing.JButton();
        buscarClientes = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        panelContenedor = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(579, 125));

        tituloClientes.setBackground(new java.awt.Color(153, 153, 153));
        tituloClientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tituloClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloClientes.setText("Lista de clientes");
        tituloClientes.setOpaque(true);

        nuevoClienteBtn.setBackground(new java.awt.Color(96, 86, 120));
        nuevoClienteBtn.setForeground(new java.awt.Color(255, 255, 255));
        nuevoClienteBtn.setText("Crear nuevo cliente");
        nuevoClienteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevoClienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoClienteBtnActionPerformed(evt);
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

        buscarClientes.setText("Buscar clientes");

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
                        .addComponent(buscarClientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busquedaField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(tituloClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevoClienteBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busquedaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarButton)
                    .addComponent(buscarClientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nuevoClienteBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoClienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoClienteBtnActionPerformed
        CrearClienteGUI cv = new CrearClienteGUI();
        cv.setVisible(true);
    }//GEN-LAST:event_nuevoClienteBtnActionPerformed

    private void buscarButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarButtonMousePressed
        String busqueda = busquedaField.getText();

        try{
            List<Cliente> listaClientes = ClienteController.buscarCliente(busqueda);
            JPanel panelMenu2 = (JPanel) scrollPane.getViewport().getView();
            panelMenu2.removeAll();
            for (Cliente c: listaClientes) {
                panelMenu2.setLayout(new FlowLayout(FlowLayout.LEFT));
                panelMenu2.setLayout(new BoxLayout(panelMenu2, BoxLayout.Y_AXIS));

                JLabel jLabel1 = new JLabel(c.getNombre());
                jLabel1.setMaximumSize(new Dimension(363, 23));
                jLabel1.setMinimumSize(new Dimension(363, 23));
                jLabel1.setPreferredSize(new Dimension(363, 23));

                JButton editarBtn = new JButton("Editar");
                editarBtn.setPreferredSize(new Dimension(73, 23));
                editarBtn.setMaximumSize(new Dimension(73, 23));
                editarBtn.setMinimumSize(new Dimension(73, 23));

                editarBtn.addMouseListener(
                        new MouseAdapter() {
                            @Override
                            public void mousePressed(MouseEvent e) {
                                EditarClienteGUI ec = new EditarClienteGUI();
                                ec.setMailViejo(c.getEmail());
                                ec.setVisible(true);
                            }
                        });

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
                                        "¿Está seguro que quiere eliminar el cliente?",
                                        "Eliminar Cliente",
                                        JOptionPane.YES_NO_OPTION,
                                        JOptionPane.WARNING_MESSAGE,
                                        null,
                                        options,
                                        options[1]
                                );

                                if (resp == JOptionPane.YES_OPTION) {
                                    try{
                                        ClienteController.eliminarCliente(c.getEmail());
                                    } catch (ClienteNoEncontradoExeption ex) {
                                        System.out.println(ex);
                                    }
                                }
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
            }
            scrollPane.setViewportView(panelMenu2);
        }catch (ClienteNoEncontradoExeption ex){
            System.out.println(ex);
        }

    }//GEN-LAST:event_buscarButtonMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarButton;
    private javax.swing.JLabel buscarClientes;
    private javax.swing.JTextField busquedaField;
    private javax.swing.JButton nuevoClienteBtn;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JLabel tituloClientes;
    // End of variables declaration//GEN-END:variables
}
