import java.util.ArrayList;
import java.util.Collections;

public class CadastroImoveis
{   private ArrayList <Imovel>  lista = new ArrayList<>();

    public CadastroImoveis() { }

    public String listar()
    {   Collections.sort(lista);
        StringBuilder string = new StringBuilder();

        for (Imovel imovel:lista)
        {   string.append(imovel.toString());
            string.append(" ");
            string.append(imovel.calculoImposto());
            string.append("\n");
        }
        return string.toString();
    }
    public void add(Imovel imovel) {lista.add(imovel); }

    public String listar(String nome)
    {   StringBuilder string = new StringBuilder();

        for (Imovel imovel:lista)
        {   if(imovel.getProprietario().equalsIgnoreCase(nome))
            {   string.append(imovel.toString());
                string.append("\n");
                if(imovel instanceof Residencial)
                {   string.append("Imóvel: Residencial");
                    string.append("\n");
                }
                else
                {   string.append("Imóvel: Comercial");
                    string.append("\n");
                }
            }

        }
        return string.toString();
    }

}
