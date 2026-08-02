package br.com.lumensystem.lumenflow.model;

import br.com.lumensystem.lumenflow.enums.StatusParticipacao;
import br.com.lumensystem.lumenflow.enums.StatusTarefa;
import ch.qos.logback.core.joran.conditional.ElseAction;

import java.time.LocalDateTime;

import static br.com.lumensystem.lumenflow.enums.StatusParticipacao.NAO_INICIADA;

public class ParticipacaoTarefa {
    private Funcionario funcionario;
    private StatusParticipacao status;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataConclusao;
    private LocalDateTime dataInicio;

    public ParticipacaoTarefa(Funcionario funcionario, StatusParticipacao status, LocalDateTime dataEntrada, LocalDateTime dataConclusao){
        this.funcionario = funcionario;
        this.status = NAO_INICIADA;
        this.dataEntrada = LocalDateTime.now();
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public StatusParticipacao getStatus() {
        return status;
    }

    public LocalDateTime getDataEntrada() {
        return dataEntrada;
    }

    public LocalDateTime getDataConclusao() {
        return dataConclusao;
    }
    //Métodos de verificação de etapas

    public void iniciar() {
        if (status != StatusParticipacao.NAO_INICIADA) {
            throw new IllegalStateException(
                    "A participação só pode ser iniciada quando estiver não iniciada."
            );
        }
        else {

            this.status = StatusParticipacao.EM_ANDAMENTO;
            this.dataInicio = LocalDateTime.now();
        }
    }

    public void pausar() {
        if (status != StatusParticipacao.EM_ANDAMENTO) {
            throw new IllegalStateException(
                    "A participação só pode ser pausada quando estiver iniciada."
            );
        }

            this.status = StatusParticipacao.PAUSADA;

    }

    public void retomar() {
        if (status != StatusParticipacao.PAUSADA) {
            throw new IllegalStateException(
                    "A participação só pode ser retomada quando estiver pausada."
            );
        }

        this.status = StatusParticipacao.EM_ANDAMENTO;

    }

    public void concluir() {
        if (status != StatusParticipacao.EM_ANDAMENTO) {
            throw new IllegalStateException(
                    "A participação só pode ser concluida quando estiver em andamento."
            );
        }

            this.status = StatusParticipacao.CONCLUIDA;
            this.dataConclusao = LocalDateTime.now();

    }

    @Override
    public String toString() {
        return "ParticipacaoTarefa{" +
                "funcionario=" + funcionario +
                ", status=" + status +
                ", dataEntrada=" + dataEntrada +
                ", dataConclusao=" + dataConclusao +
                '}';
    }
}
