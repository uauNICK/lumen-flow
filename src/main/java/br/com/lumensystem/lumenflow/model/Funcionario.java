package br.com.lumensystem.lumenflow.model;

import java.time.LocalDate;

public class Funcionario {
    private Long id;
    private String nome;
    private String cpf;
    private String telefone;
    private LocalDate dataNascimento;
    private LocalDate dataAdmissao;
    private Endereco endereco;
    private Setor setor;

    public Funcionario(String nome, String cpf, String telefone, LocalDate dataNascimento, LocalDate dataAdmissao, Endereco endereco, Setor setor){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
        this.endereco = endereco;
        this.setor = setor;
    }

    public Long getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public Setor getSetor(){
        return setor;
    }

    public void alterarTelefone(String novoTelefone){

        this.telefone = novoTelefone;
    }
    public void corrigirCpf(String novoCpf){

        this.cpf = novoCpf;
    }
    public void alterarNome(String novoNome){

        this.nome = novoNome;
    }
    public void alterarEndereco(Endereco novoEndereco){
        this.endereco = novoEndereco;

    }
    public void alterarSetor(Setor novoSetor){

        this.setor = novoSetor;
    }
    @Override
    public String toString(){
        return "Nome: " + nome +
          "\nCpf: " + cpf +
          "\nNºde telefone:" + telefone +
          "\nData de nascimento: " + dataNascimento +
          "\nData de admissão: " + dataAdmissao;
    }
}
