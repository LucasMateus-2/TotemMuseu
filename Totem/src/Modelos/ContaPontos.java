/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author lucasmateus
 */
import java.util.ArrayList;

public class ContaPontos extends AbsPropiedades
{
    public ContaPontos(String nome, String questão1, String questão2, String questão3, String questão4,
            String questão5) 
    {
        super(nome, questão1, questão2, questão3, questão4, questão5);

    }

    @Override
    public void Executar() 
    {
        Estaticos.REPOSTAS.add("SIM");
        Estaticos.REPOSTAS.add("SIM");
        Estaticos.REPOSTAS.add("a");
        Estaticos.REPOSTAS.add("a");
        Estaticos.REPOSTAS.add("c"); 
       
       
        for ( ArrayList<String> Visitante : Estaticos.DadosPessoas) 
        {
            Integer pontos= 0;
            for (int j = 1; j <= 5; j++) 
            {
            if (Visitante.get(j).equals(Estaticos.REPOSTAS.get(j-1))) 
            {
                pontos++;
            }
             if (j > 5) 
                    {
                        j = 1;
                    }
            }
           
            Visitante.add(String.valueOf(pontos));
            
            
        }
            
    }            
}

