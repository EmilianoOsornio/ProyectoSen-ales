/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import static Ventanas.InicioGrabar.data;
/**
 *
 * @author Emiliano
 */
public class JFrameVentana extends javax.swing.JFrame {

    
    double low=-3,high=3;

    
    public JFrameVentana() {
        initComponents();
        //System.out.println(Ventanas.InicioGrabar.data;.getData().length);
        //System.out.println(Ventanas.InicioGrabar.data;.getDatan().length);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();


        jButton1.setText("Graficar Entrada");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Graficar Salida");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addComponent(jButton2)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Grafica Entrada
        JFreeChart grafica,grafica2,grafica3,grafica4,grafica5,grafica6,grafica7,grafica8;
        DefaultCategoryDataset Datos = new DefaultCategoryDataset();
        DefaultCategoryDataset Datos2 = new DefaultCategoryDataset();
        DefaultCategoryDataset Datos3 = new DefaultCategoryDataset();
        DefaultCategoryDataset Datos4 = new DefaultCategoryDataset();
        DefaultCategoryDataset Datos5 = new DefaultCategoryDataset();
        DefaultCategoryDataset Datos6 = new DefaultCategoryDataset();
        DefaultCategoryDataset Datos7 = new DefaultCategoryDataset();
        DefaultCategoryDataset Datos8 = new DefaultCategoryDataset();
        
        //Botones
        JButton zoomin,zoomout;
        
        zoomin = new JButton("+");
        zoomin.setBounds(0, 0, 100, 30);
        
        zoomout = new JButton("-");
        zoomout.setBounds(0, 0, 100, 30);
        

        double[] data;
        data = Ventanas.InicioGrabar.data;
        System.out.println(data.length);
        Datos.clear();
        Datos2.clear();
        Datos3.clear();
        for(int i=0; i<data.length/8; i++){
            Datos.addValue(data[i],"Audio Saliente",String.valueOf(i));
        }
        for(int i=data.length/8; i<2*data.length/8; i++){
            Datos2.addValue(data[i],"Audio Saliente",String.valueOf(i));
        }
        for(int i=2*data.length/8; i<3*data.length/8; i++){
            Datos3.addValue(data[i],"Audio Saliente",String.valueOf(i));
        }
        for(int i=3*data.length/8; i<4*data.length/8; i++){
            Datos4.addValue(data[i],"Audio Saliente",String.valueOf(i));
        }
        for(int i=4*data.length/8; i<5*data.length/8; i++){
            Datos5.addValue(data[i],"Audio Saliente",String.valueOf(i));
        }
        for(int i=5*data.length/8; i<6*data.length/8; i++){
            Datos6.addValue(data[i],"Audio Saliente",String.valueOf(i));
        }
        for(int i=6*data.length/8; i<7*data.length/8; i++){
            Datos7.addValue(data[i],"Audio Saliente",String.valueOf(i));
        }
        for(int i=7*data.length/8; i<data.length; i++){
            Datos8.addValue(data[i],"Audio Saliente",String.valueOf(i));
        }
       
        grafica = ChartFactory.createBarChart("",null, null,Datos,PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot categoryPlot = grafica.getCategoryPlot();
        BarRenderer br = (BarRenderer) categoryPlot.getRenderer();
        br.setMaximumBarWidth(.00001);        
        grafica2 = ChartFactory.createBarChart("",null,null,Datos2,PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot categoryPlot2 = grafica2.getCategoryPlot();
        BarRenderer br2 = (BarRenderer) categoryPlot2.getRenderer();
        br2.setMaximumBarWidth(.00001); 
        grafica3 = ChartFactory.createBarChart("",null,null,Datos3,PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot categoryPlot3 = grafica3.getCategoryPlot();
        BarRenderer br3 = (BarRenderer) categoryPlot3.getRenderer();
        br3.setMaximumBarWidth(.00001); 
        grafica4 = ChartFactory.createBarChart("",null,null,Datos4,PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot categoryPlot4 = grafica4.getCategoryPlot();
        BarRenderer br4 = (BarRenderer) categoryPlot4.getRenderer();
        br4.setMaximumBarWidth(.00001);
        grafica5 = ChartFactory.createBarChart("",null,null,Datos5,PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot categoryPlot5 = grafica5.getCategoryPlot();
        BarRenderer br5 = (BarRenderer) categoryPlot5.getRenderer();
        br5.setMaximumBarWidth(.00001);
        grafica6 = ChartFactory.createBarChart("",null,null,Datos6,PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot categoryPlot6 = grafica6.getCategoryPlot();
        BarRenderer br6 = (BarRenderer) categoryPlot6.getRenderer();
        br6.setMaximumBarWidth(.00001);
        grafica7 = ChartFactory.createBarChart("",null,null,Datos7,PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot categoryPlot7 = grafica7.getCategoryPlot();
        BarRenderer br7 = (BarRenderer) categoryPlot7.getRenderer();
        br7.setMaximumBarWidth(.00001);
        grafica8 = ChartFactory.createBarChart("",null,null,Datos8,PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot categoryPlot8 = grafica8.getCategoryPlot();
        BarRenderer br8 = (BarRenderer) categoryPlot8.getRenderer();
        br8.setMaximumBarWidth(.00001);
        
        //Dimensiones y tags
        categoryPlot.getDomainAxis().setVisible(false);
        categoryPlot.getRangeAxis().setVisible(true);
        categoryPlot2.getDomainAxis().setVisible(false);
        categoryPlot2.getRangeAxis().setVisible(false);
        categoryPlot3.getDomainAxis().setVisible(false);
        categoryPlot3.getRangeAxis().setVisible(false);
        categoryPlot4.getDomainAxis().setVisible(false);
        categoryPlot4.getRangeAxis().setVisible(false);
        categoryPlot5.getDomainAxis().setVisible(false);
        categoryPlot5.getRangeAxis().setVisible(false);
        categoryPlot6.getDomainAxis().setVisible(false);
        categoryPlot6.getRangeAxis().setVisible(false);
        categoryPlot7.getDomainAxis().setVisible(false);
        categoryPlot7.getRangeAxis().setVisible(false);
        categoryPlot8.getDomainAxis().setVisible(false);
        categoryPlot8.getRangeAxis().setVisible(false);
        
        categoryPlot.getRangeAxis().setRange(low, high);
        categoryPlot2.getRangeAxis().setRange(low, high);
        categoryPlot3.getRangeAxis().setRange(low, high);
        categoryPlot4.getRangeAxis().setRange(low, high);
        categoryPlot5.getRangeAxis().setRange(low, high);
        categoryPlot6.getRangeAxis().setRange(low, high);
        categoryPlot7.getRangeAxis().setRange(low, high);
        categoryPlot8.getRangeAxis().setRange(low, high);
        
        //Acciones de los botones
        
        zoomin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                low=low+0.2;
                high=high-0.2;
                categoryPlot.getRangeAxis().setRange(low, high);
                categoryPlot2.getRangeAxis().setRange(low, high);
                categoryPlot3.getRangeAxis().setRange(low, high);
                categoryPlot4.getRangeAxis().setRange(low, high);
                categoryPlot5.getRangeAxis().setRange(low, high);
                categoryPlot6.getRangeAxis().setRange(low, high);
                categoryPlot7.getRangeAxis().setRange(low, high);
                categoryPlot8.getRangeAxis().setRange(low, high);
            }
        });
        
        zoomout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                low=low-0.2;
                high=high+0.2;
                categoryPlot.getRangeAxis().setRange(low, high);
                categoryPlot2.getRangeAxis().setRange(low, high);
                categoryPlot3.getRangeAxis().setRange(low, high);
                categoryPlot4.getRangeAxis().setRange(low, high);
                categoryPlot5.getRangeAxis().setRange(low, high);
                categoryPlot6.getRangeAxis().setRange(low, high);
                categoryPlot7.getRangeAxis().setRange(low, high);
                categoryPlot8.getRangeAxis().setRange(low, high);
            }
        });
        
        
        
        ChartPanel Panel = new ChartPanel(grafica);
        Panel.zoomOutBoth(500, 500);
        
        ChartPanel Panel2 = new ChartPanel(grafica2);
        Panel2.zoomOutBoth(500, 500);
        
        ChartPanel Panel3 = new ChartPanel(grafica3);
        Panel3.zoomOutBoth(500, 500);
        
        ChartPanel Panel4 = new ChartPanel(grafica4);
        Panel4.zoomOutBoth(500, 500);
        
        ChartPanel Panel5 = new ChartPanel(grafica5);
        Panel5.zoomOutBoth(500, 500);
        
        ChartPanel Panel6 = new ChartPanel(grafica6);
        Panel6.zoomOutBoth(500, 500);
        
        ChartPanel Panel7 = new ChartPanel(grafica7);
        Panel7.zoomOutBoth(500, 500);
        
        ChartPanel Panel8 = new ChartPanel(grafica8);
        Panel8.zoomOutBoth(500, 500);
        
        JPanel PanelControl= new JPanel();
        PanelControl.add(zoomin);
        PanelControl.add(zoomout);
        
        
        JFrame Ventana = new JFrame("Audio Entrada");
        //Ventana.getContentPane().add(Panel);
        Ventana.getContentPane().add(Panel);
        Ventana.getContentPane().add(Panel2);
        Ventana.getContentPane().add(Panel3);
        Ventana.getContentPane().add(Panel4);
        Ventana.getContentPane().add(Panel5);
        Ventana.getContentPane().add(Panel6);
        Ventana.getContentPane().add(Panel7);
        Ventana.getContentPane().add(Panel8);
        Ventana.getContentPane().add(PanelControl);
        
        Ventana.setLayout(new GridLayout(1, 0));
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setBounds(20, 0, 1200, 350);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Grafica Salida
        JFreeChart grafica,grafica2,grafica3,grafica4,grafica5,grafica6,grafica7,grafica8;
        DefaultCategoryDataset Datos = new DefaultCategoryDataset();
        DefaultCategoryDataset Datos2 = new DefaultCategoryDataset();
        DefaultCategoryDataset Datos3 = new DefaultCategoryDataset();
        DefaultCategoryDataset Datos4 = new DefaultCategoryDataset();
        DefaultCategoryDataset Datos5 = new DefaultCategoryDataset();
        DefaultCategoryDataset Datos6 = new DefaultCategoryDataset();
        DefaultCategoryDataset Datos7 = new DefaultCategoryDataset();
        DefaultCategoryDataset Datos8 = new DefaultCategoryDataset();
        
        //Botones
        JButton zoomin,zoomout;
        
        zoomin = new JButton("+");
        zoomin.setBounds(0, 0, 100, 30);
        
        zoomout = new JButton("-");
        zoomout.setBounds(0, 0, 100, 30);
        

        double[] data;
        data = Ventanas.InicioGrabar.data;
        System.out.println(data.length);
        Datos.clear();
        Datos2.clear();
        Datos3.clear();
        for(int i=0; i<data.length/8; i++){
            Datos.addValue(data[i],"Audio Saliente",String.valueOf(i));
        }
        for(int i=data.length/8; i<2*data.length/8; i++){
            Datos2.addValue(data[i],"Audio Saliente",String.valueOf(i));
        }
        for(int i=2*data.length/8; i<3*data.length/8; i++){
            Datos3.addValue(data[i],"Audio Saliente",String.valueOf(i));
        }
        for(int i=3*data.length/8; i<4*data.length/8; i++){
            Datos4.addValue(data[i],"Audio Saliente",String.valueOf(i));
        }
        for(int i=4*data.length/8; i<5*data.length/8; i++){
            Datos5.addValue(data[i],"Audio Saliente",String.valueOf(i));
        }
        for(int i=5*data.length/8; i<6*data.length/8; i++){
            Datos6.addValue(data[i],"Audio Saliente",String.valueOf(i));
        }
        for(int i=6*data.length/8; i<7*data.length/8; i++){
            Datos7.addValue(data[i],"Audio Saliente",String.valueOf(i));
        }
        for(int i=7*data.length/8; i<data.length; i++){
            Datos8.addValue(data[i],"Audio Saliente",String.valueOf(i));
        }
       
        grafica = ChartFactory.createBarChart("",null, null,Datos,PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot categoryPlot = grafica.getCategoryPlot();
        BarRenderer br = (BarRenderer) categoryPlot.getRenderer();
        br.setMaximumBarWidth(.00001);        
        grafica2 = ChartFactory.createBarChart("",null,null,Datos2,PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot categoryPlot2 = grafica2.getCategoryPlot();
        BarRenderer br2 = (BarRenderer) categoryPlot2.getRenderer();
        br2.setMaximumBarWidth(.00001); 
        grafica3 = ChartFactory.createBarChart("",null,null,Datos3,PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot categoryPlot3 = grafica3.getCategoryPlot();
        BarRenderer br3 = (BarRenderer) categoryPlot3.getRenderer();
        br3.setMaximumBarWidth(.00001); 
        grafica4 = ChartFactory.createBarChart("",null,null,Datos4,PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot categoryPlot4 = grafica4.getCategoryPlot();
        BarRenderer br4 = (BarRenderer) categoryPlot4.getRenderer();
        br4.setMaximumBarWidth(.00001);
        grafica5 = ChartFactory.createBarChart("",null,null,Datos5,PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot categoryPlot5 = grafica5.getCategoryPlot();
        BarRenderer br5 = (BarRenderer) categoryPlot5.getRenderer();
        br5.setMaximumBarWidth(.00001);
        grafica6 = ChartFactory.createBarChart("",null,null,Datos6,PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot categoryPlot6 = grafica6.getCategoryPlot();
        BarRenderer br6 = (BarRenderer) categoryPlot6.getRenderer();
        br6.setMaximumBarWidth(.00001);
        grafica7 = ChartFactory.createBarChart("",null,null,Datos7,PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot categoryPlot7 = grafica7.getCategoryPlot();
        BarRenderer br7 = (BarRenderer) categoryPlot7.getRenderer();
        br7.setMaximumBarWidth(.00001);
        grafica8 = ChartFactory.createBarChart("",null,null,Datos8,PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot categoryPlot8 = grafica8.getCategoryPlot();
        BarRenderer br8 = (BarRenderer) categoryPlot8.getRenderer();
        br8.setMaximumBarWidth(.00001);
        
        //Tags
        categoryPlot.getDomainAxis().setVisible(false);
        categoryPlot.getRangeAxis().setVisible(true);
        categoryPlot2.getDomainAxis().setVisible(false);
        categoryPlot2.getRangeAxis().setVisible(false);
        categoryPlot3.getDomainAxis().setVisible(false);
        categoryPlot3.getRangeAxis().setVisible(false);
        categoryPlot4.getDomainAxis().setVisible(false);
        categoryPlot4.getRangeAxis().setVisible(false);
        categoryPlot5.getDomainAxis().setVisible(false);
        categoryPlot5.getRangeAxis().setVisible(false);
        categoryPlot6.getDomainAxis().setVisible(false);
        categoryPlot6.getRangeAxis().setVisible(false);
        categoryPlot7.getDomainAxis().setVisible(false);
        categoryPlot7.getRangeAxis().setVisible(false);
        categoryPlot8.getDomainAxis().setVisible(false);
        categoryPlot8.getRangeAxis().setVisible(false);
        
        //Rango
        categoryPlot2.getRangeAxis().setVerticalTickLabels(false);
        categoryPlot.getRangeAxis().setRange(low, high);
        categoryPlot2.getRangeAxis().setRange(low, high);
        categoryPlot3.getRangeAxis().setRange(low, high);
        categoryPlot4.getRangeAxis().setRange(low, high);
        categoryPlot5.getRangeAxis().setRange(low, high);
        categoryPlot6.getRangeAxis().setRange(low, high);
        categoryPlot7.getRangeAxis().setRange(low, high);
        categoryPlot8.getRangeAxis().setRange(low, high);
        
        //Acciones de los botones
        
        zoomin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                low=low+0.2;
                high=high-0.2;
                categoryPlot.getRangeAxis().setRange(low, high);
                categoryPlot2.getRangeAxis().setRange(low, high);
                categoryPlot3.getRangeAxis().setRange(low, high);
                categoryPlot4.getRangeAxis().setRange(low, high);
                categoryPlot5.getRangeAxis().setRange(low, high);
                categoryPlot6.getRangeAxis().setRange(low, high);
                categoryPlot7.getRangeAxis().setRange(low, high);
                categoryPlot8.getRangeAxis().setRange(low, high);
            }
        });
        
        zoomout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                low=low-0.2;
                high=high+0.2;
                categoryPlot.getRangeAxis().setRange(low, high);
                categoryPlot2.getRangeAxis().setRange(low, high);
                categoryPlot3.getRangeAxis().setRange(low, high);
                categoryPlot4.getRangeAxis().setRange(low, high);
                categoryPlot5.getRangeAxis().setRange(low, high);
                categoryPlot6.getRangeAxis().setRange(low, high);
                categoryPlot7.getRangeAxis().setRange(low, high);
                categoryPlot8.getRangeAxis().setRange(low, high);
            }
        });
        
        
        
        ChartPanel Panel = new ChartPanel(grafica);
        Panel.zoomOutBoth(500, 500);
        
        ChartPanel Panel2 = new ChartPanel(grafica2);
        Panel2.zoomOutBoth(500, 500);
        
        ChartPanel Panel3 = new ChartPanel(grafica3);
        Panel3.zoomOutBoth(500, 500);
        
        ChartPanel Panel4 = new ChartPanel(grafica4);
        Panel4.zoomOutBoth(500, 500);
        
        ChartPanel Panel5 = new ChartPanel(grafica5);
        Panel5.zoomOutBoth(500, 500);
        
        ChartPanel Panel6 = new ChartPanel(grafica6);
        Panel6.zoomOutBoth(500, 500);
        
        ChartPanel Panel7 = new ChartPanel(grafica7);
        Panel7.zoomOutBoth(500, 500);
        
        ChartPanel Panel8 = new ChartPanel(grafica8);
        Panel8.zoomOutBoth(500, 500);
        
        JPanel PanelControl= new JPanel();
        PanelControl.add(zoomin);
        PanelControl.add(zoomout);
        
        
        JFrame Ventana = new JFrame("Audio Salida");
        //Ventana.getContentPane().add(Panel);
        Ventana.getContentPane().add(Panel);
        Ventana.getContentPane().add(Panel2);
        Ventana.getContentPane().add(Panel3);
        Ventana.getContentPane().add(Panel4);
        Ventana.getContentPane().add(Panel5);
        Ventana.getContentPane().add(Panel6);
        Ventana.getContentPane().add(Panel7);
        Ventana.getContentPane().add(Panel8);
        Ventana.getContentPane().add(PanelControl);
        
        Ventana.setLayout(new GridLayout(1, 0));
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setBounds(20, 400, 1200, 350);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
