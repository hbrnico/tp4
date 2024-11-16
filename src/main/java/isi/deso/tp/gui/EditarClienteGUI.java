package isi.deso.tp.gui;

import isi.deso.tp.controllers.ClienteController;
import isi.deso.tp.excepciones.ClienteNoEncontradoException;

import java.awt.Color;
import javax.swing.JOptionPane;

public class EditarClienteGUI extends javax.swing.JFrame {

    String mailViejo;

    public void setMailViejo(String mailViejo) {
        this.mailViejo = mailViejo;
    }
    public String getMailViejo() {
        return mailViejo;
    }


    public EditarClienteGUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        guardarBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nombreIngresado = new javax.swing.JTextField();
        direccionIngresada = new javax.swing.JTextField();
        latitudIngresada = new javax.swing.JTextField();
        longitudIngresada = new javax.swing.JTextField();
        emailIngresado = new javax.swing.JTextField();
        cuitIngresado = new javax.swing.JTextField();

        guardar.setBackground(new java.awt.Color(96, 86, 120));
        guardar.setText("Guardar");
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        guardarBtn.setBackground(new java.awt.Color(96, 86, 120));
        guardarBtn.setText("Guardar");
        guardarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                try {
                    guardarBtnMousePressed(evt);
                } catch (ClienteNoEncontradoException e) {
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Editar cliente");

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

        emailIngresado.setForeground(new java.awt.Color(204, 204, 204));
        emailIngresado.setText("Email");
        emailIngresado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                emailIngresadoMousePressed(evt);
            }
        });
        emailIngresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailIngresadoActionPerformed(evt);
            }
        });

        cuitIngresado.setForeground(new java.awt.Color(204, 204, 204));
        cuitIngresado.setText("CUIT");
        cuitIngresado.setToolTipText("");
        cuitIngresado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cuitIngresadoMousePressed(evt);
            }
        });
        cuitIngresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CUITIngresadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccionIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(cancelarBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(guardarBtn))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(nombreIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(66, 66, 66)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(latitudIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(longitudIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(cuitIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(nombreIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(direccionIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cuitIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(longitudIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(latitudIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarBtn)
                    .addComponent(cancelarBtn))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMousePressed

    }//GEN-LAST:event_guardarMousePressed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarActionPerformed

    private void guardarBtnMousePressed(java.awt.event.MouseEvent evt)  throws ClienteNoEncontradoException {//GEN-FIRST:event_guardarBtnMousePressed

        String nombre= nombreIngresado.getText();
        String direccion= direccionIngresada.getText();
        String email= emailIngresado.getText();
        String cuit= cuitIngresado.getText();
        Integer latitud = Integer.valueOf(latitudIngresada.getText());
        Integer longitud = Integer.valueOf(longitudIngresada.getText());

        ClienteController.modificarCliente(this.mailViejo,nombre,cuit,email,direccion,latitud,longitud );


        JOptionPane.showMessageDialog(null, "Cliente registrado con éxito.",
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
        
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void nombreIngresadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreIngresadoMousePressed
        if(nombreIngresado.getText().equals("Nombre")){
            nombreIngresado.setText("");
            nombreIngresado.setForeground(Color.BLACK);
        }
        if(direccionIngresada.getText().equals("")){
            direccionIngresada.setText("Dirección");
            direccionIngresada.setForeground(Color.LIGHT_GRAY);
        }
        if(emailIngresado.getText().equals("")){
            emailIngresado.setText("Email");
            emailIngresado.setForeground(Color.LIGHT_GRAY);
        }
        if(cuitIngresado.getText().equals("")){
            cuitIngresado.setText("CUIT");
            cuitIngresado.setForeground(Color.LIGHT_GRAY);
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

    }//GEN-LAST:event_nombreIngresadoActionPerformed

    private void direccionIngresadaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direccionIngresadaMousePressed
        if(nombreIngresado.getText().equals("")){
            nombreIngresado.setText("Nombre");
            nombreIngresado.setForeground(Color.LIGHT_GRAY);
        }
        if(direccionIngresada.getText().equals("Dirección")){
            direccionIngresada.setText("");
            direccionIngresada.setForeground(Color.BLACK);
        }
        if(emailIngresado.getText().equals("")){
            emailIngresado.setText("Email");
            emailIngresado.setForeground(Color.LIGHT_GRAY);
        }
        if(cuitIngresado.getText().equals("")){
            cuitIngresado.setText("CUIT");
            cuitIngresado.setForeground(Color.LIGHT_GRAY);
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

    private void direccionIngresadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionIngresadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionIngresadaActionPerformed

    private void latitudIngresadaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_latitudIngresadaMousePressed
        if(nombreIngresado.getText().equals("")){
            nombreIngresado.setText("Nombre");
            nombreIngresado.setForeground(Color.LIGHT_GRAY);
        }
        if(direccionIngresada.getText().equals("")){
            direccionIngresada.setText("Dirección");
            direccionIngresada.setForeground(Color.LIGHT_GRAY);
        }
        if(emailIngresado.getText().equals("")){
            emailIngresado.setText("Email");
            emailIngresado.setForeground(Color.LIGHT_GRAY);
        }
        if(cuitIngresado.getText().equals("")){
            cuitIngresado.setText("CUIT");
            cuitIngresado.setForeground(Color.LIGHT_GRAY);
        }
        if(latitudIngresada.getText().equals("Latitud")){
            latitudIngresada.setText("");
            latitudIngresada.setForeground(Color.BLACK);
        }
        if(longitudIngresada.getText().equals("")){
            longitudIngresada.setText("Longitud");
            longitudIngresada.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_latitudIngresadaMousePressed

    private void latitudIngresadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_latitudIngresadaActionPerformed

    }//GEN-LAST:event_latitudIngresadaActionPerformed

    private void longitudIngresadaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_longitudIngresadaMousePressed
        if(nombreIngresado.getText().equals("")){
            nombreIngresado.setText("Nombre");
            nombreIngresado.setForeground(Color.LIGHT_GRAY);
        }
        if(direccionIngresada.getText().equals("")){
            direccionIngresada.setText("Dirección");
            direccionIngresada.setForeground(Color.LIGHT_GRAY);
        }
        if(emailIngresado.getText().equals("")){
            emailIngresado.setText("Email");
            emailIngresado.setForeground(Color.LIGHT_GRAY);
        }
        if(cuitIngresado.getText().equals("")){
            cuitIngresado.setText("CUIT");
            cuitIngresado.setForeground(Color.LIGHT_GRAY);
        }
        if(latitudIngresada.getText().equals("")){
            latitudIngresada.setText("Latitud");
            latitudIngresada.setForeground(Color.LIGHT_GRAY);
        }
        if(longitudIngresada.getText().equals("Longitud")){
            longitudIngresada.setText("");
            longitudIngresada.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_longitudIngresadaMousePressed

    private void longitudIngresadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_longitudIngresadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_longitudIngresadaActionPerformed

    private void emailIngresadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailIngresadoMousePressed
        if(nombreIngresado.getText().equals("")){
            nombreIngresado.setText("Nombre");
            nombreIngresado.setForeground(Color.LIGHT_GRAY);
        }
        if(direccionIngresada.getText().equals("")){
            direccionIngresada.setText("Dirección");
            direccionIngresada.setForeground(Color.LIGHT_GRAY);
        }
        if(emailIngresado.getText().equals("Email")){
            emailIngresado.setText("");
            emailIngresado.setForeground(Color.BLACK);
        }
        if(cuitIngresado.getText().equals("")){
            cuitIngresado.setText("CUIT");
            cuitIngresado.setForeground(Color.LIGHT_GRAY);
        }
        if(latitudIngresada.getText().equals("")){
            latitudIngresada.setText("Latitud");
            latitudIngresada.setForeground(Color.LIGHT_GRAY);
        }
        if(longitudIngresada.getText().equals("")){
            longitudIngresada.setText("Longitud");
            longitudIngresada.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_emailIngresadoMousePressed

    private void emailIngresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailIngresadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailIngresadoActionPerformed

    private void cuitIngresadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuitIngresadoMousePressed
        if(nombreIngresado.getText().equals("")){
            nombreIngresado.setText("Nombre");
            nombreIngresado.setForeground(Color.LIGHT_GRAY);
        }
        if(direccionIngresada.getText().equals("")){
            direccionIngresada.setText("Dirección");
            direccionIngresada.setForeground(Color.LIGHT_GRAY);
        }
        if(emailIngresado.getText().equals("")){
            emailIngresado.setText("Email");
            emailIngresado.setForeground(Color.LIGHT_GRAY);
        }
        if(cuitIngresado.getText().equals("CUIT")){
            cuitIngresado.setText("");
            cuitIngresado.setForeground(Color.BLACK);
        }
        if(latitudIngresada.getText().equals("")){
            latitudIngresada.setText("Latitud");
            latitudIngresada.setForeground(Color.LIGHT_GRAY);
        }
        if(longitudIngresada.getText().equals("")){
            longitudIngresada.setText("Longitud");
            longitudIngresada.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_cuitIngresadoMousePressed

    private void CUITIngresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CUITIngresadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CUITIngresadoActionPerformed

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
            java.util.logging.Logger.getLogger(EditarClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarClienteGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JTextField cuitIngresado;
    private javax.swing.JTextField direccionIngresada;
    private javax.swing.JTextField emailIngresado;
    private javax.swing.JButton guardar;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField latitudIngresada;
    private javax.swing.JTextField longitudIngresada;
    private javax.swing.JTextField nombreIngresado;
    // End of variables declaration//GEN-END:variables
}
