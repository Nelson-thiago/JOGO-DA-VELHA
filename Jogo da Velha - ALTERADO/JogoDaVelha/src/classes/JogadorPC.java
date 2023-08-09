package classes;

public class JogadorPC extends Jogador {  
    
    public JogadorPC(String nome, int pontos, String simbolo) {
        super(nome, pontos, simbolo);
    }

    @Override
    public void validarMatricula() {
        System.out.println("Jogador PC está jogando.");
    } 
}