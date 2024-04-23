package GUI;

//Nina Krisna Maulida
//21110614

import java.awt.Color;
import javax.swing.JFrame;
public class Kalkulator extends javax.swing.JFrame {

    String angka;
    double total, angka1, angka2;
    int pilih;
    public Kalkulator() {
        initComponents();
        angka = "";
        
        setTitle("CALCULATOR");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        Btn0 .setBackground(Color.LIGHT_GRAY);
        Btn1 .setBackground(Color.LIGHT_GRAY);
        Btn2 .setBackground(Color.LIGHT_GRAY);
        Btn3 .setBackground(Color.LIGHT_GRAY);
        Btn4 .setBackground(Color.LIGHT_GRAY);
        Btn5 .setBackground(Color.LIGHT_GRAY);
        Btn6 .setBackground(Color.LIGHT_GRAY);
        Btn7 .setBackground(Color.LIGHT_GRAY);
        Btn8 .setBackground(Color.LIGHT_GRAY);
        Btn9 .setBackground(Color.LIGHT_GRAY);
        BtnHapus .setBackground(Color.cyan);
        BtnTambah .setBackground(Color.CYAN);
        BtnKurang .setBackground(Color.cyan);
        BtnKali .setBackground(Color.cyan);
        BtnBagi .setBackground(Color.cyan);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        Display = new javax.swing.JTextField();
        Btn1 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn0 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        BtnSamaDengan = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        BtnBagi = new javax.swing.JButton();
        BtnTambah = new javax.swing.JButton();
        BtnKurang = new javax.swing.JButton();
        BtnKali = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Btn1.setText("1");
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });

        Btn4.setText("4");
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });

        Btn7.setText("7");
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });

        Btn0.setText("0");
        Btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn0ActionPerformed(evt);
            }
        });

        Btn2.setText("2");
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });

        Btn6.setText("6");
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });

        Btn5.setText("5");
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });

        Btn8.setText("8");
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });

        Btn3.setText("3");
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });

        BtnHapus.setText("C");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });

        BtnSamaDengan.setText("=");
        BtnSamaDengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSamaDenganActionPerformed(evt);
            }
        });

        Btn9.setText("9");
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });

        BtnBagi.setText("/");
        BtnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBagiActionPerformed(evt);
            }
        });

        BtnTambah.setText("+");
        BtnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahActionPerformed(evt);
            }
        });

        BtnKurang.setText("-");
        BtnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKurangActionPerformed(evt);
            }
        });

        BtnKali.setText("*");
        BtnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BtnSamaDengan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnKali, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Display))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnKali, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSamaDengan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        angka+= "7";
        Display.setText(angka);
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        angka+= "6";
        Display.setText(angka);
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        angka+= "3";
        Display.setText(angka);
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        angka+= "5";
        Display.setText(angka);
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        angka+= "8";
        Display.setText(angka);
    }//GEN-LAST:event_Btn8ActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        Display.setText("");
        angka1 = 0;
        angka2 = 0;
        total = 0;
        angka = "";
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void BtnSamaDenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSamaDenganActionPerformed
        switch(pilih) {
            case 1:
                angka2 = Double.parseDouble(angka);
                total = angka1+angka2;
                angka = Double.toString(total);
                Display.setText(angka);
                break;
            case 2:
                angka2 = Double.parseDouble(angka);
                total = angka1-angka2;
                angka = Double.toString(total);
                Display.setText(angka);
                break;
            case 3:
                angka2 = Double.parseDouble(angka);
                total = angka1*angka2;
                angka = Double.toString(total);
                Display.setText(angka);
                break;
            case 4:
                angka2 = Double.parseDouble(angka);
                total = angka1/angka2;
                angka = Double.toString(total);
                Display.setText(angka);
                break;
        }
    }//GEN-LAST:event_BtnSamaDenganActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        angka+= "9";
        Display.setText(angka);
    }//GEN-LAST:event_Btn9ActionPerformed

    private void BtnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBagiActionPerformed
        angka1 = Double.parseDouble(angka);
        Display.setText("/");
        angka = "";
        pilih = 4;
    }//GEN-LAST:event_BtnBagiActionPerformed

    private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
        angka1 = Double.parseDouble(angka);
        Display.setText("+");
        angka = "";
        pilih = 1;
    }//GEN-LAST:event_BtnTambahActionPerformed

    private void BtnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKurangActionPerformed
        angka1 = Double.parseDouble(angka);
        Display.setText("-");
        angka = "";
        pilih = 2;
    }//GEN-LAST:event_BtnKurangActionPerformed

    private void BtnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKaliActionPerformed
        angka1 = Double.parseDouble(angka);
        Display.setText("*");
        angka = "";
        pilih = 3;
    }//GEN-LAST:event_BtnKaliActionPerformed

    private void Btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn0ActionPerformed
        angka+= "0";
        Display.setText(angka);
    }//GEN-LAST:event_Btn0ActionPerformed

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        angka+= "1";
        Display.setText(angka);
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        angka+= "2";
        Display.setText(angka);
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        angka+= "4";
        Display.setText(angka);
    }//GEN-LAST:event_Btn4ActionPerformed

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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn0;
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton BtnBagi;
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnKali;
    private javax.swing.JButton BtnKurang;
    private javax.swing.JButton BtnSamaDengan;
    private javax.swing.JButton BtnTambah;
    private javax.swing.JTextField Display;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
