public class Programa {
    public static void main(String[] args) {
        // Criação das provas
        Prova prova1Aluno1 = new Prova(4.0, 2.5);
        Prova prova2Aluno1 = new Prova(1.0, 7.0);

        Prova prova1Aluno2 = new Prova(6.5, 3.5);
        Prova prova2Aluno2 = new Prova(0.0, 3.0);

        Prova prova1Aluno3 = new Prova(5.0, 4.0);
        Prova prova2Aluno3 = new Prova(6.0, 1.5);

        // Criação dos alunos
        Aluno aluno1 = new Aluno("joão", prova1Aluno1, prova2Aluno1);
        Aluno aluno2 = new Aluno("chikinho", prova1Aluno2, prova2Aluno2);
        Aluno aluno3 = new Aluno("merilu", prova1Aluno3, prova2Aluno3);

        // Criação da turma
        Turma turma = new Turma();
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);

        // Cálculo das médias
        double mediaAluno1 = aluno1.calcularMedia();
        double mediaAluno2 = aluno2.calcularMedia();
        double mediaAluno3 = aluno3.calcularMedia();
        double mediaGeral = turma.calcularMediaGeral();

        // Exibição dos resultados
        System.out.println("Média de João: " + mediaAluno1);
        System.out.println("Média de chikito: " + mediaAluno2);
        System.out.println("Média de merilu: " + mediaAluno3);
        System.out.println("Média Geral da Turma:" + mediaGeral);
    }
}
