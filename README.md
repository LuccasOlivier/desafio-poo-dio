# Abstraindo um Bootcamp Usando Orientação a Objetos em Java

## Descrição do Projeto

Este projeto foi desenvolvido como um desafio para desmistificar a Programação Orientada a Objetos (POO) utilizando Java. O objetivo é praticar os conceitos fundamentais da POO, como Abstração, Encapsulamento, Herança e Polimorfismo, aplicando-os em um problema real.

## Estrutura do Projeto

O projeto simula um bootcamp com cursos e mentorias, permitindo que desenvolvedores (Devs) se inscrevam e progridam em conteúdos. A estrutura é composta pelas seguintes classes principais:

- **Conteudo**: Classe abstrata que serve como modelo para cursos e mentorias.
- **Curso**: Representa um curso com título, descrição e carga horária.
- **Mentoria**: Representa uma sessão de mentoria com título, descrição e data.
- **Bootcamp**: Gerencia os conteúdos e devs inscritos.
- **Dev**: Representa um desenvolvedor que pode se inscrever em bootcamps e progredir nos conteúdos.

## Pilares da POO Implementados

1. **Abstração**: Utilizada na classe `Conteudo`, permitindo que cursos e mentorias compartilhem atributos comuns.
2. **Encapsulamento**: Acesso controlado aos atributos através de getters e setters.
3. **Herança**: `Curso` e `Mentoria` herdam de `Conteudo`.
4. **Polimorfismo**: Método `calcularXp()` é implementado de forma diferente nas subclasses.
