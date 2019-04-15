package pucrs.progoo13;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        List<String> lstr = new ArrayList<>();

        lstr.add("Patinhas");
        lstr.add("Zezinho");
        lstr.add("Donald");
        lstr.add("Luizinho");
        lstr.add("Huginho");

        for (String s : lstr) System.out.print(s + " ");
        System.out.println("\n\nOrdenando...");

        Collections.sort(lstr);
        for (String s : lstr) System.out.print(s + " ");
        System.out.println("\n");

        List<Pais> paises = new ArrayList<>();

        paises.add(new Pais("ZR", "Zaire", 300));
        paises.add(new Pais("BR", "Brasil", 200));
        paises.add(new Pais("CA", "Canada", 100));
        paises.add(new Pais("EU", "Uniao Europeia", 600));
        paises.add(new Pais("UK", "Inglaterra", 400));

        for (Pais p : paises) System.out.println(p.toString());
        System.out.println("\n\nOrdenando...");

        Collections.sort(paises,new ComparadorCodigo());// compare paises usando ComparadorCodigo como com parametro
        for (Pais p : paises) System.out.println(p.toString());
        System.out.println("\n");





    }
}