package FusionMarket.VIEW;

public class AdicionarProduto_VIEW extends javax.swing.JInternalFrame 
{

    public AdicionarProduto_VIEW() 
    {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JLabel();
        Publicar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PainelAdicionarProduto = new javax.swing.JLabel();

        setBorder(null);
        setMaximumSize(new java.awt.Dimension(966, 580));
        setMinimumSize(new java.awt.Dimension(966, 580));
        setPreferredSize(new java.awt.Dimension(966, 580));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_Voltar.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(22, 20, 60, 60);

        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_Cancelar.png"))); // NOI18N
        Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelarMouseClicked(evt);
            }
        });
        getContentPane().add(Cancelar);
        Cancelar.setBounds(750, 362, 160, 50);

        Publicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_Publicar.png"))); // NOI18N
        Publicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PublicarMouseClicked(evt);
            }
        });
        getContentPane().add(Publicar);
        Publicar.setBounds(750, 470, 160, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_AdicionarImagem.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(750, 150, 160, 160);

        PainelAdicionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Paine_AdicionarProduto.png"))); // NOI18N
        getContentPane().add(PainelAdicionarProduto);
        PainelAdicionarProduto.setBounds(0, 0, 950, 550);

        setBounds(-1, -22, 966, 580);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_CancelarMouseClicked

    private void PublicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PublicarMouseClicked
        //Colocar codigo para salvar dados no banco de dados
    }//GEN-LAST:event_PublicarMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // Colocar opção pro usuario colocar imagem
    }//GEN-LAST:event_jLabel1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cancelar;
    private javax.swing.JLabel PainelAdicionarProduto;
    private javax.swing.JLabel Publicar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
