package pucrs.progoo13;

import java.util.Comparator;

public class ComparadorCodigo implements Comparator <Pais>
{

    @Override
    public int compare(Pais p1, Pais p2) {
        return p1.getCod().compareTo(p2.getCod());
    }
}
