public abstract class Imovel implements Comparable <Imovel>
{   private  String proprietario;
    private  int   areaConstruida;
    public static double  valorR = 0;
    private Geo local;

    public Imovel (String p, int a, double lat, double lon)
    {
        proprietario = p;
        areaConstruida = a;
        local = new Geo(lat, lon);
    }
    public static void setValorR(double vr){valorR = vr;}
    public String getProprietario() { return proprietario;   }
    public int getAreaConstruida()  { return areaConstruida; }

    public abstract double calculoImposto();
    @Override
    public String toString()
    {   return String.format("Proprietario: %s \n Área Construida: %d\nImposto: %.2f\nGeolocalização: %s",proprietario,areaConstruida,calculoImposto(),local.toString());
    }
    @Override
    public int compareTo(Imovel imovel)
    {return this.areaConstruida - imovel.areaConstruida;
    }


}
