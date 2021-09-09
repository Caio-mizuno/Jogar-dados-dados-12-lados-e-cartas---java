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
public abstract class Jogo {
    private int opcoes;
    private String nome;
    private String resultado;
    
    public void jogo(String nome,int op){
        /*if(op==1){
            this.setNome("Dado");
        }
        else if(op==2){
            this.setNome("Cartas");
        }
        else {this.setNome("Dados-Doze-Faces");}*/
        this.setNome(nome);
    }
//------------------------------------------------------------------------------

    public int getOpcoes() {
        return opcoes;
    }

    public String getNome() {
        return nome;
    }

    

    public void setOpcoes(int opcoes) {
        this.opcoes = opcoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    public abstract void jogar();
    public abstract String getResultado(); 
    
}
