/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author ch148
 */
public class calculador extends javax.swing.JFrame {

    public float num1;
    public float num2;
    public String oper;
    public calculador() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        BtnBorrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        BtnNum7 = new javax.swing.JButton();
        BtnNum8 = new javax.swing.JButton();
        BtnNum5 = new javax.swing.JButton();
        BtnNum6 = new javax.swing.JButton();
        BtnNum4 = new javax.swing.JButton();
        BtnNum9 = new javax.swing.JButton();
        BtnPor = new javax.swing.JButton();
        BtnMenos = new javax.swing.JButton();
        Btnas = new javax.swing.JButton();
        BtnEntre = new javax.swing.JButton();
        BtnIgual = new javax.swing.JButton();
        BtnNum0 = new javax.swing.JButton();
        Vista = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        BtnPunto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("CALCULADORA");

        BtnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnBorrar.setText("C");
        BtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("2");
        jButton2.setPreferredSize(new java.awt.Dimension(48, 48));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setLabel("3");
        jButton3.setPreferredSize(new java.awt.Dimension(48, 48));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        BtnNum7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnNum7.setText("7");
        BtnNum7.setPreferredSize(new java.awt.Dimension(48, 48));
        BtnNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum7ActionPerformed(evt);
            }
        });

        BtnNum8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnNum8.setText("8");
        BtnNum8.setPreferredSize(new java.awt.Dimension(48, 48));
        BtnNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum8ActionPerformed(evt);
            }
        });

        BtnNum5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnNum5.setText("5");
        BtnNum5.setPreferredSize(new java.awt.Dimension(48, 48));
        BtnNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum5ActionPerformed(evt);
            }
        });

        BtnNum6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnNum6.setText("6");
        BtnNum6.setPreferredSize(new java.awt.Dimension(48, 48));
        BtnNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum6ActionPerformed(evt);
            }
        });

        BtnNum4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnNum4.setText("4");
        BtnNum4.setPreferredSize(new java.awt.Dimension(48, 48));
        BtnNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum4ActionPerformed(evt);
            }
        });

        BtnNum9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnNum9.setText("9");
        BtnNum9.setPreferredSize(new java.awt.Dimension(48, 48));
        BtnNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum9ActionPerformed(evt);
            }
        });

        BtnPor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnPor.setText("*");
        BtnPor.setMaximumSize(new java.awt.Dimension(48, 48));
        BtnPor.setMinimumSize(new java.awt.Dimension(48, 48));
        BtnPor.setPreferredSize(new java.awt.Dimension(48, 48));
        BtnPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPorActionPerformed(evt);
            }
        });

        BtnMenos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnMenos.setText("-");
        BtnMenos.setPreferredSize(new java.awt.Dimension(48, 48));
        BtnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenosActionPerformed(evt);
            }
        });

        Btnas.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Btnas.setText("+");
        Btnas.setPreferredSize(new java.awt.Dimension(48, 48));
        Btnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnasActionPerformed(evt);
            }
        });

        BtnEntre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnEntre.setText("/");
        BtnEntre.setPreferredSize(new java.awt.Dimension(48, 48));
        BtnEntre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEntreActionPerformed(evt);
            }
        });

        BtnIgual.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        BtnIgual.setText("=");
        BtnIgual.setPreferredSize(new java.awt.Dimension(48, 48));
        BtnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIgualActionPerformed(evt);
            }
        });

        BtnNum0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BtnNum0.setText("0");
        BtnNum0.setPreferredSize(new java.awt.Dimension(96, 48));
        BtnNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum0ActionPerformed(evt);
            }
        });

        Vista.setEditable(false);
        Vista.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Vista.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Vista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VistaActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("1");
        jButton4.setPreferredSize(new java.awt.Dimension(48, 48));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        BtnPunto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnPunto.setText(".");
        BtnPunto.setPreferredSize(new java.awt.Dimension(48, 48));
        BtnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPuntoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Vista, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(BtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BtnEntre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BtnPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BtnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(BtnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BtnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BtnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(BtnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BtnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BtnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Btnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(BtnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BtnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BtnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Vista, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEntre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Btnas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BtnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("CALCULADORA");
        BtnBorrar.getAccessibleContext().setAccessibleName("BtnNum1");
        jButton2.getAccessibleContext().setAccessibleName("BtnNum2");
        jButton3.getAccessibleContext().setAccessibleName("BtnNum3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIgualActionPerformed
        this.num2= Float.parseFloat(this.Vista.getText());
        
        switch (this.oper) {
            case "+":
                this.Vista.setText(Float.toString(this.num1+this.num2));
                break;
            case "-":
                this.Vista.setText(Float.toString(this.num1-this.num2));
                break;
            case "*":
                this.Vista.setText(Float.toString(this.num1*this.num2));
                break;
            case "/":
                this.Vista.setText(Float.toString(this.num1/this.num2));
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_BtnIgualActionPerformed

    private void BtnNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum5ActionPerformed
        this.Vista.setText(this.Vista.getText()+"5");
    }//GEN-LAST:event_BtnNum5ActionPerformed

    private void BtnNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum6ActionPerformed
      this.Vista.setText(this.Vista.getText()+"6");
    }//GEN-LAST:event_BtnNum6ActionPerformed

    private void VistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VistaActionPerformed
       
    }//GEN-LAST:event_VistaActionPerformed

    private void BtnNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum0ActionPerformed
        this.Vista.setText(this.Vista.getText()+"0");
    }//GEN-LAST:event_BtnNum0ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       this.Vista.setText((this.Vista.getText()+"1"));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.Vista.setText(this.Vista.getText()+"2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.Vista.setText(this.Vista.getText()+"3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BtnNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum4ActionPerformed
       this.Vista.setText(this.Vista.getText()+"4");
    }//GEN-LAST:event_BtnNum4ActionPerformed

    private void BtnNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum9ActionPerformed
        this.Vista.setText(this.Vista.getText()+"9");
    }//GEN-LAST:event_BtnNum9ActionPerformed

    private void BtnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum8ActionPerformed
        this.Vista.setText(this.Vista.getText()+"8");
    }//GEN-LAST:event_BtnNum8ActionPerformed

    private void BtnNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum7ActionPerformed
        this.Vista.setText(this.Vista.getText()+"7");
    }//GEN-LAST:event_BtnNum7ActionPerformed

    private void BtnEntreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEntreActionPerformed
        this.num1=Float.parseFloat(this.Vista.getText());
        this.oper="/";
        this.Vista.setText("");
    }//GEN-LAST:event_BtnEntreActionPerformed

    private void BtnPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPorActionPerformed
        this.num1=Float.parseFloat(this.Vista.getText());
        this.oper="*";
        this.Vista.setText("");
    }//GEN-LAST:event_BtnPorActionPerformed

    private void BtnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenosActionPerformed
        this.num1=Float.parseFloat(this.Vista.getText());
        this.oper="-";
        this.Vista.setText("");        
    }//GEN-LAST:event_BtnMenosActionPerformed

    private void BtnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnasActionPerformed
       this.num1=Float.parseFloat(this.Vista.getText());
       this.oper="+";
       this.Vista.setText("");      
    }//GEN-LAST:event_BtnasActionPerformed

    private void BtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarActionPerformed
        this.Vista.setText("");
    }//GEN-LAST:event_BtnBorrarActionPerformed

    private void BtnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPuntoActionPerformed
        this.Vista.setText(this.Vista.getText()+".");
    }//GEN-LAST:event_BtnPuntoActionPerformed

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
            java.util.logging.Logger.getLogger(calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JButton BtnEntre;
    private javax.swing.JButton BtnIgual;
    private javax.swing.JButton BtnMenos;
    private javax.swing.JButton BtnNum0;
    private javax.swing.JButton BtnNum4;
    private javax.swing.JButton BtnNum5;
    private javax.swing.JButton BtnNum6;
    private javax.swing.JButton BtnNum7;
    private javax.swing.JButton BtnNum8;
    private javax.swing.JButton BtnNum9;
    private javax.swing.JButton BtnPor;
    private javax.swing.JButton BtnPunto;
    private javax.swing.JButton Btnas;
    private javax.swing.JTextField Vista;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
