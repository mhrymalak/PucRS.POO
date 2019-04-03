package pucrs.progoo9;

public class AppTeste {

	public static void main(String[] args) {
		
		CadastroProdutos cadProd = new CadastroProdutos();

		cadProd.inserir(21, "Lápis 1HB", 1.50);
		cadProd.inserir(22, "Caneta vermelha", 3);
		cadProd.inserir(23, "Recarga Caneta Pilot", 10);

		Venda venda1 = new Venda();
		Produto prod = cadProd.pesquisar(22);

		if (prod != null) venda1.inserir(3, prod);

		prod = cadProd.pesquisar(21);
		if (prod != null) venda1.inserir(prod);

		//System.out.println("Total da venda1: "+venda1.valorTotal());

		System.out.println(venda1.toString());

		CadastroPessoas clientes;

		clientes = new CadastroPessoas();
		clientes.inserir(new PessoaFisica	("Jóse", "9633515923"));
		clientes.inserir(new PessoaFisica	("Maria", "762136523"));
		clientes.inserir(new PessoaFisica	("Hermanoteu da Pentescopéia","1665235455"));
		clientes.inserir(new PessoaJuridica ("McDonalds","1323455657"));
		clientes.inserir(new PessoaJuridica ("Burger Rei","135447541"));

		clientes.listar();

	}

}
