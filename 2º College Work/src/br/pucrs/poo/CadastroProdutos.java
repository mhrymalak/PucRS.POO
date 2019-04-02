package br.pucrs.poo;

import java.util.ArrayList;

public class CadastroProdutos
{
    //  == Fields ==
    private ArrayList <Produto> lista;

    // == Constructors ==
    public CadastroProdutos(){lista  = new ArrayList<>();}

    //  == Public Methods ==
    public void adicionar (Produto produto) { lista.add(produto);   }
    public void remover   (Produto produto) { lista.remove(produto);}
    public Produto pesquisar (int id)
    {   for(Produto p: lista)
        { if(p.getCodigo() == id)return p;
        }
        return null;
    }
    public String listar ()
    {   StringBuilder string = new StringBuilder();
        for(Produto p: lista)
        {
            string.append("Código: "+ p.getCodigo() + "\nNome: " +p.getNome() + "\nPreço: " +p.getPreco()+ "\n");
        }
        return string.toString();
    }

}
