package pucrs.progoo;

public class ItemVenda {
    private int quantidade;
    private Produto prod;

    public ItemVenda(int umaQtde,
                     Produto umProd) {
        quantidade = umaQtde;
        prod = umProd;
    }

    public double getValor() {
        return quantidade * prod.getPreco();
    }

    @Override
    public String toString() {
        return prod.toString()+
                " " + quantidade +
                " " + getValor();
    }
}
