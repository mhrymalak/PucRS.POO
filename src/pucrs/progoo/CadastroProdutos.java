package pucrs.progoo;
import java.util.ArrayList;

public class CadastroProdutos {
    private ArrayList<Produto> lista;

    public CadastroProdutos() {
        lista = new ArrayList<>();
    }

    public void inserir(int umCod, String umNome,
                        double umPreco) {
        Produto novo = new Produto(umCod, umNome, umPreco);
        lista.add(novo);
        //lista.add( new Produto(umCod, umNome, umPreco) );
    }

    public Produto pesquisar(int cod) {
        for (Produto p: lista) {
            if (p.getCodigo() == cod)
                return p;
        }
        return null;

    }
}
