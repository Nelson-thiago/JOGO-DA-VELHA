package classes;

public class JogadorPC extends Jogador{
    private String nome;

    public JogadorPC(int pontos) {
        super(pontos);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
