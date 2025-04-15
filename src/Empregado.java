public abstract class Empregado extends Object{
    long matricula;
    String nome;

    public Empregado(long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getDados(){
        String aux="";
        aux += "Matrícula: "+matricula+"\n";
        aux += "Nome: "+nome+"\n";
        return aux;
    }

    public abstract double calcularSalario();

}
