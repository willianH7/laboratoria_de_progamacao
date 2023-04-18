
import java.util.ArrayList;
import java.util.List;
class Turma {
    List<Aluno> alunos;

    Turma() {
        alunos = new ArrayList<>();
    }

    void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    double calcularMediaGeral() {
        double somaMedias = 0;
        for (Aluno aluno : alunos) {
            somaMedias += aluno.calcularMedia();
        }
        return somaMedias / alunos.size();
    }
}
