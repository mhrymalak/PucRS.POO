package pucrs.progoo;

public class Pessoa
{
	private static  int cod = 0;
	private String nome;
	private String codC ;
	
	public Pessoa(String nome)
	{	this.nome = nome;
		this.codC = "00"+cod;
		cod++;
	}

	public String getNome() {
		return nome;
	}

	public String getCodC() {
		return codC;
	}

	public String toString() {
		return codC + " - " + nome;
	}

}
