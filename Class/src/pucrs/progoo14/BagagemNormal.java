package pucrs.progoo14;

public class BagagemNormal extends Bagagem {
    public BagagemNormal(double peso, String descricao) {
        super(peso, descricao);
    }

    @Override
    public double getCusto() {
        if ( getPeso() > 20) {
            return ((int)getPeso() - 20) * Bagagem.getCustoExcesso();
        } //else {
          //  return 0;
          // }
        return 0;
    }

    @Override
    public String getTipo() {
        return "Normal";
    }
}
