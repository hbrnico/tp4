package isi.deso.tp.gui;

import java.awt.Color;
import isi.deso.tp.logicaNegocios.Coordenada;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CrearPlatoGUI extends javax.swing.JFrame {
    
    public CrearPlatoGUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        pesoIngresado = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        crearPlatoLabel = new javax.swing.JLabel();
        ingresarDatosLabel = new javax.swing.JLabel();
        vegetarianosComboBox = new javax.swing.JComboBox<>();
        ingresarDatosLabel1 = new javax.swing.JLabel();
        ingresarDatosLabel2 = new javax.swing.JLabel();
        celiacosComboBox = new javax.swing.JComboBox<>();
        pesoLabel = new javax.swing.JLabel();
        caloriasLabel = new javax.swing.JLabel();
        nombreIngresado = new javax.swing.JTextField();
        caloriasIngresadas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setForeground(new java.awt.Color(255, 255, 255));

        pesoIngresado.setForeground(new java.awt.Color(204, 204, 204));
        pesoIngresado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pesoIngresado.setText("Peso");
        pesoIngresado.setToolTipText("");
        pesoIngresado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pesoIngresadoFocusLost(evt);
            }
        });
        pesoIngresado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pesoIngresadoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pesoIngresadoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pesoIngresadoMouseReleased(evt);
            }
        });
        pesoIngresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoIngresadoActionPerformed(evt);
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

        crearPlatoLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        crearPlatoLabel.setText("Crear un plato");

        ingresarDatosLabel.setText("Ingrese los siguientes datos:");

        vegetarianosComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Si" }));
        vegetarianosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vegetarianosComboBoxActionPerformed(evt);
            }
        });

        ingresarDatosLabel1.setText("¿Es apto para vegetarianos?");

        ingresarDatosLabel2.setText("¿Es apto para celíacos?");

        celiacosComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Si" }));
        celiacosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celiacosComboBoxActionPerformed(evt);
            }
        });

        pesoLabel.setText("Peso por unidad (g): ");

        caloriasLabel.setText("Calorías por unidad:");

        nombreIngresado.setForeground(new java.awt.Color(204, 204, 204));
        nombreIngresado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreIngresado.setText("Nombre");
        nombreIngresado.setToolTipText("");
        nombreIngresado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreIngresadoFocusLost(evt);
            }
        });
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

        caloriasIngresadas.setForeground(new java.awt.Color(204, 204, 204));
        caloriasIngresadas.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        caloriasIngresadas.setText("Calorías");
        caloriasIngresadas.setToolTipText("");
        caloriasIngresadas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                caloriasIngresadasFocusLost(evt);
            }
        });
        caloriasIngresadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                caloriasIngresadasMousePressed(evt);
            }
        });
        caloriasIngresadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caloriasIngresadasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(vegetarianosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pesoLabel)
                            .addComponent(ingresarDatosLabel1))
                        .addGap(54, 54, 54)))
                .addComponent(ingresarDatosLabel2)
                .addGap(64, 64, 64))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(cancelar)
                        .addGap(26, 26, 26)
                        .addComponent(guardar))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caloriasLabel)
                            .addComponent(celiacosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(ingresarDatosLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(crearPlatoLabel)
                .addGap(156, 156, 156))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(pesoIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(caloriasIngresadas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nombreIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(crearPlatoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingresarDatosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nombreIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresarDatosLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresarDatosLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vegetarianosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celiacosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caloriasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caloriasIngresadas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesoIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
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

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarActionPerformed

    private void pesoIngresadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesoIngresadoMousePressed
        if(pesoIngresado.getText().equals("Peso")){
            pesoIngresado.setText("");
            pesoIngresado.setForeground(Color.black);
        }
    }//GEN-LAST:event_pesoIngresadoMousePressed

    private void pesoIngresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoIngresadoActionPerformed
        if(pesoIngresado.getText().equals("Peso")){
            pesoIngresado.setText("");
            pesoIngresado.setForeground(Color.black);
        }
    }//GEN-LAST:event_pesoIngresadoActionPerformed

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

    private void guardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMousePressed
        if(nombreIngresado.getText().equals("Nombre")
                || pesoIngresado.getText().equals("Peso")
                || caloriasIngresadas.getText().equals("Calorías"))
        {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos.",
                "Registro incompleto", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String nombre = nombreIngresado.getText();
        float peso = Float.parseFloat(pesoIngresado.getText());
        float calorias = Float.parseFloat(caloriasIngresadas.getText());
        boolean aptoVegetariano = vegetarianosComboBox.getSelectedItem() == "Si" ? true : false;
        boolean aptoCeliaco = celiacosComboBox.getSelectedItem() == "Si" ? true : false;




        //CODIGO BACKEND



        JOptionPane.showMessageDialog(null, "Plato registrado con éxito.",
                "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }//GEN-LAST:event_guardarMousePressed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarActionPerformed

    private void vegetarianosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vegetarianosComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vegetarianosComboBoxActionPerformed

    private void celiacosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celiacosComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celiacosComboBoxActionPerformed

    private void nombreIngresadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreIngresadoMousePressed
        if(nombreIngresado.getText().equals("Nombre")){
            nombreIngresado.setText("");
            nombreIngresado.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nombreIngresadoMousePressed

    private void nombreIngresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreIngresadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreIngresadoActionPerformed

    private void caloriasIngresadasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caloriasIngresadasMousePressed
        if(caloriasIngresadas.getText().equals("Calorías")){
            caloriasIngresadas.setText("");
            caloriasIngresadas.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_caloriasIngresadasMousePressed

    private void caloriasIngresadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caloriasIngresadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caloriasIngresadasActionPerformed

    private void pesoIngresadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesoIngresadoMouseExited

    }//GEN-LAST:event_pesoIngresadoMouseExited

    private void pesoIngresadoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesoIngresadoMouseReleased

    }//GEN-LAST:event_pesoIngresadoMouseReleased

    private void pesoIngresadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pesoIngresadoFocusLost
        if(pesoIngresado.getText().equals("")){
            pesoIngresado.setText("Peso");
            pesoIngresado.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_pesoIngresadoFocusLost

    private void caloriasIngresadasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caloriasIngresadasFocusLost
        if(caloriasIngresadas.getText().equals("")){
            caloriasIngresadas.setText("Calorías");
            caloriasIngresadas.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_caloriasIngresadasFocusLost

    private void nombreIngresadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreIngresadoFocusLost
        if(nombreIngresado.getText().equals("")){
            nombreIngresado.setText("Nombre");
            nombreIngresado.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_nombreIngresadoFocusLost

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearPlatoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField caloriasIngresadas;
    private javax.swing.JLabel caloriasLabel;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox<String> celiacosComboBox;
    private javax.swing.JLabel crearPlatoLabel;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel ingresarDatosLabel;
    private javax.swing.JLabel ingresarDatosLabel1;
    private javax.swing.JLabel ingresarDatosLabel2;
    private javax.swing.JTextField nombreIngresado;
    private javax.swing.JTextField pesoIngresado;
    private javax.swing.JLabel pesoLabel;
    private javax.swing.JComboBox<String> vegetarianosComboBox;
    // End of variables declaration//GEN-END:variables
}
