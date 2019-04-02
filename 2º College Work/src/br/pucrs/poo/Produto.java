package br.pucrs.poo;

public class Produto
{
	private static int id = 1; // pertence a classe -> 'static'
	
         // == Fields ==
	private String nome;
	private int codigo;
	private double preco;

	 // == Constructor ==
	public Produto (String nome, double preco)
	{	this.nome  = nome;
		this.preco = preco;
		codigo = id;
		id++;
	}

         // == Public Methods ==
	public void setNome  (String nome) {this.nome   = nome;  }
	public void setPreco (double preco){this.preco  = preco; }

	public double getPreco () {return preco; }
	public String getNome  () {return nome;  }
	public double getCodigo() {return codigo;}
        
        @Override
	public String toString (){  return String.format("codigo: %d  Nome: %s  Preço: ", codigo, nome, preco);}

}
