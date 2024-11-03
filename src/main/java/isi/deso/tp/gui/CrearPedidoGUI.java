package isi.deso.tp.gui;

import isi.deso.tp.controllers.ItemMenuController;
import isi.deso.tp.controllers.PedidoController;
import isi.deso.tp.controllers.VendedorController;
import isi.deso.tp.excepciones.ClienteNoEncontradoExeption;
import isi.deso.tp.excepciones.ItemNoEncontradoException;
import isi.deso.tp.logicaNegocios.ItemMenu;
import isi.deso.tp.logicaNegocios.ItemMenuDTO;
import isi.deso.tp.logicaNegocios.Pedido;
import isi.deso.tp.logicaNegocios.Vendedor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.Border;

public class CrearPedidoGUI extends javax.swing.JFrame {
    public CrearPedidoGUI() {
        initComponents();
        cargarVendedores(); // Metodo que debería recibir los vendedores de la BDD
        // Y setearlos en la listaVendedores. De momento ponemos solamente vendedores de prueba
        
    }

    private void cargarVendedores(){

        List<Vendedor> lv = VendedorController.buscarListaVendedores();
        for (Vendedor v:lv){
            listaVendedores.addItem(v.getNombre());
        }


    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        listaVendedores = new javax.swing.JComboBox<>();
        idClienteIngresado = new javax.swing.JTextField();
        guardarBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        panelContenedorItems = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Crear un nuevo pedido");

        jLabel2.setText("Seleccione un vendedor:");

        listaVendedores.setToolTipText("");
        listaVendedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaVendedoresMousePressed(evt);
            }
        });
        listaVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaVendedoresActionPerformed(evt);
            }
        });

        idClienteIngresado.setForeground(new java.awt.Color(204, 204, 204));
        idClienteIngresado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        idClienteIngresado.setText("IDCliente");
        idClienteIngresado.setToolTipText("");
        idClienteIngresado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                idClienteIngresadoMousePressed(evt);
            }
        });
        idClienteIngresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idClienteIngresadoActionPerformed(evt);
            }
        });

        guardarBtn.setBackground(new java.awt.Color(96, 86, 120));
        guardarBtn.setText("Guardar");
        guardarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                try {
                    guardarBtnMousePressed(evt);
                } catch (ClienteNoEncontradoExeption e) {
                    throw new RuntimeException(e);
                } catch (ItemNoEncontradoException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        cancelarBtn.setBackground(new java.awt.Color(96, 86, 120));
        cancelarBtn.setText("Cancelar");
        cancelarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelarBtnMousePressed(evt);
            }
        });
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });

        scrollPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        javax.swing.GroupLayout panelContenedorItemsLayout = new javax.swing.GroupLayout(panelContenedorItems);
        panelContenedorItems.setLayout(panelContenedorItemsLayout);
        panelContenedorItemsLayout.setHorizontalGroup(
            panelContenedorItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );
        panelContenedorItemsLayout.setVerticalGroup(
            panelContenedorItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        scrollPane.setViewportView(panelContenedorItems);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelarBtn)
                .addGap(18, 18, 18)
                .addComponent(guardarBtn)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listaVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(idClienteIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idClienteIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listaVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollPane)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarBtn)
                    .addComponent(cancelarBtn))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaVendedoresActionPerformed

        
        // Selecciona vendedor
        List<Vendedor> vl= VendedorController.buscarListaVendedores();
        String nombreVendedor = listaVendedores.getSelectedItem().toString();

        
        // Acá iría el backend -> devolver los itemsMenu del vendedor seleccionado
        // De momento solo pongo un par de items para probar la GUI.

        List<ItemMenu> listaItemsVendedor = ItemMenuController.buscarItemMenuPorVendedor(nombreVendedor);


        JPanel panelMenu2 = (JPanel) scrollPane.getViewport().getView();
        panelMenu2.removeAll();
        for(ItemMenu item : listaItemsVendedor) {


            panelMenu2.setLayout(new FlowLayout(FlowLayout.LEFT));
            panelMenu2.setLayout(new BoxLayout(panelMenu2, BoxLayout.Y_AXIS));

            JSpinner jSpinner2 = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
            jSpinner2.setMaximumSize(new Dimension(45, 25));
            jSpinner2.setMinimumSize(new Dimension(45, 25));
            jSpinner2.setPreferredSize(new Dimension(45, 25));
            JLabel jLabel1 = new JLabel(item.getNombre());

            jLabel1.setMaximumSize(new Dimension(390 - 45, 25));
            jLabel1.setMinimumSize(new Dimension(390 - 45, 25));
            jLabel1.setPreferredSize(new Dimension(390 - 45, 25));

            JPanel paux = new JPanel();
            paux.setMaximumSize(new Dimension(400, 50));
            paux.setMinimumSize(new Dimension(400, 50));
            paux.setPreferredSize(new Dimension(400, 50));

            Border borde = BorderFactory.createLineBorder(Color.BLACK, 1);
            paux.setBorder(borde);

            paux.setLayout(new BoxLayout(paux, BoxLayout.X_AXIS));
            paux.add(jLabel1);
            paux.add(jSpinner2);


            panelMenu2.add(paux);

        }

        scrollPane.setViewportView(panelMenu2);

        
    }//GEN-LAST:event_listaVendedoresActionPerformed

    private void idClienteIngresadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idClienteIngresadoMousePressed
        if(idClienteIngresado.getText().equals("IDCliente")){
            idClienteIngresado.setText("");
            idClienteIngresado.setForeground(Color.black);
        }
    }//GEN-LAST:event_idClienteIngresadoMousePressed

    private void idClienteIngresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idClienteIngresadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idClienteIngresadoActionPerformed

    private void guardarBtnMousePressed(java.awt.event.MouseEvent evt) throws ClienteNoEncontradoExeption, ItemNoEncontradoException {//GEN-FIRST:event_guardarBtnMousePressed

        Integer idCliente= Integer.valueOf(idClienteIngresado.getText());
        String nombreVendedor = listaVendedores.getSelectedItem().toString();
        List<Integer>valores = new ArrayList<>();
        List<ItemMenu> listaItemsVendedor = ItemMenuController.buscarItemMenuPorVendedor(nombreVendedor);

        for(Component componente1 : panelContenedorItems.getComponents()) {
            if(componente1 instanceof JPanel){
                for(Component componente2 : ((JPanel) componente1).getComponents()){
                    if(componente2 instanceof JSpinner){
                        JSpinner aux = (JSpinner) componente2;
                        valores.add((Integer) aux.getValue());
                    }
                }
            }
        }

        //for(Integer i:valores)System.out.println(i);
        //formar lista de itemmenu del pedido

        List<ItemMenuDTO> itemsPedido=new ArrayList<>();

        for (int i = 0; i < listaItemsVendedor.size(); i++) {
                    itemsPedido.add(new ItemMenuDTO(listaItemsVendedor.get(i).getNombre(),valores.get(i),nombreVendedor));
        }

        /*for(ItemMenuDTO item : itemsPedido){
            System.out.println(item.getNombre());
        }*/

        PedidoController.crearPedido(idCliente,nombreVendedor,itemsPedido);


        JOptionPane.showMessageDialog(null, "Pedido registrado con éxito.",
                "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }//GEN-LAST:event_guardarBtnMousePressed

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarBtnActionPerformed

    private void cancelarBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBtnMousePressed
        String[] options = {"Sí", "No"};

        int resp = JOptionPane.showOptionDialog(null,
            "Si cancela el registro se perderán los datos no guardados.\n¿Está seguro?",
            "Cancelar registro",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE,
            null,
            options, 
            options[1] 
        );
        
        if(resp == JOptionPane.YES_OPTION) dispose();
    }//GEN-LAST:event_cancelarBtnMousePressed

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void listaVendedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaVendedoresMousePressed
        if(idClienteIngresado.getText().equals("")){
            idClienteIngresado.setText("IDCliente");
            idClienteIngresado.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_listaVendedoresMousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearPedidoGUI().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JTextField idClienteIngresado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JComboBox<String> listaVendedores;
    private javax.swing.JLabel menu8;
    private javax.swing.JLabel menu9;
    private javax.swing.JPanel panelContenedorItems;
    private javax.swing.JPanel panelMenu8;
    private javax.swing.JPanel panelMenu9;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
