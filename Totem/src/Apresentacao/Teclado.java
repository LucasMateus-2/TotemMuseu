/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Apresentacao;

import Modelos.Estaticos;

/**
 *
 * @author isaco
 */
public class Teclado extends javax.swing.JDialog {

    /**
     * Creates new form Teclado
     */
    public Teclado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jButton3 = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        brnG = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        btnEspaco = new javax.swing.JButton();
        txfTeclado = new javax.swing.JTextField();

        jButton3.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnQ.setText("Q");
        btnQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQActionPerformed(evt);
            }
        });
        getContentPane().add(btnQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 50, 50));

        btnW.setText("W");
        btnW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWActionPerformed(evt);
            }
        });
        getContentPane().add(btnW, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 50, 50));

        btnU.setText("U");
        btnU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUActionPerformed(evt);
            }
        });
        getContentPane().add(btnU, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 50, 50));

        btnI.setText("I");
        btnI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIActionPerformed(evt);
            }
        });
        getContentPane().add(btnI, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 50, 50));

        btnO.setText("O");
        btnO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOActionPerformed(evt);
            }
        });
        getContentPane().add(btnO, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 50, 50));

        btnP.setText("P");
        btnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPActionPerformed(evt);
            }
        });
        getContentPane().add(btnP, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 50, 50));

        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 100, 130));

        btnA.setText("A");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });
        getContentPane().add(btnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 50, 50));

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 86, 45));

        btnS.setText("S");
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });
        getContentPane().add(btnS, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 50, 50));

        btnD.setText("D");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        getContentPane().add(btnD, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 50, 50));

        btnF.setText("F");
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });
        getContentPane().add(btnF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 50, 50));

        brnG.setText("G");
        brnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnGActionPerformed(evt);
            }
        });
        getContentPane().add(brnG, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 50, 50));

        btnH.setText("H");
        btnH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHActionPerformed(evt);
            }
        });
        getContentPane().add(btnH, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 50, 50));

        btnJ.setText("J");
        btnJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJActionPerformed(evt);
            }
        });
        getContentPane().add(btnJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 50, 50));

        btnK.setText("K");
        btnK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKActionPerformed(evt);
            }
        });
        getContentPane().add(btnK, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 50, 50));

        btnL.setText("L");
        btnL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLActionPerformed(evt);
            }
        });
        getContentPane().add(btnL, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 50, 50));

        btnZ.setText("Z");
        btnZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZActionPerformed(evt);
            }
        });
        getContentPane().add(btnZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 50, 50));

        btnX.setText("X");
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });
        getContentPane().add(btnX, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 50, 50));

        btnN.setText("N");
        btnN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNActionPerformed(evt);
            }
        });
        getContentPane().add(btnN, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 50, 50));

        btnV.setText("V");
        btnV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVActionPerformed(evt);
            }
        });
        getContentPane().add(btnV, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 50, 50));

        btnB.setText("B");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });
        getContentPane().add(btnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 50, 50));

        btnE.setText("E");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });
        getContentPane().add(btnE, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 50, 50));

        btnR.setText("R");
        btnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRActionPerformed(evt);
            }
        });
        getContentPane().add(btnR, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 50, 50));

        btnT.setText("T");
        btnT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTActionPerformed(evt);
            }
        });
        getContentPane().add(btnT, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 50, 50));

        btnY.setText("Y");
        btnY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYActionPerformed(evt);
            }
        });
        getContentPane().add(btnY, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 50, 50));

        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        getContentPane().add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 50, 50));

        jButton45.setText("M");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 50, 50));

        btnEspaco.setText("Espaço");
        btnEspaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspacoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEspaco, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 280, 34));

        txfTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfTecladoActionPerformed(evt);
            }
        });
        getContentPane().add(txfTeclado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 500, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "R");
    }//GEN-LAST:event_btnRActionPerformed

    private void btnYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "Y");
    }//GEN-LAST:event_btnYActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "F");
    }//GEN-LAST:event_btnFActionPerformed

    private void btnQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "Q");
    }//GEN-LAST:event_btnQActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "E");
    }//GEN-LAST:event_btnEActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "D");
    }//GEN-LAST:event_btnDActionPerformed

    private void btnZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "Z");
    }//GEN-LAST:event_btnZActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "X");
    }//GEN-LAST:event_btnXActionPerformed

    private void btnWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "W");
    }//GEN-LAST:event_btnWActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "A");
    }//GEN-LAST:event_btnAActionPerformed

    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "S");
    }//GEN-LAST:event_btnSActionPerformed

    private void btnTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "T");
    }//GEN-LAST:event_btnTActionPerformed

    private void brnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnGActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "G");
    }//GEN-LAST:event_brnGActionPerformed

    private void btnVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "V");
    }//GEN-LAST:event_btnVActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "B");
    }//GEN-LAST:event_btnBActionPerformed

    private void btnHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "H");
    }//GEN-LAST:event_btnHActionPerformed

    private void btnNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "N");
    }//GEN-LAST:event_btnNActionPerformed

    private void btnUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "U");
    }//GEN-LAST:event_btnUActionPerformed

    private void btnJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "J");
    }//GEN-LAST:event_btnJActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "M");
    }//GEN-LAST:event_jButton45ActionPerformed

    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "I");
    }//GEN-LAST:event_btnIActionPerformed

    private void btnKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "K");
    }//GEN-LAST:event_btnKActionPerformed

    private void btnOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "O");
    }//GEN-LAST:event_btnOActionPerformed

    private void btnLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "L");
    }//GEN-LAST:event_btnLActionPerformed

    private void btnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "P");
    }//GEN-LAST:event_btnPActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txfTeclado.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEspacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspacoActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ " ");
    }//GEN-LAST:event_btnEspacoActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        txfTeclado.setText(txfTeclado.getText()+ "C");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        Estaticos.TEXTO = txfTeclado.getText();
        this.dispose();
    }//GEN-LAST:event_btnEnterActionPerformed

    private void txfTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfTecladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfTecladoActionPerformed

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
            java.util.logging.Logger.getLogger(Teclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Teclado dialog = new Teclado(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnG;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnEspaco;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnZ;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton45;
    private javax.swing.JTextField txfTeclado;
    // End of variables declaration//GEN-END:variables
}
