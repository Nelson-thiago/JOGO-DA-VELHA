package classes;
import java.awt.Color;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.SwingUtilities;

public final class Jogo extends javax.swing.JFrame {           
    Timer timer;
    
    // CLasses da aplicação...
    Conexao conn;
    JDBCNomes listar;   
    JogadorHumano player1, player2;
    JogadorPC playerPc;
   
    // Dados dos jogadores...
    String matricula1, matricula2;
    String nome1, nome2;
    int pontos1, pontos2;   
    boolean jogadorAtivo = true;
    
    /*Dados do cronometro*/
    boolean cronometroRodando = true;
    String time;
    int segundos = 0, minutos = 0;
    
    boolean multiplayer;
    
    public Jogo(boolean multiplayer) {
        this.multiplayer = multiplayer;
        setTitle("Jogo da Velha");
        
        initComponents();        
        setResizable(false);
        setLocationRelativeTo(null);  
        
        conn = new Conexao();
        listar = new JDBCNomes(conn.openConnection());
        
        if (multiplayer) {
            /* JOGADOR 1 vs JOGADOR 2 */
            
            boolean matriculasValidas = false;
            do {
                matricula1 = JOptionPane.showInputDialog("Entre com a matrícula - (Jogador 1): ").trim();
                matricula2 = JOptionPane.showInputDialog("Entre com a matrícula - (Jogador 2): ").trim(); 
                
                /* Verifica as matriculas no método "validarMatricula" */
                matriculasValidas = validarMatricula(matricula1, matricula2);                
            } while(!matriculasValidas);
            
            /* Exibição das informações dos jogadores */
            areaNome1.setText(player1.getNome());
            areaVitorias1.setText(Integer.toString(player1.getPontos()));
            areaNome2.setText(player2.getNome());
            areaVitorias2.setText(Integer.toString(player2.getPontos()));
            
            // Habilita todos os botões do tabuleiro.
            botoesHabilitados(true);
            
            /* Gera o click dos botões */
            JButton[] buttons = { b1, b2, b3, b4, b5, b6, b7, b8, b9 };
            for (JButton button : buttons) {
                button.addActionListener(e -> { clickButtons(button); });
            }
     
        } else {
            // JOGADOR vs PC     
            
            boolean matriculasValida = false;
            do {
                matricula1 = JOptionPane.showInputDialog("Entre com a matrícula - (Jogador 1): ").trim();
                
                /* Verifica a matricula no método "validarMatricula" */
                matriculasValida = validarMatricula(matricula1);   
            } while(!matriculasValida);     
            
            /* Exibição das informações do jogadorHumano e JogadorPC */
            areaNome1.setText(player1.getNome());
            areaNome2.setText(playerPc.getNome());
            areaVitorias1.setText(Integer.toString(player1.getPontos()));
            areaVitorias2.setText(Integer.toString(playerPc.getPontos()));
            
            /* Habilita todos os botões do tabuleiro */
            botoesHabilitados(true);
            
            /* Gera o click dos botões */
            JButton[] buttons = { b1, b2, b3, b4, b5, b6, b7, b8, b9 };
            for (JButton button : buttons) {
                button.addActionListener(e -> { clickButtons(button, 9); });
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        area_tabuleiro = new javax.swing.JPanel();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        area_jogador = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        frase = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        areaNome1 = new javax.swing.JLabel();
        areaVitorias1 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        frase1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        areaVitorias2 = new javax.swing.JLabel();
        areaNome2 = new javax.swing.JLabel();
        cronometro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        voltarInicio = new javax.swing.JButton();
        reiniciar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jButton8.setText("jButton1");

        jButton9.setText("jButton1");

        jButton10.setText("jButton1");

        jButton11.setText("jButton1");

        jButton13.setText("jButton1");

        jButton12.setText("jButton1");

        jButton14.setText("jButton1");

        jButton15.setText("jButton1");

        jButton16.setText("jButton1");

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

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setFocusableWindowState(false);

        jLabel1.setFont(new java.awt.Font("Pixeloid Sans", 1, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIC TAC TOE");

        area_tabuleiro.setBackground(new java.awt.Color(153, 153, 153));
        area_tabuleiro.setAutoscrolls(true);
        area_tabuleiro.setEnabled(false);

        b2.setFont(new java.awt.Font("Pixeloid Sans", 1, 90)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 0, 51));
        b2.setBorder(null);
        b2.setBorderPainted(false);
        b2.setFocusable(false);
        b2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b2.setVerifyInputWhenFocusTarget(false);

        b3.setFont(new java.awt.Font("Pixeloid Sans", 1, 90)); // NOI18N
        b3.setForeground(new java.awt.Color(0, 153, 255));
        b3.setBorder(null);
        b3.setBorderPainted(false);
        b3.setFocusable(false);
        b3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b3.setVerifyInputWhenFocusTarget(false);

        b4.setFont(new java.awt.Font("Pixeloid Sans", 1, 90)); // NOI18N
        b4.setForeground(new java.awt.Color(255, 0, 51));
        b4.setBorder(null);
        b4.setBorderPainted(false);
        b4.setFocusable(false);
        b4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b4.setVerifyInputWhenFocusTarget(false);

        b5.setFont(new java.awt.Font("Pixeloid Sans", 1, 90)); // NOI18N
        b5.setForeground(new java.awt.Color(0, 153, 255));
        b5.setBorder(null);
        b5.setBorderPainted(false);
        b5.setFocusable(false);
        b5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b5.setVerifyInputWhenFocusTarget(false);

        b6.setFont(new java.awt.Font("Pixeloid Sans", 1, 90)); // NOI18N
        b6.setForeground(new java.awt.Color(255, 0, 51));
        b6.setBorder(null);
        b6.setBorderPainted(false);
        b6.setFocusable(false);
        b6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b6.setVerifyInputWhenFocusTarget(false);

        b7.setFont(new java.awt.Font("Pixeloid Sans", 1, 90)); // NOI18N
        b7.setForeground(new java.awt.Color(0, 153, 255));
        b7.setBorder(null);
        b7.setBorderPainted(false);
        b7.setFocusable(false);
        b7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b7.setVerifyInputWhenFocusTarget(false);

        b8.setFont(new java.awt.Font("Pixeloid Sans", 1, 90)); // NOI18N
        b8.setForeground(new java.awt.Color(255, 0, 51));
        b8.setBorder(null);
        b8.setBorderPainted(false);
        b8.setFocusable(false);
        b8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b8.setVerifyInputWhenFocusTarget(false);

        b9.setFont(new java.awt.Font("Pixeloid Sans", 1, 90)); // NOI18N
        b9.setForeground(new java.awt.Color(0, 153, 255));
        b9.setBorder(null);
        b9.setBorderPainted(false);
        b9.setFocusable(false);
        b9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b9.setVerifyInputWhenFocusTarget(false);

        b1.setFont(new java.awt.Font("Pixeloid Sans", 1, 90)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 0, 51));
        b1.setBorder(null);
        b1.setBorderPainted(false);
        b1.setFocusable(false);
        b1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b1.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout area_tabuleiroLayout = new javax.swing.GroupLayout(area_tabuleiro);
        area_tabuleiro.setLayout(area_tabuleiroLayout);
        area_tabuleiroLayout.setHorizontalGroup(
            area_tabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(area_tabuleiroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(area_tabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, area_tabuleiroLayout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, area_tabuleiroLayout.createSequentialGroup()
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, area_tabuleiroLayout.createSequentialGroup()
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        area_tabuleiroLayout.setVerticalGroup(
            area_tabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(area_tabuleiroLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(area_tabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(area_tabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(area_tabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(area_tabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(area_tabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(b8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(b7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        area_jogador.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        p1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "JOGADOR 1", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Pixeloid Sans", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        frase.setFont(new java.awt.Font("Pixeloid Sans", 0, 20)); // NOI18N
        frase.setText("Nome:");

        jLabel6.setFont(new java.awt.Font("Pixeloid Sans", 0, 20)); // NOI18N
        jLabel6.setText("Numero de vitorias:");

        areaNome1.setFont(new java.awt.Font("Pixeloid Sans", 1, 16)); // NOI18N
        areaNome1.setForeground(new java.awt.Color(0, 153, 255));
        areaNome1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        areaNome1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        areaVitorias1.setFont(new java.awt.Font("Pixeloid Sans", 1, 18)); // NOI18N
        areaVitorias1.setForeground(new java.awt.Color(102, 102, 102));
        areaVitorias1.setText("0");
        areaVitorias1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addComponent(frase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(areaNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(areaVitorias1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(areaNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frase, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaVitorias1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        p2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "JOGADOR 2", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Pixeloid Sans", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        frase1.setFont(new java.awt.Font("Pixeloid Sans", 0, 20)); // NOI18N
        frase1.setText("Nome:");

        jLabel8.setFont(new java.awt.Font("Pixeloid Sans", 0, 20)); // NOI18N
        jLabel8.setText("Numero de vitorias: ");

        areaVitorias2.setFont(new java.awt.Font("Pixeloid Sans", 1, 18)); // NOI18N
        areaVitorias2.setForeground(new java.awt.Color(102, 102, 102));
        areaVitorias2.setText("0");
        areaVitorias2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        areaNome2.setFont(new java.awt.Font("Pixeloid Sans", 1, 16)); // NOI18N
        areaNome2.setForeground(new java.awt.Color(0, 153, 255));
        areaNome2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        areaNome2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(frase1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(areaNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(areaVitorias2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(frase1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaVitorias2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        cronometro.setFont(new java.awt.Font("Pixeloid Sans", 1, 40)); // NOI18N
        cronometro.setForeground(new java.awt.Color(102, 102, 102));
        cronometro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cronometro.setText("00:00");

        javax.swing.GroupLayout area_jogadorLayout = new javax.swing.GroupLayout(area_jogador);
        area_jogador.setLayout(area_jogadorLayout);
        area_jogadorLayout.setHorizontalGroup(
            area_jogadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(area_jogadorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(area_jogadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cronometro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(area_jogadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        area_jogadorLayout.setVerticalGroup(
            area_jogadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(area_jogadorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if-2.png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        voltarInicio.setFont(new java.awt.Font("Pixeloid Sans", 1, 45)); // NOI18N
        voltarInicio.setForeground(new java.awt.Color(51, 153, 0));
        voltarInicio.setText("TELA INICIAL");
        voltarInicio.setToolTipText("VOLTA À TELA INICIAL");
        voltarInicio.setBorder(null);
        voltarInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarInicio.setFocusPainted(false);
        voltarInicio.setFocusable(false);
        voltarInicio.setRequestFocusEnabled(false);
        voltarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarInicio(evt);
            }
        });

        reiniciar.setFont(new java.awt.Font("Pixeloid Sans", 1, 45)); // NOI18N
        reiniciar.setForeground(new java.awt.Color(51, 153, 0));
        reiniciar.setText("REINICIAR JOGO");
        reiniciar.setBorder(null);
        reiniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reiniciar.setFocusPainted(false);
        reiniciar.setFocusable(false);
        reiniciar.setRequestFocusEnabled(false);
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciar(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(reiniciar)
                                .addGap(15, 15, 15)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(voltarInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(area_tabuleiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(area_jogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(voltarInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(area_tabuleiro, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(area_jogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clickButton1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickButton1
        
    }//GEN-LAST:event_clickButton1

    private void voltarInicio(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarInicio
        int resposta = JOptionPane.showConfirmDialog(null, "<html><b>Deseja voltar à tela inicial?</b></html>", "Voltar a tela inicial?", JOptionPane.YES_NO_OPTION);
        
        if(resposta == JOptionPane.YES_OPTION){
            voltarTelaInicial();
        }
    }//GEN-LAST:event_voltarInicio

    private void reiniciar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciar
        int resposta = JOptionPane.showConfirmDialog(null, "<html><b>Deseja reiniciar o jogo?</b></html>", "Reiniciar do Jogo?", JOptionPane.YES_NO_OPTION);
        
        if(resposta == JOptionPane.YES_OPTION){
            reiniciarJogo();
        }
    }//GEN-LAST:event_reiniciar

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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo(false).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaNome1;
    private javax.swing.JLabel areaNome2;
    private javax.swing.JLabel areaVitorias1;
    private javax.swing.JLabel areaVitorias2;
    private javax.swing.JPanel area_jogador;
    private javax.swing.JPanel area_tabuleiro;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel cronometro;
    private javax.swing.JLabel frase;
    private javax.swing.JLabel frase1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JButton reiniciar;
    private javax.swing.JButton voltarInicio;
    // End of variables declaration//GEN-END:variables
    
    /* Metodos para polimorfismo */
    public boolean validarMatricula(String matricula1){
        nome1 = listar.buscarNomePorMatricula(matricula1);

        if(matricula1.equals("")){
            JOptionPane.showMessageDialog(null, "O campo da matrícula não podem ser vazio.", "Alerta", INFORMATION_MESSAGE);
            return false;
        }else if(nome1 == null){
            JOptionPane.showMessageDialog(null, "A matrícula está incorreta. Por favor, verifique e tente novamente.", "Alerta", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else{
            pontos1 = listar.buscarPontosPorMatricula(matricula1);
  
            player1 = new JogadorHumano(nome1, pontos1, matricula1, "x");
            playerPc = new JogadorPC("COMPUTER", 0, "o");
            
            iniciarCronometro();
            return true;
        }
    }
    
    public boolean validarMatricula(String matricula1, String matricula2) {
        nome1 = listar.buscarNomePorMatricula(matricula1);
        nome2 = listar.buscarNomePorMatricula(matricula2);

        if (matricula1.equals(matricula2)) {
            JOptionPane.showMessageDialog(null, "Os campos das matrícula(s) não podem ser iguais ou vazios.", "Alerta", INFORMATION_MESSAGE);
            return false;
        } else if (nome1 == null || nome2 == null) {
            JOptionPane.showMessageDialog(null, "Uma ou mais matrículas estão incorretas. Por favor, verifique e tente novamente.", "Alerta", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else {
            pontos1 = listar.buscarPontosPorMatricula(matricula1);
            pontos2 = listar.buscarPontosPorMatricula(matricula2);     
            
            player1 = new JogadorHumano(nome1, pontos1, matricula1, "x");
            player2 = new JogadorHumano(nome2, pontos2, matricula2, "o");
            
            iniciarCronometro();
            return true;
        }
    }

    public void clickButtons(JButton button){     
        if(jogadorAtivo == true){
            if(button.getText().isEmpty()){    
                button.setText("x");
                button.setForeground(new Color(255, 0, 0));
                mudarJogador();
            }
        }
        else{
            if(button.getText().isEmpty()){
                button.setText("o");
                button.setForeground(new Color(0, 153, 255));
                mudarJogador();
            }
        }
        
        verificarJogada(player1.getSimbolo());
        verificarJogada(player2.getSimbolo());
    }
    
    public void clickButtons(JButton button, int num) {
        JButton botoes[] = {b1, b2, b3, b4, b5, b6, b7, b8, b9};

        if (button.getText().isEmpty()) {
            button.setText("x");
            button.setForeground(new Color(255, 0, 0));
            mudarJogador();

            boolean haBotoesVazios = false;
            for (JButton b : botoes) {
                if (b.getText().isEmpty()) {
                    haBotoesVazios = true;
                    break;
                }
            }

            if (haBotoesVazios) {
                Random randomico = new Random();
                int numSorteado;

                do {
                    numSorteado = randomico.nextInt(num);
                } while (!botoes[numSorteado].getText().isEmpty());

                //delay(2);
                botoes[numSorteado].setText("o");
                botoes[numSorteado].setForeground(new Color(0, 153, 255));
                mudarJogador();
            }
        }
        
        verificarJogada(player1.getSimbolo());
        verificarJogada(playerPc.getSimbolo());
    }  
    
    /* Metodos comum para todos */
    public void botoesHabilitados(boolean bin){    
        JButton botoes[] = {b1, b2, b3, b4, b5, b6, b7, b8, b9}; 
        
        for(JButton item: botoes){
            item.setEnabled(bin);
        }
    }
    
    public void mudarJogador(){
        jogadorAtivo = jogadorAtivo != true;
        playSong("/audios/marcarTabuleiro");
        
        System.out.println("playr: "+ jogadorAtivo);
    }
    
    public void verificarJogada(String value) {
        JButton botoes[] = {b1, b2, b3, b4, b5, b6, b7, b8, b9};
         
        int[][] linhas    = {{0, 1, 2}, 
                             {3, 4, 5}, 
                             {6, 7, 8}};
        
        int[][] colunas   = {{0, 3, 6}, 
                             {1, 4, 7}, 
                             {2, 5, 8}};
        
        int[][] diagonais = {{0, 4, 8}, 
                             {2, 4, 6}};

        for (int[] linha : linhas) {
            if (botoesIguais(value, linha)) {
                declararVencedor(value);
                return;
            }
        }
        for (int[] coluna : colunas) {
            if (botoesIguais(value, coluna)) {
                declararVencedor(value);
                return;
            }
        }
        for (int[] diagonal : diagonais) {
            if (botoesIguais(value, diagonal)) {
                declararVencedor(value);
                return;
            }
        }
        
        boolean jogoEmpatado = true;
        for (int i = 0; i < 9; i++) {
            if (botoes[i].getText().isEmpty()) {
                jogoEmpatado = false;
                break;
            }
        }
        
        if (jogoEmpatado) {
             declararVencedor("Empate");
        }
    }
    
    public boolean botoesIguais(String value, int[] posicoes) {
        JButton botoes[] = {b1, b2, b3, b4, b5, b6, b7, b8, b9};
        for (int i : posicoes) {
            if (!botoes[i].getText().equals(value)) {
                return false;
            }
        }
        return true;
    }
    
    public void declararVencedor(String value) {
        switch (value) {
            case "x" -> vencedorDoJogo("Jogador 1");
            case "o" -> vencedorDoJogo("Jogador 2");
            default  -> vencedorDoJogo("Empate");
        }
    }
    
    public void vencedorDoJogo(String vencedor) {
        if (vencedor.equalsIgnoreCase("Jogador 1")) {
            playSong("/audios/win");

            String mensagem = "<html>O jogador <b>" + player1.getNome() + "</b> venceu o jogo!!<br><br><b>Deseja fazer revanche?</b></html>";
            listar.atualizarPontuacao(player1.getMatricula());
            int resposta = JOptionPane.showConfirmDialog(null, mensagem, "VITÓRIA", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                reiniciarJogo();
                return;
            } 
            
            voltarTelaInicial();
            fecharJOptionPane();
            return;
            
        } else if (vencedor.equalsIgnoreCase("Jogador 2")) {
            playSong("/audios/win");
            String mensagem = "";
                    
            if(multiplayer){
                mensagem = "<html>O jogador <b>" + player2.getNome() + "</b> venceu o jogo!!<br><br><b>Deseja fazer revanche?</b></html>";
                listar.atualizarPontuacao(player2.getMatricula());
            }else{
                mensagem = "<html>O jogador <b>" + playerPc.getNome() + "</b> venceu o jogo!!<br><br><b>Deseja fazer revanche?</b></html>";
            }
            
            int resposta = JOptionPane.showConfirmDialog(null, mensagem, "VITÓRIA", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                reiniciarJogo();
                return;
            } 
            
            voltarTelaInicial();
            fecharJOptionPane();
            return;
        } 
        
        String mensagem = "<html>O jogo terminou <b>empatado</b>!!<br><br><b>Deseja fazer revanche?</b></html>";
        int resposta = JOptionPane.showConfirmDialog(null, mensagem, "EMPATE", JOptionPane.YES_NO_OPTION);
        System.out.println("Empate");

        if (resposta == JOptionPane.YES_OPTION) {
            reiniciarJogo();
            System.out.println("Sim");
            return;
        } 
        
        voltarTelaInicial();
        fecharJOptionPane();
    } 
    
    /*  */
    public void voltarTelaInicial(){
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
        dispose();
    }
    
    public void playSong(String name) {
        try {
            URL url = getClass().getResource(name + ".wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(url);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
        }
    }
    
    public void iniciarCronometro() {
        segundos = 0; minutos = 0;
        
        timer = new Timer();
        TimerTask tarefa = new TimerTask(){
            @Override
            public void run() {
                if (cronometroRodando) {
                    segundos++;
                    if (segundos == 60) {
                        segundos = 0;
                        minutos++;
                    }

                    // Formatação do tempo para exibição
                    String time = (minutos < 10) ? "0" + minutos + ":" : "" + minutos + ":";
                    time += (segundos < 10) ? "0" + segundos : "" + segundos;

                    // Exibe o tempo no componente de texto "cronometro"
                    cronometro.setText(time);
                }
            }
        };

        timer.scheduleAtFixedRate(tarefa, 0, 1000);
    }
    
    public void pausarCronometro() {
        cronometroRodando = false; // Define a variável de controle como falsa para pausar o cronômetro
    }

    public void retomarCronometro() {
        cronometroRodando = true; // Define a variável de controle como verdadeira para retomar o cronômetro
    }
    
    public void reiniciarCronometro() {
        segundos = 0;
        minutos = 0;
        time = "00:00"; // Tempo reiniciado no formato "mm:ss"
        cronometro.setText(time); // Atualiza o componente de texto com o tempo reiniciado
    }
    
    public void cleanButtons(){    
        JButton botoes[] = {b1, b2, b3, b4, b5, b6, b7, b8, b9};        
        for(JButton item: botoes){
            item.setText("");
        }
        
        jogadorAtivo = true;    
        botoesHabilitados(false); 
    }
    
    public void reiniciarJogo(){
        cleanButtons();
        
        pausarCronometro();
        reiniciarCronometro();
        retomarCronometro();
        
        if(multiplayer){
            areaNome1.setText(player1.getNome());
            areaNome2.setText(player2.getNome());

            pontos1 = listar.buscarPontosPorMatricula(player1.getMatricula());
            pontos2 = listar.buscarPontosPorMatricula(player2.getMatricula());

            player1.setPontos(pontos1);
            player2.setPontos(pontos2);

            areaVitorias1.setText(Integer.toString(player1.getPontos()));
            areaVitorias2.setText(Integer.toString(player2.getPontos()));
        }else{
            areaNome1.setText(player1.getNome());
            areaNome2.setText(playerPc.getNome());

            pontos1 = listar.buscarPontosPorMatricula(player1.getMatricula());

            player1.setPontos(pontos1);
            playerPc.setPontos(0);

            areaVitorias1.setText(Integer.toString(player1.getPontos()));
            areaVitorias2.setText(Integer.toString(playerPc.getPontos()));
        }
          
        botoesHabilitados(true);
    }
     
    public void delay(int num){
         int valor = num * 1000;
         try {
            Thread.sleep(valor);
        } catch (InterruptedException e) {
        }
     }
     
    public void fecharJOptionPane(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }

        JDialog dialog = (JDialog) SwingUtilities.getRoot(JOptionPane.getRootFrame());

        if (dialog != null) {
            dialog.dispose();
        }
    }
}