package pucrs.progoo12;

public abstract class Funcionario
{   private String codigo;
    private String nome;
    private double salario;

    public Funcionario(String codigo, String nome, double salario)
    {   this.codigo = codigo;
        this.nome   = nome;
        this.salario  = salario;
    }

    public void setSalarioBruto(double salario) { if(salario > 0)this.salario = salario; }


    public String getCodigo()       { return codigo;   }
    public String getNome()         { return nome;     }
    public double getSalarioBruto() { return salario;  }
    public double getSalarioLiquido()
    {   if(salario > 2500.00) return salario - (salario * 17) / 100;
        return salario - salario / 10;
    }

    public String toString()
    {   StringBuilder string = new StringBuilder("Código: "+codigo);
        string.append("\nNome: "+nome);
        string.append("\nsalario: %.2f"+salario);
        return string.toString();
    }

}
