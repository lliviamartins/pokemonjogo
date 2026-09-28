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
responsáveis pelas decisões e pelo funcionamento final do projeto.
