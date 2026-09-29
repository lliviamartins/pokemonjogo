Jogo Pokémon --- Projeto AV1 de POO

Sobre o projeto

Este projeto foi desenvolvido para a disciplina de Programação
Orientada a Objetos (POO) da UniAnchieta.

A ideia foi criar uma versão simples, feita em Java, inspirada na
dinâmica dos jogos Pokémon. O jogador pode começar com um Pokémon,
capturar outros, consultar sua Pokédex e participar de batalhas.

O principal objetivo do projeto não foi criar um jogo completo, mas
colocar em prática os conceitos de Java e POO estudados durante as
aulas.

Objetivo

O jogo simula, de forma simplificada, algumas ações de um treinador
Pokémon:

escolher e visualizar seus Pokémon;

tentar capturar novos Pokémon;

consultar a Pokédex;

escolher um Pokémon para batalhar;

enfrentar um Pokémon adversário;

aplicar vantagens entre os tipos;

visualizar o resultado da batalha.

Tudo acontece pelo terminal, através de um menu interativo.

Como funciona

Ao iniciar o programa, o jogador entra no menu principal.

As opções disponíveis são:

Capturar Pokémon

Ver Pokédex

Batalhar

Sair

Durante a captura, existe uma chance de o Pokémon ser capturado. O
programa também verifica se ele já está na Pokédex para evitar que o
mesmo Pokémon seja adicionado novamente.

Na batalha, o jogador escolhe um Pokémon do seu time e enfrenta um
Pokémon adversário. O dano pode mudar de acordo com a vantagem ou
desvantagem entre os tipos.

Também existe a possibilidade de acontecer um ataque crítico,
deixando a batalha um pouco menos previsível.

Sistema de batalha

O sistema de batalha utiliza o ataque base de cada Pokémon e considera a
efetividade dos tipos.

Algumas relações utilizadas no jogo são:

Tipo              Tem vantagem contra

Água            Fogo
Eletricidade    Água
Terra           Eletricidade
Vento           Terra

O dano é calculado considerando o ataque do Pokémon e a efetividade do
tipo.

Além disso, existe uma chance de ocorrer um ataque crítico.

O HP do Pokémon também é controlado durante a batalha e não pode ficar
abaixo de zero.

Estrutura do projeto

O projeto foi organizado utilizando classes para representar os
principais conceitos do jogo.

Pokemon

É a classe principal do projeto e representa um Pokémon.

Ela possui informações como:

nome;

tipo;

nível;

HP;

ataque base.

Os atributos são encapsulados e acessados através de métodos.

Subclasses de Pokémon

Existem diferentes subclasses que representam os tipos de Pokémon
utilizados no jogo, como:

PokemonAgua

PokemonFogo

PokemonEletricidade

PokemonTerra

PokemonVento

Essas classes fazem parte da hierarquia de herança do projeto.

Treinador

Representa o jogador e guarda a lista de Pokémon que ele possui.

A classe utiliza uma ArrayList<Pokemon> para armazenar os Pokémon do
treinador.

Batalha

É responsável pelas principais regras relacionadas às batalhas, como:

escolha dos Pokémon;

cálculo de dano;

efetividade dos tipos;

ataques críticos;

atualização do HP;

definição do resultado da batalha.

App

É a classe responsável por iniciar o programa e controlar a interação
principal com o usuário.

É nela que o menu é apresentado e o Scanner é utilizado para receber
as escolhas do jogador.

Conceitos de POO utilizados

O projeto foi desenvolvido para colocar em prática os conteúdos
trabalhados na disciplina.

Entre os principais conceitos estão:

Classes e objetos

Encapsulamento

Getters e setters

Herança

extends e super()

protected

Polimorfismo

Sobrescrita de métodos com @Override

Sobrecarga de métodos (overload)

instanceof e downcasting

Coleções com ArrayList

Percorrimento com for-each

Tipos primitivos e String

Scanner para entrada de dados

Validação de entradas

Uso de Random

Organização do código em diferentes classes

Encapsulamento e validações

Os atributos das classes são mantidos de forma controlada, evitando que
qualquer parte do programa altere os dados diretamente.

Por isso, são utilizados métodos get e set.

Alguns setters possuem validações para impedir valores que não fazem
sentido no jogo, como:

HP negativo;

valores vazios ou inválidos;

dados que poderiam deixar o objeto em um estado inconsistente.

Dessa forma, além de esconder os atributos, o programa também consegue
controlar como eles podem ser alterados.

Herança e polimorfismo

A classe Pokemon funciona como uma superclasse.

As classes de tipos específicos herdam suas características utilizando
extends.

A ideia é evitar repetir informações que são comuns a todos os Pokémon e
permitir que cada subclassificação tenha seu próprio comportamento
quando necessário.

O polimorfismo também aparece quando trabalhamos com uma coleção do
tipo:

ArrayList<Pokemon>

Mesmo contendo objetos de subclasses diferentes, a lista pode tratá-los
como Pokémon e chamar comportamentos definidos na hierarquia.

Requisitos técnicos da atividade

O projeto segue os requisitos técnicos apresentados na proposta da AV1:

Mínimo de 5 classes próprias, além da classe principal.

Hierarquia de herança com uma superclasse e subclasses.

Atributos encapsulados com getters e setters.

Uso de atributo protected na superclasse.

Polimorfismo com sobrescrita de método e coleção do tipo da
superclasse.

Sobrecarga de método.

Uso de instanceof e downcasting.

Uso de tipos primitivos e String.

Menu interativo utilizando Scanner.

Validação de entradas do usuário.

Programa executável pelo terminal/IDE.

Convenções de nomenclatura e código comentado.

Os itens acima correspondem aos conceitos exigidos na atividade e
utilizados na implementação do projeto.

▶ Como executar

É necessário ter o Java (JDK) instalado.

No terminal, dentro da pasta do projeto:

javac *.java

Depois, execute:

java App

Também é possível executar o projeto diretamente pela IDE, como o VS
Code.

O que foi aprendido

Durante o desenvolvimento, o projeto ajudou a transformar os conceitos
vistos em aula em algo funcionando de verdade.

Além da parte de programação, foi necessário pensar em coisas como:

como dividir o sistema em classes;

como fazer as classes se relacionarem;

como guardar vários objetos em uma lista;

como validar o que o usuário digita;

como organizar as regras da batalha;

como evitar que o programa quebre com entradas inválidas;

como testar o sistema e encontrar erros.

Por isso, o projeto foi construído de forma gradual, começando pelas
classes e objetos e depois adicionando as funcionalidades do jogo.

Projeto acadêmico

Disciplina: Programação Orientada a Objetos
Instituição: UniAnchieta
Projeto: AV1 --- Jogo Pokémon
Linguagem: Java

Este projeto tem finalidade acadêmica e foi desenvolvido para
demonstrar, na prática, os conceitos estudados durante a disciplina de
POO.
