public class Main {
    public static void main(String[] args) {
        Colaborador[] colaboradores = new Colaborador[3];
        colaboradores[0] = new Funcionario("Funcionário", "Alitta", "43 99946644", 3000.00);
        colaboradores[1] = new Vendedor("Vendedor", "Marcus", "43 99946644", 3900.00, 500.00);
        colaboradores[2] = new Gerente("Gerente", "Lara", "43 99946644", 6000.00, 1000.00);

        for (Colaborador colaborador : colaboradores) {
            System.out.println(colaborador);
        }

    }
}