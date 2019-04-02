package br.pucrs.poo;

import java.util.ArrayList;

public class CadastroClientes
{
    //  == Fields ==

    private ArrayList <Cliente> lista;

    // == Constructors ==

    public CadastroClientes(){lista  = new ArrayList<>();}

    //  == Public Methods ==

    public void adicionar (Cliente cliente) { lista.add(cliente);   }
    public void remover   (Cliente cliente) { lista.remove(cliente);}
    public Cliente pesquisar (String cpf)
    {  
        for(Cliente c: lista)
        { if(c.getCpf().equals(cpf))return c;
        }
        return null;
    }
     public String listar ()
    {   StringBuilder string = new StringBuilder();
        for(Cliente c: lista)
        {
            string.append("Nome: " +c.getNome() + "\nCpf: " +c.getCpf()+ "\n");
        }
        return string.toString();
    }
}
