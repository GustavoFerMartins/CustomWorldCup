/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

/**
 *
 * @author Gustavo
 */
public class SimulacaoNaoOficial extends javax.swing.JInternalFrame {

    /**
     * Creates new form SimulacaoNaoOficial
     */
    public SimulacaoNaoOficial() {
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

        jLabel1 = new javax.swing.JLabel();
        criarGruposManualmente = new botao.botao();
        criarGruposAleatorios = new botao.botao();
        jLabel2 = new javax.swing.JLabel();
        simularGrupos = new botao.botao();
        simularPartidas = new botao.botao();
        sair = new botao.botao();
        botao1 = new botao.botao();

        setBackground(new java.awt.Color(51, 51, 51));
        setClosable(true);
        setIconifiable(true);
        setTitle("Simulação Não Oficial");

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Ubuntu Mono", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/world-cup.png"))); // NOI18N
        jLabel1.setText("Simular Grupos Copa 2022");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        criarGruposManualmente.setForeground(new java.awt.Color(255, 255, 255));
        criarGruposManualmente.setText("Criar Grupos Manualmente");
        criarGruposManualmente.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        criarGruposManualmente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarGruposManualmenteActionPerformed(evt);
            }
        });

        criarGruposAleatorios.setForeground(new java.awt.Color(255, 255, 255));
        criarGruposAleatorios.setText("Criar Grupos Aleatóriamente");
        criarGruposAleatorios.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        criarGruposAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarGruposAleatoriosActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Ubuntu Mono", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Simular Partidas");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        simularGrupos.setForeground(new java.awt.Color(255, 255, 255));
        simularGrupos.setText("Simular Resultados Grupos");
        simularGrupos.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        simularGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simularGruposActionPerformed(evt);
            }
        });

        simularPartidas.setForeground(new java.awt.Color(255, 255, 255));
        simularPartidas.setText("Simular Partidas Eliminatórias");
        simularPartidas.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        simularPartidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simularPartidasActionPerformed(evt);
            }
        });

        sair.setForeground(new java.awt.Color(255, 255, 255));
        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        sair.setText("SAIR");
        sair.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        botao1.setBackground(new java.awt.Color(51, 51, 51));
        botao1.setForeground(new java.awt.Color(255, 0, 0));
        botao1.setText("MANUAL PARA JOGAR");
        botao1.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(162, 162, 162))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(criarGruposManualmente, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(criarGruposAleatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(simularGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(simularPartidas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(criarGruposManualmente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(criarGruposAleatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(jLabel2)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simularGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simularPartidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sair, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(botao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simularPartidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simularPartidasActionPerformed
        SimularPartidasNaoOficial simulacao = new SimularPartidasNaoOficial();
        simulacao.setVisible(true);
    }//GEN-LAST:event_simularPartidasActionPerformed

    private void simularGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simularGruposActionPerformed
        SimularGruposNaoOficias simularg = new SimularGruposNaoOficias();
        simularg.setVisible(true);
    }//GEN-LAST:event_simularGruposActionPerformed

    private void criarGruposAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarGruposAleatoriosActionPerformed
        CriarGruposAleatorios novoGrupoAleatorio = new CriarGruposAleatorios();
        novoGrupoAleatorio.setVisible(true);

    }//GEN-LAST:event_criarGruposAleatoriosActionPerformed

    private void criarGruposManualmenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarGruposManualmenteActionPerformed
        CriarGruposManual novoGrupoManual = new CriarGruposManual();
        novoGrupoManual.setVisible(true);
    }//GEN-LAST:event_criarGruposManualmenteActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private botao.botao botao1;
    private botao.botao criarGruposAleatorios;
    private botao.botao criarGruposManualmente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private botao.botao sair;
    private botao.botao simularGrupos;
    private botao.botao simularPartidas;
    // End of variables declaration//GEN-END:variables
}
