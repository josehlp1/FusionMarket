package FusionMarket.VIEW;

import FusionMarket.POJO.Usuario_POJO;
import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class ConfirmarDados_VIEW extends javax.swing.JInternalFrame 
{

    public ConfirmarDados_VIEW(Usuario_POJO up) 
    {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi =(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        LNome.setText(up.getNome());
        LEmail.setText(up.getEmail());
        LCpf.setText(up.getCpf());
        LEndereco.setText(up.getEndereco());
        
        LCartao.setOpaque(false);
        LCartao.setBackground(new Color(255,0,0,60));
        
        LBoleto.setOpaque(false);
        LBoleto.setBackground(new Color(255, 0, 0, 60));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LNome = new javax.swing.JLabel();
        LEmail = new javax.swing.JLabel();
        LCpf = new javax.swing.JLabel();
        LEndereco = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LCartao = new javax.swing.JLabel();
        LBoleto = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(950, 550));
        setMinimumSize(new java.awt.Dimension(950, 550));
        setPreferredSize(new java.awt.Dimension(950, 550));
        getContentPane().setLayout(null);
        getContentPane().add(LNome);
        LNome.setBounds(510, 140, 400, 40);
        getContentPane().add(LEmail);
        LEmail.setBounds(508, 217, 400, 40);
        getContentPane().add(LCpf);
        LCpf.setBounds(512, 294, 400, 40);
        getContentPane().add(LEndereco);
        LEndereco.setBounds(513, 370, 400, 40);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(14, 14, 80, 60);

        LCartao.setBackground(new java.awt.Color(255, 0, 0));
        LCartao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LCartaoMouseClicked(evt);
            }
        });
        getContentPane().add(LCartao);
        LCartao.setBounds(93, 186, 169, 50);

        LBoleto.setBackground(new java.awt.Color(255, 0, 0));
        LBoleto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBoletoMouseClicked(evt);
            }
        });
        getContentPane().add(LBoleto);
        LBoleto.setBounds(93, 303, 169, 51);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "   1", "   2", "   3", "   4", "   5", "   6", "   8", "   9 ", "  10" }));
        jComboBox1.setBorder(null);
        jComboBox1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(237, 412, 50, 38);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painel_ConfirmarDados_VIEW.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 950, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        this.dispose();
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void LCartaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LCartaoMouseClicked
        
        LCartao.setOpaque(true);
        
    }//GEN-LAST:event_LCartaoMouseClicked

    private void LBoletoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBoletoMouseClicked
        
        LBoleto.setOpaque(true);
        
    }//GEN-LAST:event_LBoletoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBoleto;
    private javax.swing.JLabel LCartao;
    private javax.swing.JLabel LCpf;
    private javax.swing.JLabel LEmail;
    private javax.swing.JLabel LEndereco;
    private javax.swing.JLabel LNome;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}