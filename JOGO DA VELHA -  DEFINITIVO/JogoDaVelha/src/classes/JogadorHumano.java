package classes;

public class JogadorHumano extends Jogador{
    private String matricula;
    private String nome;

    public JogadorHumano(int pontos) {
        super(pontos);
    }
    
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
