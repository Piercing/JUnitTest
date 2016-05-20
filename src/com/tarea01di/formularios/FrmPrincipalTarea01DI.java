package com.tarea01di.formularios;

import com.tarea01.utilidades.Datos;
import com.tarea01.utilidades.DesktopConFondo;
import java.awt.event.ActionEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;

/**
 *
 * @author Juan Carlos Merlos Albarracín
 * @version 1.0.0
 */
public class FrmPrincipalTarea01DI extends javax.swing.JFrame {

    private String clave;
    private String usuario;
    private Datos misDatos;
    
    public void setDatos(Datos misDatos) {
        this.misDatos = misDatos;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

  
    /**
     * Creates new form frmTarea01DI
     */
    public FrmPrincipalTarea01DI() {

        initComponents();

        // centrado de ventana
        setLocationRelativeTo(null);
        try {

            // Cargar el fichero de ayuda
            File fichero = new File("src/help/help_set.hs");
            URL hsURL = fichero.toURI().toURL();

            // Crear el HelpSet, instancio la clase HelpSet,
            // pasándole un ClassLoader  la URL del fichero.
            // La calse 'HelpSet' contiene todos los datos relativos a nuestra
            // ayuda leídos de los ficheros de  configuración que hemos creado.
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);

            // Creamos un 'HelpBroker' => clase de ayuda ofrecida por 'JavHelp'
            HelpBroker hb = helpset.createHelpBroker();

            /* Asociamos el botón ayuda para que muestre la ayuda.
             // Lo hacemos mediante los métodos 'enableHelpOnButton()
             y enableHelpKey() del HelpBroker'.*/
            // Ayuda al Ayuda al hacer click en el JButtonHelp
            hb.enableHelpOnButton(FrmPrincipalTarea01DI.jButtonInicoHelp, "portada", helpset);

            // Ayuda al pulsar F1 sobre la ventana de este formulario,
            // le paso el Formulario en el que estoy
            hb.enableHelp(this.getContentPane(), "vantana_portada", helpset);
        } catch (MalformedURLException | HelpSetException ex) {
            Logger.getLogger(FrmPrincipalTarea01DI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método que establece la imagen de fondo del formulario principal cuando
     * se abre o es llamado. Establece permisos según perfil usuario
     *
     * @param evt
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        //Establece la imagen de fondo 
        ((DesktopConFondo) jDesktopPaneEscritorio).setImagen("/com/images/imagen_fondo.jpg");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPaneEscritorio = new DesktopConFondo();
        jButtonAbrirGestion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonInicoHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAbrirGestion.setBackground(new java.awt.Color(204, 255, 255));
        jButtonAbrirGestion.setFont(new java.awt.Font("Tsukushi A Round Gothic", 1, 18)); // NOI18N
        jButtonAbrirGestion.setForeground(new java.awt.Color(0, 153, 153));
        jButtonAbrirGestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tarea01/images/Add-Male-User_48x48.png"))); // NOI18N
        jButtonAbrirGestion.setText("Ir a Gestión Usuarios");
        jButtonAbrirGestion.setToolTipText("Ir a Gestión Usuarios");
        jButtonAbrirGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirGestionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tsukushi A Round Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText(" Gestión para alumnos de los ciclos de FP");

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Tsukushi A Round Gothic", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tarea01/images/Out-icon.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.setToolTipText("Salir de la aplición");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonInicoHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tarea01/images/help_64x64.jpg"))); // NOI18N

        javax.swing.GroupLayout jDesktopPaneEscritorioLayout = new javax.swing.GroupLayout(jDesktopPaneEscritorio);
        jDesktopPaneEscritorio.setLayout(jDesktopPaneEscritorioLayout);
        jDesktopPaneEscritorioLayout.setHorizontalGroup(
            jDesktopPaneEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneEscritorioLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPaneEscritorioLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonInicoHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAbrirGestion)
                .addGap(47, 47, 47))
        );
        jDesktopPaneEscritorioLayout.setVerticalGroup(
            jDesktopPaneEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPaneEscritorioLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addGroup(jDesktopPaneEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonInicoHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPaneEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAbrirGestion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );

        jDesktopPaneEscritorioLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButtonAbrirGestion});

        jDesktopPaneEscritorio.setLayer(jButtonAbrirGestion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneEscritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneEscritorio.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneEscritorio.setLayer(jButtonInicoHelp, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAbrirGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirGestionActionPerformed

        JDialogGestionAlumnado misAlumnos = new JDialogGestionAlumnado(this, rootPaneCheckingEnabled);
        jButtonAbrirGestion.addActionListener((ActionEvent e) -> {
            misAlumnos.setVisible(true);
        });
    }//GEN-LAST:event_jButtonAbrirGestionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalTarea01DI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmPrincipalTarea01DI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAbrirGestion;
    private static javax.swing.JButton jButtonInicoHelp;
    private javax.swing.JDesktopPane jDesktopPaneEscritorio;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
