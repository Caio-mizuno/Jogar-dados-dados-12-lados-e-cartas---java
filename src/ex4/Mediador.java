/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

import java.io.IOException;
import java.util.ArrayList;
import java.lang.Thread ;
import java.lang.Runnable ;
import java.lang.RuntimeException ;
import java.lang.InterruptedException;
/**
 *
 * @author Caio
 */
public class Mediador extends Thread implements Runnable  {
    private ArrayList<Jogador> listajogador;
    
    
//==============================================================================
   
    public Mediador(ArrayList<Jogador> listajogador) {
        this.listajogador = listajogador;
        start();
    }

    public ArrayList<Jogador> getListajogador() {
        return listajogador;
    }

    public void setListajogador(ArrayList<Jogador> listajogador) {
        this.listajogador = listajogador;
    }

   
    public void GravarResultado(String arq, String texto){
        
        String aux;
        for(Jogador a : this.getListajogador()){
            aux = a.getJogo().getResultado();
            texto = texto + "Jogador: " +a.getNomeJogador()+ aux + "      ";
            
        }
       Arquivo.Write(arq, texto);
    
    }
   
//==============================================================================
    
    @Override
    public void run(){
       String arq = "arq.txt";
        String texto = "";
       
        try{
            for(int i=0;i<10;i++){                                              //inicia 10 jogadas
                for(Jogador j: this.getListajogador()){                         //verifica jogadores na lista de jogadores
                    j.iniciaJogada();                                           //inicia a jogada conforme o jogo
                    System.out.println(j.getNomeJogador()+ j.getJogo().getResultado());//IMPRIME PARA VERIFICAR
                    Thread.sleep(300);                                          //faz a thread dormir por algum tempo
                }
                Thread.sleep(1000);
                System.out.println("");
            }
            
        }catch(InterruptedException e){                                         //tratamento de exceção
            e.printStackTrace();
        
        }
            
            
                            
        if(arq.contains(arq)){       
            this.GravarResultado(arq,texto);                                    //GRAVA O RESULTADO NUM ARQUIVO                                  
            System.out.println("ARQUIVO SALVO COM SUCESSO");
        }
        else{
            System.out.println("ERRO: Não foi salvo!");
        }
        
        System.out.println("Terminou a execução;");                             //para mostrar a morte da thread.
        
    
    }
}