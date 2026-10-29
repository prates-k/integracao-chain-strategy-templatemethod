package org.example;

public abstract class Aluno {

    private int matricula;
    protected String nome;
    private float nota1;
    private float nota2;
    private float valorMensalidade;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getValorMensalidade() {
        return valorMensalidade;
    }

    public float calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    public void calcularPlanoMensal(float valorBase, float taxaInscricao) {
        CalculadoraMensalidade calculadora = new CalculadoraMensalidade(valorBase, taxaInscricao);
        this.valorMensalidade = calculadora.calcular(new OperacaoPlanoMensal());
    }

    public void calcularPlanoSemestral(float valorBase, float meses) {
        CalculadoraMensalidade calculadora = new CalculadoraMensalidade(valorBase, meses);
        this.valorMensalidade = calculadora.calcular(new OperacaoPlanoSemestral());
    }

    public void calcularPlanoAnual(float valorBase, float meses) {
        CalculadoraMensalidade calculadora = new CalculadoraMensalidade(valorBase, meses);
        this.valorMensalidade = calculadora.calcular(new OperacaoPlanoAnual());
    }

    public void calcularDescontoEstudante(float valorBase, float percentualDesconto) {
        CalculadoraMensalidade calculadora = new CalculadoraMensalidade(valorBase, percentualDesconto);
        this.valorMensalidade = calculadora.calcular(new OperacaoDescontoEstudante());
    }

    public void calcularDescontoFidelidade(float valorBase, float valorDesconto) {
        CalculadoraMensalidade calculadora = new CalculadoraMensalidade(valorBase, valorDesconto);
        this.valorMensalidade = calculadora.calcular(new OperacaoDescontoFidelidade());
    }

    public String solicitarAssinaturaDocumento(Funcionario cadeiaAtendimento, Documento documento) {
        return cadeiaAtendimento.assinarDocumento(documento);
    }

    public abstract String verificarAprovacao();

    public String getTipo() {
        return "Aluno";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "matricula=" + this.matricula +
                ", nome='" + this.nome + '\'' +
                ", mensalidade=" + this.valorMensalidade +
                ", resultado=" + this.verificarAprovacao() +
                '}';
    }
}
