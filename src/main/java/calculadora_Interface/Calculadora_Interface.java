package calculadora_Interface;

public class Calculadora_Interface extends javax.swing.JFrame {
double n1, n2, resultado;
        char operador;
 
    public Calculadora_Interface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Button08 = new javax.swing.JButton();
        Button09 = new javax.swing.JButton();
        ButtonAtras = new javax.swing.JButton();
        ButtonBorrar = new javax.swing.JButton();
        Button07 = new javax.swing.JButton();
        Button04 = new javax.swing.JButton();
        Button05 = new javax.swing.JButton();
        Button06 = new javax.swing.JButton();
        ButtonMult = new javax.swing.JButton();
        ButtonDiv = new javax.swing.JButton();
        Button01 = new javax.swing.JButton();
        Button02 = new javax.swing.JButton();
        Button03 = new javax.swing.JButton();
        ButtonMas = new javax.swing.JButton();
        ButtonMin = new javax.swing.JButton();
        ButtonIgual = new javax.swing.JButton();
        Button00 = new javax.swing.JButton();
        Pantalla = new javax.swing.JTextField();
        ButtonPunto = new javax.swing.JButton();
        ButtonPot = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Button08.setText("8");
        Button08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button08ActionPerformed(evt);
            }
        });

        Button09.setText("9");
        Button09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button09ActionPerformed(evt);
            }
        });

        ButtonAtras.setText("<-");
        ButtonAtras.setActionCommand("< -");
        ButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAtrasActionPerformed(evt);
            }
        });

        ButtonBorrar.setText("C");
        ButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBorrarActionPerformed(evt);
            }
        });

        Button07.setText("7");
        Button07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button07ActionPerformed(evt);
            }
        });

        Button04.setText("4");
        Button04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button04ActionPerformed(evt);
            }
        });

        Button05.setText("5");
        Button05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button05ActionPerformed(evt);
            }
        });

        Button06.setText("6");
        Button06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button06ActionPerformed(evt);
            }
        });

        ButtonMult.setText("*");
        ButtonMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMultActionPerformed(evt);
            }
        });

        ButtonDiv.setText("/");
        ButtonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDivActionPerformed(evt);
            }
        });

        Button01.setText("1");
        Button01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button01ActionPerformed(evt);
            }
        });

        Button02.setText("2");
        Button02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button02ActionPerformed(evt);
            }
        });

        Button03.setText("3");
        Button03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button03ActionPerformed(evt);
            }
        });

        ButtonMas.setText("+");
        ButtonMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMasActionPerformed(evt);
            }
        });

        ButtonMin.setText("-");
        ButtonMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMinActionPerformed(evt);
            }
        });

        ButtonIgual.setText("=");
        ButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIgualActionPerformed(evt);
            }
        });

        Button00.setText("0");
        Button00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button00ActionPerformed(evt);
            }
        });

        Pantalla.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        Pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PantallaActionPerformed(evt);
            }
        });

        ButtonPunto.setText(".");
        ButtonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPuntoActionPerformed(evt);
            }
        });

        ButtonPot.setText("^");
        ButtonPot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pantalla)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Button04, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Button05, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Button06, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonMult, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Button07, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Button08, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Button09, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Button01, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button02, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button03, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Button00, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonMas, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(ButtonPot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonMin, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button08, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button09, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button07, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button05, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button06, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonMult, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button04, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button02, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button03, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonMas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonMin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button01, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonPot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button00, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtonPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
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

    private void Button08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button08ActionPerformed

        Pantalla.setText(Pantalla.getText()+'8');       
    }//GEN-LAST:event_Button08ActionPerformed

    private void Button09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button09ActionPerformed

        Pantalla.setText(Pantalla.getText()+'9');       
    }//GEN-LAST:event_Button09ActionPerformed

    private void ButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAtrasActionPerformed

        if (Pantalla.getText().length()>0){
            Pantalla.setText(Pantalla.getText().substring(0,Pantalla.getText().length()-1));
        }
    }//GEN-LAST:event_ButtonAtrasActionPerformed

    private void ButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBorrarActionPerformed

        Pantalla.setText("");
    }//GEN-LAST:event_ButtonBorrarActionPerformed

    private void Button07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button07ActionPerformed

        Pantalla.setText(Pantalla.getText()+'7');       
    }//GEN-LAST:event_Button07ActionPerformed

    private void Button04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button04ActionPerformed

        Pantalla.setText(Pantalla.getText()+'4');       
    }//GEN-LAST:event_Button04ActionPerformed

    private void Button05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button05ActionPerformed

        Pantalla.setText(Pantalla.getText()+'5');       
    }//GEN-LAST:event_Button05ActionPerformed

    private void Button06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button06ActionPerformed

        Pantalla.setText(Pantalla.getText()+'6');       
    }//GEN-LAST:event_Button06ActionPerformed

    private void ButtonMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMultActionPerformed

        if (Pantalla.getText().length()>0){
            n1=Double.parseDouble(Pantalla.getText());
            operador = '*';
            Pantalla.setText("");
        }
    }//GEN-LAST:event_ButtonMultActionPerformed

    private void ButtonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDivActionPerformed

        if (Pantalla.getText().length()>0){
            n1=Double.parseDouble(Pantalla.getText());
            operador = '/';
            Pantalla.setText("");
        }
    }//GEN-LAST:event_ButtonDivActionPerformed

    private void Button01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button01ActionPerformed

        Pantalla.setText(Pantalla.getText()+'1');       
    }//GEN-LAST:event_Button01ActionPerformed

    private void Button02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button02ActionPerformed

        Pantalla.setText(Pantalla.getText()+'2');       
    }//GEN-LAST:event_Button02ActionPerformed

    private void Button03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button03ActionPerformed

        Pantalla.setText(Pantalla.getText()+'3');       
    }//GEN-LAST:event_Button03ActionPerformed

    private void ButtonMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMasActionPerformed

        if (Pantalla.getText().length()>0){
            n1=Double.parseDouble(Pantalla.getText());
            operador = '+';
            Pantalla.setText("");
        }
    }//GEN-LAST:event_ButtonMasActionPerformed

    private void ButtonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMinActionPerformed

        if (Pantalla.getText().length()>0){
            n1=Double.parseDouble(Pantalla.getText());
            operador = '-';
            Pantalla.setText("");
        }
    }//GEN-LAST:event_ButtonMinActionPerformed

    private void ButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIgualActionPerformed
       if (Pantalla.getText().length()>0){
            n2 = Double.parseDouble(Pantalla.getText());
            switch(operador){
                case'+':
                    Suma sum = new Suma(n1,n2);
                    Pantalla.setText(Double.toString(sum.res));
                    break;
                case'-':
                    Resta rest = new Resta(n1,n2);
                    Pantalla.setText(Double.toString(rest.res));
                    break;
                case'*':
                    Multiplicacion mul = new Multiplicacion(n1,n2);
                    Pantalla.setText(Double.toString(mul.res));
                    break;
                case'/':
                    Division div = new Division(n1,n2);
                    Pantalla.setText(Double.toString(div.res));
                    break; 
                case'^':
                    Potencia pot = new Potencia(n1,n2);
                    Pantalla.setText(Double.toString(pot.res));
                    break;     
            }
        }
    }//GEN-LAST:event_ButtonIgualActionPerformed

    private void Button00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button00ActionPerformed
       
       Pantalla.setText(Pantalla.getText()+'0');       
    }//GEN-LAST:event_Button00ActionPerformed

    private void ButtonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPuntoActionPerformed

        boolean hayPunto = false;
        for (int i = 0; i < Pantalla.getText().length() ; i++) {
          if(Pantalla.getText().charAt(i)== '.') {
              hayPunto=true;
              break;
          }
        }
        if (!hayPunto){
            Pantalla.setText(Pantalla.getText()+'.');
        }
    }//GEN-LAST:event_ButtonPuntoActionPerformed

    private void PantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PantallaActionPerformed

    }//GEN-LAST:event_PantallaActionPerformed

    private void ButtonPotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPotActionPerformed

        if (Pantalla.getText().length()>0){
            n1=Double.parseDouble(Pantalla.getText());
            operador = '^';
            Pantalla.setText("");
        }
        
    }//GEN-LAST:event_ButtonPotActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora_Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button00;
    private javax.swing.JButton Button01;
    private javax.swing.JButton Button02;
    private javax.swing.JButton Button03;
    private javax.swing.JButton Button04;
    private javax.swing.JButton Button05;
    private javax.swing.JButton Button06;
    private javax.swing.JButton Button07;
    private javax.swing.JButton Button08;
    private javax.swing.JButton Button09;
    private javax.swing.JButton ButtonAtras;
    private javax.swing.JButton ButtonBorrar;
    private javax.swing.JButton ButtonDiv;
    private javax.swing.JButton ButtonIgual;
    private javax.swing.JButton ButtonMas;
    private javax.swing.JButton ButtonMin;
    private javax.swing.JButton ButtonMult;
    private javax.swing.JButton ButtonPot;
    private javax.swing.JButton ButtonPunto;
    private javax.swing.JTextField Pantalla;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
