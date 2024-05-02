package Modelos;

import java.util.ArrayList;

public class Dados extends AbsPropiedades
{
    private ArrayList<String> dadosVisitante;

    public Dados(String Nome, String Cep, String DataNasc, String Quest1, String Quest2, String Quest3, String Quest4, String Quest5) {
        super(Nome, Cep, DataNasc, Quest1, Quest2, Quest3, Quest4, Quest5);
    }


    @Override
    public void Executar()
    {
        ArrayList<String> dadosVisitante=Visitantes(Nome,Cep,DataNasc,Quest1,Quest2,Quest3,Quest4,Quest5);
        
        int pontos= 0;
        ArrayList<String> respostas = new ArrayList<>();
        respostas.add("a");
        respostas.add("b");
        respostas.add("c");
        respostas.add("d");
        respostas.add("e");
        
        for (int i = 0; i < respostas.size(); i++) {
            if (respostas.get(i).equals(dadosVisitante.get(i+3)))
            {
                System.out.printf(dadosVisitante.get(i));
                pontos+=5;
            }
        }
        System.out.printf("você fez %d pontos!!",pontos);
        
    }

    private ArrayList<String> Visitantes(String Nome, String Cep,String DataNasc,String Quest1,String Quest2, String Quest3,String Quest4,String Quest5)
    {
        ArrayList<String> visitante = new ArrayList<>();
        visitante.add(Nome);
        visitante.add(Cep);
        visitante.add(DataNasc);

        visitante.add(Quest1);
        visitante.add(Quest2);
        visitante.add(Quest3);
        visitante.add(Quest4);
        visitante.add(Quest5);
        return visitante;
    }
    
    
    public ArrayList<String> getDadosVisitantes()
    {
        ArrayList<String> dadosVisitante=Visitantes(Nome,Cep,DataNasc,Quest1,Quest2,Quest3,Quest4,Quest5);
        return dadosVisitante;
    }
    
    
}

