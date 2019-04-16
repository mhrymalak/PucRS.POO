package pucrs.progoo12;

public class Vendedor extends Funcionario
{   private double totalDeVendas;

    public Vendedor (String codigo, String nome, double salario)
    {   super(codigo, nome, salario);
    }
    //Sobrecarga
    public Vendedor (String codigo, String nome, double salario, double totalDeVendas)
    {   super(codigo, nome, salario);
        this.totalDeVendas = totalDeVendas;
    }

    public void setTotalDeVendas(double totalDeVendas)
    {   if(totalDeVendas > 0) this.totalDeVendas = totalDeVendas;
    }

    public double getTotalDeVendas() {  return totalDeVendas; }
}
