package isi.deso.tp.gui;

import isi.deso.tp.controllers.ItemMenuController;
import java.awt.Color;

import isi.deso.tp.excepciones.ItemNoEncontradoException;
import isi.deso.tp.logicaNegocios.Coordenada;
import isi.deso.tp.logicaNegocios.Vendedor;

import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EditarBebidaGUI extends javax.swing.JFrame {
    String nombreViejo;
    String nombreVendedor;
    public EditarBebidaGUI() {
        initComponents();
        cargarVendedores();
    }
    public EditarBebidaGUI( String nombreVendedor) {
        initComponents();
        this.nombreVendedor = nombreVendedor;
        cargarVendedores();
    }

    public void setNombreViejo(String nombre){this.nombreViejo=nombre;}
    public void setVendedor(String nombre){this.nombreVendedor=nombre;}
    public String getNombreViejo(){return this.nombreViejo;}
    public String getNombreVendedor(){return this.nombreVendedor;}
    private void cargarVendedores(){


            vendedorComboBox.addItem(getNombreVendedor());



    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        graduacionIngresada = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        editarBebidaLabel = new javax.swing.JLabel();
        graduacionLabel = new javax.swing.JLabel();
        nombreIngresado = new javax.swing.JTextField();
        precioLabel = new javax.swing.JLabel();
        precioIngresado = new javax.swing.JTextField();
        tamañoLabel = new javax.swing.JLabel();
        tamañoIngresado = new javax.swing.JTextField();
        vendedorComboBox = new javax.swing.JComboBox<>();
        seleccionVendedorLabel = new javax.swing.JLabel();
        descripcionIngresada = new javax.swing.JTextField();
        categoriaLabel = new javax.swing.JLabel();
        categoriaIngresada = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setForeground(new java.awt.Color(255, 255, 255));

        graduacionIngresada.setForeground(new java.awt.Color(204, 204, 204));
        graduacionIngresada.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        graduacionIngresada.setText("%");
        graduacionIngresada.setToolTipText("");
        graduacionIngresada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                graduacionIngresadaFocusLost(evt);
            }
        });
        graduacionIngresada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                graduacionIngresadaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                graduacionIngresadaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                graduacionIngresadaMouseReleased(evt);
            }
        });
        graduacionIngresada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graduacionIngresadaActionPerformed(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(96, 86, 120));
        guardar.setText("Guardar");
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                try {
                    guardarMousePressed(evt);
                } catch (ItemNoEncontradoException e) {
                    throw new RuntimeException(e);
                }
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

        editarBebidaLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editarBebidaLabel.setText("Editar bebida");

        graduacionLabel.setText("Graduación alcohólica");

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

        precioLabel.setText("Precio");

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

        tamañoLabel.setText("Tamaño");

        tamañoIngresado.setForeground(new java.awt.Color(204, 204, 204));
        tamañoIngresado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tamañoIngresado.setText("Tamaño");
        tamañoIngresado.setToolTipText("");
        tamañoIngresado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tamañoIngresadoFocusLost(evt);
            }
        });
        tamañoIngresado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tamañoIngresadoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tamañoIngresadoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tamañoIngresadoMouseReleased(evt);
            }
        });
        tamañoIngresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamañoIngresadoActionPerformed(evt);
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

        categoriaLabel.setText("Categoría");

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

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(cancelar)
                        .addGap(26, 26, 26)
                        .addComponent(guardar))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(graduacionLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(precioLabel))
                            .addComponent(precioIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(categoriaIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(categoriaLabel)
                                .addGap(0, 20, Short.MAX_VALUE))))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(graduacionIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tamañoIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
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
                            .addComponent(nombreIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tamañoLabel))
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                        .addComponent(editarBebidaLabel)
                        .addGap(153, 153, 153))))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(editarBebidaLabel)
                .addGap(26, 26, 26)
                .addComponent(nombreIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descripcionIngresada, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(seleccionVendedorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendedorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(graduacionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tamañoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(graduacionIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tamañoIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoriaLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(precioIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelar)
                            .addComponent(guardar)))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(categoriaIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarActionPerformed

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

    private void guardarMousePressed(java.awt.event.MouseEvent evt) throws ItemNoEncontradoException {//GEN-FIRST:event_guardarMousePressed

        String nombre = nombreIngresado.getText();
        float graduacionAlcoholica = Float.parseFloat(graduacionIngresada.getText());
        float precio = Float.parseFloat(precioIngresado.getText());
        String vendedor = vendedorComboBox.getSelectedItem().toString();
        String categoria = categoriaIngresada.getText();
        int tamanio = Integer.parseInt(tamañoIngresado.getText());
        String descripcion = descripcionIngresada.getText();
        
        //CODIGO BACKEND

        ItemMenuController.modificarBebida(getNombreViejo(),nombre, descripcion, precio, graduacionAlcoholica, tamanio, vendedor);
        JOptionPane.showMessageDialog(null, "Bebida registrada con éxito.",
                "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }//GEN-LAST:event_guardarMousePressed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarActionPerformed

    private void nombreIngresadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreIngresadoMousePressed
        if(nombreIngresado.getText().equals("Nombre")){
            nombreIngresado.setText("");
            nombreIngresado.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nombreIngresadoMousePressed

    private void nombreIngresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreIngresadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreIngresadoActionPerformed

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

    private void tamañoIngresadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tamañoIngresadoFocusLost
        if(tamañoIngresado.getText().equals("")){
            tamañoIngresado.setText("Tamaño");
            tamañoIngresado.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_tamañoIngresadoFocusLost

    private void tamañoIngresadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tamañoIngresadoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tamañoIngresadoMouseExited

    private void tamañoIngresadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tamañoIngresadoMousePressed
        if(tamañoIngresado.getText().equals("Tamaño")){
            tamañoIngresado.setText("");
            tamañoIngresado.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tamañoIngresadoMousePressed

    private void tamañoIngresadoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tamañoIngresadoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tamañoIngresadoMouseReleased

    private void tamañoIngresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamañoIngresadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamañoIngresadoActionPerformed

    private void descripcionIngresadaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descripcionIngresadaFocusLost
          if(descripcionIngresada.getText().equals("")){
            descripcionIngresada.setText("Descripción");
            descripcionIngresada.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_descripcionIngresadaFocusLost

    private void descripcionIngresadaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descripcionIngresadaMousePressed
          if(descripcionIngresada.getText().equals("Descripción")){
            descripcionIngresada.setText("");
            descripcionIngresada.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_descripcionIngresadaMousePressed

    private void descripcionIngresadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionIngresadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionIngresadaActionPerformed

    private void graduacionIngresadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graduacionIngresadaActionPerformed

    }//GEN-LAST:event_graduacionIngresadaActionPerformed

    private void graduacionIngresadaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graduacionIngresadaMouseReleased

    }//GEN-LAST:event_graduacionIngresadaMouseReleased

    private void graduacionIngresadaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graduacionIngresadaMousePressed
        if(graduacionIngresada.getText().equals("%")){
            graduacionIngresada.setText("");
            graduacionIngresada.setForeground(Color.black);
        }
    }//GEN-LAST:event_graduacionIngresadaMousePressed

    private void graduacionIngresadaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graduacionIngresadaMouseExited

    }//GEN-LAST:event_graduacionIngresadaMouseExited

    private void graduacionIngresadaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_graduacionIngresadaFocusLost
        if(graduacionIngresada.getText().equals("")){
            graduacionIngresada.setText("%");
            graduacionIngresada.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_graduacionIngresadaFocusLost

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
            categoriaIngresada.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_categoriaIngresadaMousePressed

    private void categoriaIngresadaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriaIngresadaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaIngresadaMouseReleased

    private void categoriaIngresadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaIngresadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaIngresadaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarBebidaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField categoriaIngresada;
    private javax.swing.JLabel categoriaLabel;
    private javax.swing.JTextField descripcionIngresada;
    private javax.swing.JLabel editarBebidaLabel;
    private javax.swing.JPanel fondo;
    private javax.swing.JTextField graduacionIngresada;
    private javax.swing.JLabel graduacionLabel;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField nombreIngresado;
    private javax.swing.JTextField precioIngresado;
    private javax.swing.JLabel precioLabel;
    private javax.swing.JLabel seleccionVendedorLabel;
    private javax.swing.JTextField tamañoIngresado;
    private javax.swing.JLabel tamañoLabel;
    private javax.swing.JComboBox<String> vendedorComboBox;
    // End of variables declaration//GEN-END:variables
}
