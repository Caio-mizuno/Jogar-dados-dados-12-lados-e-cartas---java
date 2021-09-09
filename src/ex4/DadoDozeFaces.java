/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;
import java.util.Random;
/**
 *
 * @author Caio
 */
public class DadoDozeFaces extends Dado {
    private String dado;

    public DadoDozeFaces() {
        this.dado ="";
    }

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

   
//------------------------------------------------------------------------------    
   
    @Override
    public void jogar(){
        
        Random rand = new Random();
        
        int resultado;
        
            do{
                resultado = rand.nextInt(13);
            }while(resultado<1);
            String a=""; 
           a = Integer.toString(resultado);
           this.dado= this.dado +"/"+ a;
    }
    @Override
    public String getResultado(){
        return " Resultado: " + this.dado;
    }
}