# Projeto desenvolvido em Java para a disciplina de Programação Orientada a Objetos (POO).

## Integrantes:
- Kathleen Martins Teixeira
- Lívia Pereira Martins dos Santos
- Luca Conti Turchet


## Sobre o projeto

O Pokémon Adventure é um sistema desenvolvido para aplicar conceitos de
Programação Orientada a Objetos utilizando Pokémon, treinadores e batalhas.

O programa permite visualizar os Pokémon do treinador, escolher um Pokémon
para batalhar e enfrentar um Pokémon adversário sorteado aleatoriamente.

## Requisitos técnicos aplicados

O projeto atende aos principais requisitos técnicos trabalhados durante a disciplina:

- Classes: o projeto possui mais de 5 classes próprias além da classe App.
- Herança: as subclasses utilizam extends e seus construtores utilizam super(...).
- Encapsulamento: os atributos das classes são protegidos por modificadores de acesso e possuem getters e setters, com validações aplicadas aos valores.
- protected: é utilizado na superclasse quando é necessário permitir o acesso pelas subclasses. A justificativa dessa utilização está apresentada no relatório individual.
- Polimorfismo: as subclasses sobrescrevem o método atacar() utilizando @Override. Os Pokémon são armazenados em uma ArrayList<Pokemon> e podem ser percorridos utilizando for-each.
- Sobrecarga: a classe Batalha possui métodos com o mesmo nome e diferentes assinaturas para realizar cálculos de dano.
- instanceof e downcasting: utilizados na classe Batalha para verificar o tipo específico de um Pokémon e permitir o acesso a comportamentos específicos de suas subclasses.
- Tipos de dados: são utilizados tipos primitivos e String de acordo com as necessidades do sistema.
- Menu: o programa possui um menu interativo no console utilizando Scanner.
- Validação de entrada: o sistema verifica se a entrada do usuário é válida antes de continuar determinadas operações.
- Execução: o projeto pode ser executado pela classe App em uma IDE compatível com Java.
- Nomenclatura: as classes, métodos e variáveis seguem as convenções de nomenclatura utilizadas em Java.

## Funcionalidades

- Visualização dos Pokémon do treinador
- Escolha de um Pokémon para a batalha
- Sorteio aleatório do Pokémon adversário
- Sistema de batalha por turnos
- Ataques específicos para cada tipo de Pokémon
- Efetividade entre tipos
- Ataques críticos
- Sistema de dano
- Alteração de nível após a batalha
- Recuperação do HP após a batalha
- Validação da escolha do Pokémon

## Pokémon

O projeto possui diferentes classes de Pokémon:

- `Pokemon` — classe base
- `PokemonAgua` — tipo Água
- `PokemonFogo` — tipo Fogo
- `PokemonEletricidade` — tipo Eletricidade
- `PokemonTerra` — tipo Terra
- `PokemonVento` — tipo Vento

Cada subclasse possui sua própria implementação do método `atacar()`.

## Sistema de batalha

A classe `Batalha` é responsável pelo funcionamento das batalhas.

Durante uma batalha:

1. O treinador escolhe um Pokémon.
2. Um Pokémon adversário é sorteado.
3. Os Pokémon realizam seus ataques.
4. O dano é calculado de acordo com o ataque base e a efetividade dos tipos.
5. Existe a possibilidade de ocorrer um ataque crítico.
6. A batalha continua até que um dos Pokémon fique sem HP.
7. O vencedor recebe alteração de nível.
8. O HP dos Pokémon é restaurado para a próxima batalha.

## Conceitos de POO utilizados

- Classes e objetos
- Encapsulamento
- Getters e setters
- Herança
- Polimorfismo
- Sobrescrita de métodos (`@Override`)
- Sobrecarga de métodos
- `ArrayList`
- `for-each`
- `instanceof`
- Downcasting
- Construtores
- `this`
- Tipos primitivos e `String`

## Principais classes

### `Pokemon`
Classe base dos Pokémon. Possui informações como nome, tipo, nível,
HP e ataque base.

`PokemonAgua`, `PokemonFogo`, `PokemonEletricidade`,
`PokemonTerra` e `PokemonVento`

São subclasses de `Pokemon` que especializam o comportamento do método
`atacar()`.

### `Treinador`

Representa o treinador e armazena seus Pokémon em uma `ArrayList<Pokemon>`.

### `Batalha`

Controla a seleção dos Pokémon, sorteio do adversário, ataques,
cálculo de dano, efetividade, ataques críticos e resultado da batalha.

### `App`

Classe responsável pela execução do programa e interação inicial com o
usuário.

## Tecnologias utilizadas

- Java
- Programação Orientada a Objetos
- `ArrayList`
- `Scanner`
- `Random`

## Como executar

1. Abra o projeto em uma IDE compatível com Java, como o VS Code.
2. Certifique-se de que o Java está instalado.
3. Execute a classe `App`.
4. Siga as opções apresentadas no terminal.

## Uso de Inteligência Artificial

Durante o desenvolvimento do projeto, foram utilizadas ferramentas de
Inteligência Artificial como apoio ao processo de desenvolvimento.

A IA foi utilizada principalmente para:
- esclarecer dúvidas sobre conceitos de Java e Programação Orientada a Objetos;
- auxiliar na compreensão de trechos de código;
- sugerir soluções para problemas encontrados durante o desenvolvimento;
- auxiliar na organização e documentação do projeto.

O código foi analisado e compreendido pelos integrantes do grupo, que são
responsáveis pelas decisões e pelo funcionamento final do projeto.desvantagem entre os tipos.

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
