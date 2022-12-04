# Programação Orientada Objetos II - COM221

---

## Objetivo :dart:

Este repositório visa armazenar, versionar e executar as atividades propostas na disciplina COM221 da Universidade Federal de Itajubá. Também, busca apresentar conceitos relacionados a componentes reutilizáveis com orientação a objetos e práticas ágeis de software.

---

## Ambiente de desenvolvimento :computer:
    > Linguagem: Java 11 - OpenJDK

    > SO: Manjaro Linux - 5.15.72-1-MANJARO

    > Shell: zsh 5.9

    > IDE: IntelliJ IDEA 2022.2.2 (Community Edition)

    > Build: Maven 4.0

    > Testes: JUnit 4.13.2

    > Versionamento: Git 2.38 + Github

    > Organization package: br.unifei.imc 

## Design Patterns 🩹

Conforme problemas surgem, as soluções são necessárias! Esse é o papel dos design patterns! Alguém provavelmente já teve o mesmo problema que o seu e, após errar muito, pensou em como resolver de forma **eficiente**.

A disciplina abordará os seguintes design patterns:

- [X] Strategy;
- [X] Observer;
- [X] Command;
- [ ] Singleton;
- [ ] Static Factory;
- [ ] State;
- [ ] Decorator.

## Strategy 🤔

Principais pontos para compreender o design:
- Entender o problema do reuso pela herança;
- Para encapsular comportamento utilizamos interfaces;
- Identifique as partes que se alteram com frequência e separe das mais estáveis;
- Programe para uma interface e não uma implementação concreta;

UML genérico do Strategy:

![UMLStrategy](https://imgur.com/JNRb4uX.png)

## Observer 👁️ + 🗼

Principais pontos para compreender o design:

- Define uma dependência “um para muitos”;
- Quando um objeto mudar de estado (subject/observável), todos os seus dependentes são notificados automaticamente;
- Busque acoplamento fraco(aceitável) entre objetos;
- O Observável conhece apenas a interface do observador.

UML genérico do Observer:

![UMLObserver](https://imgur.com/VcBSyxb.png)

## Command ⏮️ ⏯️ ⏭️

Principais pontos para compreender o design:
