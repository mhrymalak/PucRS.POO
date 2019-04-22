public class App
{
    public static void main(String[] args) {
        Imovel casa = new Residencial("Matheus", 200,1223,5353,340);
        Imovel lancheria = new Comercial("Pércio", 1500,425,435);
        CadastroImoveis lista = new CadastroImoveis();
     }   // minimo 3 imoveis, 2 do mesmo proprietário
}
