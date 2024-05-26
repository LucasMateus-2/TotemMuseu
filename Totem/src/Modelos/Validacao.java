/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author lucasmateus
 */
public class Validacao extends AbsPropiedades
{

    public Validacao(String nome, String questão1, String questão2, String questão3, String questão4, String questão5) {
        super(nome, questão1, questão2, questão3, questão4, questão5);
        
    } 

    @Override
    public void Executar() 
    {
        Pessoa pessoa = new Pessoa(nome, questão1, questão2, questão3, questão4, questão5);

        try 
        {
            validarCampos(pessoa);
        } 
        catch (Exception e) 
        {
            Estaticos.MENSAGEM = "Digite valores validos";
        }
    }

    private void validarCampos(Pessoa pessoa)
    {
        if ("".equals(pessoa.nome) && pessoa.nome ==null) 
        {
            Estaticos.MENSAGEM = "Nome não pode ser nulo";
        }
        else if (!pessoa.questão1.equals("SIM") && !pessoa.questão1.equals("NÃO"))
        {
            Estaticos.MENSAGEM = "Questão 1: Digite apenas sim ou não";
        }
        else if (!pessoa.questão2.equals("SIM") && !pessoa.questão2.equals("NÃO"))
        {
            Estaticos.MENSAGEM = "Questão 2: Digite apenas sim ou não";
        }
        else if (pessoa.questão1.equals("") || pessoa.questão1 == null ) 
        {
            Estaticos.MENSAGEM =  "Questão 1 não pode ser nula";
        }
        else if (pessoa.questão2.equals("") || pessoa.questão2 == null) 
        {
            Estaticos.MENSAGEM = "Questão 2 não pode ser nula";
        }
        else if (pessoa.questão3.equals("") || pessoa.questão3 == null) 
        {
            Estaticos.MENSAGEM = "Questão 3 não pode ser nula";
        }
        else if (pessoa.questão4.equals("") || pessoa.questão4 == null) 
        {
            Estaticos.MENSAGEM = "Questão 4 não pode ser nula";
        }
        else if (pessoa.questão5.equals("") || pessoa.questão5 == null) 
        {
            Estaticos.MENSAGEM = "Questão 5 não pode ser nula";
        }
    }
}

