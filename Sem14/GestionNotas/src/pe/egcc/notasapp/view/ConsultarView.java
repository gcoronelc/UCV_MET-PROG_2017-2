package pe.egcc.notasapp.view;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.table.DefaultTableModel;
import pe.egcc.notasapp.controller.CursoController;
import pe.egcc.notasapp.model.Alumno;

public class ConsultarView extends javax.swing.JInternalFrame {
  
  private CursoController cursoController;
  private int tamano = 0;
  public int time = 100;
  
  public ConsultarView() {
    initComponents();
    cursoController = new CursoController();
    
    TimerTask timerTask = new TimerTask() {
      public void run() {
        llenarTabla();
        
      }
    };
    
    Timer timer = new Timer();
    
    timer.scheduleAtFixedRate(timerTask, 0, time);
    
  }
  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jScrollPane1 = new javax.swing.JScrollPane();
    tblRepo = new javax.swing.JTable();
    jPanel1 = new javax.swing.JPanel();
    lblAprobados = new javax.swing.JLabel();
    lblDesaprobados = new javax.swing.JLabel();
    lblPromAlt = new javax.swing.JLabel();
    lblPromBajo = new javax.swing.JLabel();

    setClosable(true);
    setMaximizable(true);
    setTitle("REPORTES DE NOTAS");

    tblRepo.setBackground(new java.awt.Color(226, 246, 231));
    tblRepo.setForeground(new java.awt.Color(102, 102, 102));
    tblRepo.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null}
      },
      new String [] {
        "Alumno", "P1", "P2", "P3", "P4", "Exa Parc", "Exa Fin", "Promedio Prac", "Promedio", "Situacion"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false, false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tblRepo.setRowHeight(25);
    tblRepo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    jScrollPane1.setViewportView(tblRepo);

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESUMEN", 0, 0, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N

    lblAprobados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    lblAprobados.setText("Aprobados:");

    lblDesaprobados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    lblDesaprobados.setText("Desaprobados:");

    lblPromAlt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    lblPromAlt.setText("Promedio más Alto:");

    lblPromBajo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    lblPromBajo.setText("Promedio más Alto:");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addComponent(lblAprobados, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(lblDesaprobados, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(35, 35, 35)
        .addComponent(lblPromAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(35, 35, 35)
        .addComponent(lblPromBajo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(46, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(9, 9, 9)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblDesaprobados, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblAprobados, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblPromAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblPromBajo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane1)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lblAprobados;
  private javax.swing.JLabel lblDesaprobados;
  private javax.swing.JLabel lblPromAlt;
  private javax.swing.JLabel lblPromBajo;
  private javax.swing.JTable tblRepo;
  // End of variables declaration//GEN-END:variables

  private void llenarTabla() {
    //Lista ventas ventacontroller
    List<Alumno> alumnos = cursoController.leerAlumnos();
    if (alumnos.size() == tamano) {
      return;
    }
    
    tamano = alumnos.size();
    
    DefaultTableModel tabla;
    tabla = (DefaultTableModel) tblRepo.getModel();
    
    int selectedRow = tblRepo.getSelectedRow();
    
    tabla.setRowCount(0);
    int aprobados = 0, desaprobados = 0;
    double mayor = 0.0, menor = 0.0;
    
    for (Alumno alumno : alumnos) {
      tabla.addRow(alumno.toRowData());
      
    }
    
    if (selectedRow > -1) {
      tblRepo.setRowSelectionInterval(selectedRow, selectedRow);
    }
    
    lblAprobados.setText("Aprobados: " + cursoController.leerAprobados());
    lblDesaprobados.setText("Desaprobados: " + cursoController.leerDesaprobados());
    lblPromAlt.setText("Promedio más Alto: " + cursoController.leerNotaMayor());
    lblPromBajo.setText("Promedio más Bajo: " + cursoController.leerNotaMenor());
    
  }
  
}
