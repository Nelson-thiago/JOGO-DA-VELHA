package classes;

public class JogadorHumano extends Jogador {
    
    private String matricula;
    
    public JogadorHumano(String nome, int pontos, String matricula, String simbolo) {
        super(nome, pontos, simbolo);
        this.matricula = matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    @Override
    public void validarMatricula() {
        System.out.println("Jogador Humano está jogando.");
    }
}
