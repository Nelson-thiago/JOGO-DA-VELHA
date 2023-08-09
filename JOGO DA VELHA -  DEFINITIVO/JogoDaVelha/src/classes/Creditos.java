package classes;

import java.util.Timer;
import java.util.TimerTask;


public final class Creditos extends javax.swing.JFrame {

    public Creditos() {
        super("Créditos");
        initComponents();
        
        setResizable(false);
        setLocationRelativeTo(null);
        iniciarTransicao();
        setTextCreditos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img1 = new javax.swing.JLabel();
        texto = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        title3 = new javax.swing.JLabel();
        title4 = new javax.swing.JLabel();
        title5 = new javax.swing.JLabel();
        created = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        img1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if-2.png"))); // NOI18N
        img1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        texto.setFont(new java.awt.Font("Pixeloid Sans", 1, 18)); // NOI18N
        texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto.setText("Breve descrição");

        title1.setFont(new java.awt.Font("Pixeloid Sans", 1, 36)); // NOI18N
        title1.setForeground(new java.awt.Color(51, 153, 0));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("HÁRLITON MARTINS");

        title2.setFont(new java.awt.Font("Pixeloid Sans", 1, 36)); // NOI18N
        title2.setForeground(new java.awt.Color(51, 153, 0));
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("JOSUÉ ALEXANDRE");

        title3.setFont(new java.awt.Font("Pixeloid Sans", 1, 36)); // NOI18N
        title3.setForeground(new java.awt.Color(51, 153, 0));
        title3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title3.setText("NELSON THIAGO");

        title4.setFont(new java.awt.Font("Pixeloid Sans", 1, 36)); // NOI18N
        title4.setForeground(new java.awt.Color(51, 153, 0));
        title4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title4.setText("RAIMUNDO DIONE");

        title5.setFont(new java.awt.Font("Pixeloid Sans", 1, 36)); // NOI18N
        title5.setForeground(new java.awt.Color(51, 153, 0));
        title5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title5.setText("CAIO CÉSAR");

        created.setFont(new java.awt.Font("Pixeloid Sans", 1, 65)); // NOI18N
        created.setForeground(new java.awt.Color(255, 0, 0));
        created.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        created.setText("CREATED BY");

        title.setFont(new java.awt.Font("Pixeloid Sans", 1, 100)); // NOI18N
        title.setForeground(new java.awt.Color(0, 153, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("CRÉDITOS");

        voltar.setFont(new java.awt.Font("Pixeloid Sans", 1, 55)); // NOI18N
        voltar.setForeground(new java.awt.Color(0, 153, 255));
        voltar.setText("TELA INICIAL");
        voltar.setBorder(null);
        voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltar.setFocusPainted(false);
        voltar.setFocusable(false);
        voltar.setRequestFocusEnabled(false);
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(title4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(title5, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(created, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(title1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(title2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(title3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(img1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(created, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title5)
                        .addGap(15, 15, 15)
                        .addComponent(title1)
                        .addGap(15, 15, 15)
                        .addComponent(title2)
                        .addGap(15, 15, 15)
                        .addComponent(title3)
                        .addGap(15, 15, 15)
                        .addComponent(title4))
                    .addComponent(texto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(voltar, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        voltarTelaInicio();
    }//GEN-LAST:event_voltarActionPerformed

    public static void main(String args[]) {
        FontGame.addFont("/fonts/PixeloidSansBold.ttf");
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Creditos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel created;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel texto;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel title5;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
    
    int index;
    public void iniciarTransicao() {
        index = 0;
        String titulo = created.getText();
        created.setText("");
        
        Timer timer = new Timer();
        TimerTask tarefa = new TimerTask(){
                
            @Override
            public void run() {   
                if(index == titulo.length()){
                    index = 0;
                    String titulo = created.getText();
                    created.setText("");
                }
                
                created.setText(created.getText() + titulo.charAt(index));  
                index++; 
            }
        };

        timer.scheduleAtFixedRate(tarefa, 0, 200);
    }
    
    public void voltarTelaInicio(){
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
        dispose();
    }
    
    public void setTextCreditos(){
        String mensagem = """
                          <html><div style='text-align: justify;'>Jogo criado no ano de 2023 como projeto da disciplina "Paradigmas de Linguagens de Programação", ministrada pelo professor Gabriel Pinheiro Compto.<br><br> É com grande satisfa\u00e7\u00e3o que apresentamos nosso projeto: "Tic Tac Toe"! Baseado no jogo clássico e atemportal, foi criado como resultado de nosso esfor\u00e7o e dedica\u00e7\u00e3o como forma de evoluirmos individualmente e em equipe.
                          <br><br>Nossa equipe se empenhou em transformar o simples jogo da velha em uma experiência divertida e envolvente para jogadores de todas as idades. Com gráficos modernos e uma interface intuitiva, buscamos trazer uma nova vida a esse jogo t\u00e3o conhecido.</div></html>""";
        
        texto.setText(mensagem);
    }
}
