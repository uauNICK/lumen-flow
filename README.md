# Lúmen Flow

Sistema de gestão de equipes e tarefas para operações em campo, inicialmente idealizado a partir de problemas observados na rotina de uma fazenda.

## Sobre o projeto

O Lúmen Flow tem como objetivo auxiliar na organização de funcionários, setores e tarefas realizadas em locais onde as equipes trabalham de forma distribuída.

A proposta é permitir que gestores criem tarefas, definam responsáveis, acompanhem o andamento dos serviços e mantenham um histórico das atividades executadas.

O projeto está sendo desenvolvido como parte dos meus estudos para desenvolvimento backend com Java.

## Problema observado

Em operações rurais extensas, gestores podem precisar se deslocar constantemente para distribuir tarefas e verificar o andamento das equipes.

Isso pode causar:

- atraso no início de atividades;
- dificuldade para controlar prioridades;
- falta de histórico;
- tempo excessivo gasto com deslocamentos;
- dificuldade para acompanhar tarefas em locais com pouca conexão.

## Funcionalidades planejadas

- Cadastro de funcionários;
- Cadastro de endereços;
- Cadastro de setores;
- Definição de responsável por setor;
- Cadastro de tarefas;
- Prioridade e status das tarefas;
- Vários participantes por tarefa;
- Acompanhamento individual dos participantes;
- Histórico de pausas, retomadas e conclusões;
- Funcionamento adaptado a operações com conexão limitada.

## Funcionalidades implementadas

- [x] Modelagem de `Funcionario`;
- [x] Modelagem de `Endereco`;
- [x] Modelagem de `Setor`;
- [x] Relacionamento entre funcionário, endereço e setor;
- [x] Tipos de endereço com `enum`;
- [x] Status e prioridade de tarefas com `enum`;
- [x] Modelagem inicial de `Tarefa`;
- [x] Modelagem inicial de `ParticipacaoTarefa`;
- [ ] Validações de negócio;
- [ ] Histórico de eventos da tarefa;
- [ ] Persistência em banco de dados;
- [ ] API REST com Spring Boot;
- [ ] Autenticação e controle de acesso;
- [ ] Interface web.

## Tecnologias

Atualmente:

- Java;
- Programação Orientada a Objetos;
- Collections;
- Git e GitHub.

Planejadas:

- Spring Boot;
- Maven;
- PostgreSQL;
- JPA/Hibernate;
- API REST;
- Docker.

## Estrutura atual

```text
src/main/java/br/com/lumensystem/lumenflow
├── controller
├── dto
├── enums
├── exception
├── model
├── repository
├── service
└── util