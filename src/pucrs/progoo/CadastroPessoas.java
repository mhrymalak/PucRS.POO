package pucrs.progoo;

import java.util.ArrayList;

public class CadastroPessoas {
    ArrayList<Pessoa> lista;

    public CadastroPessoas() {
        lista = new ArrayList<>();
    }

    public void inserir(Pessoa p) {
        lista.add(p);
    }

    public Pessoa pesquisar(String cod) {
        for (Pessoa p: lista) {
            if (p.getCodC() == cod)
                return p;
        }
        return null;

    }

    public void listar()
    {
        System.out.println("\nRelatório de Clientes: ");
        for (Pessoa p: lista)System.out.println(p.toString());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");

    }
}
