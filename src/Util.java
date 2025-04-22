import static java.lang.Double.parseDouble;
import static java.lang.Long.parseLong;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Util {
    private Controle controle = new Controle();

    public void menu() {
        inserir();
        inserir();
        pesquisar();
        pesquisar();
        listar();
    }

    private void inserir(){
        String nome;
        long matricula;
        double totalDeVendas, comissao, valorDaHora;
        int totalDeHoras;
        String menu = "1. Empregado Comissionado\n2. Empregado Horista\n3. Sair";
        int opcao;

        while(true){
            opcao = parseInt(showInputDialog(menu));
            if (opcao==3){
                return;
            }
            if (opcao==1 || opcao==2){
                nome = showInputDialog("Nome do empregado");
                matricula = parseLong(showInputDialog("Matricula do empregado"));
                if (opcao==1){
                    totalDeVendas = parseDouble(showInputDialog("Total de vendas"));
                    comissao = parseDouble(showInputDialog("Comissao de vendas"));
                    controle.inserir(new EmpregadoComissionado(matricula,nome,totalDeVendas,comissao));
                }
                else{
                    totalDeHoras = parseInt(showInputDialog("Total de horas trabalhadas"));
                    valorDaHora = parseDouble(showInputDialog("Valor da venda"));
                    controle.inserir(new EmpregadoHorista(matricula, nome, totalDeHoras, valorDaHora));
                }
            }
        }

    }

    private void pesquisar(){
        long matricula = parseLong(showInputDialog("Matricula para pesquisa:"));
        Empregado empregado = controle.pesquisar(matricula);
        if (empregado == null){
            showMessageDialog(null,"Empregado com matricula "+matricula+" não encontrado");
        }
        else{
            showMessageDialog(null,empregado.getDados());
        }
    }

    private void listar(){
        String lista = controle.listar();
        showMessageDialog(null,lista);
    }

}
