/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author lucasmateus
 */
public class Controle extends AbsPropiedades
{

    public Controle(String nome, String questão1, String questão2, String questão3, String questão4, String questão5) {
        super(nome, questão1, questão2, questão3, questão4, questão5);
    }

    @Override
    public void Executar() 
    {
        Estaticos.MENSAGEM = "";
        AbsPropiedades validacao = new Validacao(this.nome, this.questão1, this.questão2, this.questão3,
        this.questão4, this.questão5);
        
        if(Estaticos.MENSAGEM.equals(""))
        {
            AbsPropiedades adicionaDados = new AdicionaDados(validacao.nome,validacao.questão1,
                    validacao.questão2, validacao.questão3, validacao.questão4, validacao.questão5);
            
            AbsPropiedades contaPontos = new ContaPontos(null, null, null, null, null, null);
            
            AnalisaDados analisaDados = new AnalisaDados(nome, questão1, questão2, questão3, questão4, questão5);
            
        }
    }
}