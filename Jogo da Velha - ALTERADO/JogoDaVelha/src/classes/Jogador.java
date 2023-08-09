package classes;

public abstract class Jogador {
    private int pontos;
    private String nome;
    private String simbolo;
    

    public Jogador(String nome, int pontos, String simbolo) {
        this.nome = nome;
        this.pontos = pontos;
        this.simbolo = simbolo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
    
    public void validarMatricula() {}
}