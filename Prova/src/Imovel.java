public abstract class Imovel implements Comparable <Imovel>
{   private  String proprietario;
    private  int   areaConstruida;
    public static double  valorR = 0;
    private Geo local;

    public Imovel (String p, int a, Geo local)
    {
        proprietario = p;
        areaConstruida = a;
        this.local = local;
    }
    public static void setVR(double vr){valorR = vr;}
    public String getProprietario() { return proprietario;   }
    public int getAreaConstruida()  { return areaConstruida; }

    public abstract double calculoImposto();
    @Override
    public String toString()
    {   return String.format("Proprietario: %s aC: %d\t Imposto: %.2f\t Geo: %s",proprietario,areaConstruida,calculoImposto(),local.toString());
    }
    @Override
    public int compareTo(Imovel imovel)
    {return this.areaConstruida - imovel.areaConstruida;
    }


}
