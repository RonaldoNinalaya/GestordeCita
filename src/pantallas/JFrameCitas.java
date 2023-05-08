/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import entidades.Cita;
import entidades.Especialidad;
import entidades.Medico;
import entidades.Paciente;
import gestordecitas.GestorDeCitas;
import javax.swing.ComboBoxModel;
import javax.swing.JFrame;

/**
 *
 * @author Ronaldo
 */
public class JFrameCitas extends javax.swing.JFrame {

    private JFrameGestorDeCitas padre;
    
    private Cita cita;
    private boolean estoyEditando = false;
    
    
    private Medico medicoSelecionado;
    private Paciente pacienteSelecionado;
    private Especialidad especialidadSeleccionada;
    
    
    public JFrameCitas(JFrameGestorDeCitas padre) {
        initComponents();
        this.padre = padre;
        
        cbEspecialidad.removeAllItems();
        cbEspecialidad.setEnabled(false);
        
        cbHora.removeAllItems();
        for(String hora: GestorDeCitas.horasDisponible)
        cbHora.addItem(hora);
        
        cbFecha.removeAllItems();
        for(String fecha:GestorDeCitas.fechasDisponible)
        cbFecha.addItem(fecha);
         
    }
     public JFrameCitas(JFrameGestorDeCitas padre, Cita cita) {
        initComponents();
        this.padre = padre;
        this.cita = cita;
        this.estoyEditando = true;
        this.btnBuscarPaciente.setVisible(false);
        this.btnBuscarMedico.setVisible(false);
        this.btnGuardar.setVisible(false);
        lblTitulo.setText("Visualizar Cita");
        this.txtBuscarMedico.setText(cita.getMedico().getDatoMostrar());
        this.txtBuscarPaciente.setText(cita.getMedico().getDatoMostrar());
        
        cbEspecialidad.removeAllItems();
        cbEspecialidad.addItem(cita.getEspecialidad().getNombre());
        
        
        cbFecha.removeAllItems();
        cbFecha.addItem(GestorDeCitas.fechasDisponible.get(cita.getFecha()));
        
        cbHora.removeAllItems();
        cbHora.addItem(GestorDeCitas.horasDisponible.get(cita.getFecha()));
    }   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        txtBuscarPaciente = new javax.swing.JTextField();
        txtBuscarMedico = new javax.swing.JTextField();
        btnBuscarPaciente = new javax.swing.JButton();
        btnBuscarMedico = new javax.swing.JButton();
        cbEspecialidad = new javax.swing.JComboBox<>();
        cbFecha = new javax.swing.JComboBox<>();
        cbHora = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitulo.setText("Nueva Citas");

        btnBuscarPaciente.setText("Buscar Paciente");
        btnBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPacienteActionPerformed(evt);
            }
        });

        btnBuscarMedico.setText("Buscar Medico");
        btnBuscarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMedicoActionPerformed(evt);
            }
        });

        cbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbEspecialidad.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbEspecialidadPropertyChange(evt);
            }
        });

        cbFecha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnCancelar.setText("Salir");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbHora, 0, 97, Short.MAX_VALUE))
                            .addComponent(cbEspecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBuscarMedico)
                            .addComponent(txtBuscarPaciente)
                            .addComponent(lblTitulo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbHora, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(cbFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void guardarCita(){
        
        
        if(medicoSelecionado !=null && pacienteSelecionado !=null ){
            int indiceSeleccionado = cbEspecialidad.getSelectedIndex();
            especialidadSeleccionada = medicoSelecionado.getEspecialidades().get(indiceSeleccionado);
            
            
            cita = new Cita(medicoSelecionado,pacienteSelecionado,especialidadSeleccionada);
            cita.setFecha(cbFecha.getSelectedIndex());
            cita.setHora(cbHora.getSelectedIndex());
            this.padre.agregarCita(cita); 
        }
       
    }
    public void setPaciente(Paciente paciente){
        this.pacienteSelecionado = paciente;
        txtBuscarPaciente.setText(paciente.getDatosMostrar());
    }
    
    public void setMedico(Medico medico){
        this.medicoSelecionado = medico;
        txtBuscarMedico.setText(medico.getDatoMostrar());
        
        cbEspecialidad.removeAllItems();
        for(Especialidad espec: medico.getEspecialidades()){
            cbEspecialidad.addItem(espec.getNombre());
        }
        
        cbEspecialidad.setEnabled(true);
    }
    
    
    private void btnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPacienteActionPerformed
        JFramePacientes pantallaPaciente = new JFramePacientes(this);
        pantallaPaciente.setLocationRelativeTo(this);
        pantallaPaciente.setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_btnBuscarPacienteActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       guardarCita();
        salir();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        salir();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMedicoActionPerformed
        JFrameMedicos pantallaMedico = new JFrameMedicos(this);
        pantallaMedico.setLocationRelativeTo(this);
        pantallaMedico.setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_btnBuscarMedicoActionPerformed

    private void cbEspecialidadPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbEspecialidadPropertyChange
       
        if(this.medicoSelecionado!=null){
            Especialidad espec = this.medicoSelecionado.getEspecialidades().get(cbEspecialidad.getSelectedIndex());
            especialidadSeleccionada = espec;
        }
        
    }//GEN-LAST:event_cbEspecialidadPropertyChange

    private void buscarPaciente(){
       JFramePacientes paciente=new JFramePacientes(this);
       paciente.setLocationRelativeTo(null);
       paciente.setVisible(true);
       
    }
    private void salir(){
        padre.setVisible(true);
        this.dispose();
    }
    
    
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
            java.util.logging.Logger.getLogger(JFrameCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCitas(new JFrameGestorDeCitas()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarMedico;
    private javax.swing.JButton btnBuscarPaciente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbEspecialidad;
    private javax.swing.JComboBox<String> cbFecha;
    private javax.swing.JComboBox<String> cbHora;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtBuscarMedico;
    private javax.swing.JTextField txtBuscarPaciente;
    // End of variables declaration//GEN-END:variables
}
