package pucrs.progoo;

public class PessoaFisica extends Pessoa
{
    private String cpf;

    public PessoaFisica(String nome, String cpf)
    {   super(nome); // Procure na classe-mãe outro construtor que respeite esses parametros
        this.cpf = cpf;
    }

    public String Id() { return  cpf; }


    public String toString()
    {   return super.toString() + " (PF) cpf: " + cpf ;
    }
}
