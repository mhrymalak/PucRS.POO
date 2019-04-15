package pucrs.progoo14;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Bagagem.setCustoExcesso(30);

        Bagagem b1 = new BagagemDeMao(30, "Huguinho");
        Bagagem b2 = new BagagemNormal(30, "Zezinho");

        //System.out.println(b1.toString());
        //System.out.println(b2.toString());

        ArrayList<Bagagem> lista = new ArrayList<>();

        lista.add(b1);
        lista.add(b2);
        lista.add(new BagagemDeMao(7, "Luizinho"));
        lista.add(new BagagemNormal(24, "Patinhas"));
        lista.add(new BagagemDeMao(17, "Donald"));
        lista.add(new BagagemDeMao(217, "John Smith"));
        lista.add(new BagagemNormal(27, "Margarida"));

        Collections.sort(lista);

        for (Bagagem b : lista) {
            System.out.println(b);
        }


        Collections.sort(lista, new ComparadorCustoBagagem());
        System.out.println("\nOrdenado pelo valor...\n");
        for (Bagagem b : lista) {
            System.out.println(b);
        }


        lista.sort((Bagagem o1, Bagagem o2) -> o2.getDescricao().compareTo(o1.getDescricao()));
        System.out.println("\nOrdenado pela descricao decrescente com lambda\n");
        for (Bagagem b : lista) {
            System.out.println(b);
        }

        int total = 0;
        for (Bagagem b : lista) {
            if ( b instanceof BagagemDeMao) {
                // se eu precisasse usar métodos específicos de Bagagem de mão
                // faria um "casting" e trabalharia com a variável bm
                //BagagemDeMao bm = (BagagemDeMao) b;
                total = total + 1;
            }
        }
        System.out.println("\nTotal de bagagens de mão: " + total);


    }
}
