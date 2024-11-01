package isi.deso.tp.gui;

import isi.deso.tp.logicaNegocios.Coordenada;
import javax.swing.JOptionPane;

public class CrearItemMenuGUI extends javax.swing.JFrame {
    public CrearItemMenuGUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        categoriaIngresada = new javax.swing.JTextField();
        nombreIngresado = new javax.swing.JTextField();
        descripcionIngresada = new javax.swing.JTextField();
        precioIngresado = new javax.swing.JTextField();
        cancelar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        categoriaIngresada.setForeground(new java.awt.Color(204, 204, 204));
        categoriaIngresada.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        categoriaIngresada.setText("Categoría");
        categoriaIngresada.setToolTipText("");
        categoriaIngresada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                categoriaIngresadaMousePressed(evt);
            }
        });
        categoriaIngresada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaIngresadaActionPerformed(evt);
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

        descripcionIngresada.setForeground(new java.awt.Color(204, 204, 204));
        descripcionIngresada.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        descripcionIngresada.setText("Descripción");
        descripcionIngresada.setToolTipText("");
        descripcionIngresada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                descripcionIngresadaMousePressed(evt);
            }
        });
        descripcionIngresada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionIngresadaActionPerformed(evt);
            }
        });

        precioIngresado.setForeground(new java.awt.Color(204, 204, 204));
        precioIngresado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        precioIngresado.setText("Precio");
        precioIngresado.setToolTipText("");
        precioIngresado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                precioIngresadoMousePressed(evt);
            }
        });
        precioIngresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioIngresadoActionPerformed(evt);
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

        jLabel2.setText("Ingrese los siguientes datos:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Crear un nuevo ItemMenu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descripcionIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(categoriaIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guardar)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(nombreIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descripcionIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(precioIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(categoriaIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(guardar))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categoriaIngresadaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriaIngresadaMousePressed
        if(nombreIngresado.getText().equals("")){
            nombreIngresado.setText("Nombre");
        }
        if(descripcionIngresada.getText().equals("")){
            descripcionIngresada.setText("Descripción");
        }
        if(precioIngresado.getText().equals("")){
            precioIngresado.setText("Precio");
        }
        if(categoriaIngresada.getText().equals("Categoría")){
            categoriaIngresada.setText("");
        }
    }//GEN-LAST:event_categoriaIngresadaMousePressed

    private void categoriaIngresadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaIngresadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaIngresadaActionPerformed

    private void nombreIngresadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreIngresadoMousePressed
        if(nombreIngresado.getText().equals("Nombre")){
            nombreIngresado.setText("");
        }
        if(descripcionIngresada.getText().equals("")){
            descripcionIngresada.setText("Descripción");
        }
        if(precioIngresado.getText().equals("")){
            precioIngresado.setText("Precio");
        }
        if(categoriaIngresada.getText().equals("")){
            categoriaIngresada.setText("Categoría");
        }
    }//GEN-LAST:event_nombreIngresadoMousePressed

    private void nombreIngresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreIngresadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreIngresadoActionPerformed

    private void descripcionIngresadaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descripcionIngresadaMousePressed
        if(nombreIngresado.getText().equals("")){
            nombreIngresado.setText("Nombre");
        }
        if(descripcionIngresada.getText().equals("Descripción")){
            descripcionIngresada.setText("");
        }
        if(precioIngresado.getText().equals("")){
            precioIngresado.setText("Precio");
        }
        if(categoriaIngresada.getText().equals("")){
            categoriaIngresada.setText("Categoría");
        }
    }//GEN-LAST:event_descripcionIngresadaMousePressed

    private void descripcionIngresadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionIngresadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionIngresadaActionPerformed

    private void precioIngresadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precioIngresadoMousePressed
        if(nombreIngresado.getText().equals("")){
            nombreIngresado.setText("Nombre");
        }
        if(descripcionIngresada.getText().equals("")){
            descripcionIngresada.setText("Descripción");
        }
        if(precioIngresado.getText().equals("Precio")){
            precioIngresado.setText("");
        }
        if(categoriaIngresada.getText().equals("")){
            categoriaIngresada.setText("Categoría");
        }
    }//GEN-LAST:event_precioIngresadoMousePressed

    private void precioIngresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioIngresadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioIngresadoActionPerformed

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

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarActionPerformed

    private void guardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMousePressed
       // CODIGO BACKEND

        JOptionPane.showMessageDialog(null, "ItemMenú registrado con éxito.",
                "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }//GEN-LAST:event_guardarMousePressed

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
            java.util.logging.Logger.getLogger(CrearItemMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearItemMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearItemMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearItemMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearItemMenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField categoriaIngresada;
    private javax.swing.JTextField descripcionIngresada;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nombreIngresado;
    private javax.swing.JTextField precioIngresado;
    // End of variables declaration//GEN-END:variables
}
