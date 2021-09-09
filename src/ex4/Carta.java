/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Caio
 */
public class Carta extends Jogo{
    private String numCarta;

    public String getNumCarta() {
        return numCarta;
    }

    public Carta() {
        this.numCarta = "";
    }

    public void setNumCarta(String numCarta) {
        this.numCarta = numCarta;
    }

    
   
    
    
    @Override
    public void jogar(){
    
    Random rand = new Random();
    int resultadoNUM;
    
         do{
            resultadoNUM  = rand.nextInt(14); //GERAR NUMEROS ALEATORIOS ENTRE 0 E 13
        }while(resultadoNUM<1);
        
         
         if(resultadoNUM==1){
            this.numCarta = this.numCarta + "/A";
        }
        else if(resultadoNUM==11){
            this.numCarta = this.numCarta + "/VALETE";
        }
        else if(resultadoNUM==12){
            this.numCarta = this.numCarta + "/DAMA";
        }
        else if(resultadoNUM==13){
            this.numCarta = this.numCarta + "/REI";
        }
        else{
            String a =Integer.toString(resultadoNUM);
            this.numCarta = this.numCarta +"/"+ a;
        }
      
         
    }
    
    @Override
    public String getResultado(){
        
        return " Resultado: "+this.numCarta;
    }
    
    
    
}
