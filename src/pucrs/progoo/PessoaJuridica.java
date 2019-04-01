package pucrs.progoo;

public class PessoaJuridica extends Pessoa
{
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj)
    {   super(nome); // Procure na classe-mãe outro construtor que respeite esses parametros
        this.cnpj = cnpj;
    }

    public String Id()       { return  cnpj; }


    public String toString() { return super.toString() + " (PJ) cnpj: " + cnpj ; }
}
