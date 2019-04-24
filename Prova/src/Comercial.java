public class Comercial extends Imovel
{
    public Comercial(String nome,int Ac, Geo local)
    { super(nome,Ac,local);
    }

    @Override
    public double calculoImposto() {
        return 0;
    }
}
