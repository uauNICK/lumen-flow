package br.com.lumensystem.lumenflow.model;

import br.com.lumensystem.lumenflow.enums.StatusParticipacao;

import java.time.LocalDateTime;

public class ParticipacaoTarefa {
    private Funcionario funcionario;
    private StatusParticipacao status;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataConclusao;

    public ParticipacaoTarefa(Funcionario funcionario, StatusParticipacao status, LocalDateTime dataEntrada, LocalDateTime dataConclusao){
        this.funcionario = funcionario;
        this.status = StatusParticipacao.NAO_INICIADA;
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
