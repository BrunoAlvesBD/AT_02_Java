public class Funcionario extends Colaborador{

    public Funcionario() {
    }

    public Funcionario(String identificacao, String nome, String telefone, double salario) {
        super(identificacao, nome, telefone, salario);
    }

    @Override
    public double calcularSalario() {
        return getSalario();
    }

    @Override
    public String toString() {
        String s =super.toString()+" Funcionário: ";
        return s;
    }
}
