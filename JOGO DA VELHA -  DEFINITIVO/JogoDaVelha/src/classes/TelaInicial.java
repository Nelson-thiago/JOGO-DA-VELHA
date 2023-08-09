package classes;

import java.awt.Color;
import java.io.IOException;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class TelaInicial extends javax.swing.JFrame {     
    Jogo jogo;
    Creditos credito;
    Classificacao cl;
    TelaFalhas falhas;
    
    public TelaInicial() {
        super("Tela Inicial");
        initComponents();
        
        setResizable(false);
        setLocationRelativeTo(null);
        iniciarTransicao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img2 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        iniciar = new javax.swing.JButton();
        classificacao = new javax.swing.JButton();
        creditos = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bola = new javax.swing.JLabel();
        xis = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        creditos1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        img2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if-2.png"))); // NOI18N
        img2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        img2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        title.setFont(new java.awt.Font("Pixeloid Sans", 1, 100)); // NOI18N
        title.setForeground(new java.awt.Color(0, 153, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("TIC TAC TOE");

        iniciar.setFont(new java.awt.Font("Pixeloid Sans", 1, 60)); // NOI18N
        iniciar.setForeground(new java.awt.Color(51, 153, 0));
        iniciar.setText("INICIAR JOGO");
        iniciar.setBorder(null);
        iniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciar.setFocusPainted(false);
        iniciar.setFocusable(false);
        iniciar.setRequestFocusEnabled(false);
        iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iniciarMouseExited(evt);
            }
        });
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
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
                classificacaoActionPerformed(evt);
            }
        });

        creditos.setFont(new java.awt.Font("Pixeloid Sans", 1, 60)); // NOI18N
        creditos.setForeground(new java.awt.Color(51, 153, 0));
        creditos.setText("REPORTAR FALHAS");
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
                creditosActionPerformed(evt);
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
                sairActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        bola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola-2.png"))); // NOI18N

        xis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/xis-2.png"))); // NOI18N

        img1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if-2.png"))); // NOI18N
        img1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        creditos1.setFont(new java.awt.Font("Pixeloid Sans", 1, 60)); // NOI18N
        creditos1.setForeground(new java.awt.Color(51, 153, 0));
        creditos1.setText("CRÉDITOS");
        creditos1.setBorder(null);
        creditos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        creditos1.setFocusPainted(false);
        creditos1.setFocusable(false);
        creditos1.setRequestFocusEnabled(false);
        creditos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                creditos1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                creditos1MouseExited(evt);
            }
        });
        creditos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditos1ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(creditos1, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
                                    .addComponent(sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(iniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(creditos, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                                            .addComponent(classificacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(img2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bola, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(img1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(img2)))
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xis, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bola))
                        .addGap(8, 8, 8)
                        .addComponent(creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(creditos1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "<html><b>Deseja mesmo sair do Jogo?</b></html>", "Sair do Jogo?", JOptionPane.YES_NO_OPTION);
        
        if(resposta == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_sairActionPerformed

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        abrirTelaJogo();
        
        jogo.startGame();
        jogo.setEnabledButtons(true);
        jogo.reiniciarCronometro();
        jogo.retomarCronometro();
    }//GEN-LAST:event_iniciarActionPerformed

    private void sairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseEntered
        mouseIn(sair);
    }//GEN-LAST:event_sairMouseEntered

    private void sairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseExited
        mouseOut(sair);
        
    }//GEN-LAST:event_sairMouseExited

    private void creditosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditosMouseEntered
        mouseIn(creditos);
    }//GEN-LAST:event_creditosMouseEntered

    private void creditosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditosMouseExited
        mouseOut(creditos);
    }//GEN-LAST:event_creditosMouseExited

    private void classificacaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classificacaoMouseEntered
        mouseIn(classificacao);
    }//GEN-LAST:event_classificacaoMouseEntered

    private void classificacaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classificacaoMouseExited
        mouseOut(classificacao);
        
    }//GEN-LAST:event_classificacaoMouseExited

    private void iniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarMouseEntered
        mouseIn(iniciar);
    }//GEN-LAST:event_iniciarMouseEntered

    private void iniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarMouseExited
        mouseOut(iniciar);
    }//GEN-LAST:event_iniciarMouseExited

    private void classificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classificacaoActionPerformed
        abrirClassificação();
    }//GEN-LAST:event_classificacaoActionPerformed

    private void creditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditosActionPerformed
        abrirTelaFalhas();
    }//GEN-LAST:event_creditosActionPerformed

    private void creditos1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditos1MouseEntered
        mouseIn(creditos1);
    }//GEN-LAST:event_creditos1MouseEntered

    private void creditos1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditos1MouseExited
        mouseOut(creditos1);
    }//GEN-LAST:event_creditos1MouseExited

    private void creditos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditos1ActionPerformed
        abrirTelaCreditos();
    }//GEN-LAST:event_creditos1ActionPerformed

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
    private javax.swing.JButton creditos1;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JButton iniciar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton sair;
    private javax.swing.JLabel title;
    private javax.swing.JLabel xis;
    // End of variables declaration//GEN-END:variables
    
    int index;
    public void iniciarTransicao() {
        index = 0;
        String titulo = title.getText();
        title.setText("");
        
        Timer timer = new Timer();
        TimerTask tarefa = new TimerTask(){
                
            @Override
            public void run() {   
                if(index == titulo.length()){
                    index = 0;
                    String titulo = title.getText();
                    title.setText("");
                }
                
                title.setText(title.getText() + titulo.charAt(index));  
                index++; 
            }
        };

        timer.scheduleAtFixedRate(tarefa, 0, 200);
    }
    
    public void playSong(String name) {
        try {
            URL url = getClass().getResource(name + ".wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(url);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            //  algo aqui..
        }
    }
    
    public void abrirClassificação(){
        cl = new Classificacao();
        cl.setVisible(true);       
        dispose();
    }
    
    public void abrirTelaJogo(){
        jogo = new Jogo();
        jogo.setVisible(true);
        dispose();
    }
    
    public void abrirTelaCreditos(){
        credito = new Creditos();
        credito.setVisible(true);
        dispose();
    }
    
    public void mouseIn(JButton button){
        Color AZUL = new Color(0, 153, 255);
        button.setForeground(AZUL);
        playSong("/audios/mouse");
    }
    
    public void mouseOut(JButton button){
        Color VERDE = new Color(51, 153, 0);
        button.setForeground(VERDE);
    }
    
    public void abrirTelaFalhas(){
        falhas = new TelaFalhas();
        falhas.setVisible(true);
        dispose();
    }
}
