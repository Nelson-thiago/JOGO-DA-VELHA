package classes;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public final class Classificacao extends javax.swing.JFrame {      
    Conexao conn;
    JDBCNomes listar;
    
    int pontos;
    String matricula, nome;
    
    public Classificacao() {    
        super("Classificação");
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        exibirClassificacao();
        
        JTableHeader cabecalho = user.getTableHeader();
        cabecalho.setFont(cabecalho.getFont().deriveFont(Font.BOLD));
        cabecalho.setFont((new Font("Pixeloid Sans", 1, 13))); 
        cabecalho.setForeground(new Color(0, 153, 255));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        user = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        chave = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        voltar.setFont(new java.awt.Font("Pixeloid Sans", 1, 50)); // NOI18N
        voltar.setForeground(new java.awt.Color(0, 153, 255));
        voltar.setText("TELA INICIAL");
        voltar.setBorder(null);
        voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltar.setDefaultCapable(false);
        voltar.setFocusPainted(false);
        voltar.setFocusable(false);
        voltar.setRequestFocusEnabled(false);
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Pixeloid Sans", 1, 65)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLASSIFICAÇÃO DO JOGO");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if-2.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        tabela.setFont(new java.awt.Font("Pixeloid Sans", 1, 13)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Colocação", "Nome", "Vitórias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setAlignmentX(1.0F);
        tabela.setAlignmentY(1.0F);
        tabela.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabela.setAutoscrolls(false);
        tabela.setColumnSelectionAllowed(true);
        tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabela.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tabela.setDropMode(javax.swing.DropMode.ON);
        tabela.setEnabled(false);
        tabela.setFocusCycleRoot(true);
        tabela.setGridColor(new java.awt.Color(240, 240, 240));
        tabela.setName("tabela"); // NOI18N
        tabela.setOpaque(false);
        tabela.setRequestFocusEnabled(false);
        tabela.setRowHeight(30);
        tabela.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tabela.setShowGrid(true);
        tabela.getTableHeader().setResizingAllowed(false);
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(tabela);
        tabela.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(1).setResizable(false);
            tabela.getColumnModel().getColumn(2).setResizable(false);
        }
        tabela.getAccessibleContext().setAccessibleParent(tabela);

        jLabel3.setFont(new java.awt.Font("Pixeloid Sans", 1, 14)); // NOI18N
        jLabel3.setText("10 melhores jogadores");

        user.setFont(new java.awt.Font("Pixeloid Sans", 1, 12)); // NOI18N
        user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Colocação", "Nome", "Vitórias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        user.setAlignmentX(1.0F);
        user.setAlignmentY(1.0F);
        user.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        user.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        user.setDoubleBuffered(true);
        user.setDropMode(javax.swing.DropMode.ON);
        user.setFocusCycleRoot(true);
        user.setFocusTraversalPolicyProvider(true);
        user.setGridColor(new java.awt.Color(255, 255, 255));
        user.setIntercellSpacing(new java.awt.Dimension(5, 5));
        user.setName("tabela"); // NOI18N
        user.setOpaque(false);
        user.setRequestFocusEnabled(false);
        user.setRowHeight(30);
        user.setSelectionBackground(new java.awt.Color(255, 255, 255));
        user.setShowGrid(true);
        user.getTableHeader().setResizingAllowed(false);
        user.getTableHeader().setReorderingAllowed(false);
        user.setUpdateSelectionOnSort(false);
        user.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(user);
        user.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (user.getColumnModel().getColumnCount() > 0) {
            user.getColumnModel().getColumn(0).setResizable(false);
            user.getColumnModel().getColumn(1).setResizable(false);
            user.getColumnModel().getColumn(2).setResizable(false);
        }
        user.getAccessibleContext().setAccessibleName("");
        user.getAccessibleContext().setAccessibleParent(user);

        jLabel4.setFont(new java.awt.Font("Pixeloid Sans", 1, 14)); // NOI18N
        jLabel4.setText("Sua colocação");

        chave.setFont(new java.awt.Font("Pixeloid Sans", 1, 14)); // NOI18N
        chave.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        chave.setToolTipText("Matricula");

        jButton1.setFont(new java.awt.Font("Pixeloid Sans", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 255));
        jButton1.setText("Buscar Jogador");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setOpaque(false);
        jButton1.setRequestFocusEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pesquisar(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(chave, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(voltar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chave)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        voltarTelaInicial();
    }//GEN-LAST:event_voltarActionPerformed

    private void Pesquisar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pesquisar
        matricula = chave.getText().trim();
        buscaJogador(matricula);
        chave.setText("");
        chave.setFocusable(true);
    }//GEN-LAST:event_Pesquisar

    public static void main(String args[]) {
        FontGame.addFont("/fonts/PixeloidSansBold.ttf");
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Classificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Classificacao().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabela;
    private javax.swing.JTable user;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables

    
    public void exibirClassificacao(){
        conn = new Conexao();
        listar = new JDBCNomes(conn.openConnection());                   

        ArrayList<String[]> nomesEPontos = listar.buscarOsMelhores();
        DefaultTableModel modelo =  (DefaultTableModel) tabela.getModel();
        
        modelo.setNumRows(0);
        int cont = 0;
        for (int i = 0; i < nomesEPontos.size(); i++) {
            cont++;           
            String[] itens = nomesEPontos.get(i);
            modelo.addRow(new Object[]{cont+"º", " "+itens[0], itens[1]});

            if (cont <= 3) {
                tabela.setSelectionBackground(new Color(0, 153, 255)); 
                tabela.setSelectionForeground(Color.WHITE);
            }
        }        
        
        JTableHeader cabecalho = tabela.getTableHeader();
        cabecalho.setFont(cabecalho.getFont().deriveFont(Font.BOLD));
        cabecalho.setFont((new Font("Pixeloid Sans", 1, 13))); 
        cabecalho.setForeground(new Color(0, 153, 255));
        tabela.setModel(modelo);   
    }
    
    public void voltarTelaInicial(){
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
        dispose();
    } 
    
    public void buscaJogador(String matricula){
        nome = listar.buscarNomePorMatricula(matricula);

        if(nome != null) {
            pontos = listar.buscarPontosPorMatricula(matricula);
        } else {
            JOptionPane.showMessageDialog(null, "Matrícula não encontrada. Tente outra.", "Alerta" ,INFORMATION_MESSAGE);
            return;
        }

        conn = new Conexao();
        listar = new JDBCNomes(conn.openConnection());

        ArrayList<String[]> nomeEPonto = listar.buscarTodos();
        DefaultTableModel userModelo = (DefaultTableModel) user.getModel();

        userModelo.setNumRows(0);
        
        int cont = 0;
        for (int i = 0; i < nomeEPonto.size(); i++) {
            String[] itens = nomeEPonto.get(i);
            cont++;
            
            if (itens[0].equals(nome)) {               
                userModelo.addRow(new Object[]{cont+"º", itens[0], itens[1]});
                user.setSelectionBackground(new Color(0, 153, 255)); 
                user.setSelectionForeground(Color.WHITE); 
            }
        }
        
        JTableHeader cabecalho = user.getTableHeader();
        cabecalho.setFont(cabecalho.getFont().deriveFont(Font.BOLD));
        cabecalho.setFont((new Font("Pixeloid Sans", 1, 13))); 
        cabecalho.setForeground(new Color(0, 153, 255));
        user.setModel(userModelo);   
    }
}
