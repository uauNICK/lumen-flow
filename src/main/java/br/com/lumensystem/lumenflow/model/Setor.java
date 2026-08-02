package br.com.lumensystem.lumenflow.model;

public class Setor {

    private String nome;
    private String codigoSetor;
    private String descricao;
    private String localizacao;
    private Funcionario responsavel;
    private boolean ativo;

    public Setor(String nome, String codigoSetor, String descricao, String localizacao) {
        this.nome = nome;
        this.codigoSetor = codigoSetor;
        this.descricao = descricao;
        this.localizacao = localizacao;
        this.ativo = true;
    }

    public String getNome() {

        return nome;
    }

    public String getCodigoSetor() {

        return codigoSetor;
    }

    public String getDescricao() {

        return descricao;
    }

    public String getLocalizacao() {

        return localizacao;
    }

    public Funcionario getResponsavel() {

        return responsavel;
    }

    public boolean isAtivo() {

        return ativo;
    }

    public void alterarNome(String novoNome) {

        this.nome = novoNome;
    }

    public void alterarCodigoSetor(String novoCodigoSetor) {

        this.codigoSetor = novoCodigoSetor;
    }

    public void alterarDescricao(String novaDescricao) {

        this.descricao = novaDescricao;
    }

    public void alterarLocalizacao(String novaLocalizacao) {
        this.localizacao = novaLocalizacao;
    }

    public void alterarResponsavel(Funcionario novoResponsavel) {

        this.responsavel = novoResponsavel;
    }

    public void ativar() {

        this.ativo = true;
    }

    public void desativar() {

        this.ativo = false;
    }

    @Override
    public String toString() {

        String nomeResponsavel = "Não definido";

        if (responsavel != null) {
            nomeResponsavel = responsavel.getNome();
        }

        String situacao;

        if (ativo) {
            situacao = "Sim";
        } else {
            situacao = "Não";
        }

        return "Setor: " + nome +
                "\nCódigo setor: " + codigoSetor +
                "\nDescrição: " + descricao +
                "\nLocal: " + localizacao +
                "\nFuncionário responsável: " + nomeResponsavel +
                "\nSetor ativo: " + situacao;

    }
}