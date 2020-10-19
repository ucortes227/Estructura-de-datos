
package InterfazGrafica;

import polimorfismo.Entrenador;
import polimorfismo.Futbolista;
import polimorfismo.Masajista;
import polimorfismo.SeleccionFutbol;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class Menu extends javax.swing.JFrame {
    
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
    
    private void preRegistro() {
        Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
        Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        Masajista raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);
        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);
    }
    
    public Menu() {
        initComponents();
        preRegistro();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Cerrar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Entrenadores = new javax.swing.JMenuItem();
        Futbolistas = new javax.swing.JMenuItem();
        Masajistas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Concentrarse = new javax.swing.JMenuItem();
        Viajar = new javax.swing.JMenuItem();
        Entrenar = new javax.swing.JMenuItem();
        Jugar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jMenu1.setText("Inicio");

        Cerrar.setText("Salir");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        jMenu1.add(Cerrar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Registro");

        Entrenadores.setText("Entrenador");
        Entrenadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrenadoresActionPerformed(evt);
            }
        });
        jMenu2.add(Entrenadores);

        Futbolistas.setText("Futbolista");
        Futbolistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FutbolistasActionPerformed(evt);
            }
        });
        jMenu2.add(Futbolistas);

        Masajistas.setText("Masajista");
        Masajistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasajistasActionPerformed(evt);
            }
        });
        jMenu2.add(Masajistas);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Actividades");

        Concentrarse.setText("Concentrarse");
        Concentrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConcentrarseActionPerformed(evt);
            }
        });
        jMenu3.add(Concentrarse);

        Viajar.setText("Viajar");
        Viajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViajarActionPerformed(evt);
            }
        });
        jMenu3.add(Viajar);

        Entrenar.setText("Entrenar");
        Entrenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrenarActionPerformed(evt);
            }
        });
        jMenu3.add(Entrenar);

        Jugar.setText("Jugar");
        Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarActionPerformed(evt);
            }
        });
        jMenu3.add(Jugar);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CerrarActionPerformed

    private void EntrenadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrenadoresActionPerformed
        Entrenadores ventana = new Entrenadores();
        ventana.setVisible(true);
        ventana.pack();
    }//GEN-LAST:event_EntrenadoresActionPerformed

    private void FutbolistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FutbolistasActionPerformed
        Futbolistas ventana = new Futbolistas();
        ventana.setVisible(true);
        ventana.pack();
    }//GEN-LAST:event_FutbolistasActionPerformed

    private void MasajistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasajistasActionPerformed
        Masajistas ventana = new Masajistas();
        ventana.setVisible(true);
        ventana.pack();
    }//GEN-LAST:event_MasajistasActionPerformed

    private void ConcentrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConcentrarseActionPerformed
        
        Vector<String> columnas = new Vector<>();
        columnas.add("Integrante");
        columnas.add("Concentracion");

        Vector datos = new Vector();
        for (SeleccionFutbol integrante : integrantes) {
            Vector row = new Vector();
            row.add(integrante.getNombre() + " " + integrante.getApellidos());
            row.add(integrante.Concentrarse());

            datos.add(row);
        }

        DefaultTableModel model = new DefaultTableModel(datos, columnas);
        jTable1.setModel(model);
    }//GEN-LAST:event_ConcentrarseActionPerformed

    private void ViajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViajarActionPerformed
        // TODO add your handling code here:
        Vector<String> columnas = new Vector<>();
        columnas.add("Integrante");
        columnas.add("Viajan");

        Vector datos = new Vector();
        for (SeleccionFutbol integrante : integrantes) {
            Vector row = new Vector();
            row.add(integrante.getNombre() + " " + integrante.getApellidos());
            row.add(integrante.Viajar());

            datos.add(row);
        }

        DefaultTableModel model = new DefaultTableModel(datos, columnas);
        jTable1.setModel(model);
    }//GEN-LAST:event_ViajarActionPerformed

    private void EntrenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrenarActionPerformed
        // TODO add your handling code here:
        Vector<String> columnas = new Vector<>();
        columnas.add("Integrante");
        columnas.add("Entrenan");

        Vector datos = new Vector();
        for (SeleccionFutbol integrante : integrantes) {
            Vector row = new Vector();
            if (integrante instanceof Entrenador) {

                row.add(integrante.getNombre() + " " + integrante.getApellidos());
                row.add(((Entrenador) integrante).Concentrarse());

            }
              if (integrante instanceof Futbolista) {

                row.add(integrante.getNombre() + " " + integrante.getApellidos());
                row.add(((Futbolista) integrante).Concentrarse());
            }

            datos.add(row);
        }

        DefaultTableModel model = new DefaultTableModel(datos, columnas);
        jTable1.setModel(model);
    }//GEN-LAST:event_EntrenarActionPerformed

    private void JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarActionPerformed
        Vector<String> columnas = new Vector<>();
        columnas.add("Integrante");
        columnas.add("Partido");
        
        Vector datos = new Vector();
        for (SeleccionFutbol integrante : integrantes) {
            Vector row = new Vector();
            if (integrante instanceof Entrenador) {
                row.add(integrante.getNombre() + " " + integrante.getApellidos());
                row.add(((Entrenador) integrante).Partido());
            }
              if (integrante instanceof Futbolista) {
                row.add(integrante.getNombre() + " " + integrante.getApellidos());
                row.add(((Futbolista) integrante).Partido());
            }
              if (integrante instanceof Masajista) {
                row.add(integrante.getNombre() + " " + integrante.getApellidos());
                row.add(((Masajista) integrante).Partido());
            }
            datos.add(row);
        }
        DefaultTableModel model = new DefaultTableModel(datos, columnas);
        jTable1.setModel(model);
    }//GEN-LAST:event_JugarActionPerformed
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cerrar;
    private javax.swing.JMenuItem Concentrarse;
    private javax.swing.JMenuItem Entrenadores;
    private javax.swing.JMenuItem Entrenar;
    private javax.swing.JMenuItem Futbolistas;
    private javax.swing.JMenuItem Jugar;
    private javax.swing.JMenuItem Masajistas;
    private javax.swing.JMenuItem Viajar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}