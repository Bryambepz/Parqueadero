/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorTicket;
import Controlador.ControladorVehiculo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Ticket;

/**
 *
 * @author braya
 */
public class VntTicket extends javax.swing.JInternalFrame {
    private ControladorVehiculo ctrlVehiculo;
    private ControladorTicket ctrlTicket;
    /**
     * Creates new form VntTicket
     */
    public VntTicket(ControladorVehiculo ctrlVehiculo, ControladorTicket ctrlTicket) {
        initComponents();
        this.ctrlVehiculo = ctrlVehiculo;
        this.ctrlTicket = ctrlTicket;
        //panelTicket.setVisible(false);
        panelCarro.setVisible(false);
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
        labelPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        panelCarro = new javax.swing.JPanel();
        labelModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        labelColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        panelTicket = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        labelIngreso = new javax.swing.JLabel();
        ftxtIngreso = new javax.swing.JFormattedTextField();
        lableSalida = new javax.swing.JLabel();
        ftxtSalida = new javax.swing.JFormattedTextField();
        labelPuesto = new javax.swing.JLabel();
        txtPuesto = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(81, 153, 228));

        labelPlaca.setText("Ingrese placa");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        labelModelo.setText("Modelo");

        labelColor.setText("Color");

        jButton1.setText("Generar ticket");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCarroLayout = new javax.swing.GroupLayout(panelCarro);
        panelCarro.setLayout(panelCarroLayout);
        panelCarroLayout.setHorizontalGroup(
            panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCarroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelModelo)
                    .addComponent(labelColor))
                .addGap(74, 74, 74)
                .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtModelo)
                    .addComponent(txtColor, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCarroLayout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(79, 79, 79))
        );
        panelCarroLayout.setVerticalGroup(
            panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCarroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Id");

        labelIngreso.setText("Hora Ingreso");

        try {
            ftxtIngreso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####  ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lableSalida.setText("Hora Salida");

        try {
            ftxtSalida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####  ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelPuesto.setText("Puesto");

        javax.swing.GroupLayout panelTicketLayout = new javax.swing.GroupLayout(panelTicket);
        panelTicket.setLayout(panelTicketLayout);
        panelTicketLayout.setHorizontalGroup(
            panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(labelIngreso)
                    .addComponent(lableSalida)
                    .addComponent(labelPuesto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtId)
                    .addComponent(ftxtIngreso)
                    .addComponent(ftxtSalida)
                    .addComponent(txtPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelTicketLayout.setVerticalGroup(
            panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIngreso)
                    .addComponent(ftxtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lableSalida)
                    .addComponent(ftxtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPuesto)
                    .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelPlaca)
                        .addGap(57, 57, 57)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnRegresar)
                            .addGap(85, 85, 85)
                            .addComponent(btnGuardar))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelTicket, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelCarro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlaca)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(panelCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(panelTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnRegresar))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        var v = ctrlVehiculo.read(txtPlaca.getText());
        panelCarro.setVisible(true);
        txtColor.setText(v.getColor());
        txtModelo.setText(v.getModelo());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        panelTicket.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
        int id = Integer.valueOf(txtId.getText());
        String fI = ftxtIngreso.getText();
        String fS = ftxtSalida.getText();
        Date fechaIng = null;
        Date fechaSal = null;
        try {
            fechaIng = formato.parse(fI);
            fechaSal = formato.parse(fS);
        } catch (ParseException ex) {
            Logger.getLogger(VntTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
        int lugar = Integer.valueOf(txtPuesto.getText());
        Ticket ti = new Ticket(id, fechaIng, fechaSal, lugar);
        System.out.println("--> " + ti);
        ctrlTicket.create(ti);
        var v = ctrlVehiculo.read(txtPlaca.getText());
        v.setTicket(ti);
        System.out.println("v " + v);
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JFormattedTextField ftxtIngreso;
    private javax.swing.JFormattedTextField ftxtSalida;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelIngreso;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelPuesto;
    private javax.swing.JLabel lableSalida;
    private javax.swing.JPanel panelCarro;
    private javax.swing.JPanel panelTicket;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPuesto;
    // End of variables declaration//GEN-END:variables
}
