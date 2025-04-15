
public class Main {
    public static void main(String[] args) {
        //EmpregadoComissionado ec = new EmpregadoComissionado();
        Empregado[] empregado = new Empregado[3];
        empregado[0] = new EmpregadoComissionado(1,"Alberto",1000,10);
        empregado[1] = new EmpregadoHorista(2,"Patrícia",200,180);
        empregado[2] = new EmpregadoComissionado(3,"Selmini",100,10);

        for (Empregado e : empregado){
            System.out.println(e.getDados());
            System.out.println(e.calcularSalario());
        }
    }
}