/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author lucasmateus
 */
public  abstract class AbsPropiedades implements IMetodos
{
    public String nome;
    public String questão1;
    public String questão2;
    public String questão3;
    public String questão4;
    public String questão5;

    public AbsPropiedades(String nome, String questão1, String questão2, String questão3, String questão4,
            String questão5) {
        this.nome = nome;
        this.questão1 = questão1;
        this.questão2 = questão2;
        this.questão3 = questão3;
        this.questão4 = questão4;
        this.questão5 = questão5;
        this.Executar();
    }
    
}
