import java.text.DecimalFormat;

public class EmpregadoComissionado extends Empregado {
    double totalDeVendas;
    double comissao;

    public EmpregadoComissionado(long matricula, String nome, double totalDeVendas, double comissao) {
        super(matricula, nome);
        this.totalDeVendas = totalDeVendas;
        this.comissao = comissao;
    }

    public String getDados(){
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String aux = super.getDados();
        aux += "Total de vendas R$ "+ df.format(totalDeVendas)+"\n";
        aux += "Comissão "+df.format(comissao)+"%\n";
        return aux;
    }

    public double calcularSalario(){
        return totalDeVendas*comissao/100;
    }
}
