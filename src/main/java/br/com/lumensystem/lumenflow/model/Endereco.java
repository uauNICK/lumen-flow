package br.com.lumensystem.lumenflow.model;

import br.com.lumensystem.lumenflow.enums.TipoEndereco;

//Coloquei tudo como String, pois por ser apenas informações, não valores que serão usados para calculo, acredito que registrar como String seja melhor
//posso refatorar no caso do CEP e numero precisarem ser int. Adicionei país também pra caso tenham funcionarios estrangeiros, ou mesmo o sistema ir pra fora hehe.

public class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String pais;
    private String complemento;
    private TipoEndereco tipoEndereco;

    public Endereco(String rua, String numero, String bairro, String cidade, String estado, String cep, String pais, String complemento, TipoEndereco tipoEndereco){
       this.rua = rua;
       this.numero = numero;
       this.bairro = bairro;
       this.cidade = cidade;
       this.estado = estado;
       this.cep = cep;
       this.pais = pais;
       this.complemento = complemento;
       this.tipoEndereco = tipoEndereco;
    }

    public String getRua() {

        return rua;
    }

    public String getNumero() {

        return numero;
    }

    public String getBairro() {

        return bairro;
    }

    public String getCidade() {

        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {

        return cep;
    }

    public String getPais() {

        return pais;
    }

    public String getComplemento() {

        return complemento;
    }

    public TipoEndereco getTipoEndereco() {

        return tipoEndereco;
    }
    @Override
    public String toString(){
        return "Rua: " + rua +
                "\nNúmero: " + numero +
                "\nBairro: " + bairro +
                "\nComplemento: " + complemento +
                "\nCidade: " + cidade +
                "\nEstado: " + estado +
                "\nPaís: " + pais +
                "\nCEP: " + cep;
    }
}
