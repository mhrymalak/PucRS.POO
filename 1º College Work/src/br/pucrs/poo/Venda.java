package br.pucrs.poo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Venda 
{        
        // == Fields ==
        private static int cont = 1; // contador de numero de vendas
        private String data;
	    private int nVenda;
	    private ArrayList <ItemVenda> lista;
        private Cliente cliente;
        
        // == Contructor ==
        
        public Venda ()
        {   DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
            LocalDateTime horario = LocalDateTime.now(); 
            
            lista   = new ArrayList <>();
            data    =  horario.format(formato);
            nVenda = cont;
            cont++;
        }   
        public Venda (Cliente cliente)
        {   DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
            LocalDateTime horario = LocalDateTime.now(); 
            
            lista   = new ArrayList <>();
            cliente = this.cliente;
            data    =  horario.format(formato);
            nVenda = cont;
            cont++;
        }   
         // == Public Methods ==
        public void adicionar (ItemVenda item) { lista.add(item);   }
        public void remover   (ItemVenda item) { lista.remove(item);}
        public double total()
        {   double total = 0;
            for(ItemVenda item: lista)
            {
              total +=  item.getProduto().getPreco() * item.getQuantidade(); 
            }
            return total;
        }
        public String emitir()
        {   
            if(cliente == null) return String.format("Cliente: Não infomado\nNúmero da Nota: %d\nProdutos: %s\n\nTOTAL: R$%d",nVenda,carrinho(),total());
            return String.format("Cliente: %s\nNúmero da Nota: %d\nProdutos: %s\n\nTOTAL: R$%d",cliente,nVenda,carrinho(),total());
        }
        private String carrinho()
        {   StringBuilder string = new StringBuilder();
            Produto p;
            
            for(ItemVenda item: lista)
            { p = item.getProduto();
              string.append("Código: " + p.getPreco()+ " Nome: "+p.getNome()+" Quantidade: "+ item.getQuantidade() +"\n"); 
            }
            return string.toString();
        }

}
