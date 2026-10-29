package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcademiaIntegracaoTest {

    private FuncionarioRecepcionista cadeiaAtendimento;

    @BeforeEach
    void setUp() {
        FuncionarioProprietario proprietario = new FuncionarioProprietario(null);
        FuncionarioGerente gerente = new FuncionarioGerente(proprietario);
        FuncionarioInstrutor instrutor = new FuncionarioInstrutor(gerente);
        cadeiaAtendimento = new FuncionarioRecepcionista(instrutor);
    }

    @Test
    void deveIntegrarTemplateMethodStrategyEChainOfResponsibility() {
        AlunoCrossfit aluno = new AlunoCrossfit();
        aluno.setMatricula(101);
        aluno.setNome("Lucas");
        aluno.setNota1(8.0f);
        aluno.setNota2(7.0f);

        aluno.calcularDescontoFidelidade(150.0f, 20.0f);
        assertEquals(130.0f, aluno.getValorMensalidade());

        assertEquals("AlunoCrossfit{matricula=101, nome='Lucas', mensalidade=130.0, resultado=Aprovado}", aluno.getInfo());

        Documento contrato = new Documento(TipoDocumentoContrato.getTipoDocumentoContrato());
        String assinante = aluno.solicitarAssinaturaDocumento(cadeiaAtendimento, contrato);

        assertEquals("Proprietario", assinante);
    }

    @Test
    void deveRetornarSemAssinaturaParaDocumentoInvalidoNaIntegracao() {
        AlunoMusculacao aluno = new AlunoMusculacao();
        aluno.setMatricula(102);
        aluno.setNome("Ana");
        aluno.setNota1(5.0f);
        aluno.setNota2(5.0f);

        aluno.calcularPlanoMensal(100.0f, 15.0f);
        assertEquals(115.0f, aluno.getValorMensalidade());

        assertEquals("Aluno{matricula=102, nome='Ana', mensalidade=115.0, resultado=Reprovado}", aluno.getInfo());

        Documento cupom = new Documento(TipoDocumentoCupom.getTipoDocumentoCupom());
        String assinante = aluno.solicitarAssinaturaDocumento(cadeiaAtendimento, cupom);

        assertEquals("Sem assinatura", assinante);
    }
}