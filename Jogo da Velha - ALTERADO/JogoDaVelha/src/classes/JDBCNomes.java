package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class JDBCNomes {
    Connection conexao;
    PreparedStatement declaracao;
    
    public JDBCNomes(Connection conexao){
        this.conexao = conexao;
    }
     
    public String buscarNomePorMatricula(String matricula) {
        String nome = null;
        String SQL = "SELECT nome FROM dados WHERE matricula = ?";
        try {
           declaracao = conexao.prepareStatement(SQL);
           declaracao.setString(1, matricula);
           ResultSet resultado = declaracao.executeQuery();
           if (resultado.next()) {
              nome = resultado.getString("nome");
           } else {
              // Matrícula não encontrada
              return null;
           }
        } catch (SQLException e) {
        }
        return nome;
    }
    
    public int buscarPontosPorMatricula(String matricula) {
        int pontos = 0;
        String SQL = "SELECT pontos FROM dados WHERE matricula = ?";
        try {
           declaracao = conexao.prepareStatement(SQL);
           declaracao.setString(1, matricula);
           ResultSet resultado = declaracao.executeQuery();
           if (resultado.next()) {
              pontos = resultado.getInt("pontos");
              declaracao.close();
           } else {
              // Matrícula não encontrada
               System.out.println("Cancelou nas entradas das matriculas");
           }
        } catch (SQLException error) {
        }
        return pontos;
    }
    
    public ArrayList<String[]> buscarOsMelhores() {
        String SQL = "SELECT nome, pontos FROM dados ORDER BY pontos DESC, nome ASC LIMIT 10";
        ArrayList<String[]> listaJogadores = new ArrayList<>();
        try {
            declaracao = conexao.prepareStatement(SQL);
            ResultSet resultado = declaracao.executeQuery();
            while (resultado.next()) {
                String[] jogador = new String[2];
                jogador[0] = resultado.getString("nome");
                jogador[1] = Integer.toString(resultado.getInt("pontos"));
                listaJogadores.add(jogador);
            }
            declaracao.close();
        } catch (SQLException error) {
        }
        return listaJogadores;
    }
    
    public ArrayList<String[]> buscarTodos() {
        String SQL = "SELECT matricula, nome, pontos FROM dados ORDER BY pontos DESC, nome ASC";
        ArrayList<String[]> listaJogadores = new ArrayList<>();
        try {
            declaracao = conexao.prepareStatement(SQL);
            ResultSet resultado = declaracao.executeQuery();
            while (resultado.next()) {
                String[] jogador = new String[2];
                jogador[0] = resultado.getString("nome");
                jogador[1] = Integer.toString(resultado.getInt("pontos"));
                listaJogadores.add(jogador);
            }
            declaracao.close();
        } catch (SQLException error) {
        }
        return listaJogadores;
    }
    
    public ArrayList<String[]> buscarNomesEPontosPorMatricula(String matricula) {
        String SQL = "SELECT nome, pontos FROM dados WHERE matricula = ?";
        ArrayList<String[]> listaJogadores = new ArrayList<>();
        
        try {
            declaracao = conexao.prepareStatement(SQL);
            ResultSet resultado = declaracao.executeQuery();
            while (resultado.next()) {
                String[] jogador = new String[2];
                jogador[0] = resultado.getString("nome");
                jogador[1] = Integer.toString(resultado.getInt("pontos"));
                listaJogadores.add(jogador);
            }
            declaracao.close();
        } catch (SQLException error) {
        }
        return listaJogadores;
    }
    
    public void atualizarPontuacao(String matricula) {
        String SQL = "UPDATE dados SET pontos = pontos + 1 WHERE matricula = ?";
        try {
            declaracao = conexao.prepareStatement(SQL);
            declaracao.setString(1, matricula);
            declaracao.executeUpdate();
            declaracao.close();
        } catch (SQLException error) {
        }
    }

}