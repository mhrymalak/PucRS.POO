package pucrs.progoo12;

import java.util.ArrayList;

public class Cadastro
{
     // == Atributos ==

    private ArrayList <Funcionario> lista;


     // == Métodos ==

    public Cadastro() { lista = new ArrayList<>(); }

    public void incluir(Funcionario funcionario) {if (funcionario != null)lista.add(funcionario);}
    public boolean excluir(String codigo)
    {   if(codigo == null)return false;
        else
        {   for (Funcionario f : lista)
             {  if (f.getCodigo().equals(codigo))
                {   if (lista.remove(f)) return true;
                    else return false;
                }
             }
        }
        return false;
    }
    public String geraRelatorio()
    {   return "";

    }
    public boolean gravaArquivo()
    {   return false;

    }
}
