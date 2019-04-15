package pucrs.progoo12;

public class Gerente extends Funcionario
{   private double bonus;

    public Gerente (String codigo, String nome, double salario)
    {   super(codigo, nome, salario);
    }

    public double getBonus() {return bonus; }
    public void setBonus(double bonus){ if(bonus > 0)this.bonus = bonus; }
    @Override
        public double getSalarioLiquido()
        {

        }
}
