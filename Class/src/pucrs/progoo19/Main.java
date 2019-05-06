package pucrs.progoo19;

public class Main {

    public static void main(String[] args) {
        CadastroFuncionarios cad;
        int[] valores = new int[100];
        cad = CadastroFuncionarios.getInstance(); // Sistema de arquivos instância diferente => Padrão Singleton

        /*
        cad.add(new Funcionario(100,"Zezinho",1000));

        cad.add(new Funcionario(200,"Huginho",2000));
        cad.add(new Funcionario(300,"Luizinho",3000));

        cad.saveFile("funcionarios.txt");


        cad.cleanAll();
        cad.readFile("Class/funcionarios.txt");

        System.out.println(cad.toString());

        System.out.println(cad.relatorio());
    */
        for (int i = 0; i < 100;i++)valores[i] =  (int)(Math.random() * 100);

    }
}
