public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor("ViniRaiz", 20, "Masculino", "matematica", 50000);
        Aluno a1 = new Aluno("Lis", 18, "Feminino", 12345, "Engenharia");
        Funcionario f1 = new Funcionario("Vitoria", 38, "feminino", "TI", true);

        p1.receberAum(500);
        a1.cancelarMatr();
        f1.mudarTrabalho("RH");
        a1.fazerAniv();
    }
}
