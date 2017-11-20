package pe.egcc.notasapp.view;

import javax.swing.JInternalFrame;

public class MainView extends javax.swing.JFrame {

    public MainView() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);

    }

    
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuArchivoSalir = new javax.swing.JMenuItem();
        menuVenta = new javax.swing.JMenu();
        menuVentaRegistrar = new javax.swing.JMenuItem();
        menuVentaConsultar = new javax.swing.JMenuItem();
        menuVentaResumen = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO DE NOTAS");

        menuArchivo.setText("Archivo");

        menuArchivoSalir.setText("Salir");
        menuArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoSalir);

        menuBar.add(menuArchivo);

        menuVenta.setText("Notas");

        menuVentaRegistrar.setText("Registrar");
        menuVentaRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVentaRegistrarActionPerformed(evt);
            }
        });
        menuVenta.add(menuVentaRegistrar);

        menuVentaConsultar.setText("Consultar");
        menuVentaConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVentaConsultarActionPerformed(evt);
            }
        });
        menuVenta.add(menuVentaConsultar);

        menuVentaResumen.setText("Resumen");
        menuVentaResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVentaResumenActionPerformed(evt);
            }
        });
        menuVenta.add(menuVentaResumen);

        menuBar.add(menuVenta);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuArchivoSalirActionPerformed

    private void menuVentaRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVentaRegistrarActionPerformed
        mostrarFormulario(RegistrarView.class);
    }//GEN-LAST:event_menuVentaRegistrarActionPerformed

    private void menuVentaConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVentaConsultarActionPerformed
        mostrarFormulario(ConsultarView.class);
    }//GEN-LAST:event_menuVentaConsultarActionPerformed

    private void menuVentaResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVentaResumenActionPerformed

    }//GEN-LAST:event_menuVentaResumenActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuArchivoSalir;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuVenta;
    private javax.swing.JMenuItem menuVentaConsultar;
    private javax.swing.JMenuItem menuVentaRegistrar;
    private javax.swing.JMenuItem menuVentaResumen;
    // End of variables declaration//GEN-END:variables

    private void mostrarFormulario(Class<?> aClass) {
        
        try {
            
            // Variable de control
            JInternalFrame view = null;
            
            // Varificar si existe instancia
            for( JInternalFrame form: desktopPane.getAllFrames() ){
                if( aClass.isInstance(form) ){
                    view = form;
                    break;
                }
            }
            
            // Crear nueva instancia
            if( view == null ){
                String nombre = aClass.getName();
                view = (JInternalFrame) Class.forName(nombre).newInstance();
                desktopPane.add(view);
                view.setVisible(true);
            }
            
            // Activar formulario
            view.setSelected(true);
            
        } catch (Exception e) {
        }
        
    }

    
    
    
}
