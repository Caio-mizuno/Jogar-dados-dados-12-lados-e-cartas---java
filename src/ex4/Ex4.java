/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

import java.util.ArrayList;

/**
 *
 * @author Caio
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Jogador> listaJogador = new ArrayList<>();                    //criei uma lista de jogadores
        Carta carta = new Carta();                                              //iniciei um objeto carta
        Dado dado = new Dado();                                                 //iniciei um objeto dado
        DadoDozeFaces dado12 = new DadoDozeFaces();                             //iniciei um objeto dado de doze faces
        
        Jogador j1 = new Jogador("Caio",carta);                                 //iniciei jogador 1
        Jogador j2 = new Jogador("Julifer",dado);                               //iniciei jogador 2
        Jogador j3 = new Jogador("Eliton",dado12);                              //iniciei jogador 3
        
        listaJogador.add(j1); //adicionei cada jogador na lista de JOGADORES
        listaJogador.add(j2);
        listaJogador.add(j3);
        
       
        Runnable thread = new Mediador(listaJogador);                         // iniciei um OBJETO de mediador
        Thread t1 = new Thread(thread);
            
        
    
       
        
        
        
    }
    
}
