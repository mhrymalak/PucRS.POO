public class App
{
    public static void main(String[] args) {
        Geo geo = new Geo(-51, 30);

        Imovel i1 = new Residencial("Sr. Smith", 180, geo, 600);
        Imovel i2 = new Residencial("Sr. Smith", 400, geo, 1000);
        Imovel i3 = new Residencial("Sra. Smith", 100, geo, 300);
        Imovel i4 = new Residencial("Sra. Smith", 200, geo, 600);
        Imovel i5 = new Residencial("Anna Smith", 201, geo, 500);
        Imovel i6 = new Residencial("Carl Smith", 80, geo, 600);
        Imovel i7 = new Residencial("Sr. Smith", 300, geo, 500);

        //Imovel i8 = new Comercial("Sr. Smith", 20, geo);
        //Imovel i9 = new Comercial("Sra. Smith", 40, geo);

        CadastroImoveis cad = new CadastroImoveis();
        cad.add(i1);
        cad.add(i2);
        cad.add(i3);
        cad.add(i4);
        cad.add(i5);
        cad.add(i6);
        cad.add(i7);
        //cad.add(i8);
        //cad.add(i9);

        Imovel.setVR(1);

        System.out.println("Cadastro ordenado pelo area");
        System.out.println(cad.listar());

        System.out.println("\nImoveis Sr. Smith");
        System.out.println(cad.listar("Sr. Smith"));

        System.out.println("\nImoveis Sra. Smith");
        System.out.println(cad.listar("Sra. Smith"));

    }


}
