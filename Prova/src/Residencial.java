public class Residencial extends Imovel
{   private int areaTerreno;

    public Residencial(String n, int aC, double lat, double lon, int aT)
    {   super(n,aC,lat,lon);
        areaTerreno = aT;
    }

    @Override
    public double calculoImposto() {
        double d = super.getAreaConstruida();
        double c = 0;
        if(d > 200)
        {   c = (d % 200) * Imovel.valorR;
        }
        if(areaTerreno > 500)return c + 100;
        return  c;
    }

    @Override
    public String toString() {
        if(areaTerreno < 500)return String.format(super.toString() + "\nTerreno: %d",areaTerreno);
        return String.format(super.toString() + "\nTerreno: %d.\n Há imposto em seu imóvel pelo tamanho do terreno.",areaTerreno);
    }
}
