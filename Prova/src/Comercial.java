public class Comercial extends Imovel
{
    public Comercial(String nome,int Ac, double lat, double lon)
    { super(nome,Ac,lat,lon);
    }

    @Override
    public double calculoImposto() {
        return 0;
    }
}
