/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;

public class TestContaPontos {
    public static void main(String[] args) {
        // Criar dados de exemplo
        ArrayList<String> visitante1 = new ArrayList<>();
        visitante1.add("Alice");
        visitante1.add("SIM");
        visitante1.add("NAO");
        visitante1.add("a");
        visitante1.add("b");
        visitante1.add("c");

        ArrayList<String> visitante2 = new ArrayList<>();
        visitante2.add("Bob");
        visitante2.add("NAO");
        visitante2.add("SIM");
        visitante2.add("a");
        visitante2.add("c");
        visitante2.add("b");

        ArrayList<String> visitante3 = new ArrayList<>();
        visitante3.add("Charlie");
        visitante3.add("SIM");
        visitante3.add("SIM");
        visitante3.add("b");
        visitante3.add("a");
        visitante3.add("c");

        
        
        ArrayList<String> visitante4 = new ArrayList<>();
        visitante4.add("Lucas");
        visitante4.add("NAO");
        visitante4.add("SIM");
        visitante4.add("a");
        visitante4.add("c");
        visitante4.add("b");
        
        Estaticos.DadosPessoas.add(visitante1);
        Estaticos.DadosPessoas.add(visitante2);
        Estaticos.DadosPessoas.add(visitante3);
        Estaticos.DadosPessoas.add(visitante4);
        // Criar e executar ContaPontos
        ContaPontos contaPontos = new ContaPontos("", "", "", "", "", "");
        AnalisaPorcentagem analisaPocentagem = new AnalisaPorcentagem();
        
        // Imprimir os resultados
        for (ArrayList<String> visitante : Estaticos.DadosPessoas) {
        
            for (int i = 0; i < visitante.size(); i++) 
            {
                System.out.println(visitante.get(i));
            }
        }
    }
}
