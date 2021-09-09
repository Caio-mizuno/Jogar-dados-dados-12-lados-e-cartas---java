/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Caio
 */
public class Dado extends Jogo{
   private String dados;

    public Dado() {
        this.dados ="";
    }
    
   
    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }

//------------------------------------------------------------------------------    
    @Override
    public void jogar(){
        
        Random rand = new Random();
        
        int resultado;
        
            do{
                resultado = rand.nextInt(7);
            }while(resultado<1);
    
            
        this.dados = this.dados +"/"+ resultado;
    }
        
    @Override
    public String getResultado(){
        return " Resultado: " + this.dados;
    }
    
}
