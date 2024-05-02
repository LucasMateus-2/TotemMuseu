package Modelos;

public class Calcular extends AbsPropriedade
{
    private Double i; //Variavel de "controle" para o calculo
    
    public Calcular(Double num)
    {
        super(num);
    }
    
    @Override
    public void Executar()
    {
        
        this.i = this.num; //define que os valores sao iguai para terem o mesmo tamanho e melhor controle sobre o laço
        while (this.num > 1) //define o laço
        {
            this.i = this.i * (this.num - 1); //realiza o calculo
            this.num --; //dininui para que o laço tenha um fim
        }
        
        this.numero = String.format("%.0f", i);//transforma em string removendo a casa decimal
        
        this.numero = this.numero.toString(); //chama o metodo toString() para retornar o valor do calculo
        
    }

    @Override
    public String toString()
    {
        return this.numero; //retorna o valor em String do calculo
    }

    
}
