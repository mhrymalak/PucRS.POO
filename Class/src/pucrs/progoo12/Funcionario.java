package pucrs.progoo12;

public abstract class Funcionario
{   private String codigo;
    private String nome;
    private double salario;

    public Funcionario(String codigo, String nome, double salario)
    {   this.codigo   = codigo;
        this.nome     = nome;
        this.salario  = salario;
    }

    public void setSalarioBruto(double salario) { if(salario > 0) this.salario = salario; }


    public String getCodigo()       { return codigo;   }
    public String getNome()         { return nome;     }
    public double getSalarioBruto() { return salario;  }
    public double getSalarioLiquido()
    {   if(salario > 2500.00) return salario * 0.83;
        return salario * 0.9;
    }

    @Override // Sobrescrita
    public String toString()
    { /*StringBuilder string = new StringBuilder("Código: ");
        string.append(codigo);
        string.append("\nNome: ");
        string.append(nome);
        string.append("\nSalário: %.2f");
        string.append(salario);
        return string.toString();*/

        return String.format("Código: %s\nNome: %s\nSalário Bruto: %.2f", codigo, nome, salario);
    }

}
