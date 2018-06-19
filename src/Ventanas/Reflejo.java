/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import javax.swing.JFrame;
import paquete.JFrameVentana;
import static paquete.Menu.setDatan;
import paquete.OperacionesBasicas;
import paquete.ReadSound;

/**
 *
 * @author csb
 */
public class Reflejo extends javax.swing.JFrame {

    OperacionesBasicas ob = new OperacionesBasicas(); //tiempoGrabacion = rcs.
    public double[] datan = null;
    public double[] data = null;
    ReadSound rds;
    int segundos;
    
    public Reflejo(double[] data) {
        initComponents();
        this.setVisible(true);

        this.data = data;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        desplazar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        reproducirEntrada = new javax.swing.JButton();
        reproducirSalida = new javax.swing.JButton();
        reproducirSalida1 = new javax.swing.JButton();

        setTitle("Reflejo");
        setSize(new java.awt.Dimension(683, 552));

        jPanel1.setBackground(new java.awt.Color(48, 63, 159));

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Reflejo");

        jPanel2.setBackground(new java.awt.Color(48, 63, 159));

        desplazar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        desplazar.setText("Comenzar");
        desplazar.setToolTipText("");
        desplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desplazarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(desplazar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(172, 172, 172))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(desplazar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(48, 63, 159));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reproducirEntrada.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        reproducirEntrada.setText("Reproducir Entrada");
        reproducirEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reproducirEntradaActionPerformed(evt);
            }
        });

        reproducirSalida.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        reproducirSalida.setText("Reproducir Salida");
        reproducirSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reproducirSalidaActionPerformed(evt);
            }
        });

        reproducirSalida1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        reproducirSalida1.setText("Gráficar");
        reproducirSalida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reproducirSalida1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reproducirEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(reproducirSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(reproducirSalida1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reproducirEntrada)
                    .addComponent(reproducirSalida)
                    .addComponent(reproducirSalida1))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(285, 285, 285))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void desplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desplazarActionPerformed
        datan=ob.reflejo(data);
        if (datan == null) {
            System.out.println("PARA REPRODUCIR TIENES QUE REALIZAR UNA OPERACION");
        } else {
            rds.play("NuevaGrabacion.wav");
        }
    }//GEN-LAST:event_desplazarActionPerformed

    private void reproducirEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reproducirEntradaActionPerformed
        rds.play("Grabacion.wav");
    }//GEN-LAST:event_reproducirEntradaActionPerformed

    private void reproducirSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reproducirSalidaActionPerformed
        if (datan == null) {
            System.out.println("PARA REPRODUCIR TIENES QUE REALIZAR UNA OPERACION");
        } else {
            rds.play("NuevaGrabacion.wav");
        }
    }//GEN-LAST:event_reproducirSalidaActionPerformed

    private void reproducirSalida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reproducirSalida1ActionPerformed
        JFrameVentana newv = new JFrameVentana();
        newv.setVisible(true);
    }//GEN-LAST:event_reproducirSalida1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton desplazar;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton reproducirEntrada;
    private javax.swing.JButton reproducirSalida;
    private javax.swing.JButton reproducirSalida1;
    // End of variables declaration//GEN-END:variables
}
