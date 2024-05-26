/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;


/**
 *
 * @author lucasmateus
 */
public class AnalisaPorcentagem 
{

    public AnalisaPorcentagem() 
    {
        for (int i = 0; i < Estaticos.DadosPessoas.size(); i++)
        {
            Integer valorI = Integer.valueOf(Estaticos.DadosPessoas.get(i).get(6));
            Integer Dif = 0;
            Integer Total =0;
            int porcertagem;


            if(Estaticos.DadosPessoas.size()>1 && i>0)
            {

                Integer valorJ = Integer.valueOf(Estaticos.DadosPessoas.get(i-1).get(6));
                if(valorI.equals(valorJ))
                {
                    Total +=1;
                }

                Dif = valorI-valorJ;
            }
            else
            {
                Estaticos.DadosPessoas.get(i).add("100");
            }

            if(!Total.equals(0))
            {
                porcertagem = (Dif/ Estaticos.DadosPessoas.size())*100;
                Estaticos.DadosPessoas.get(i).add(String.valueOf(porcertagem));
            }
            else
            {
                Estaticos.DadosPessoas.get(i).add(String.valueOf(0));
            }
        }      
    }
        
    
    
    
   
}
