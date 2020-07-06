/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;


import ec.edu.ups.controlador.ControladorDirectorio;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author JHON FAREZ
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private ControladorDirectorio controladorDirectorio;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        controladorDirectorio = new ControladorDirectorio();
    }

    public void llenarLista(List<String> directorio) {
        DefaultListModel modelo = new DefaultListModel();
        modelo.clear();

        for (String nombre : directorio) {
            modelo.addElement(nombre);
        }
        listaTodo.setModel(modelo);
        txtAreaInformacion.setText("");
        btnMostrarInformacion.setEnabled(false);
    }

    public void limpiarLista() {
        DefaultListModel modelo = new DefaultListModel();
        modelo.clear();
        listaTodo.setModel(modelo);
        txtAreaInformacion.setText("");
        btnMostrarInformacion.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTodo = new javax.swing.JList<>();
        btnMostrarInformacion = new javax.swing.JButton();
        btnListarDirectorios = new javax.swing.JButton();
        btnListarArchivosOcultos = new javax.swing.JButton();
        btnListarDirectoriosOcultos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaInformacion = new javax.swing.JTextArea();
        txtContenido = new javax.swing.JScrollPane();
        txtTexto = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        crearDirectorio = new javax.swing.JMenuItem();
        eliminarDirectorio = new javax.swing.JMenuItem();
        renombrarDirectorio = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("\t\t\tGestionar Directorios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 889, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
        );

        listaTodo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        listaTodo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaTodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaTodoMouseClicked(evt);
            }
        });
        listaTodo.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaTodoValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaTodo);

        btnMostrarInformacion.setBackground(new java.awt.Color(102, 102, 255));
        btnMostrarInformacion.setText("Mostrar Información");
        btnMostrarInformacion.setEnabled(false);
        btnMostrarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarInformacionActionPerformed(evt);
            }
        });

        btnListarDirectorios.setBackground(new java.awt.Color(102, 102, 255));
        btnListarDirectorios.setText("Listar Directorios");
        btnListarDirectorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarDirectoriosActionPerformed(evt);
            }
        });

        btnListarArchivosOcultos.setBackground(new java.awt.Color(102, 102, 255));
        btnListarArchivosOcultos.setText("Listar Archivos Ocultos");
        btnListarArchivosOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarArchivosOcultosActionPerformed(evt);
            }
        });

        btnListarDirectoriosOcultos.setBackground(new java.awt.Color(102, 102, 255));
        btnListarDirectoriosOcultos.setText("Listar Directorios Ocultos");
        btnListarDirectoriosOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarDirectoriosOcultosActionPerformed(evt);
            }
        });

        jLabel1.setText("Ruta:");

        txtAreaInformacion.setEditable(false);
        txtAreaInformacion.setBackground(new java.awt.Color(153, 153, 153));
        txtAreaInformacion.setColumns(20);
        txtAreaInformacion.setLineWrap(true);
        txtAreaInformacion.setRows(5);
        jScrollPane2.setViewportView(txtAreaInformacion);

        txtTexto.setColumns(20);
        txtTexto.setRows(5);
        txtContenido.setViewportView(txtTexto);

        jMenu1.setText("Gestionar Directorio");

        crearDirectorio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        crearDirectorio.setText("Crear");
        crearDirectorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearDirectorioActionPerformed(evt);
            }
        });
        jMenu1.add(crearDirectorio);

        eliminarDirectorio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        eliminarDirectorio.setText("Eliminar");
        eliminarDirectorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarDirectorioActionPerformed(evt);
            }
        });
        jMenu1.add(eliminarDirectorio);

        renombrarDirectorio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        renombrarDirectorio.setText("Renombrar");
        renombrarDirectorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renombrarDirectorioActionPerformed(evt);
            }
        });
        jMenu1.add(renombrarDirectorio);

        salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.CTRL_MASK));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jMenu1.add(salir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnMostrarInformacion))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnListarDirectorios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnListarArchivosOcultos)
                                .addGap(18, 18, 18)
                                .addComponent(btnListarDirectoriosOcultos))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(586, 586, 586))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnListarDirectorios)
                            .addComponent(btnListarArchivosOcultos)
                            .addComponent(btnListarDirectoriosOcultos))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarInformacion))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void btnListarDirectoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarDirectoriosActionPerformed
        // TODO add your handling code here:
        String ruta = txtRuta.getText();

        String subdirectorio = listaTodo.getSelectedValue();

        if (subdirectorio != null) {
            List<String> directorios = controladorDirectorio.buscarPorNombre(ruta, subdirectorio);
            
            //
            txtRuta.setText(controladorDirectorio.devolverRuta(ruta, subdirectorio));
            subdirectorio = null;
            if (directorios.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Directorio  vacio");

                limpiarLista();
            } else {
                llenarLista(directorios);
            }
        } else {
            if (ruta == null) {
                JOptionPane.showMessageDialog(this, "Escriba el campo de la ruta");
            } else {
                if (controladorDirectorio.comprobarRuta(ruta)) {
                    List<String> directorios = controladorDirectorio.listarArchivos(ruta);
                    if (directorios.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Directorio vacio");
                        limpiarLista();
                    } else {
                        llenarLista(directorios);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Ruta no econtrada");

                }

            }
        }
    }//GEN-LAST:event_btnListarDirectoriosActionPerformed

    private void btnListarArchivosOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarArchivosOcultosActionPerformed
        // TODO add your handling code here:
        String ruta = txtRuta.getText();

        if (ruta == null) {
            JOptionPane.showMessageDialog(this, "Llenar el campo de la ruta para nuscar archivos ocultos");
        } else {
            if (controladorDirectorio.comprobarRuta(ruta)) {
                List<String> directorios = controladorDirectorio.listarArchivosOcultos(ruta);
                if (directorios.isEmpty()) {
                    JOptionPane.showMessageDialog(this, " Archivos ocultos no encontrados");
                    limpiarLista();
                } else {
                    llenarLista(directorios);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Directorio incorrectO");

            }

        }
    }//GEN-LAST:event_btnListarArchivosOcultosActionPerformed

    private void btnListarDirectoriosOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarDirectoriosOcultosActionPerformed
        // TODO add your handling code here:
        String ruta = txtRuta.getText();

        if (ruta == null) {
            JOptionPane.showMessageDialog(this, "Lleene el campo de la ruta ");
        } else {
            if (controladorDirectorio.comprobarRuta(ruta)) {
                List<String> directorios = controladorDirectorio.listarDirectoriosOcultos(ruta);
                if (directorios.isEmpty()) {
                    JOptionPane.showMessageDialog(this, " Directorios ocultos no encontrados");
                    limpiarLista();
                } else {
                    llenarLista(directorios);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Directorio incorrectO");
            }

        }

    }//GEN-LAST:event_btnListarDirectoriosOcultosActionPerformed

    private void crearDirectorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearDirectorioActionPerformed
        // TODO add your handling code here:
        String nuevo = null;

        nuevo = JOptionPane.showInputDialog("Ingrese el nombre del directorio");
        if (nuevo == null) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre al directorio");
        } else {
            System.out.println(nuevo);
            String ruta = txtRuta.getText();
            if (ruta == null) {
                JOptionPane.showMessageDialog(this, "Ingrese la ruta para crear un nuevo directorio");
            } else {
                if (controladorDirectorio.comprobarExistencia(ruta, nuevo)) {
                     JOptionPane.showMessageDialog(this, "La carpeta ya existe");

                } else {
                    controladorDirectorio.crearDirectorio(ruta, nuevo);
                    List<String> directorio = controladorDirectorio.listarArchivos(ruta);
                    llenarLista(directorio);
                }
            }
        }

    }//GEN-LAST:event_crearDirectorioActionPerformed

    private void listaTodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTodoMouseClicked
        // TODO add your handling code here:
        String nombre = listaTodo.getSelectedValue();
        btnMostrarInformacion.setEnabled(true);
        System.out.println(nombre);
    }//GEN-LAST:event_listaTodoMouseClicked

    private void btnMostrarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarInformacionActionPerformed
        // TODO add your handling code here:
        String nombre = listaTodo.getSelectedValue();
        String ruta = txtRuta.getText();

        String informacion = controladorDirectorio.mostrarInformacion(nombre, ruta);
        txtAreaInformacion.setText(informacion);
        listaTodo.clearSelection();
        btnMostrarInformacion.setEnabled(false);
    }//GEN-LAST:event_btnMostrarInformacionActionPerformed

    private void renombrarDirectorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renombrarDirectorioActionPerformed
        // TODO add your handling code here:
        String renombre = null;

        renombre = JOptionPane.showInputDialog("Nombre del nuevo directorio");
        if (renombre == null) {
            JOptionPane.showMessageDialog(this, "Agregue un nombre al directorio");
        } else {
            String ruta = txtRuta.getText();
            if (controladorDirectorio.comprobarRuta(ruta)) {
                String actual = listaTodo.getSelectedValue();
                controladorDirectorio.renombrarDirectorio(ruta, actual, renombre);
                JOptionPane.showMessageDialog(this, "Directorio actualizado");
                List<String> directorio = controladorDirectorio.listarArchivos(ruta);
                llenarLista(directorio);
            } else {
                JOptionPane.showMessageDialog(this, "Ruta incorrecta vuelva a ingresar");
            }
        }


    }//GEN-LAST:event_renombrarDirectorioActionPerformed

    private void eliminarDirectorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarDirectorioActionPerformed
        // TODO add your handling code here:
        int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro deseas eliminar este directorio?");
        if (opcion == JOptionPane.YES_OPTION) {
            try {
                String eliminar = listaTodo.getSelectedValue();
                String ruta = txtRuta.getText();
                controladorDirectorio.eliminarDirectorio(ruta, eliminar);
                List<String> directorio = controladorDirectorio.listarArchivos(ruta);
                llenarLista(directorio);
                //JOptionPane.showMessageDialog(this, "Directorio eliminado ");
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        List<String> directorio = controladorDirectorio.listarArchivos(txtRuta.getText());
        llenarLista(directorio);

    }//GEN-LAST:event_eliminarDirectorioActionPerformed

    private void listaTodoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaTodoValueChanged
       String nombre = listaTodo.getSelectedValue();
        String ruta = txtRuta.getText();
        String contenido = controladorDirectorio.leerArchivo(nombre);
        txtTexto.setText(contenido);
        
    }//GEN-LAST:event_listaTodoValueChanged

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListarArchivosOcultos;
    private javax.swing.JButton btnListarDirectorios;
    private javax.swing.JButton btnListarDirectoriosOcultos;
    private javax.swing.JButton btnMostrarInformacion;
    private javax.swing.JMenuItem crearDirectorio;
    private javax.swing.JMenuItem eliminarDirectorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaTodo;
    private javax.swing.JMenuItem renombrarDirectorio;
    private javax.swing.JMenuItem salir;
    private javax.swing.JTextArea txtAreaInformacion;
    private javax.swing.JScrollPane txtContenido;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextArea txtTexto;
    // End of variables declaration//GEN-END:variables
}
