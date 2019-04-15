package pucrs.progoo14;

public class BagagemDeMao extends Bagagem {

    public BagagemDeMao(double peso, String descricao) {
        super(peso, descricao);
    }

    @Override
    public double getCusto() {
        if ( getPeso() <= 5) {
            return 0;
        } else if (getPeso() >= 10) {
                  return ((int)getPeso() - 5) * 20;

        } else {
            return ((int)getPeso() - 5) * 10;
          }
    }

    @Override
    public String getTipo() {
        return "Mão";
    }
}
