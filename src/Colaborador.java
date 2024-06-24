public abstract class Colaborador {
    private String identificacao;
    private String nome;
    private String telefone;
    private double salario;

    public Colaborador() {}

    public Colaborador(String identificacao, String nome, String telefone, double salario) {
        this.identificacao = identificacao;
        this.nome = nome;
        this.telefone = telefone;
        this.salario = salario;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String  identificacao) {
        this.identificacao = identificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Colaborador{" +
                "identificacao='" + identificacao + '\'' +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", salario=" + salario +
                '}';
    }
}
