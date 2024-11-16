package isi.deso.tp.gui;

import java.awt.Color;

import isi.deso.tp.controllers.ItemMenuController;
import isi.deso.tp.logicaNegocios.Vendedor;

import java.util.List;
import javax.swing.JOptionPane;

public class CrearPlatoGUI extends javax.swing.JFrame {
    
    public CrearPlatoGUI() {

        initComponents();
        cargarVendedores();

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
        pesoLabel1 = new javax.swing.JLabel();
        precioIngresado = new javax.swing.JTextField();
        pesoLabel2 = new javax.swing.JLabel();
        categoriaIngresada = new javax.swing.JTextField();
        vendedorComboBox = new javax.swing.JComboBox<>();
        seleccionVendedorLabel = new javax.swing.JLabel();
        descripcionIngresada = new javax.swing.JTextField();

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

        pesoLabel1.setText("Precio");

        precioIngresado.setForeground(new java.awt.Color(204, 204, 204));
        precioIngresado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        precioIngresado.setText("Precio");
        precioIngresado.setToolTipText("");
        precioIngresado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                precioIngresadoFocusLost(evt);
            }
        });
        precioIngresado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                precioIngresadoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                precioIngresadoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                precioIngresadoMouseReleased(evt);
            }
        });
        precioIngresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioIngresadoActionPerformed(evt);
            }
        });

        pesoLabel2.setText("Categoría");

        categoriaIngresada.setForeground(new java.awt.Color(204, 204, 204));
        categoriaIngresada.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        categoriaIngresada.setText("Categoría");
        categoriaIngresada.setToolTipText("");
        categoriaIngresada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                categoriaIngresadaFocusLost(evt);
            }
        });
        categoriaIngresada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                categoriaIngresadaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                categoriaIngresadaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                categoriaIngresadaMouseReleased(evt);
            }
        });
        categoriaIngresada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaIngresadaActionPerformed(evt);
            }
        });

        seleccionVendedorLabel.setText("Seleccione un vendedor");

        descripcionIngresada.setForeground(new java.awt.Color(204, 204, 204));
        descripcionIngresada.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        descripcionIngresada.setText("Descripción");
        descripcionIngresada.setToolTipText("");
        descripcionIngresada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                descripcionIngresadaFocusLost(evt);
            }
        });
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

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(ingresarDatosLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(crearPlatoLabel)
                .addGap(156, 156, 156))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(cancelar)
                .addGap(26, 26, 26)
                .addComponent(guardar)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(ingresarDatosLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ingresarDatosLabel2)
                .addGap(43, 43, 43))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pesoLabel)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(precioIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pesoIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(132, 132, 132)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caloriasLabel)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(categoriaIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(caloriasIngresadas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(vegetarianosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(celiacosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(pesoLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pesoLabel2)
                .addGap(84, 84, 84))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(vendedorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addComponent(seleccionVendedorLabel)
                                .addGap(11, 11, 11)))
                        .addGap(148, 148, 148))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(descripcionIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89))))
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
                .addGap(18, 18, 18)
                .addComponent(descripcionIngresada, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(seleccionVendedorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendedorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresarDatosLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresarDatosLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
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
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarVendedores(){

        List<Vendedor> lv = isi.deso.tp.controllers.VendedorController.buscarListaVendedores();
        for (Vendedor v:lv){
            vendedorComboBox.addItem(v.getNombre());
        }


    }

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
                || caloriasIngresadas.getText().equals("Calorías")
                || categoriaIngresada.getText().equals("Categoría")
                || vendedorComboBox.getSelectedItem().equals("")
                || precioIngresado.getText().equals("Precio"))
                   
        {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos.",
                "Registro incompleto", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String nombre = nombreIngresado.getText();
        float peso = Float.parseFloat(pesoIngresado.getText());
        int calorias = Integer.parseInt(caloriasIngresadas.getText());
        boolean aptoVegetariano = vegetarianosComboBox.getSelectedItem() == "Si" ? true : false;
        boolean aptoCeliaco = celiacosComboBox.getSelectedItem() == "Si" ? true : false;
        float precio = Float.parseFloat(precioIngresado.getText());
        String vendedor = vendedorComboBox.getSelectedItem().toString();
        String categoria = categoriaIngresada.getText();
        String descripcion = descripcionIngresada.getText();

        ItemMenuController.crearPlato(nombre, descripcion, (double) precio, categoria, calorias, aptoCeliaco, aptoVegetariano, peso, vendedor);


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

    private void precioIngresadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precioIngresadoFocusLost
        if(precioIngresado.getText().equals("")){
            precioIngresado.setText("Precio");
            precioIngresado.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_precioIngresadoFocusLost

    private void precioIngresadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precioIngresadoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_precioIngresadoMouseExited

    private void precioIngresadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precioIngresadoMousePressed
        if(precioIngresado.getText().equals("Precio")){
            precioIngresado.setText("");
            precioIngresado.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_precioIngresadoMousePressed

    private void precioIngresadoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precioIngresadoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_precioIngresadoMouseReleased

    private void precioIngresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioIngresadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioIngresadoActionPerformed

    private void categoriaIngresadaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_categoriaIngresadaFocusLost
        if(categoriaIngresada.getText().equals("")){
            categoriaIngresada.setText("Categoría");
            categoriaIngresada.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_categoriaIngresadaFocusLost

    private void categoriaIngresadaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriaIngresadaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaIngresadaMouseExited

    private void categoriaIngresadaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriaIngresadaMousePressed
        if(categoriaIngresada.getText().equals("Categoría")){
            categoriaIngresada.setText("");
            categoriaIngresada.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_categoriaIngresadaMousePressed

    private void categoriaIngresadaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriaIngresadaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaIngresadaMouseReleased

    private void categoriaIngresadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaIngresadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaIngresadaActionPerformed

    private void descripcionIngresadaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descripcionIngresadaFocusLost
          if(categoriaIngresada.getText().equals("Descripción")){
            categoriaIngresada.setText("");
            categoriaIngresada.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_descripcionIngresadaFocusLost

    private void descripcionIngresadaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descripcionIngresadaMousePressed
          if(categoriaIngresada.getText().equals("Descripción")){
            categoriaIngresada.setText("");
            categoriaIngresada.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_descripcionIngresadaMousePressed

    private void descripcionIngresadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionIngresadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionIngresadaActionPerformed

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
    private javax.swing.JTextField categoriaIngresada;
    private javax.swing.JComboBox<String> celiacosComboBox;
    private javax.swing.JLabel crearPlatoLabel;
    private javax.swing.JTextField descripcionIngresada;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel ingresarDatosLabel;
    private javax.swing.JLabel ingresarDatosLabel1;
    private javax.swing.JLabel ingresarDatosLabel2;
    private javax.swing.JTextField nombreIngresado;
    private javax.swing.JTextField pesoIngresado;
    private javax.swing.JLabel pesoLabel;
    private javax.swing.JLabel pesoLabel1;
    private javax.swing.JLabel pesoLabel2;
    private javax.swing.JTextField precioIngresado;
    private javax.swing.JLabel seleccionVendedorLabel;
    private javax.swing.JComboBox<String> vegetarianosComboBox;
    private javax.swing.JComboBox<String> vendedorComboBox;
    // End of variables declaration//GEN-END:variables
}
