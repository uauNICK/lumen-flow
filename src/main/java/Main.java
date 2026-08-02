package br.com.lumensystem.lumenflow;

import br.com.lumensystem.lumenflow.enums.PrioridadeTarefa;
import br.com.lumensystem.lumenflow.model.Funcionario;
import br.com.lumensystem.lumenflow.model.Setor;
import br.com.lumensystem.lumenflow.model.Endereco;
import br.com.lumensystem.lumenflow.model.Tarefa;

import java.time.LocalDate;


import static br.com.lumensystem.lumenflow.enums.TipoEndereco.CASA;


public class Main {
    public static void main(String[] args){

        Endereco endereco = new Endereco("1043","95B","St.Agostinho","Volta Redonda","RJ", "27211-670", "Brasil", "bloco 180", CASA);

        Setor setor = new Setor("Viveiro 1","01A","Viveiro de plantas x","Proximo a casa do Carlos");

        Funcionario funcionario = new Funcionario("Laís Lessa","198.440.527-69","(24)99268-7554",LocalDate.of(2004,05,26), LocalDate.of(2026,07,01),endereco,setor);


        setor.alterarResponsavel(funcionario);
        Tarefa tarefa = new Tarefa(
                "TAR-001",
                "Organizar viveiro",
                "Separar e organizar as mudas",
                funcionario,
                setor,
                LocalDate.of(2026, 8, 10),
                PrioridadeTarefa.ALTA
        );

        tarefa.adicionarResponsavel(funcionario);

        System.out.println(tarefa);


    }
}
