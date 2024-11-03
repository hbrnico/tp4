package isi.deso.tp.gui;

import java.awt.Color;

import isi.deso.tp.controllers.VendedorController;
import isi.deso.tp.logicaNegocios.Coordenada;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EditarVendedorGUI extends javax.swing.JFrame {

    Integer id_vendedor;

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public Integer getId_vendedor() {
        return id_vendedor;
    }

    public EditarVendedorGUI() {
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

        fondo = new javax.swing.JPanel();
        latitudIngresada = new javax.swing.JTextField();
        nombreIngresado = new javax.swing.JTextField();
        direccionIngresada = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        longitudIngresada = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        labelVendedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setForeground(new java.awt.Color(255, 255, 255));

        latitudIngresada.setForeground(new java.awt.Color(204, 204, 204));
        latitudIngresada.setText("Latitud");
        latitudIngresada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                latitudIngresadaMousePressed(evt);
            }
        });
        latitudIngresada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                latitudIngresadaActionPerformed(evt);
            }
        });

        nombreIngresado.setForeground(new java.awt.Color(204, 204, 204));
        nombreIngresado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreIngresado.setText("Nombre");
        nombreIngresado.setToolTipText("");
        nombreIngresado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreIngresadoMousePressed(evt);
            }
        });
        nombreIngresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreIngresadoActionPerformed(evt);
            }
        });

        direccionIngresada.setForeground(new java.awt.Color(204, 204, 204));
        direccionIngresada.setText("Dirección");
        direccionIngresada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                direccionIngresadaMousePressed(evt);
            }
        });
        direccionIngresada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionIngresadaActionPerformed(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(96, 86, 120));
        guardar.setText("Guardar");
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                guardarMousePressed(evt);
            }
        });
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(96, 86, 120));
        cancelar.setText("Cancelar");
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelarMousePressed(evt);
            }
        });
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        longitudIngresada.setForeground(new java.awt.Color(204, 204, 204));
        longitudIngresada.setText("Longitud");
        longitudIngresada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                longitudIngresadaMousePressed(evt);
            }
        });
        longitudIngresada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                longitudIngresadaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Editar Vendedor");

        labelVendedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelVendedor.setText("Vendedor: ");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(latitudIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addComponent(cancelar)
                                .addGap(26, 26, 26)
                                .addComponent(guardar))
                            .addComponent(longitudIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(direccionIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(nombreIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(direccionIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(longitudIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(latitudIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(guardar))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void latitudIngresadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_latitudIngresadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_latitudIngresadaActionPerformed

    private void direccionIngresadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionIngresadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionIngresadaActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarActionPerformed

    private void nombreIngresadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreIngresadoMousePressed
        if(nombreIngresado.getText().equals("Nombre")){
            nombreIngresado.setText("");
            nombreIngresado.setForeground(Color.black);
        }
        if(direccionIngresada.getText().equals("")){
            direccionIngresada.setText("Dirección");
            direccionIngresada.setForeground(Color.LIGHT_GRAY);
        }
        if(latitudIngresada.getText().equals("")){
            latitudIngresada.setText("Latitud");
            latitudIngresada.setForeground(Color.LIGHT_GRAY);
        }
        if(longitudIngresada.getText().equals("")){
            longitudIngresada.setText("Longitud");
            longitudIngresada.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_nombreIngresadoMousePressed

    private void nombreIngresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreIngresadoActionPerformed
        if(nombreIngresado.getText().equals("Nombre")){
            nombreIngresado.setText("");
        }
        if(direccionIngresada.getText().equals("")){
            direccionIngresada.setText("Dirección");
        }
        if(latitudIngresada.getText().equals("")){
            latitudIngresada.setText("");
        }
        if(longitudIngresada.getText().equals("")){
            longitudIngresada.setText("Longitud");
        }
    }//GEN-LAST:event_nombreIngresadoActionPerformed

    private void cancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMousePressed
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
    }//GEN-LAST:event_cancelarMousePressed

    private void direccionIngresadaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direccionIngresadaMousePressed
        if(direccionIngresada.getText().equals("Dirección")){
            direccionIngresada.setText("");
            direccionIngresada.setForeground(Color.black);
        }
        if(nombreIngresado.getText().equals("")){
            nombreIngresado.setText("Nombre");
            nombreIngresado.setForeground(Color.LIGHT_GRAY);
        }
        if(latitudIngresada.getText().equals("")){
            latitudIngresada.setText("Latitud");
            latitudIngresada.setForeground(Color.LIGHT_GRAY);
        }
        if(longitudIngresada.getText().equals("")){
            longitudIngresada.setText("Longitud");
            longitudIngresada.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_direccionIngresadaMousePressed

    private void latitudIngresadaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_latitudIngresadaMousePressed
        if(latitudIngresada.getText().equals("Latitud")){
            latitudIngresada.setText("");
            latitudIngresada.setForeground(Color.black);
        }
        if(direccionIngresada.getText().equals("")){
            direccionIngresada.setText("Dirección");
            direccionIngresada.setForeground(Color.LIGHT_GRAY);
        }
        if(nombreIngresado.getText().equals("")){
            nombreIngresado.setText("Nombre");
            nombreIngresado.setForeground(Color.LIGHT_GRAY);
        }
        if(longitudIngresada.getText().equals("")){
            longitudIngresada.setText("Longitud");
            longitudIngresada.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_latitudIngresadaMousePressed

    private void guardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMousePressed
       // CODIGO BACKEND
        String nombre = nombreIngresado.getText();
        String direccion = direccionIngresada.getText();
        Integer latitud = Integer.valueOf(latitudIngresada.getText());
        Integer longitud = Integer.valueOf(longitudIngresada.getText());

        VendedorController.modificarVendedor(nombre, direccion, latitud, longitud,this.id_vendedor);


        JOptionPane.showMessageDialog(null, "Vendedor registrado con éxito.",
                "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }//GEN-LAST:event_guardarMousePressed

    private void longitudIngresadaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_longitudIngresadaMousePressed
       if(longitudIngresada.getText().equals("Longitud")){
            longitudIngresada.setText("");
            longitudIngresada.setForeground(Color.black);
        }
        if(direccionIngresada.getText().equals("")){
            direccionIngresada.setText("Dirección");
            direccionIngresada.setForeground(Color.LIGHT_GRAY);
        }
        if(nombreIngresado.getText().equals("")){
            nombreIngresado.setText("Nombre");
            nombreIngresado.setForeground(Color.LIGHT_GRAY);
        }
        if(latitudIngresada.getText().equals("")){
            latitudIngresada.setText("Latitud");
            latitudIngresada.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_longitudIngresadaMousePressed

    private void longitudIngresadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_longitudIngresadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_longitudIngresadaActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:



    }//GEN-LAST:event_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(EditarVendedorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarVendedorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarVendedorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarVendedorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarVendedorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField direccionIngresada;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelVendedor;
    private javax.swing.JTextField latitudIngresada;
    private javax.swing.JTextField longitudIngresada;
    private javax.swing.JTextField nombreIngresado;
    // End of variables declaration//GEN-END:variables
}