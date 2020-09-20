package com.udistrital.informatica.view;

import com.udistrital.informatica.controller.FigureController;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseMotionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;


/**
 * Class MainWindow
 * @author angelicaquevedo
 * 12/09/2020
 * v 1.1
 */
public class MainWindow extends javax.swing.JFrame {
    /**
     * The canvas
     */
    private Canvas canvas;
    /**
     * The figure controller
     */
    private FigureController figureController;

    /**
     * The MainWindow constructor
     */
    public MainWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
        dcbm.addElement("Choose a figure ..");
        dcbm.addElement("Triangle");
        dcbm.addElement("Square");
        dcbm.addElement("Circle");
        cboLineSize.addItem("5");
        cboLineSize.addItem("10");
        cboLineSize.addItem("15");
        cboLineSize.addItem("20");
        
        jTextBackgroundColor.setBackground(Color.white);
        canvas = new Canvas();
        canvas.setBounds(4, 4, 450, 450);
        cboFigureType.setModel(dcbm);
        this.add(canvas);
        canvas.setVisible(true);
        catchUpEvent();
    }
    
    /**
     * Method that returns a instance of the figure controller
     * @return FigureController
     */
    public FigureController getControl() {
        if (figureController == null) {
            figureController = new FigureController(this);
        }
        return figureController;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        plHud = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        cboFigureType = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jTextBackgroundColor = new javax.swing.JTextField();
        btnElegirColor = new javax.swing.JButton();
        jBtnEraser = new javax.swing.JButton();
        jBtnPencil = new javax.swing.JButton();
        cboLineSize = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnGenerate = new javax.swing.JButton();
        jBtnClearCanvas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cboFigureType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboFigureType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboFigureTypeItemStateChanged(evt);
            }
        });

        jLabel9.setText("Color");

        jTextBackgroundColor.setEditable(false);

        btnElegirColor.setLabel("Choose");
        btnElegirColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirColorActionPerformed(evt);
            }
        });

        jBtnEraser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/udistrital/informatica/resources/images/borrador.png"))); // NOI18N
        jBtnEraser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEraserActionPerformed(evt);
            }
        });

        jBtnPencil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/udistrital/informatica/resources/images/lapiz.png"))); // NOI18N
        jBtnPencil.setEnabled(false);
        jBtnPencil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPencilActionPerformed(evt);
            }
        });

        cboLineSize.setActionCommand("");

        jLabel1.setText("Pencil Size");

        javax.swing.GroupLayout plHudLayout = new javax.swing.GroupLayout(plHud);
        plHud.setLayout(plHudLayout);
        plHudLayout.setHorizontalGroup(
            plHudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plHudLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plHudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addComponent(cboFigureType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(plHudLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextBackgroundColor, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnElegirColor))
                    .addGroup(plHudLayout.createSequentialGroup()
                        .addComponent(jBtnEraser, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(plHudLayout.createSequentialGroup()
                        .addComponent(jBtnPencil, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(plHudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(plHudLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cboLineSize, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator3))
                .addContainerGap())
        );
        plHudLayout.setVerticalGroup(
            plHudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plHudLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnEraser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plHudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnPencil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(plHudLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboLineSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboFigureType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plHudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextBackgroundColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElegirColor))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        btnGenerate.setText("Create");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        jBtnClearCanvas.setText("Clear view");
        jBtnClearCanvas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClearCanvasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plHud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jBtnClearCanvas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plHud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnClearCanvas)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(468, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void jBtnPencilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPencilActionPerformed
    }//GEN-LAST:event_jBtnPencilActionPerformed

    private void jBtnEraserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEraserActionPerformed
    }//GEN-LAST:event_jBtnEraserActionPerformed

    private void btnElegirColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirColorActionPerformed
        jTextBackgroundColor.setBackground(JColorChooser.showDialog(rootPane, "Choose the color of the figure", Color.RED));
    }//GEN-LAST:event_btnElegirColorActionPerformed

    private void cboFigureTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboFigureTypeItemStateChanged

    }//GEN-LAST:event_cboFigureTypeItemStateChanged

    private void jBtnClearCanvasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClearCanvasActionPerformed
    }//GEN-LAST:event_jBtnClearCanvasActionPerformed

    public void displayResult(String result, String resultMessages) {
        JOptionPane.showMessageDialog(rootPane, result, resultMessages, JOptionPane.WARNING_MESSAGE);
    }
   
    /**
     * Method that captures the events related to the components
     */
    private void catchUpEvent() {
        btnGenerate.addActionListener(getControl());
        jBtnPencil.addActionListener(getControl());
        jBtnEraser.addActionListener(getControl());
        this.addComponentListener(getControl());
        jBtnClearCanvas.addActionListener(getControl());
        canvas.addMouseListener(getControl());
        canvas.addMouseMotionListener(getControl());
        cboLineSize.addActionListener(getControl());
   }
    
    
    public JButton getBtnElegirColor() {
        return btnElegirColor;
    }

    public JButton getBtnGenerate() {
        return btnGenerate;
    }

    public JComboBox<String> getCboFigureType() {
        return cboFigureType;
    }

    public JButton getjBtnEraser() {
        return jBtnEraser;
    }

    public JButton getjBtnPencil() {
        return jBtnPencil;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public JSeparator getjSeparator2() {
        return jSeparator2;
    }

    public JTextField getjTextBackgroundColor() {
        return jTextBackgroundColor;
    }

    public JPanel getPlHud() {
        return plHud;
    }
        public JButton getjBtnClearCanvas() {
        return jBtnClearCanvas;
    }
    
     public Canvas getCanvas() {
        return canvas;
    }

    public JComboBox<String> getCboLineSize() {
        return cboLineSize;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElegirColor;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JComboBox<String> cboFigureType;
    private javax.swing.JComboBox<String> cboLineSize;
    private javax.swing.JButton jBtnClearCanvas;
    private javax.swing.JButton jBtnEraser;
    private javax.swing.JButton jBtnPencil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextBackgroundColor;
    private javax.swing.JPanel plHud;
    // End of variables declaration//GEN-END:variables

}
