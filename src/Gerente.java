public class Gerente extends Colaborador{
    private double bonus;

    public Gerente(double bonus) {
        this.bonus = bonus;
    }

    public Gerente(String identificacao, String nome, String telefone, double salario, double bonus) {
        super(identificacao, nome, telefone, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        double salario = getSalario() + bonus;
        return salario;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\nBonus: " + bonus;
        s+= "\nSalario com bonus: " + calcularSalario();
        return s;
    }
}
