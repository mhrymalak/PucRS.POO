package pucrs.progoo12;

import java.util.ArrayList;

public class Cadastro
{
     // == Atributos ==

    private ArrayList <Funcionario> lista;


     // == Métodos ==

    public Cadastro() { lista = new ArrayList<>(); }

    public void incluir(Funcionario funcionario) {if (funcionario != null)lista.add(funcionario);}
    public boolean incluir(String codigo)
    {
    //   if(lista.getCodigo(codigo) )
        return true;
    }
    public String geraRelatorio()
    {   return "";

    }
    public boolean gravaArquivo()
    {   return false;

    }
}
