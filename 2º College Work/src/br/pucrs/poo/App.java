package br.pucrs.poo;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {   Scanner in = new Scanner (System.in);

        // == Fields == 
        CadastroProdutos listaP = new CadastroProdutos();
        CadastroClientes listaC = new CadastroClientes();

     // == Main Code ==   
        Cliente cliente1 = new Cliente("João","097.800.000.01");
        Cliente cliente2 = new Cliente("Maria","123.385.764.12");
        Cliente cliente3 = new Cliente("Pércio","456.987.532.02");
        listaC.adicionar(cliente1);
        listaC.adicionar(cliente2);
        listaC.adicionar(cliente3);
        
        Produto produto1 = new Produto("Bis",4.50);
        Produto produto2 = new Produto("Coca",5.00);
        Produto produto3 = new Produto("Água Mineral",4.00);
        listaP.adicionar(produto1);
        listaP.adicionar(produto2);
        listaP.adicionar(produto3);
        
        
        System.out.println("== Clientes cadastrados ==");
        System.out.println(listaC.listar());
        
        System.out.println("== Produtos cadastrados ==");
        System.out.println(listaP.listar());
        
        System.out.println("== Alteração de cliente ==");
        listaC.pesquisar("097.800.000.01").setNome("João Antonio");
        System.out.println("Alteração: " +listaC.pesquisar("097.800.000.01").toString());
                
        System.out.println("== Alteração de produto ==");
        listaP.pesquisar(1).setPreco(5.00);
        System.out.println("Alteração: " +listaP.pesquisar(1).toString());
        
        System.out.println("== Venda com Cliente==");
        
        Venda venda1   = new Venda (listaC.pesquisar("097.800.000.01"));
        
        ItemVenda item1 = new ItemVenda(2,listaP.pesquisar(1)); 
        venda1.adicionar(item1);
        ItemVenda item2 = new ItemVenda(1,listaP.pesquisar(3)); 
        venda1.adicionar(item2);
        
        System.out.println("== Nota da venda com Cliente ==");
        System.out.println(venda1.emitir());
        
         System.out.println("== Venda sem Cliente==");
        
        Venda venda2   = new Venda ();
        
        ItemVenda item3 = new ItemVenda(2,listaP.pesquisar(1)); 
        venda2.adicionar(item3); 
        venda2.adicionar(item2);
        
        System.out.println("== Nota da venda ==");
        System.out.println(venda2.emitir());
        
        
    }
}
