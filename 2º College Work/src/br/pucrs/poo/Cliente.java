package br.pucrs.poo;

public class Cliente
{
	 // == Fields ==

	private String cpf;
	private String nome;

	 // == Constructor ==

	public Cliente (String nome, String cpf)
	{	this.nome  = nome;
		this.cpf = cpf;
	}

	 // == Public Methods ==

	public String getCpf()           { return cpf;      }
	public String getNome()          { return nome;     }

	public void setCpf (String cpf)  { this.cpf = cpf;  }
	public void setNome(String nome) { this.nome = nome;}

	@Override
	public String toString (){return String.format("Nome: %s  Cpf: %s", cpf, nome);}
}
