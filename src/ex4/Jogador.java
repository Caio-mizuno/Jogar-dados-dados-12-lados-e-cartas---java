/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

/**
 *
 * @author Caio
 */
public class Jogador {
    private String nomeJogador;
    private Jogo jogo;
    private String result;
   public void iniciaJogada(){
       this.jogo.jogar();
   } 
    
//------=-=-==-=-==--=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==--=---=-=-=-=-=-=-=-=-=    
    public Jogador(String nomeJogador, Jogo jogo) {
        this.nomeJogador = nomeJogador;
        this.jogo = jogo;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public String getResult() {
        return result;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public void setResult(String result) {
        this.result = result;
    }


    
}
