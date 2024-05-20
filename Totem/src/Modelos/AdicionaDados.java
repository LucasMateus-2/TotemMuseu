/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;

/**
 *
 * @author lucasmateus
 */
public class AdicionaDados extends AbsPropiedades
{
    public AdicionaDados(String nome, String questão1, String questão2, String questão3, String questão4,
            String questão5) 
    {
        super(nome, questão1, questão2, questão3, questão4, questão5);
    }

    @Override
    public void Executar() 
    {
        ArrayList<String>Pessoas =new ArrayList<>(); 

        Pessoa p1 = new Pessoa(this.nome, this.questão1, this.questão2, this.questão3, 
        this.questão4, this.questão5);
      
    
        Pessoas.add(p1.nome);
        Pessoas.add(p1.questão1);
        Pessoas.add(p1.questão2);
        Pessoas.add(p1.questão3);
        Pessoas.add(p1.questão4);
        Pessoas.add(p1.questão5);
      
        Estaticos.DadosPessoas.add(Pessoas);    
        
    }

}
