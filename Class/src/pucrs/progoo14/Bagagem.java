package pucrs.progoo14;

public abstract class Bagagem implements Comparable<Bagagem> {
    private double peso;
    private String descricao;

    private static double custoExcesso;
    private static int totalBagagens = 0;

    public static double getCustoExcesso() { return custoExcesso; }
    public static int getTotalBagagens()   { return  totalBagagens;}
    public static void setCustoExcesso(double valor) {
        custoExcesso = valor;
    }


    public Bagagem(double umPeso, String umaDescricao) {
        peso = umPeso;
        descricao = umaDescricao;
        Bagagem.totalBagagens++;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPeso() {
        return peso;
    }

    public abstract double getCusto();
    public abstract String getTipo();

    @Override
    public String toString() {
        return String.format("(%s) %s - %.1f - custo: %.1f",
                getTipo(), descricao, peso, getCusto());
    }

    @Override
    public int compareTo(Bagagem outra) {
        // criterio: descricap
        // return this.descricao.compareTo(outra.descricao);

        // criterio: peso
        // a linha abaixo só funciona para valores inteiros...
        //return this.getPeso() - outra.getPeso();
        if (this.getPeso() < outra.getPeso())
            return -1;
        else if (this.getPeso() > outra.getPeso())
            return 1;
        else  // mesmo peso
            return 0;
    }
}








