package Apresentacao;

import Modelos.AdicionaDados;
import java.awt.event.KeyEvent;

public class frmComecar extends javax.swing.JDialog {

    public frmComecar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        /*this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(true);
        this.*/
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnMapa = new javax.swing.JButton();
        btnQuestionário = new javax.swing.JButton();
        btnExposição = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnDadosAps = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bem Vindo a Marte!");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 64, 59));
        setPreferredSize(new java.awt.Dimension(1366, 736));
        setSize(new java.awt.Dimension(1366, 768));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 64, 59));
        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 768));

        btnMapa.setBackground(new java.awt.Color(255, 255, 255));
        btnMapa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnMapa.setForeground(new java.awt.Color(0, 0, 0));
        btnMapa.setIcon(new javax.swing.ImageIcon("/home/lucasmateus/Imagens/mapaIcon157.png")); // NOI18N
        btnMapa.setText("           MAPA");
        btnMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMapaActionPerformed(evt);
            }
        });

        btnQuestionário.setBackground(new java.awt.Color(255, 255, 255));
        btnQuestionário.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnQuestionário.setForeground(new java.awt.Color(0, 0, 0));
        btnQuestionário.setIcon(new javax.swing.ImageIcon("/home/lucasmateus/Imagens/Questinário127X127.png")); // NOI18N
        btnQuestionário.setText("QUESTIONÁRIO");
        btnQuestionário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuestionárioActionPerformed(evt);
            }
        });

        btnExposição.setBackground(new java.awt.Color(255, 255, 255));
        btnExposição.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnExposição.setForeground(new java.awt.Color(0, 0, 0));
        btnExposição.setIcon(new javax.swing.ImageIcon("/home/lucasmateus/Imagens/mars127x127.png")); // NOI18N
        btnExposição.setText("    EXPOSIÇÃO");
        btnExposição.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExposiçãoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BEM VINDO AO MUSEU!");

        btnDadosAps.setBackground(new java.awt.Color(255, 255, 225));
        btnDadosAps.setForeground(new java.awt.Color(0, 0, 0));
        btnDadosAps.setText("Inserir Dados para Aps");
        btnDadosAps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadosApsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(534, 534, 534)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnExposição)
                            .addComponent(btnQuestionário)
                            .addComponent(btnMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(419, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDadosAps)
                .addGap(25, 25, 25))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnExposição, btnMapa, btnQuestionário});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(btnMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnQuestionário)
                .addGap(27, 27, 27)
                .addComponent(btnExposição)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(btnDadosAps, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnExposição, btnMapa, btnQuestionário});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1387, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuestionárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuestionárioActionPerformed
        this.dispose();
        frmPrincipal frmP = new frmPrincipal(null, true);
        frmP.setVisible(true);
    }//GEN-LAST:event_btnQuestionárioActionPerformed

    private void btnMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMapaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frmMapa mapa = new frmMapa(null, true);
        mapa.setVisible(true);
    }//GEN-LAST:event_btnMapaActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
        
    }//GEN-LAST:event_formKeyPressed

    private void btnExposiçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExposiçãoActionPerformed
       this.dispose();
       frmExposicoes Expo = new frmExposicoes();
       Expo.setVisible(true);
    }//GEN-LAST:event_btnExposiçãoActionPerformed

    private void btnDadosApsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadosApsActionPerformed
       String Nome ="Alice";
       String Questao1 ="SIM";
       String Questao2 ="NAO";
       String Questao3 ="a";
       String Questao4 ="b";
       String Questao5 ="c";
       AdicionaDados pessoa1= new AdicionaDados(Nome, Questao1, Questao2, Questao3, Questao4, Questao5);
      

       Nome ="Bob";
       Questao1 ="NAO";
       Questao2 ="SIM";
       Questao3 ="a";
       Questao4 ="c";
       Questao5 ="b";
       
       AdicionaDados pessoa2= new AdicionaDados(Nome, Questao1, Questao2, Questao3, Questao4, Questao5);
       
       Nome ="Carlos";
       Questao1 ="SIM";
       Questao2 ="NAO";
       Questao3 ="a";
       Questao4 ="b";
       Questao5 ="c";
       
       AdicionaDados pessoa3= new AdicionaDados(Nome, Questao1, Questao2, Questao3, Questao4, Questao5);
    }//GEN-LAST:event_btnDadosApsActionPerformed

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
            java.util.logging.Logger.getLogger(frmComecar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmComecar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmComecar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmComecar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmComecar dialog = new frmComecar(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnDadosAps;
    private javax.swing.JButton btnExposição;
    private javax.swing.JButton btnMapa;
    private javax.swing.JButton btnQuestionário;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
