package br.pucrs.poo;

public class ItemVenda 
{
         // == Fields ==
        private int quantidade;
	private Produto produto;
        
        
         // == Public Methods ==
        
        public ItemVenda(int quantidade, Produto produto)
        {   this.produto    = produto;
            this.quantidade = quantidade;
        }
        
       public Produto getProduto(){ return produto;   }
       public int getQuantidade(){ return quantidade;}
       
}
