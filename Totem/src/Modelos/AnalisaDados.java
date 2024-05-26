/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lucasmateus
 */
public class AnalisaDados extends AbsPropiedades
{
    public AnalisaDados(String nome, String questão1, String questão2, String questão3, String questão4, String questão5) {
        super(nome, questão1, questão2, questão3, questão4, questão5);
    }

        @Override
        public void Executar() 
        {
            if (Estaticos.DadosPessoas.size()>1) 
            {
                Map<String, Integer> contador = new HashMap<>();

                for (ArrayList<String> visitante : Estaticos.DadosPessoas) 
                {
                    String nome = visitante.get(0);
                    contador.put(nome, contador.getOrDefault(nome, 0) + 1);
                }

                // Encontrar a maior contagem de respostas idênticas
                int maxContagem = 0;
                for (int count : contador.values()) 
                {
                    if (count > maxContagem) 
                    {
                        maxContagem = count;

                    }

                double porcentagem = ((double) maxContagem / Estaticos.DadosPessoas.size()) * 100;


                Estaticos.PORCENTAGEM = String.valueOf(porcentagem);
            }  
        }  
    }
}
