package classes;

import javax.swing.JOptionPane;

public class TelaInicial extends javax.swing.JFrame {     
    Jogo jogo;
    Creditos credito;
    Classificacao clas;
    
    Conexao conn;
    JDBCNomes listar;
    TelaInicial inicio;
    
    public TelaInicial() {
        super("Tela Inicial");
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        
        conn = new Conexao();
        listar = new JDBCNomes(conn.openConnection());
        
        playHumano.addActionListener(e -> {   
            JOptionPane.showMessageDialog(this, "PLAYER 1 vs. PLAYER 2");
            abrirTelaJogo(true);       
        });
        
        playPC.addActionListener(e -> {     
            JOptionPane.showMessageDialog(this, "PLAYER 1 vs. PLAYER PC");
            abrirTelaJogo(false);   
        });
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img2 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        playHumano = new javax.swing.JButton();
        playPC = new javax.swing.JButton();
        classificacao = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bola = new javax.swing.JLabel();
        xis = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        creditos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        img2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if-2.png"))); // NOI18N
        img2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        img2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        title.setFont(new java.awt.Font("Pixeloid Sans", 1, 100)); // NOI18N
        title.setForeground(new java.awt.Color(0, 153, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("TIC TAC TOE");

        playHumano.setFont(new java.awt.Font("Pixeloid Sans", 1, 60)); // NOI18N
        playHumano.setForeground(new java.awt.Color(51, 153, 0));
        playHumano.setText("PLAYER 1 x PLAYER 2");
        playHumano.setBorder(null);
        playHumano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playHumano.setFocusPainted(false);
        playHumano.setFocusable(false);
        playHumano.setRequestFocusEnabled(false);
        playHumano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                playHumanoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                playHumanoMouseExited(evt);
            }
        });
        playHumano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playHumano(evt);
            }
        });

        playPC.setFont(new java.awt.Font("Pixeloid Sans", 1, 60)); // NOI18N
        playPC.setForeground(new java.awt.Color(51, 153, 0));
        playPC.setText("PLAYER x PC");
        playPC.setBorder(null);
        playPC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playPC.setFocusPainted(false);
        playPC.setFocusable(false);
        playPC.setRequestFocusEnabled(false);
        playPC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                playPCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                playPCMouseExited(evt);
            }
        });
        playPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playPC(evt);
            }
        });

        classificacao.setFont(new java.awt.Font("Pixeloid Sans", 1, 60)); // NOI18N
        classificacao.setForeground(new java.awt.Color(51, 153, 0));
        classificacao.setText("CLASSIFICAÇÃO");
        classificacao.setBorder(null);
        classificacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        classificacao.setFocusPainted(false);
        classificacao.setFocusable(false);
        classificacao.setRequestFocusEnabled(false);
        classificacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                classificacaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                classificacaoMouseExited(evt);
            }
        });
        classificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classificacao(evt);
            }
        });

        sair.setFont(new java.awt.Font("Pixeloid Sans", 1, 60)); // NOI18N
        sair.setForeground(new java.awt.Color(51, 153, 0));
        sair.setText("SAIR");
        sair.setBorder(null);
        sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sair.setFocusPainted(false);
        sair.setFocusable(false);
        sair.setRequestFocusEnabled(false);
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sairMouseExited(evt);
            }
        });
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        bola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola-2.png"))); // NOI18N

        xis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/xis-2.png"))); // NOI18N

        img1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if-2.png"))); // NOI18N
        img1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        creditos.setFont(new java.awt.Font("Pixeloid Sans", 1, 60)); // NOI18N
        creditos.setForeground(new java.awt.Color(51, 153, 0));
        creditos.setText("CRÉDITOS");
        creditos.setBorder(null);
        creditos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        creditos.setFocusPainted(false);
        creditos.setFocusable(false);
        creditos.setRequestFocusEnabled(false);
        creditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                creditosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                creditosMouseExited(evt);
            }
        });
        creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditos(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1318, 1318, 1318)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(xis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(img1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(creditos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(playHumano, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(playPC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(classificacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(img2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bola, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(img1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(img2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xis, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(playHumano, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(playPC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bola))
                        .addGap(20, 20, 20)
                        .addComponent(classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sair(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair
        sairDoJogo();
    }//GEN-LAST:event_sair

    private void playHumano(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playHumano
        //abrirTelaJogo();
    }//GEN-LAST:event_playHumano

    private void sairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseEntered
     
    }//GEN-LAST:event_sairMouseEntered

    private void sairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseExited
     
        
    }//GEN-LAST:event_sairMouseExited

    private void classificacaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classificacaoMouseEntered
        
    }//GEN-LAST:event_classificacaoMouseEntered

    private void classificacaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classificacaoMouseExited
      
    }//GEN-LAST:event_classificacaoMouseExited

    private void playPCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playPCMouseEntered
   
    }//GEN-LAST:event_playPCMouseEntered

    private void playPCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playPCMouseExited

        
    }//GEN-LAST:event_playPCMouseExited

    private void playHumanoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playHumanoMouseEntered

    }//GEN-LAST:event_playHumanoMouseEntered

    private void playHumanoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playHumanoMouseExited
       
    }//GEN-LAST:event_playHumanoMouseExited

    private void playPC(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playPC
        //abrirTelaJogo();
    }//GEN-LAST:event_playPC

    private void classificacao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classificacao
        abrirClassificacao();
    }//GEN-LAST:event_classificacao

    private void creditosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditosMouseEntered

    }//GEN-LAST:event_creditosMouseEntered

    private void creditosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditosMouseExited
        
    }//GEN-LAST:event_creditosMouseExited

    private void creditos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditos
        abrirTelaCreditos();
    }//GEN-LAST:event_creditos

    public static void main(String args[]) {
        FontGame.addFont("/fonts/PixeloidSansBold.ttf");
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bola;
    private javax.swing.JButton classificacao;
    private javax.swing.JButton creditos;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton playHumano;
    private javax.swing.JButton playPC;
    private javax.swing.JButton sair;
    private javax.swing.JLabel title;
    private javax.swing.JLabel xis;
    // End of variables declaration//GEN-END:variables
    
    public void sairDoJogo(){
        int resposta = JOptionPane.showConfirmDialog(null, "<html><b>Deseja mesmo sair do Jogo?</b></html>", "Sair do Jogo?", JOptionPane.YES_NO_OPTION);
        
        if(resposta == 0){
            System.exit(0);
        }
    }
    
    public void abrirTelaCreditos(){
        credito = new Creditos();
        credito.setVisible(true);
        dispose();
    }
    
    public void abrirClassificacao(){
        clas = new Classificacao();
        clas.setVisible(true);       
        dispose();
    }
    
    public void abrirTelaJogo(boolean multiplayer){
        jogo = new Jogo(multiplayer);
        jogo.setVisible(true);
        dispose();
    }
}
