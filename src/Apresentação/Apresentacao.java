package Apresentação;


import Modelos.Dados;

import java.util.ArrayList;
import java.util.Scanner;

public class Apresentacao 
{
    ArrayList<String> dadoVisitante = new ArrayList<>();
    public Apresentacao()
    {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu cep:");
        String cep = scanner.nextLine();

        System.out.println("Digite sua data de nascimento:");
        String dataNasc= scanner.nextLine();

        System.out.printf("Digite a resposta da primeira pergunta:");
        String res1 = scanner.next();

        System.out.printf("Digite a resposta da seguda pergunta:");
        String res2 = scanner.next();

        System.out.printf("Digite a resposta da Terceira pergunta:");
        String res3 = scanner.next();
        System.out.printf("Digite a resposta da quarta pergunta:");
        String res4 = scanner.next();

        System.out.printf("Digite a resposta da quinta pergunta:");
        String res5 = scanner.next();


        Dados dados = new Dados(nome,cep,dataNasc,res1,res2,res3,res4,res5);

    }
}
