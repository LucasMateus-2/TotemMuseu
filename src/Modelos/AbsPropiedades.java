package Modelos;

public  abstract class  AbsPropiedades implements IMetodos
{
    public String Nome;
    public String Cep;
    public String DataNasc;
   
    public String Quest1;
    public String Quest2;
    public String Quest3;
    public String Quest4;
    public String Quest5;

    public AbsPropiedades(String Nome, String Cep, String DataNasc, String Quest1, String Quest2, String Quest3,String Quest4, String Quest5)
    {
        this.Nome = Nome;
        this.Cep = Cep;
        this.DataNasc = DataNasc;
        this.Quest1 = Quest1;
        this.Quest2 = Quest2;
        this.Quest3 = Quest3;
        this.Quest4 = Quest4;
        this.Quest5 = Quest5;
        this.Executar();
    }

    
    
}
