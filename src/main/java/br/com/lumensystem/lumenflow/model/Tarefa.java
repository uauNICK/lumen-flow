package br.com.lumensystem.lumenflow.model;

import br.com.lumensystem.lumenflow.enums.PrioridadeTarefa;
import br.com.lumensystem.lumenflow.enums.StatusTarefa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tarefa {

        private Long id;
        private String codigoTarefa;
        private String nome;
        private String descricao;

        private Funcionario criador;
        private List<Funcionario> responsaveis = new ArrayList<>();
        private Setor setor;

        private LocalDate dataCriacao;
        private LocalDate dataLimite;

        private PrioridadeTarefa prioridade;
        private StatusTarefa status;

        public Tarefa(
                String codigoTarefa,
                String nome,
                String descricao,
                Funcionario criador,
                Setor setor,
                LocalDate dataLimite,
                PrioridadeTarefa prioridade
        ) {
                this.codigoTarefa = codigoTarefa;
                this.nome = nome;
                this.descricao = descricao;
                this.criador = criador;
                this.setor = setor;
                this.dataCriacao = LocalDate.now();
                this.dataLimite = dataLimite;
                this.prioridade = prioridade;
                this.status = StatusTarefa.CRIADA;
        }

        public Long getId() {
                return id;
        }

        public String getCodigoTarefa() {
                return codigoTarefa;
        }

        public String getNome() {
                return nome;
        }

        public String getDescricao() {
                return descricao;
        }

        public Funcionario getCriador() {
                return criador;
        }

        public List<Funcionario> getResponsaveis() {
                return responsaveis;
        }

        public Setor getSetor() {
                return setor;
        }

        public LocalDate getDataCriacao() {
                return dataCriacao;
        }

        public LocalDate getDataLimite() {
                return dataLimite;
        }

        public PrioridadeTarefa getPrioridade() {
                return prioridade;
        }

        public StatusTarefa getStatus() {
                return status;
        }

        //métodos

        public void adicionarResponsavel(Funcionario novoResponsavel) {
                responsaveis.add(novoResponsavel);
        }

        public void removerResponsavel(Funcionario responsavelRemovido) {
                responsaveis.remove(responsavelRemovido);
        }

        @Override
        public String toString() {
                return "Código: " + codigoTarefa +
                        "\nNome: " + nome +
                        "\nDescrição: " + descricao +
                        "\nCriador: " + criador.getNome() +
                        "\nQuantidade de responsáveis: " + responsaveis.size() +
                        "\nSetor: " + setor.getNome() +
                        "\nData de criação: " + dataCriacao +
                        "\nData limite: " + dataLimite +
                        "\nPrioridade: " + prioridade +
                        "\nStatus: " + status;
        }
}