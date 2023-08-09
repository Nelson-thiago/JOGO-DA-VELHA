package classes;

import java.util.Timer;

public class Tabuleiro {
    String matriculaOne, matriculaTwo, nomeOne, nomeTwo, time;
    
    boolean jogadorAtivo = true;
    boolean cronometroRodando = false;
    
    int segundos = 0, minutos = 0, pontosPlayerOne, pontosPlayerTwo;
    
    Timer timer;
    Conexao conn;
    JDBCNomes listar;
    TelaInicial inicio;
    
    
    
}
