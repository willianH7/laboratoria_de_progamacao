class Aluno {
    String nome;
    Prova prova1;
    Prova prova2;

    Aluno(String nome, Prova prova1, Prova prova2) {
        this.nome = nome;
        this.prova1 = prova1;
        this.prova2 = prova2;
    }
    double calcularMedia() {
        double mediaProva1 = (prova1.notaParte1 + prova1.notaParte2) / 2;
        double mediaProva2 = (prova2.notaParte1 + prova2.notaParte2) / 2;
        return (mediaProva1 + mediaProva2) / 2;
    }
}