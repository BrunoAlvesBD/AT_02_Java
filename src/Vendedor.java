public class Vendedor extends Colaborador{
    private double comissao;

    public Vendedor(double comissao) {
        this.comissao = comissao;
    }

    public Vendedor(String identificacao, String nome, String telefone, double salario, double comissao) {
        super(identificacao, nome, telefone, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double salario = getSalario() + comissao;
        return salario;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\nComissao: " + getComissao();
        s+= "\nSalario com comisão: " + calcularSalario();
        return s;
    }
}
